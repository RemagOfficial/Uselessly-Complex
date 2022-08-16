package com.remag.useless.util;

import com.remag.useless.UselesslyComplex;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeTagHandler;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTags {
    public static class Blocks {

        private static final String log_tag = "logs";
        public static final ITag.INamedTag<Block> LOGS =
                ForgeTagHandler.makeWrapperTag(ForgeRegistries.BLOCKS, new ResourceLocation(UselesslyComplex.MOD_ID, log_tag));
    }

    public static class Items {

        private static final String axe_tag = "axes";
        public static final ITag.INamedTag<Item> AXES =
                ForgeTagHandler.makeWrapperTag(ForgeRegistries.ITEMS, new ResourceLocation(UselesslyComplex.MOD_ID, axe_tag));
    }
}