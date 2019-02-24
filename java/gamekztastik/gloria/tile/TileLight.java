package gamekztastik.gloria.tile;

import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileLight extends TileEntity implements ITickable
{
    public int ticks;

    @Override
    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);

        ticks = nbt.getInteger("Ticks");
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);

        nbt.setInteger("Ticks", ticks);
		return nbt;
    }

    @Override
    public void update()
    {
        ticks += 1;

        if (ticks > 2)
        {
            world.setBlockState(pos, Blocks.AIR.getDefaultState());
        }
    }
}
