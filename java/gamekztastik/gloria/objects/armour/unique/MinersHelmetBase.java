package gamekztastik.gloria.objects.armour.unique;

import gamekztastik.gloria.Main;
import gamekztastik.gloria.init.ItemInit;
import gamekztastik.gloria.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MinersHelmetBase extends ItemArmor implements IHasModel 
{
	public MinersHelmetBase(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs tab, PotionEffect potionEffect)
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


