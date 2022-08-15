package com.remag.useless.block;

import com.remag.useless.UselesslyComplex;
import com.remag.useless.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class TabbedBlocks
{

    public static final RegistryObject<Block> TRONA_ORE = register("trona_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(1.5f, 1.5f)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static void register() { }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));
        return toReturn;
    }
}
