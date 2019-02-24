package gamekztastik.gloria.objects.blocks;

import gamekztastik.gloria.tile.TileLight;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockLight extends BlockContainer
{
    public BlockLight()
    {
        super(Material.AIR);
        this.setLightLevel(0.8F);
        this.setUnlocalizedName("light_source");
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean isFullCube()
    {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileLight();
    }
}
