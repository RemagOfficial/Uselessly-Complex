package com.remag.useless.item;

import com.remag.useless.UselesslyComplex;
import com.remag.useless.util.Registration;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class TabbedItems {

    /* ITEMS */

    public static final RegistryObject<Item> BAKING_SODA =
            Registration.ITEMS.register("baking_soda",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> CRUSHED_TRONA =
            Registration.ITEMS.register("crushed_trona",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> SODIUM_CARBONATE =
            Registration.ITEMS.register("sodium_carbonate",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> WET_SODIUM_CARBONATE =
            Registration.ITEMS.register("wet_sodium_carbonate",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> FLOUR =
            Registration.ITEMS.register("flour",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));

    public static final RegistryObject<Item> PEBBLE =
            Registration.ITEMS.register("pebble",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> CLEAN_SUGAR_CANE =
            Registration.ITEMS.register("clean_sugar_cane",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> CUT_CLEAN_SUGAR_CANE =
            Registration.ITEMS.register("cut_clean_sugar_cane",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> SUGAR_CANE_FIBERS =
            Registration.ITEMS.register("sugar_cane_fibers",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> UNREFINED_SUGAR_WATER =
            Registration.ITEMS.register("unrefined_sugar_water",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> SUGAR_WATER =
            Registration.ITEMS.register("sugar_water",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));

    public static final RegistryObject<Item> BOTTLE_OF_CREAM =
            Registration.ITEMS.register("bottle_of_cream",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> HOT_MILK =
            Registration.ITEMS.register("hot_milk",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> BUTTER =
            Registration.ITEMS.register("butter",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> BUTTERCREAM =
            Registration.ITEMS.register("buttercream",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));

    public static final RegistryObject<Item> SUGARY_FLOUR =
            Registration.ITEMS.register("sugary_flour",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));


    public static final RegistryObject<Item> CAKE_BATTER =
            Registration.ITEMS.register("cake_batter",
                    () -> new Item(new Item.Properties().tab(UselesslyComplex.USELESS_TAB)));

    /* TOOLS */

    public static final RegistryObject<Item> HATCHET =
            Registration.ITEMS.register("hatchet",
                    () -> new AxeItem(ModItemTier.HATCHET_TOOL, 2.5f, -3f,
                            new Item.Properties()
                                    .defaultDurability(150)
                                    .addToolType(ToolType.AXE, 2)
                                    .tab(UselesslyComplex.USELESS_TAB)));


    public static void register() {
    }

    public enum ModItemTier implements IItemTier {
        HATCHET_TOOL(1, 100, 0.5f, 0.5f, 2,
                Ingredient.of(new ItemStack(TabbedItems.PEBBLE.get())));

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final Ingredient repairMaterial;

        ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage
                , int enchantability, Ingredient repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = repairMaterial;
        }

        @Override
        public int getUses() {
            return maxUses;
        }

        @Override
        public float getSpeed() {
            return efficiency;
        }

        @Override
        public float getAttackDamageBonus() {
            return attackDamage;
        }

        @Override
        public int getLevel() {
            return harvestLevel;
        }

        @Override
        public int getEnchantmentValue() {
            return enchantability;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return repairMaterial;
        }
    }
}