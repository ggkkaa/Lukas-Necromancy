package net.luka.necromancy;

import net.fabricmc.api.ModInitializer;

import net.luka.necromancy.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LukasNecromancy implements ModInitializer {
	public static final String MOD_ID = "lukas-necromancy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}