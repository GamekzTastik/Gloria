package gamekztastik.gloria.event;

import gamekztastik.gloria.init.BlockInit;
import gamekztastik.gloria.init.ItemInit;
import gamekztastik.gloria.tile.TileLight;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class CommonEventHandler
{
    @SubscribeEvent
    public void playerTick(TickEvent.PlayerTickEvent event)
    {
        EntityPlayer player = event.player;

        if(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) == new ItemStack(ItemInit.MINERS_HELMET))
        {
        	RayTraceResult mop = rayTrace(player, 20, 1.0F);

            if (mop != null)
            {
                if (!(mop.typeOfHit == RayTraceResult.Type.MISS))
                {
                    net.minecraft.util.math.BlockPos pos;

                    if (mop.typeOfHit == RayTraceResult.Type.ENTITY)
                    {
                        pos = mop.entityHit.getPosition();
                    }
                    else
                    {
                        pos = mop.getBlockPos();
                        pos = pos.offset(mop.sideHit);
                    }

                    if (player.world.getBlockState(pos).getBlock() == BlockInit.BLOCK_LIGHT)
                    {
                        TileLight tileLight = (TileLight) player.world.getTileEntity(pos);
                        tileLight.ticks = 0;
                    }
                    else
                    {
                        if (player.world.isAirBlock(pos))
                        {
                            player.world.setBlockState(pos, BlockInit.BLOCK_LIGHT.getDefaultState());
                        }
                    }
                }
            }
        }
    }
	public Vec3d getPositionEyes(EntityPlayer player, float partialTick)
    {
        if (partialTick == 1.0F)
        {
            return new Vec3d(player.posX, player.posY + (double)player.getEyeHeight(), player.posZ);
        }
        else
        {
            double d0 = player.prevPosX + (player.posX - player.prevPosX) * (double)partialTick;
            double d1 = player.prevPosY + (player.posY - player.prevPosY) * (double)partialTick + (double)player.getEyeHeight();
            double d2 = player.prevPosZ + (player.posZ - player.prevPosZ) * (double)partialTick;
            return new Vec3d(d0, d1, d2);
        }
    }

    public RayTraceResult rayTrace(EntityPlayer player, double distance, float partialTick)
    {
        Vec3d vec3 = getPositionEyes(player, partialTick);
        Vec3d vec31 = player.getLook(partialTick);
        Vec3d vec32 = vec3.addVector(vec31.x * distance, vec31.y * distance, vec31.z * distance);
        return player.world.rayTraceBlocks(vec3, vec32, false, false, true);
    }
}
