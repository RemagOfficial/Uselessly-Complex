package com.remag.useless.util;

import com.remag.useless.UselesslyComplex;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class ModTags
{
    public static class Blocks {

        public static final Tags.IOptionalNamedTag<Block> LOGS =
                createTag("logs");

        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(UselesslyComplex.MOD_ID, name));
        }
    }

    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> AXES =
                createTag("axes");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(UselesslyComplex.MOD_ID, name));
        }
    }
}
