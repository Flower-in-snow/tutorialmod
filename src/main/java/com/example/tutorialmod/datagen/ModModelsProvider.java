package com.example.tutorialmod.datagen;

import com.example.tutorialmod.block.ModBlocks;
import com.example.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_SPRAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_SPRAY_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_ICE_SPRAY_GEMSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_SPRAY_GEMSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_SPRAY_WAND, Models.GENERATED);

    }
}
