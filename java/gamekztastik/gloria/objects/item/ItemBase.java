package gamekztastik.gloria.objects.item;

import gamekztastik.gloria.Main;
import gamekztastik.gloria.init.ItemInit;
import gamekztastik.gloria.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item implements IHasModel 
{
	private int lightValue;

	public ItemBase(String name, CreativeTabs tab) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
		
	}
	
    public int getLightValueItem(Item state)
    {
        return this.lightValue;
    }

	
	public ItemBase setLightLevelItem(float value)
    {
        this.lightValue = (int)(15.0F * value);
		return this;
}
}

