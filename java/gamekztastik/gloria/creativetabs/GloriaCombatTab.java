package gamekztastik.gloria.creativetabs;

import gamekztastik.gloria.init.BlockInit;
import gamekztastik.gloria.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GloriaCombatTab extends CreativeTabs
{
	public GloriaCombatTab() 
	{
		super("gloriacombattab");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.COPPER_SWORD);
	}
}