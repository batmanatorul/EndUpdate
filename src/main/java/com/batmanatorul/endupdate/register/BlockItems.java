package com.batmanatorul.endupdate.register;

import com.batmanatorul.endupdate.EndUpdate;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockItems {
    public static final BlockItem END_IRON = new BlockItem(Blocks.END_IRON, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void BLockItemsInit() {
        Registry.register(Registry.ITEM, new Identifier(EndUpdate.MOD_ID, "end_iron"), END_IRON);
    }
}
