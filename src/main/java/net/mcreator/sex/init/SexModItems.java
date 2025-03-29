
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.sex.item.CumItem;
import net.mcreator.sex.SexMod;

public class SexModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SexMod.MODID);
	public static final RegistryObject<Item> RIA_SPAWN_EGG = REGISTRY.register("ria_spawn_egg", () -> new ForgeSpawnEggItem(SexModEntities.RIA, -16738048, -3407668, new Item.Properties()));
	public static final RegistryObject<Item> CUM_BUCKET = REGISTRY.register("cum_bucket", () -> new CumItem());
	public static final RegistryObject<Item> JENNY_SPAWN_EGG = REGISTRY.register("jenny_spawn_egg", () -> new ForgeSpawnEggItem(SexModEntities.JENNY, -16777216, -10092442, new Item.Properties()));
	public static final RegistryObject<Item> ROBOT_SPAWN_EGG = REGISTRY.register("robot_spawn_egg", () -> new ForgeSpawnEggItem(SexModEntities.ROBOT, -39322, -1, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
