
package net.mcreator.envirocraft.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.envirocraft.init.EnvirocraftModFluids;

public class EnviroWaterBlock extends LiquidBlock {
	public EnviroWaterBlock() {
		super(() -> (FlowingFluid) EnvirocraftModFluids.ENVIRO_WATER.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.WATER).strength(1000f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
