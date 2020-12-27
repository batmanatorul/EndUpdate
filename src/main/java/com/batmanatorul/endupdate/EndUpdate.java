package com.batmanatorul.endupdate;


import com.batmanatorul.endupdate.gen.OreGen;
import com.batmanatorul.endupdate.register.BlockItems;
import com.batmanatorul.endupdate.register.Blocks;
import net.fabricmc.api.ModInitializer;

public class EndUpdate implements ModInitializer {
    public static final String MOD_ID = "endup";

    @Override
    public void onInitialize() {
        Blocks.BlocksInit();
        BlockItems.BLockItemsInit();
        OreGen.OreGenInit();
    }
}
