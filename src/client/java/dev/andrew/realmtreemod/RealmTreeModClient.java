package dev.andrew.realmtreemod;

import dev.andrew.realmtreemod.block.InitBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class RealmTreeModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), InitBlocks.BLACKWALNUT_SAPLING);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), InitBlocks.MITHRIL_SAPLING);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), InitBlocks.DARKELF_SAPLING);
	}
}