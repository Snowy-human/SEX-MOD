
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sex.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sex.client.renderer.RobotRenderer;
import net.mcreator.sex.client.renderer.RiastrippedexpanRenderer;
import net.mcreator.sex.client.renderer.RiastrippedRenderer;
import net.mcreator.sex.client.renderer.RiagainRenderer;
import net.mcreator.sex.client.renderer.RiaexpangainRenderer;
import net.mcreator.sex.client.renderer.RiaexpanRenderer;
import net.mcreator.sex.client.renderer.RiaRenderer;
import net.mcreator.sex.client.renderer.PLayreRenderer;
import net.mcreator.sex.client.renderer.JennyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SexModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SexModEntities.RIA.get(), RiaRenderer::new);
		event.registerEntityRenderer(SexModEntities.RIAEXPAN.get(), RiaexpanRenderer::new);
		event.registerEntityRenderer(SexModEntities.JENNY.get(), JennyRenderer::new);
		event.registerEntityRenderer(SexModEntities.RIASTRIPPED.get(), RiastrippedRenderer::new);
		event.registerEntityRenderer(SexModEntities.RIASTRIPPEDEXPAN.get(), RiastrippedexpanRenderer::new);
		event.registerEntityRenderer(SexModEntities.PLAYER_RIA.get(), PLayreRenderer::new);
		event.registerEntityRenderer(SexModEntities.ROBOT.get(), RobotRenderer::new);
		event.registerEntityRenderer(SexModEntities.RIAEXPANGAIN.get(), RiaexpangainRenderer::new);
		event.registerEntityRenderer(SexModEntities.RIAGAIN.get(), RiagainRenderer::new);
	}
}
