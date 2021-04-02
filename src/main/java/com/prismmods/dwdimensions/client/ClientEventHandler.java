package com.prismmods.dwdimensions.client;

import com.prismmods.dwdimensions.core.init.DimensionInit;
import com.prismmods.dwdimensions.core.init.SoundInit;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SimpleSound;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/* Created by Craig on 28/02/2021 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEventHandler {

    private static SimpleSound SKARO_WIND = null;

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent clientTickEvent) {
        if (Minecraft.getInstance().player == null) return;
        SoundHandler sound = Minecraft.getInstance().getSoundHandler();
        if(Minecraft.getInstance().world.getDimensionKey().equals(DimensionInit.GALLIFREY_DIMENSION)) {

            sound.stop(null, SoundCategory.MUSIC);


            if(SKARO_WIND == null){
                SKARO_WIND = SimpleSound.master(SoundInit.WIND.get(), 1,0.4F);
            }

            if(!sound.isPlaying(SKARO_WIND)){
                sound.play(SKARO_WIND);
            }
        } else {
            if(sound.isPlaying(SKARO_WIND)){
                sound.stop(SKARO_WIND);
            }
        }
    }
}
