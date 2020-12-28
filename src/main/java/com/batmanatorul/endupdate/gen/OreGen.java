package com.batmanatorul.endupdate.gen;

import com.batmanatorul.endupdate.EndUpdate;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGen {
    public static ConfiguredFeature<?, ?> END_IRON_END = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE),
            com.batmanatorul.endupdate.register.Blocks.END_IRON.getDefaultState(), 9)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0,0,70)))
            .spreadHorizontally().repeat(10);
    public static ConfiguredFeature<?, ?> END_GOLD_END = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE),
            com.batmanatorul.endupdate.register.Blocks.END_GOLD.getDefaultState(), 8)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0,0,50)))
            .spreadHorizontally().repeat(7);

public static void OreGenInit() {
    RegistryKey<ConfiguredFeature<?, ?>> end_iron_end = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(EndUpdate.MOD_ID, "end_iron_gen"));
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, end_iron_end.getValue(), END_IRON_END);
    BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, end_iron_end);
    RegistryKey<ConfiguredFeature<?, ?>> end_gold_end = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(EndUpdate.MOD_ID, "end_gold_gen"));
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, end_gold_end.getValue(), END_GOLD_END);
    BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, end_gold_end);
}}
