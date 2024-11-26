package dev.andrew.realmtreemod.datagen;

import dev.andrew.realmtreemod.block.InitBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class RealmLootTableProvider extends FabricBlockLootTableProvider {
    public RealmLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    @Override
    public void generate() {
        addDrop(InitBlocks.BlACKWALNUT_LOG);
        addDrop(InitBlocks.ELF_LOG);
        addDrop(InitBlocks.SILVER_LOG);
        addDrop(InitBlocks.BlACKWILLOW_LOG);
        addDrop(InitBlocks.MITHRIL_LOG);
        addDrop(InitBlocks.BLUECRYSTAL_LOG);
        addDrop(InitBlocks.DROW_LOG);
        addDrop(InitBlocks.PINE_LOG);
        addDrop(InitBlocks.IRONWOOD_LOG);
        addDrop(InitBlocks.EVILWOOD_LOG);
        addDrop(InitBlocks.SUNELF_LOG);
        addDrop(InitBlocks.UATHAR_LOG);
        addDrop(InitBlocks.OUFYEW_LOG);
        addDrop(InitBlocks.AYIFER_LOG);
        addDrop(InitBlocks.MITHRIL_LEAVES);
        addDrop(InitBlocks.SILVER_LEAVES);
        addDrop(InitBlocks.CRYSTAL_LEAVES);
        addDrop(InitBlocks.EVIL_LEAVES);
        addDrop(InitBlocks.IORANY_LOG);
        addDrop(InitBlocks.SHADOW_FIR_LOG);
        addDrop(InitBlocks.DARKELF_LOG);
        addDrop(InitBlocks.YEZHOVE_LOG);
       addDrop(InitBlocks.EDLIFER_LOG);
       addDrop(InitBlocks.KLINWOOD_LOG);
       addDrop(InitBlocks.GREEN_FIR_LOG);
       addDrop(InitBlocks.ASHRET_LOG);
       addDrop(InitBlocks.SUNELF_LEAVES);
       addDrop(InitBlocks.DARKELF_LEAVES);
       addDrop(InitBlocks.WEEPING_LOG);
       addDrop(InitBlocks.OTHON_LOG);
       addDrop(InitBlocks.ALOGRORN_LOG);
     addDrop(InitBlocks.MITHRIL_PLANKS);
     addDrop(InitBlocks.MITHRIL_PLANKS_SLAB);
        addDrop(InitBlocks.EIKEW_LOG);
        addDrop(InitBlocks.DLONET_LOG);
        addDrop(InitBlocks.DIRE_LOG);
        addDrop(InitBlocks.MITHRIL_PLANKS_FENCE);
        addDrop(InitBlocks.DROW_PLANKS_SLAB);
        addDrop(InitBlocks.DROW_PLANKS_FENCE);
        addDrop(InitBlocks.CRYSTAL_PLANKS);
        addDrop(InitBlocks.CRYSTAL_SLAB);
        addDrop(InitBlocks.CRYSTAL_FENCE);
        addDrop(InitBlocks.ASHRET_PLANKS);
        addDrop(InitBlocks.ASHRET_FENCE);
        addDrop(InitBlocks.ASHRET_SLAB);
        addDrop(InitBlocks.ELF_PLANKS);
        addDrop(InitBlocks.ELF_FENCE);
        addDrop(InitBlocks.ALOGRORN_PLANKS);
        addDrop(InitBlocks.ALOGRORN_FENCE);
        addDrop(InitBlocks.DIRE_PLANKS);
        addDrop(InitBlocks.DIRE_FENCE);
        addDrop(InitBlocks.DIRE_SLAB);
        addDrop(InitBlocks.ELF_SLAB);
        addDrop(InitBlocks.MITHRIL_STRIPPED_LOG);
        addDrop(InitBlocks.ELF_STRIPPED_LOG);
        addDrop(InitBlocks.BUCKEYE_LOG);
        addDrop(InitBlocks.DOGWOOD_LOG);
        addDrop(InitBlocks.SCONET_LOG);
        addDrop(InitBlocks.SCONET_PLANKS);
        addDrop(InitBlocks.SCONET_FENCE);
        addDrop(InitBlocks.OPLOOD_LOG);
        addDrop(InitBlocks.OPLOOD_SLAB);
        addDrop(InitBlocks.OPLOOD_PLANKS);
        addDrop(InitBlocks.OPLOOD_FENCE);
        addDrop(InitBlocks.AEKLOOD_LOG);
        addDrop(InitBlocks.AEKLOOD_SLAB);
        addDrop(InitBlocks.AEKLOOD_PLANKS);
        addDrop(InitBlocks.KRESS_LOG);
        addDrop(InitBlocks.KRESS_PLANKS);
        addDrop(InitBlocks.KRESS_FENCE);
        addDrop(InitBlocks.SMANY_LOG);
        addDrop(InitBlocks.SMANY_FENCE);
        addDrop(InitBlocks.SMANY_PLANKS);
        addDrop(InitBlocks.ICHREAM_LOG);
        addDrop(InitBlocks.TUFICH_LOG);
        addDrop(InitBlocks.BLUSHET_LOG);
        addDrop(InitBlocks.BLUSHET_FENCE);
        addDrop(InitBlocks.OLEN_LOG);
        addDrop(InitBlocks.GOLD_ELF_LOG);
        addDrop(InitBlocks.TREE_ELF_LOG);
        addDrop(InitBlocks.SILVERELF_LOG);
        addDrop(InitBlocks.PEACH_LOG);
        addDrop(InitBlocks.NIGHTELF_LOG);






    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
