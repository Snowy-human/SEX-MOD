package net.mcreator.sex.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;

import net.mcreator.sex.entity.RiaEntity;
import net.mcreator.sex.SexMod;

public class DebugKeyTestOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(RiaEntity.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty()) {
			SexMod.LOGGER.info("doing the thing");
		}
	}
}
