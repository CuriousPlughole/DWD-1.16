package com.prismmods.dwdimensions.common.blocks.generic;

import java.util.Map;
import java.util.Random;

import com.google.common.collect.ImmutableMap.Builder;
import com.prismmods.dwdimensions.core.init.BlockInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class ModLogBlock extends RotatedPillarBlock {

    public ModLogBlock(MaterialColor verticalColorIn, Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return true;
    }

    // Random chance between 0% and 30%
    @Override
    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        Random rand = new Random();
        int flammability = rand.nextInt(90) + 1;
        return flammability;
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
                                             Hand handIn, BlockRayTraceResult hit) {

        final Map<Block, Block> BLOCK_STRIPPING_MAP = (new Builder<Block, Block>())
              //  .put(BlockInit.CANDONWOOD_LOG.get(), BlockInit.STRIPPED_CANDONWOOD_LOG.get())
             //   .put(BlockInit.ULANDA_LOG.get(), BlockInit.STRIPPED_ULANDA_LOG.get())
                .put(BlockInit.PETRIFIED_LOG.get(), BlockInit.STRIPPED_PETRIFIED_LOG.get()).build();


        if (player.getHeldItem(handIn).getItem() instanceof AxeItem) {
            Block block = BLOCK_STRIPPING_MAP.get(state.getBlock());
            if (block != null) {
                worldIn.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                if (!worldIn.isRemote) {
                    worldIn.setBlockState(pos,
                            block.getDefaultState().with(RotatedPillarBlock.AXIS, state.get(RotatedPillarBlock.AXIS)),
                            11);
                    if (player != null) {
                        player.getHeldItem(handIn).getStack().damageItem(1, player, (entity) -> {
                            entity.sendBreakAnimation(handIn);
                        });
                    }

                }
            }
        }

        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }
}
