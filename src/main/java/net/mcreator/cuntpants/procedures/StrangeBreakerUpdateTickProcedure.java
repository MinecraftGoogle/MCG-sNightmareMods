package net.mcreator.cuntpants.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.cuntpants.CuntpantsModElements;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

@CuntpantsModElements.ModElement.Tag
public class StrangeBreakerUpdateTickProcedure extends CuntpantsModElements.ModElement {
	public StrangeBreakerUpdateTickProcedure(CuntpantsModElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure StrangeBreakerUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure StrangeBreakerUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure StrangeBreakerUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure StrangeBreakerUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double generator_distance = 0;
		double energy = 0;
		generator_distance = (double) 1;
		if (((500 < (new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z)))) == (world.getBlockState(new BlockPos((int) (x + (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getXOffset()) * (generator_distance))), (int) (y + (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getYOffset()) * (generator_distance))), (int) (z + (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getZOffset()) * (generator_distance))))).isSolid()))) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + (((new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						return _bs.get(property);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getXOffset()) * (generator_distance))), (int) (y + (((new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						return _bs.get(property);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getYOffset()) * (generator_distance))), (int) (z + (((new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						return _bs.get(property);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getZOffset()) * (generator_distance))))), world.getWorld(),
					new BlockPos((int) (x + (((new Object() {
						public Direction getDirection(BlockPos pos) {
							try {
								BlockState _bs = world.getBlockState(pos);
								DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
								return _bs.get(property);
							} catch (Exception e) {
								return Direction.NORTH;
							}
						}
					}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getXOffset()) * (generator_distance))), (int) (y + (((new Object() {
						public Direction getDirection(BlockPos pos) {
							try {
								BlockState _bs = world.getBlockState(pos);
								DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
								return _bs.get(property);
							} catch (Exception e) {
								return Direction.NORTH;
							}
						}
					}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getYOffset()) * (generator_distance))), (int) (z + (((new Object() {
						public Direction getDirection(BlockPos pos) {
							try {
								BlockState _bs = world.getBlockState(pos);
								DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
								return _bs.get(property);
							} catch (Exception e) {
								return Direction.NORTH;
							}
						}
					}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getZOffset()) * (generator_distance)))));
			world.destroyBlock(new BlockPos((int) (x + (((new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						return _bs.get(property);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getXOffset()) * (generator_distance))), (int) (y + (((new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						return _bs.get(property);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getYOffset()) * (generator_distance))), (int) (z + (((new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						return _bs.get(property);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getZOffset()) * (generator_distance)))), false);
			energy = (double) ((new Object() {
				public int getEnergyStored(BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z))) - 500);
		}
	}
}
