package net.vasilis.cavernroot.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.vasilis.cavernroot.world.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void generateTrees() {

        // The following line is similar to cancer. It spreads and grows larger, but I cannot stop it.
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES, BiomeKeys.DEEP_DARK, BiomeKeys.PLAINS, BiomeKeys.FOREST, BiomeKeys.TAIGA, BiomeKeys.DESERT, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CAVERN_ROOT_PLACED_KEY);

    }
}