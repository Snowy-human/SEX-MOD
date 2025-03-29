
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.sex.potion.MovementStopMobEffect;
import net.mcreator.sex.SexMod;

public class SexModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SexMod.MODID);
	public static final RegistryObject<MobEffect> MOVEMENT_STOP = REGISTRY.register("movement_stop", () -> new MovementStopMobEffect());
}
