package dev.andrew.realmtreemod.block;

import dev.andrew.realmtreemod.RealmTreeMod;

import dev.andrew.realmtreemod.block.custom.RealmSevenSlab;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;

import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

import net.minecraft.util.Identifier;




public class InitBlocks {

    public static final Block BlACKWALNUT_LOG = registerBlock("blackwalnut_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BlACKWILLOW_LOG = registerBlock("blackwillow_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MITHRIL_LOG = registerBlock("mithril_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BLUECRYSTAL_LOG = registerBlock("bluecrystal_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DROW_LOG = registerBlock("drow_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block PINE_LOG = registerBlock("pine_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SILVER_LOG = registerBlock("silver_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ELF_LOG = registerBlock("elf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block IRONWOOD_LOG = registerBlock("ironwood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block EVILWOOD_LOG = registerBlock("evilwood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SUNELF_LOG = registerBlock("sunelf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block UATHAR_LOG = registerBlock("uathar_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block OUFYEW_LOG = registerBlock("oufyew_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block AYIFER_LOG = registerBlock("ayifer_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BUCKEYE_LOG = registerBlock("buckeye_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block IORANY_LOG = registerBlock("iorany_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SHADOW_FIR_LOG = registerBlock("shadow_fir_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DARKELF_LOG = registerBlock("darkelf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block YEZHOVE_LOG = registerBlock("yezhove_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block EDLIFER_LOG = registerBlock("edlifer_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block KLINWOOD_LOG = registerBlock("klinwood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block GREEN_FIR_LOG = registerBlock("green_fir_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ELF_PLANKS = registerBlock("elf_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ELF_FENCE = registerBlock("elf_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ELF_SLAB = registerBlock("elf_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ASHRET_LOG = registerBlock("ashret_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ALOGRORN_PLANKS = registerBlock("alogrorn_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block WEEPING_LOG = registerBlock("weeping_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block OTHON_LOG = registerBlock("othon_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ALOGRORN_LOG = registerBlock("alogrorn_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ALOGRORN_FENCE = registerBlock("alogrorn_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block EIKEW_LOG = registerBlock("eikew_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DLONET_LOG = registerBlock("dlonet_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DIRE_LOG = registerBlock("dire_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MITHRIL_PLANKS = registerBlock("mithril_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MITHRIL_PLANKS_SLAB = registerBlock("mithril_planks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MITHRIL_PLANKS_FENCE = registerBlock("mithril_planks_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DROW_PLANKS = registerBlock("drow_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DROW_PLANKS_SLAB = registerBlock("drow_planks_slab",
            new RealmSevenSlab(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DROW_PLANKS_FENCE = registerBlock("drow_planks_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block CRYSTAL_PLANKS = registerBlock("crystal_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block CRYSTAL_SLAB = registerBlock("crystal_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block CRYSTAL_FENCE = registerBlock("crystal_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ASHRET_PLANKS = registerBlock("ashret_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DIRE_PLANKS = registerBlock("dire_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DIRE_FENCE = registerBlock("dire_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DIRE_SLAB = registerBlock("dire_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ASHRET_FENCE = registerBlock("ashret_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ASHRET_SLAB = registerBlock("ashret_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DOGWOOD_LOG = registerBlock("dogwood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SCONET_LOG = registerBlock("sconet_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SCONET_PLANKS = registerBlock("sconet_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SCONET_FENCE = registerBlock("sconet_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block OPLOOD_LOG = registerBlock("oplood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block AEKLOOD_LOG = registerBlock("aeklood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block AEKLOOD_PLANKS = registerBlock("aeklood_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block AEKLOOD_FENCE = registerBlock("aeklood_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block AEKLOOD_SLAB = registerBlock("aeklood_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block OPLOOD_FENCE = registerBlock("oplood_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block OPLOOD_PLANKS = registerBlock("oplood_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block OPLOOD_SLAB = registerBlock("oplood_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block KRESS_LOG = registerBlock("kress_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block KRESS_PLANKS = registerBlock("kress_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block KRESS_FENCE = registerBlock("kress_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SMANY_LOG = registerBlock("smany_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ICHREAM_LOG = registerBlock("ichream_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SMANY_PLANKS = registerBlock("smany_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SMANY_FENCE = registerBlock("smany_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block TUFICH_LOG = registerBlock("tufich_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BLUSHET_LOG = registerBlock("blushet_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block OLEN_LOG = registerBlock("olen_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BLUSHET_PLANKS = registerBlock("blushet_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BLUSHET_FENCE = registerBlock("blushet_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block GOLD_ELF_LOG = registerBlock("gold_elf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block TREE_ELF_LOG = registerBlock("tree_elf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SILVERELF_LOG = registerBlock("silverelf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block PEACH_LOG = registerBlock("peach_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block NIGHTELF_LOG = registerBlock("nightelf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MITHRIL_STRIPPED_LOG = registerBlock("mithril_stripped_log",
            new PillarBlock(
                    AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()
            )
    );
    public static final Block ELF_STRIPPED_LOG = registerBlock("elf_stripped_log",
            new PillarBlock(
                    AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()
            )
    );
    public static final Block MITHRIL_LEAVES = registerBlock("mithril_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final Block SILVER_LEAVES = registerBlock("silver_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final Block CRYSTAL_LEAVES = registerBlock("crystal_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final Block EVIL_LEAVES = registerBlock("evil_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final Block SUNELF_LEAVES = registerBlock("sunelf_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final Block DARKELF_LEAVES = registerBlock("darkelf_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RealmTreeMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RealmTreeMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {
        RealmTreeMod.LOGGER.info("Registering Mod Blocks for " + RealmTreeMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(InitBlocks.BlACKWALNUT_LOG);
            entries.add(InitBlocks.BlACKWILLOW_LOG);
            entries.add(InitBlocks.MITHRIL_LOG);
            entries.add(InitBlocks.DROW_LOG);
            entries.add(InitBlocks.BLUECRYSTAL_LOG);
            entries.add(InitBlocks.PINE_LOG);
            entries.add(InitBlocks.SILVER_LOG);
            entries.add(InitBlocks.ELF_LOG);
            entries.add(InitBlocks.IRONWOOD_LOG);
            entries.add(InitBlocks.EVILWOOD_LOG);
            entries.add(InitBlocks.SUNELF_LOG);
            entries.add(InitBlocks.UATHAR_LOG);
            entries.add(InitBlocks.OUFYEW_LOG);
            entries.add(InitBlocks.AYIFER_LOG);
            entries.add(InitBlocks.MITHRIL_LEAVES);
            entries.add(InitBlocks.SILVER_LEAVES);
            entries.add(InitBlocks.CRYSTAL_LEAVES);
            entries.add(InitBlocks.EVIL_LEAVES);
            entries.add(InitBlocks.IORANY_LOG);
            entries.add(InitBlocks.SHADOW_FIR_LOG);
            entries.add(InitBlocks.DARKELF_LOG);
            entries.add(InitBlocks.YEZHOVE_LOG);
            entries.add(InitBlocks.EDLIFER_LOG);
            entries.add(InitBlocks.KLINWOOD_LOG);
            entries.add(InitBlocks.GREEN_FIR_LOG);
            entries.add(InitBlocks.ASHRET_LOG);
            entries.add(InitBlocks.SUNELF_LEAVES);
            entries.add(InitBlocks.DARKELF_LEAVES);
            entries.add(InitBlocks.WEEPING_LOG);
            entries.add(InitBlocks.OTHON_LOG);
            entries.add(InitBlocks.ALOGRORN_LOG);
            entries.add(InitBlocks.EIKEW_LOG);
            entries.add(InitBlocks.DLONET_LOG);
            entries.add(InitBlocks.DIRE_LOG);
            entries.add(InitBlocks.MITHRIL_PLANKS);
            entries.add(InitBlocks.MITHRIL_PLANKS_SLAB);
            entries.add(InitBlocks.MITHRIL_PLANKS_FENCE);
            entries.add(InitBlocks.DROW_PLANKS);
            entries.add(InitBlocks.DROW_PLANKS_SLAB);
            entries.add(InitBlocks.DROW_PLANKS_FENCE);
            entries.add(InitBlocks.CRYSTAL_PLANKS);
            entries.add(InitBlocks.CRYSTAL_SLAB);
            entries.add(InitBlocks.CRYSTAL_FENCE);
            entries.add(InitBlocks.ASHRET_PLANKS);
            entries.add(InitBlocks.ASHRET_FENCE);
            entries.add(InitBlocks.ASHRET_SLAB);
            entries.add(InitBlocks.ELF_PLANKS);
            entries.add(InitBlocks.ELF_FENCE);
            entries.add(InitBlocks.ALOGRORN_PLANKS);
            entries.add(InitBlocks.ALOGRORN_FENCE);
            entries.add(InitBlocks.DIRE_PLANKS);
            entries.add(InitBlocks.DIRE_FENCE);
            entries.add(InitBlocks.DIRE_SLAB);
            entries.add(InitBlocks.ELF_SLAB);
            entries.add(InitBlocks.MITHRIL_STRIPPED_LOG);
            entries.add(InitBlocks.ELF_STRIPPED_LOG);
            entries.add(InitBlocks.BUCKEYE_LOG);
            entries.add(InitBlocks.DOGWOOD_LOG);
            entries.add(InitBlocks.SCONET_PLANKS);
            entries.add(InitBlocks.SCONET_FENCE);
            entries.add(InitBlocks.OPLOOD_LOG);
            entries.add(InitBlocks.OPLOOD_PLANKS);
            entries.add(InitBlocks.OPLOOD_FENCE);
            entries.add(InitBlocks.OPLOOD_SLAB);
            entries.add(InitBlocks.AEKLOOD_LOG);
            entries.add(InitBlocks.AEKLOOD_PLANKS);
            entries.add(InitBlocks.AEKLOOD_FENCE);
            entries.add(InitBlocks.AEKLOOD_SLAB);
            entries.add(InitBlocks.KRESS_LOG);
            entries.add(InitBlocks.KRESS_PLANKS);
            entries.add(InitBlocks.KRESS_FENCE);
            entries.add(InitBlocks.SMANY_LOG);
            entries.add(InitBlocks.SMANY_FENCE);
            entries.add(InitBlocks.SMANY_PLANKS);
            entries.add(InitBlocks.ICHREAM_LOG);
            entries.add(InitBlocks.TUFICH_LOG);
            entries.add(InitBlocks.BLUSHET_LOG);
            entries.add(InitBlocks.BLUSHET_PLANKS);
            entries.add(InitBlocks.BLUSHET_FENCE);
            entries.add(InitBlocks.OLEN_LOG);
            entries.add(InitBlocks.GOLD_ELF_LOG);
            entries.add(InitBlocks.TREE_ELF_LOG);
            entries.add(InitBlocks.SILVERELF_LOG);
            entries.add(InitBlocks.PEACH_LOG);
            entries.add(InitBlocks.NIGHTELF_LOG);






        });
    }
}
