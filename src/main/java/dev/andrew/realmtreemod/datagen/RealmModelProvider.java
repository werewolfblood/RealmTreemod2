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
        blockStateModelGenerator.registerLog(InitBlocks.BlACKWALNUT_LOG)
                .log(InitBlocks.BlACKWALNUT_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BlACKWILLOW_LOG)
                .log(InitBlocks.BlACKWILLOW_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.MITHRIL_LOG)
                .log(InitBlocks.MITHRIL_LOG);
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


        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MITHRIL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.SILVER_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.EVIL_LEAVES);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

}