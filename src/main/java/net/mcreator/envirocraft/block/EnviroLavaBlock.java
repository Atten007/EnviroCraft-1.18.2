
package net.mcreator.envirocraft.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.envirocraft.init.EnvirocraftModFluids;

public class EnviroLavaBlock extends LiquidBlock {
	public EnviroLavaBlock() {
		super(() -> (FlowingFluid) EnvirocraftModFluids.ENVIRO_LAVA.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(1000f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
