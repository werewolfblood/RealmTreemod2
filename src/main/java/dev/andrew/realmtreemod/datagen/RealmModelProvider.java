package dev.andrew.realmtreemod.datagen;

import dev.andrew.realmtreemod.RealmTreeMod;
import dev.andrew.realmtreemod.block.InitBlocks;
import dev.andrew.realmtreemod.block.custom.RealmSevenSlab;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class RealmModelProvider extends FabricModelProvider {
    public RealmModelProvider(FabricDataOutput output) {
        super(output);
    }

    private static BlockStateModelGenerator.BlockTexturePool getCubeAllBlockTexturePoolWithoutRegisteringBaseBlock(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        return blockStateModelGenerator.new BlockTexturePool(TextureMap.all(block));
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerAxisRotated(InitBlocks.DROW_PLANKS_SLAB, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        getCubeAllBlockTexturePoolWithoutRegisteringBaseBlock(blockStateModelGenerator, InitBlocks.DROW_PLANKS_SLAB)
                .fence(InitBlocks.DROW_PLANKS_FENCE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.MITHRIL_PLANKS)
                .slab(InitBlocks.MITHRIL_PLANKS_SLAB)
                .fence(InitBlocks.MITHRIL_PLANKS_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.CRYSTAL_PLANKS)
                .slab(InitBlocks.CRYSTAL_SLAB)
                .fence(InitBlocks.CRYSTAL_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.ASHRET_PLANKS)
                .slab(InitBlocks.ASHRET_SLAB)
                .fence(InitBlocks.ASHRET_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.ELF_PLANKS)
                .slab(InitBlocks.ELF_SLAB)
                .fence(InitBlocks.ELF_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.ALOGRORN_PLANKS)
                .fence(InitBlocks.ALOGRORN_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DIRE_PLANKS)
                .slab(InitBlocks.DIRE_SLAB)
                .fence(InitBlocks.DIRE_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.SCONET_PLANKS)
                .fence(InitBlocks.SCONET_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.OPLOOD_PLANKS)
                .slab(InitBlocks.OPLOOD_SLAB)
                .fence(InitBlocks.OPLOOD_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.AEKLOOD_PLANKS)
                .slab(InitBlocks.AEKLOOD_SLAB)
                .fence(InitBlocks.AEKLOOD_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.KRESS_PLANKS)
                .fence(InitBlocks.KRESS_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.SMANY_PLANKS)
                .fence(InitBlocks.SMANY_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.BLUSHET_PLANKS)
                .fence(InitBlocks.BLUSHET_FENCE);


        blockStateModelGenerator.registerLog(InitBlocks.MITHRIL_LOG)
                 .log(InitBlocks.MITHRIL_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BlACKWALNUT_LOG)
                .log(InitBlocks.BlACKWALNUT_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BlACKWILLOW_LOG)
                .log(InitBlocks.BlACKWILLOW_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BLUECRYSTAL_LOG)
                .log(InitBlocks.BLUECRYSTAL_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.DROW_LOG)
                .log(InitBlocks.DROW_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.PINE_LOG)
                .log(InitBlocks.PINE_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.SILVER_LOG)
                .log(InitBlocks.SILVER_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.ELF_LOG)
                .log(InitBlocks.ELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.IRONWOOD_LOG)
                .log(InitBlocks.IRONWOOD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.EVILWOOD_LOG)
                .log(InitBlocks.EVILWOOD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.SUNELF_LOG)
                .log(InitBlocks.SUNELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.UATHAR_LOG)
                .log(InitBlocks.UATHAR_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.OUFYEW_LOG)
                .log(InitBlocks.OUFYEW_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.AYIFER_LOG)
                .log(InitBlocks.AYIFER_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.IORANY_LOG)
                .log(InitBlocks.IORANY_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.SHADOW_FIR_LOG)
                .log(InitBlocks.SHADOW_FIR_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.DARKELF_LOG)
                .log(InitBlocks.DARKELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.YEZHOVE_LOG)
                .log(InitBlocks.YEZHOVE_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.EDLIFER_LOG)
                .log(InitBlocks.EDLIFER_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.KLINWOOD_LOG)
                .log(InitBlocks.KLINWOOD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.GREEN_FIR_LOG)
                .log(InitBlocks.GREEN_FIR_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.WEEPING_LOG)
                .log(InitBlocks.WEEPING_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.OTHON_LOG)
                .log(InitBlocks.OTHON_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.ALOGRORN_LOG)
                .log(InitBlocks.ALOGRORN_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.EIKEW_LOG)
                .log(InitBlocks.EIKEW_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.DLONET_LOG)
                .log(InitBlocks.DLONET_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.DIRE_LOG)
                .log(InitBlocks.DIRE_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.ASHRET_LOG)
                .log(InitBlocks.ASHRET_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.MITHRIL_STRIPPED_LOG)
                .log(InitBlocks.MITHRIL_STRIPPED_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.ELF_STRIPPED_LOG)
                .log(InitBlocks.ELF_STRIPPED_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BUCKEYE_LOG)
                .log(InitBlocks.BUCKEYE_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.DOGWOOD_LOG)
                .log(InitBlocks.DOGWOOD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.SCONET_LOG)
                .log(InitBlocks.SCONET_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.OPLOOD_LOG)
                .log(InitBlocks.OPLOOD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.AEKLOOD_LOG)
                .log(InitBlocks.AEKLOOD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.KRESS_LOG)
                .log(InitBlocks.KRESS_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.SMANY_LOG)
                .log(InitBlocks.SMANY_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.ICHREAM_LOG)
                .log(InitBlocks.ICHREAM_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.TUFICH_LOG)
                .log(InitBlocks.TUFICH_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BLUSHET_LOG)
                .log(InitBlocks.BLUSHET_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.OTHON_LOG)
                .log(InitBlocks.OLEN_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.GOLD_ELF_LOG)
                .log(InitBlocks.GOLD_ELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.TREE_ELF_LOG)
                .log(InitBlocks.TREE_ELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.SILVERELF_LOG)
                .log(InitBlocks.SILVERELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.PEACH_LOG)
                .log(InitBlocks.PEACH_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.NIGHTELF_LOG)
                .log(InitBlocks.NIGHTELF_LOG);

        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MITHRIL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.SILVER_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.EVIL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.SUNELF_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DARKELF_LEAVES);

        VariantsBlockStateSupplier.create(InitBlocks.DROW_PLANKS_SLAB)
                .coordinate(BlockStateVariantMap.create(RealmSevenSlab.FACING, RealmSevenSlab.LAYERS)
                        .register((facing, layers) -> {
                            BlockStateVariant blockStateVariant = BlockStateVariant.create()
                                    .put(VariantSettings.UVLOCK, true);
                            if (layers != 7) {
                                blockStateVariant.put(VariantSettings.MODEL, Identifier.of(RealmTreeMod.MOD_ID, "block/stack_slab_drow_" + layers));
                            } else {
                                blockStateVariant.put(VariantSettings.MODEL, Identifier.of(RealmTreeMod.MOD_ID, "block/drow_planks_slab"));
                            }
                            switch (facing) {
                                case DOWN -> {}
                                case UP -> blockStateVariant
                                        .put(VariantSettings.X, VariantSettings.Rotation.R180);
                                case NORTH -> blockStateVariant
                                        .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R180);
                                case SOUTH -> blockStateVariant
                                        .put(VariantSettings.X, VariantSettings.Rotation.R90);
                                case WEST -> blockStateVariant
                                        .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R90);
                                case EAST -> blockStateVariant
                                        .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R270);
                            }
                            return blockStateVariant;
                        }));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
