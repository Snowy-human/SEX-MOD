
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.sex.block.CumBlock;
import net.mcreator.sex.SexMod;

public class SexModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SexMod.MODID);
	public static final RegistryObject<Block> CUM = REGISTRY.register("cum", () -> new CumBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
