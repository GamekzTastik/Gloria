package gamekztastik.gloria.objects.armour;

import gamekztastik.gloria.Main;
import gamekztastik.gloria.init.ItemInit;
import gamekztastik.gloria.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.nbt.NBTTagCompound;

public class ArmourBase extends ItemArmor implements IHasModel 
{
	public ArmourBase(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs tab)
	{
		super(materialIn, 1, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
	
}

