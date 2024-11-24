package dev.andrew.realmtreemod.block;

import dev.andrew.realmtreemod.RealmTreeMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
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
    public static final Block ASHRET_LOG = registerBlock("ashret_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
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
public  static final Block BLACKWALNUT_SAPLING = registerBlock("blackwalnut_sapling",
        new SaplingBlock(
                SaplingGenerator.SPRUCE,
                AbstractBlock.Settings.create()
                        .mapColor(MapColor.DARK_GREEN)
                        .noCollision()
                        .ticksRandomly()
                        .breakInstantly()
                        .sounds(BlockSoundGroup.GRASS)
                        .pistonBehavior(PistonBehavior.DESTROY)
        )
);

    public  static final Block MITHRIL_SAPLING = registerBlock("mithril_sapling",
            new SaplingBlock(
                    SaplingGenerator.SPRUCE,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public  static final Block DARKELF_SAPLING = registerBlock("darkelf_sapling",
            new SaplingBlock(
                    SaplingGenerator.SPRUCE,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

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
            entries.add(InitBlocks.BLACKWALNUT_SAPLING);
            entries.add(InitBlocks.MITHRIL_SAPLING);
            entries.add(InitBlocks.DARKELF_LOG);
            entries.add(InitBlocks.YEZHOVE_LOG);
            entries.add(InitBlocks.DARKELF_SAPLING);
            entries.add(InitBlocks.EDLIFER_LOG);
            entries.add(InitBlocks.KLINWOOD_LOG);
            entries.add(InitBlocks.GREEN_FIR_LOG);
            entries.add(InitBlocks.ASHRET_LOG);
        });
    }
}
