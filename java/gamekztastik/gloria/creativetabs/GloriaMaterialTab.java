package gamekztastik.gloria.creativetabs;

import gamekztastik.gloria.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GloriaMaterialTab extends CreativeTabs
{
	public GloriaMaterialTab() 
	{
		super("gloriamaterialtab");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.COPPER_INGOT);
	}
}