package com.remag.useless.block;

import com.remag.useless.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class UntabbedBlocks
{
    public static final RegistryObject<Block> STICK_BLOCK = register("stick_block",
            () -> new BushBlock(AbstractBlock.Properties.of(Material.WOOD)
                    .noCollission().strength(1.5f, 1.5f)));

    public static final RegistryObject<Block> PEBBLE_BLOCK = register("pebble_block",
            () -> new BushBlock(AbstractBlock.Properties.of(Material.STONE)
                    .noCollission().strength(1.5f, 1.5f)));

    public static void register() { }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block)
    {
        return Registration.BLOCKS.register(name, block);
    }
}
