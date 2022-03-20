
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
import net.mcreator.envirocraft.fluid.attributes.EnviroWaterFluidAttributes;

public abstract class EnviroWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(EnvirocraftModFluids.ENVIRO_WATER,
			EnvirocraftModFluids.FLOWING_ENVIRO_WATER,
			EnviroWaterFluidAttributes
					.builder(new ResourceLocation("envirocraft:blocks/envirowater"), new ResourceLocation("envirocraft:blocks/envirowater0"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty"))).color(-13083194))
							.explosionResistance(1000f).canMultiply()

							.bucket(EnvirocraftModItems.ENVIRO_WATER_BUCKET).block(() -> (LiquidBlock) EnvirocraftModBlocks.ENVIRO_WATER.get());

	private EnviroWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends EnviroWaterFluid {
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

	public static class Flowing extends EnviroWaterFluid {
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
