package guapisimos.family.mod;

import java.util.Arrays;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.GenerationStep;

public class Family implements ModInitializer {

	public static final Block FAMILY_ORE = new familyOre();
	private static ConfiguredFeature<?, ?> OVERWORLD_FAMILY_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(Feature.ORE, new OreFeatureConfig(
	OreConfiguredFeatures.STONE_ORE_REPLACEABLES, FAMILY_ORE.getDefaultState(), 10));
	public static PlacedFeature OVERWORLD_FAMILY_ORE_PLACED_FEATURE = new PlacedFeature(
      RegistryEntry.of(OVERWORLD_FAMILY_ORE_CONFIGURED_FEATURE),
      Arrays.asList(
          CountPlacementModifier.of(200), 
          SquarePlacementModifier.of(),
          HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
      ));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK , new Identifier("family", "family_ore"), FAMILY_ORE);
		Registry.register(Registry.ITEM , new Identifier("family", "family_ore"), new BlockItem(FAMILY_ORE, new Item.Settings().group(ItemGroup.MISC)));
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("family", "overworld_family_ore"), OVERWORLD_FAMILY_ORE_PLACED_FEATURE);
    	BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
        RegistryKey.of(Registry.PLACED_FEATURE_KEY,
            new Identifier("family", "overworld_family_ore")));
	}
}
