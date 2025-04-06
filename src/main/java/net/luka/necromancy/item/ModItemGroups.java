package net.luka.necromancy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.luka.necromancy.LukasNecromancy;
import net.luka.necromancy.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NECROMANCY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LukasNecromancy.MOD_ID, "lukas_necromancy"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.luka_necromancy"))
                    .icon(() -> new ItemStack(ModItems.SOULSTONE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CHAINSAW);
                        entries.add(ModItems.SOULSTONE);
                        entries.add(ModItems.RAW_SOULSTONE);
                        entries.add(ModItems.DARK_ORB);
                        entries.add(ModBlocks.BLOCK_OF_SOULSTONE);
                    }).build());

    public static void registerItemGroups() {
        LukasNecromancy.LOGGER.info("Registering Item Groups for " + LukasNecromancy.MOD_ID);
    }
}
