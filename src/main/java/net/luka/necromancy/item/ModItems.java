package net.luka.necromancy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.luka.necromancy.LukasNecromancy;
import net.luka.necromancy.item.custom.ChainsawItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SOULSTONE = registerItem("soulstone",
            new Item(new Item.Settings()));
    public static final Item RAW_SOULSTONE = registerItem("raw_soulstone",
            new Item(new Item.Settings()));
    public static final Item DARK_ORB = registerItem("dark_orb",
            new Item(new Item.Settings()));

    public static final Item CHAINSAW = registerItem("chainsaw", new ChainsawItem(new Item.Settings().maxDamage(32)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LukasNecromancy.MOD_ID, name),  item);
    }

    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(SOULSTONE);
        entries.add(RAW_SOULSTONE);
        entries.add(DARK_ORB);
    }

    public static void registerModItems() {
        LukasNecromancy.LOGGER.info("Registering mod items for " + LukasNecromancy.MOD_ID);
    }
}
