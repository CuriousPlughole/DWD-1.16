package com.prismmods.dwdimensions.common.blocks;

import com.prismmods.dwdimensions.common.tileentities.TardisTileEntity;
import com.prismmods.dwdimensions.core.init.SoundInit;
import com.prismmods.dwdimensions.core.init.TileEntityTypeInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class TardisBlock extends Block{

	public static final BooleanProperty LIT = BlockStateProperties.LIT;
	private static final VoxelShape block_shape = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 40.0D, 16.0D);
	
	public TardisBlock(Properties properties) {
		super(properties.doesNotBlockMovement());
	}
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(LIT);
	}
	
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        if(tileentity instanceof TardisTileEntity){
        	TardisTileEntity tardisTileEntity = (TardisTileEntity) tileentity;
            tardisTileEntity.setRotation(180 + (float) Math.floor(placer.rotationYaw));
        }
    }
	
	@Override
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {

		TileEntity tileentity = worldIn.getTileEntity(pos);
		if (tileentity instanceof TardisTileEntity) {
			TardisTileEntity tardisTileEntity = (TardisTileEntity) tileentity;
			if (tardisTileEntity.getDoorState() == TardisTileEntity.EnumDoorState.BOTH_OPEN_IN
					|| tardisTileEntity.getDoorState() == TardisTileEntity.EnumDoorState.ONE_OPEN_IN) {

				// System.out.println("Entity collided; teleport to interior!");
				
				int TardisID = tardisTileEntity.getTardisID();
				
				

			}
		}
	}
	
	@Override
	public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos,
			ISelectionContext context) {
		TileEntity tileentity = worldIn.getTileEntity(pos);
		if (tileentity instanceof TardisTileEntity) {
			TardisTileEntity tardisTileEntity = (TardisTileEntity) tileentity;
			if (tardisTileEntity.getDoorState() == TardisTileEntity.EnumDoorState.CLOSED) {
				return block_shape;
			} else {
				return VoxelShapes.empty();
			}
		}

		return block_shape;

	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return block_shape;
	}

	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.INVISIBLE;
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypeInit.TARDIS.get().create();
	}

	@Override
	public boolean addDestroyEffects(BlockState state, World world, BlockPos pos, ParticleManager manager) {
		return false;
	}
	
	@Override
	public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
		return state.get(LIT) ? 7:0;
	}
	
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {

		TileEntity tileentity = worldIn.getTileEntity(pos);
		if (tileentity instanceof TardisTileEntity) {
			TardisTileEntity tardisTileEntity = (TardisTileEntity) tileentity;
			TardisTileEntity.EnumChameleon currentChameleon = tardisTileEntity.getActiveChameleon();
			TardisTileEntity.EnumDoorState currentDoorState = tardisTileEntity.getDoorState();

			if (player.getHeldItem(handIn).isEmpty()) {
				if (currentDoorState == TardisTileEntity.EnumDoorState.CLOSED) {
					if (player.isCrouching()) {
						currentDoorState = TardisTileEntity.EnumDoorState.BOTH_OPEN_IN;
						worldIn.playSound(null, pos, SoundInit.TARDIS_DOOR_OPEN_1.get(), SoundCategory.BLOCKS, 0.5f, 1.0f);
					} else {
						currentDoorState = TardisTileEntity.EnumDoorState.ONE_OPEN_IN;
						worldIn.playSound(null, pos, SoundInit.TARDIS_DOOR_OPEN_2.get(), SoundCategory.BLOCKS, 0.5f, 1.0f);
					}

				} else {
					currentDoorState = TardisTileEntity.EnumDoorState.CLOSED;
					worldIn.playSound(null, pos, SoundInit.TARDIS_DOOR_CLOSE.get(), SoundCategory.BLOCKS, 0.3f, 1.0f);
				}

				tardisTileEntity.setDoorState(currentDoorState);
			}


			if (player.getHeldItem(handIn).isItemEqual(new ItemStack(Items.IRON_INGOT))) {
				tardisTileEntity.setLightsStatus(false);

				worldIn.setBlockState(pos, state.with(LIT, false), 3);
			}

			if (player.getHeldItem(handIn).isItemEqual(new ItemStack(Items.GOLD_INGOT))) {
				tardisTileEntity.setLightsStatus(true);

				worldIn.setBlockState(pos, state.with(LIT, true), 3);
			}

			if (player.getHeldItem(handIn).getItem() instanceof ShovelItem) {
				if (tardisTileEntity.getSnowy()) {
					worldIn.playSound(null, pos, SoundEvents.BLOCK_SNOW_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
					tardisTileEntity.setSnowy(false);
					tardisTileEntity.setSnowCoolDown(6000); // Five Minutes
				}
			}

			worldIn.notifyBlockUpdate(pos, state, state, 2);
			return ActionResultType.SUCCESS;
		}
		return ActionResultType.FAIL;
	}
	

}
