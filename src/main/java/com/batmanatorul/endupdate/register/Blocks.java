package com.batmanatorul.endupdate.register;


import com.batmanatorul.endupdate.EndUpdate;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {
    public static final Block END_IRON = new Block(FabricBlockSettings
            .of(Material.STONE)
            .strength(4, 10)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool());

    public static void BlocksInit() {
        Registry.register(Registry.BLOCK, new Identifier(EndUpdate.MOD_ID, "end_iron"), END_IRON);
    }
}
