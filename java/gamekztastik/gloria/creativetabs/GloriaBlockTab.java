package gamekztastik.gloria.creativetabs;

import gamekztastik.gloria.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GloriaBlockTab extends CreativeTabs
{
	public GloriaBlockTab() 
	{
		super("gloriablocktab");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Item.getItemFromBlock(BlockInit.ORE_COPPER));
	}
}