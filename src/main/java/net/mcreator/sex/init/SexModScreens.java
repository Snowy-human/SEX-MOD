
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sex.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.sex.client.gui.RiainventoryScreen;
import net.mcreator.sex.client.gui.RiaExpInventoryScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SexModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SexModMenus.RIAINVENTORY.get(), RiainventoryScreen::new);
			MenuScreens.register(SexModMenus.RIA_EXP_INVENTORY.get(), RiaExpInventoryScreen::new);
		});
	}
}
