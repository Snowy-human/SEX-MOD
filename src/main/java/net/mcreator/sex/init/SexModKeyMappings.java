
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sex.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.sex.network.FuckitMessage;
import net.mcreator.sex.network.DebugKeyTestMessage;
import net.mcreator.sex.SexMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SexModKeyMappings {
	public static final KeyMapping FUCKIT = new KeyMapping("key.sex.fuckit", GLFW.GLFW_KEY_V, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SexMod.PACKET_HANDLER.sendToServer(new FuckitMessage(0, 0));
				FuckitMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DEBUG_KEY_TEST = new KeyMapping("key.sex.debug_key_test", GLFW.GLFW_KEY_PERIOD, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SexMod.PACKET_HANDLER.sendToServer(new DebugKeyTestMessage(0, 0));
				DebugKeyTestMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(FUCKIT);
		event.register(DEBUG_KEY_TEST);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				FUCKIT.consumeClick();
				DEBUG_KEY_TEST.consumeClick();
			}
		}
	}
}
