package com.remag.useless.world;

import com.remag.useless.UselesslyComplex;
import com.remag.useless.world.gen.ModFlowerGeneration;
import com.remag.useless.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UselesslyComplex.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        ModFlowerGeneration.generateFlowers(event);
    }
}
