package dev.andrew.realmtreemod.datagen;

import dev.andrew.realmtreemod.block.InitBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class RealmModelProvider extends FabricModelProvider {
    public RealmModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
BlockStateModelGenerator.BlockTexturePool REALMGRANET = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.MITHRIL_PLANKS);
BlockStateModelGenerator.BlockTexturePool RPGGRANET = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DROW_PLANKS);
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



        REALMGRANET.slab(InitBlocks.MITHRIL_PLANKS_SLAB);
        RPGGRANET.slab(InitBlocks.DROW_PLANKS_SLAB);



        REALMGRANET.fence(InitBlocks.MITHRIL_PLANKS_FENCE);
        RPGGRANET.fence(InitBlocks.DROW_PLANKS_FENCE);







        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MITHRIL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.SILVER_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.EVIL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.SUNELF_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DARKELF_LEAVES);






    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

}
