
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.sex.SexMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SexModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SexMod.MODID);
	public static final RegistryObject<CreativeModeTab> SEX_2 = REGISTRY.register("sex_2",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sex.sex_2")).icon(() -> new ItemStack(Blocks.END_ROD)).displayItems((parameters, tabData) -> {
				tabData.accept(SexModItems.RIA_SPAWN_EGG.get());
				tabData.accept(SexModItems.CUM_BUCKET.get());
				tabData.accept(SexModItems.JENNY_SPAWN_EGG.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(SexModItems.RIA_SPAWN_EGG.get());
			tabData.accept(SexModItems.JENNY_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SexModItems.CUM_BUCKET.get());
		}
	}
}
