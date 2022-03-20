
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.envirocraft.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnvirocraftModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> SPAWNENVIROSTRUCTURES = GameRules.register("spawnEnviroStructures",
			GameRules.Category.SPAWNING, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWNENVIROMOBS = GameRules.register("spawnEnviroMobs", GameRules.Category.SPAWNING,
			GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> ENVIRODIMENABLED = GameRules.register("enviroDimEnabled", GameRules.Category.MISC,
			GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.IntegerValue> ENVIRODIMBUILD = GameRules.register("enviroDimBuild", GameRules.Category.PLAYER,
			GameRules.IntegerValue.create(512));
}
