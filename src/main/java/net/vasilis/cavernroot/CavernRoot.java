package net.vasilis.cavernroot;

import net.fabricmc.api.ModInitializer;

import net.vasilis.cavernroot.block.ModBlocks;
import net.vasilis.cavernroot.item.ModItemGroups;
import net.vasilis.cavernroot.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CavernRoot implements ModInitializer {
	public static final String MOD_ID = "cavern-root";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}