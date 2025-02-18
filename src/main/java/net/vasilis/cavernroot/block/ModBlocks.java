package net.vasilis.cavernroot.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.vasilis.cavernroot.CavernRoot;

public class ModBlocks {
    public static final Block CAVERN_ROOT_BLOCK = registerBlock("cavern_root_block",
            new Block(
                    AbstractBlock.Settings.create()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.MOSS_CARPET)
            )
    );


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CavernRoot.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CavernRoot.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CavernRoot.LOGGER.info("Registering Mod Blocks for" + CavernRoot.MOD_ID);
    }
}
