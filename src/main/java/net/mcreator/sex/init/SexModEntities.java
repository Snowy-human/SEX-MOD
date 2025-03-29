
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.sex.entity.RobotEntity;
import net.mcreator.sex.entity.RiastrippedexpanEntity;
import net.mcreator.sex.entity.RiastrippedEntity;
import net.mcreator.sex.entity.RiagainEntity;
import net.mcreator.sex.entity.RiaexpangainEntity;
import net.mcreator.sex.entity.RiaexpanEntity;
import net.mcreator.sex.entity.RiaEntity;
import net.mcreator.sex.entity.PLayreEntity;
import net.mcreator.sex.entity.JennyEntity;
import net.mcreator.sex.SexMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SexModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SexMod.MODID);
	public static final RegistryObject<EntityType<RiaEntity>> RIA = register("ria",
			EntityType.Builder.<RiaEntity>of(RiaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RiaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RiaexpanEntity>> RIAEXPAN = register("riaexpan",
			EntityType.Builder.<RiaexpanEntity>of(RiaexpanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RiaexpanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JennyEntity>> JENNY = register("jenny",
			EntityType.Builder.<JennyEntity>of(JennyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JennyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RiastrippedEntity>> RIASTRIPPED = register("riastripped",
			EntityType.Builder.<RiastrippedEntity>of(RiastrippedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RiastrippedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RiastrippedexpanEntity>> RIASTRIPPEDEXPAN = register("riastrippedexpan",
			EntityType.Builder.<RiastrippedexpanEntity>of(RiastrippedexpanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RiastrippedexpanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PLayreEntity>> PLAYER_RIA = register("player_ria",
			EntityType.Builder.<PLayreEntity>of(PLayreEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PLayreEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RobotEntity>> ROBOT = register("robot",
			EntityType.Builder.<RobotEntity>of(RobotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RobotEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RiaexpangainEntity>> RIAEXPANGAIN = register("riaexpangain",
			EntityType.Builder.<RiaexpangainEntity>of(RiaexpangainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RiaexpangainEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RiagainEntity>> RIAGAIN = register("riagain",
			EntityType.Builder.<RiagainEntity>of(RiagainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RiagainEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RiaEntity.init();
			RiaexpanEntity.init();
			JennyEntity.init();
			RiastrippedEntity.init();
			RiastrippedexpanEntity.init();
			PLayreEntity.init();
			RobotEntity.init();
			RiaexpangainEntity.init();
			RiagainEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RIA.get(), RiaEntity.createAttributes().build());
		event.put(RIAEXPAN.get(), RiaexpanEntity.createAttributes().build());
		event.put(JENNY.get(), JennyEntity.createAttributes().build());
		event.put(RIASTRIPPED.get(), RiastrippedEntity.createAttributes().build());
		event.put(RIASTRIPPEDEXPAN.get(), RiastrippedexpanEntity.createAttributes().build());
		event.put(PLAYER_RIA.get(), PLayreEntity.createAttributes().build());
		event.put(ROBOT.get(), RobotEntity.createAttributes().build());
		event.put(RIAEXPANGAIN.get(), RiaexpangainEntity.createAttributes().build());
		event.put(RIAGAIN.get(), RiagainEntity.createAttributes().build());
	}
}
