
package net.mcreator.envirocraft.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;

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
import net.mcreator.envirocraft.fluid.attributes.EnviroFluidFluidAttributes;

public abstract class EnviroFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(EnvirocraftModFluids.ENVIRO_FLUID,
			EnvirocraftModFluids.FLOWING_ENVIRO_FLUID,
			EnviroFluidFluidAttributes
					.builder(new ResourceLocation("envirocraft:blocks/envirofluidsilent"), new ResourceLocation("envirocraft:blocks/envirofluid"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty"))).color(-8214273))
							.explosionResistance(1000f).canMultiply()

							.levelDecreasePerBlock(3)

							.bucket(EnvirocraftModItems.ENVIRO_FLUID_BUCKET).block(() -> (LiquidBlock) EnvirocraftModBlocks.ENVIRO_FLUID.get());

	private EnviroFluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.SPIT;
	}

	public static class Source extends EnviroFluidFluid {
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

	public static class Flowing extends EnviroFluidFluid {
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
