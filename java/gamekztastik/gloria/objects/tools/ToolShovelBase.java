package gamekztastik.gloria.objects.tools;

import gamekztastik.gloria.Main;
import gamekztastik.gloria.init.ItemInit;
import gamekztastik.gloria.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolShovelBase extends ItemSpade implements IHasModel
{
	public ToolShovelBase(String name, ToolMaterial material, CreativeTabs tab) 
	{
		super(material);
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
}
