package guapisimos.family.mod;

import java.util.Arrays;
import java.util.Random;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
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
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;

public class familyOre extends Block {    
    public familyOre() {
        super(FabricBlockSettings.of(Material.STONE).strength(2, 2.0f));
    }

    public static final Block HOMER_ORE = new familyOre();
	private static ConfiguredFeature<?, ?> OVERWORLD_HOMER_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(Feature.ORE, new OreFeatureConfig(
	OreConfiguredFeatures.STONE_ORE_REPLACEABLES, HOMER_ORE.getDefaultState(), 10));
	public static PlacedFeature OVERWORLD_HOMER_ORE = new PlacedFeature(
      RegistryEntry.of(OVERWORLD_HOMER_ORE_CONFIGURED_FEATURE),
      Arrays.asList(
          CountPlacementModifier.of(200), 
          SquarePlacementModifier.of(),
          HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
    ));

    public static final Block MARGE_ORE = new familyOre();
	private static ConfiguredFeature<?, ?> OVERWORLD_MARGE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(Feature.ORE, new OreFeatureConfig(
	OreConfiguredFeatures.STONE_ORE_REPLACEABLES, MARGE_ORE.getDefaultState(), 10));
	public static PlacedFeature OVERWORLD_MARGE_ORE = new PlacedFeature(
      RegistryEntry.of(OVERWORLD_MARGE_ORE_CONFIGURED_FEATURE),
      Arrays.asList(
          CountPlacementModifier.of(200), 
          SquarePlacementModifier.of(),
          HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
    ));

    public static final Block BART_ORE = new familyOre();
	private static ConfiguredFeature<?, ?> OVERWORLD_BART_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(Feature.ORE, new OreFeatureConfig(
	OreConfiguredFeatures.STONE_ORE_REPLACEABLES, BART_ORE.getDefaultState(), 10));
	public static PlacedFeature OVERWORLD_BART_ORE = new PlacedFeature(
      RegistryEntry.of(OVERWORLD_BART_ORE_CONFIGURED_FEATURE),
      Arrays.asList(
          CountPlacementModifier.of(200), 
          SquarePlacementModifier.of(),
          HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
    ));

    public static final Block LISA_ORE = new familyOre();
	private static ConfiguredFeature<?, ?> OVERWORLD_LISA_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(Feature.ORE, new OreFeatureConfig(
	OreConfiguredFeatures.STONE_ORE_REPLACEABLES, LISA_ORE.getDefaultState(), 10));
	public static PlacedFeature OVERWORLD_LISA_ORE = new PlacedFeature(
      RegistryEntry.of(OVERWORLD_LISA_ORE_CONFIGURED_FEATURE),
      Arrays.asList(
          CountPlacementModifier.of(200), 
          SquarePlacementModifier.of(),
          HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
    ));

    public static final Block MAGGIE_ORE = new familyOre();
	private static ConfiguredFeature<?, ?> OVERWORLD_MAGGIE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(Feature.ORE, new OreFeatureConfig(
	OreConfiguredFeatures.STONE_ORE_REPLACEABLES, MAGGIE_ORE.getDefaultState(), 10));
	public static PlacedFeature OVERWORLD_MAGGIE_ORE = new PlacedFeature(
      RegistryEntry.of(OVERWORLD_MAGGIE_ORE_CONFIGURED_FEATURE),
      Arrays.asList(
          CountPlacementModifier.of(200), 
          SquarePlacementModifier.of(),
          HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
    ));

    public static final Block SNOWBALL_ORE = new familyOre();
	private static ConfiguredFeature<?, ?> OVERWORLD_SNOWBALL_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(Feature.ORE, new OreFeatureConfig(
	OreConfiguredFeatures.STONE_ORE_REPLACEABLES, SNOWBALL_ORE.getDefaultState(), 10));
	public static PlacedFeature OVERWORLD_SNOWBALL_ORE = new PlacedFeature(
      RegistryEntry.of(OVERWORLD_SNOWBALL_ORE_CONFIGURED_FEATURE),
      Arrays.asList(
          CountPlacementModifier.of(200), 
          SquarePlacementModifier.of(),
          HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
    ));

    public static final Block SANTA_ORE = new familyOre();
	private static ConfiguredFeature<?, ?> OVERWORLD_SANTA_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(Feature.ORE, new OreFeatureConfig(
	OreConfiguredFeatures.STONE_ORE_REPLACEABLES, SANTA_ORE.getDefaultState(), 10));
	public static PlacedFeature OVERWORLD_SANTA_ORE = new PlacedFeature(
      RegistryEntry.of(OVERWORLD_SANTA_ORE_CONFIGURED_FEATURE),
      Arrays.asList(
          CountPlacementModifier.of(200), 
          SquarePlacementModifier.of(),
          HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
    ));
    
    protected int getExperienceWhenMined(Random random) {
        return MathHelper.nextInt(random, 0, 2);
    }

    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            int i = this.getExperienceWhenMined(world.random);
            if (i > 0) {
                this.dropExperience(world, pos, i);
            }
        }
    }

    public static void startOre(String name, Block item, PlacedFeature ow) {
        Registry.register(Registry.BLOCK , new Identifier("family", name), item);
		Registry.register(Registry.ITEM , new Identifier("family", name), new BlockItem(item, new Item.Settings().group(ItemGroup.MISC)));
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("family", "overworld_" + name), ow);
    	BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
        RegistryKey.of(Registry.PLACED_FEATURE_KEY,
            new Identifier("family", "overworld_" + name)));
    }

    public static void initOre() {
        startOre("homer_ore", HOMER_ORE, OVERWORLD_HOMER_ORE);
        startOre("marge_ore", MARGE_ORE, OVERWORLD_MARGE_ORE);
        startOre("bart_ore", BART_ORE, OVERWORLD_BART_ORE);
        startOre("lisa_ore", LISA_ORE, OVERWORLD_LISA_ORE);
        startOre("maggie_ore", MAGGIE_ORE, OVERWORLD_MAGGIE_ORE);
        startOre("snowball_ore", SNOWBALL_ORE, OVERWORLD_SNOWBALL_ORE);
        startOre("santa_ore", SANTA_ORE, OVERWORLD_SANTA_ORE);
    }
}