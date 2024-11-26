package dev.andrew.realmtreemod.datagen;

import dev.andrew.realmtreemod.block.InitBlocks;
import dev.andrew.realmtreemod.unit.RealmTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class RealmItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public RealmItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(RealmTags.Items.TRANSFORMABLE_ITEMS);
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(InitBlocks.EVIL_LEAVES.asItem())
                .add(InitBlocks.CRYSTAL_LEAVES.asItem())
                .add(InitBlocks.SILVER_LEAVES.asItem())
                .add(InitBlocks.MITHRIL_LEAVES.asItem());


    }
}
