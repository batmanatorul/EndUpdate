package com.batmanatorul.endupdate.Fluids;

import com.batmanatorul.endupdate.register.Fluids;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;


public abstract class Enderium_Fluid extends Enderium {
    @Override
    public Fluid getFlowing() {
        return Fluids.FLOWING_ENDERIUM;
    }

    @Override
    public Fluid getStill() {
        return Fluids.STILL_ENDERIUM;
    }

    @Override
    public Item getBucketItem() {
        return Fluids.ENDERIUM_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return Fluids.ENDERIUM.getDefaultState().with(Properties.LEVEL_15, method_15741(state));
    }
    public static class Flowing extends Enderium_Fluid{

        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }
    }
    public static class STILL extends Enderium_Fluid {
        @Override
        public int getLevel(FluidState state) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState state) {
            return true;
        }
    }}
