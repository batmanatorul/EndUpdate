package com.batmanatorul.endupdate.register;


import com.batmanatorul.endupdate.EndUpdate;
import com.batmanatorul.endupdate.Fluids.Enderium_Fluid;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Fluids {

    public static FlowableFluid STILL_ENDERIUM;
    public static FlowableFluid FLOWING_ENDERIUM;
    public static Item ENDERIUM_BUCKET;
    public static Block ENDERIUM;

    public static void Enderium_Init() {
        STILL_ENDERIUM = Registry.register(Registry.FLUID, new Identifier(EndUpdate.MOD_ID, "enderium"), new Enderium_Fluid.STILL());
        FLOWING_ENDERIUM = Registry.register(Registry.FLUID, new Identifier(EndUpdate.MOD_ID, "flowing_enderium"), new Enderium_Fluid.Flowing());
        ENDERIUM_BUCKET = Registry.register(Registry.ITEM, new Identifier(EndUpdate.MOD_ID, "enderium_bucket"), new BucketItem(STILL_ENDERIUM, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));
        ENDERIUM = Registry.register(Registry.BLOCK, new Identifier(EndUpdate.MOD_ID, "enderium"), new FluidBlock(STILL_ENDERIUM, FabricBlockSettings.copy(Blocks.WATER)){});
    }

    public static void Init() {
        Enderium_Init();
    }
}
