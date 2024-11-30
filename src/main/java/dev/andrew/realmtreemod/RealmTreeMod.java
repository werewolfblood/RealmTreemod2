package dev.andrew.realmtreemod;

import dev.andrew.realmtreemod.block.InitBlocks;
import dev.andrew.realmtreemod.item.InitItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealmTreeMod implements ModInitializer {
	public static final String MOD_ID = "realmtreemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		InitBlocks.registerModBlocks();
		InitItems.registerModItems();

	}
}