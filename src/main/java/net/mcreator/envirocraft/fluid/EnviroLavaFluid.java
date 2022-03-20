
package net.mcreator.envirocraft.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.envirocraft.init.EnvirocraftModItems;
import net.mcreator.envirocraft.init.EnvirocraftModFluids;
import net.mcreator.envirocraft.init.EnvirocraftModBlocks;

public abstract class EnviroLavaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(EnvirocraftModFluids.ENVIRO_LAVA,
			EnvirocraftModFluids.FLOWING_ENVIRO_LAVA,
			FluidAttributes.builder(new ResourceLocation("envirocraft:blocks/envirolava"), new ResourceLocation("envirocraft:blocks/envirolava0"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_lava")))).explosionResistance(1000f)
							.canMultiply()

							.bucket(EnvirocraftModItems.ENVIRO_LAVA_BUCKET).block(() -> (LiquidBlock) EnvirocraftModBlocks.ENVIRO_LAVA.get());

	private EnviroLavaFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends EnviroLavaFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends EnviroLavaFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
