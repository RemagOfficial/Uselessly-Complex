package com.remag.useless.world.gen;

import com.remag.useless.block.UntabbedBlocks;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;

public class ModConfiguredFeatures {

    public static final ConfiguredFeature<?, ?> STICK_BLOCK_CONFIG = Feature.FLOWER.configured((
                    new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(UntabbedBlocks.STICK_BLOCK.get().defaultBlockState()),
                            SimpleBlockPlacer.INSTANCE)).tries(6).build())
            .decorated(Features.Placements.HEIGHTMAP).count(1);

    public static final ConfiguredFeature<?, ?> PEBBLE_BLOCK_CONFIG = Feature.FLOWER.configured((
                    new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(UntabbedBlocks.PEBBLE_BLOCK.get().defaultBlockState()),
                            SimpleBlockPlacer.INSTANCE)).tries(6).build())
            .decorated(Features.Placements.HEIGHTMAP).count(1);
}
