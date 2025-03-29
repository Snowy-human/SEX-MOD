
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.sex.world.inventory.RiainventoryMenu;
import net.mcreator.sex.world.inventory.RiaExpInventoryMenu;
import net.mcreator.sex.SexMod;

public class SexModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SexMod.MODID);
	public static final RegistryObject<MenuType<RiainventoryMenu>> RIAINVENTORY = REGISTRY.register("riainventory", () -> IForgeMenuType.create(RiainventoryMenu::new));
	public static final RegistryObject<MenuType<RiaExpInventoryMenu>> RIA_EXP_INVENTORY = REGISTRY.register("ria_exp_inventory", () -> IForgeMenuType.create(RiaExpInventoryMenu::new));
}
