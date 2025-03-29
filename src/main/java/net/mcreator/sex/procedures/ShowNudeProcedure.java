package net.mcreator.sex.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.sex.network.SexModVariables;

public class ShowNudeProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(SexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SexModVariables.PlayerVariables())).IsNude == false) {
			return true;
		}
		return false;
	}
}
