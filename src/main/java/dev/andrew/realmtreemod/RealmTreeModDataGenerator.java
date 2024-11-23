package dev.andrew.realmtreemod;

import dev.andrew.realmtreemod.datagen.RealmBlockTagProvider;
import dev.andrew.realmtreemod.datagen.RealmItemTagProvider;
import dev.andrew.realmtreemod.datagen.RealmLootTableProvider;
import dev.andrew.realmtreemod.datagen.RealmModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class RealmTreeModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(RealmBlockTagProvider::new);
		pack.addProvider(RealmItemTagProvider::new);
		pack.addProvider(RealmModelProvider::new);
		pack.addProvider(RealmLootTableProvider::new);
	}
}
