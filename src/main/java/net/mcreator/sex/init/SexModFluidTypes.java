
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.sex.fluid.types.CumFluidType;
import net.mcreator.sex.SexMod;

public class SexModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SexMod.MODID);
	public static final RegistryObject<FluidType> CUM_TYPE = REGISTRY.register("cum", () -> new CumFluidType());
}
