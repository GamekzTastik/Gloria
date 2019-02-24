package gamekztastik.gloria.init;

import java.util.ArrayList;
import java.util.List;

import gamekztastik.gloria.Main;
import gamekztastik.gloria.objects.blocks.BlockBase;
import gamekztastik.gloria.objects.blocks.BlockLight;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Ores
	public static final Block ORE_COPPER = new BlockBase("ore_copper", Material.IRON, Main.GLORIABLOCKSSTAB).setHardness(3.0F).setResistance(5.0F);
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON, Main.GLORIABLOCKSSTAB).setHardness(5.0F).setResistance(5.0F);
	public static final Block BLOCK_LIGHT = new BlockLight();
	//Aluminum

	
	//Custom Models
	
	
	//Machines
	
	
}