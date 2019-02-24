package gamekztastik.gloria.init;

import java.util.ArrayList;
import java.util.List;

import gamekztastik.gloria.Main;
import gamekztastik.gloria.objects.armour.ArmourBase;
import gamekztastik.gloria.objects.armour.ReinforcedArmorBase;
import gamekztastik.gloria.objects.armour.unique.MinersHelmetBase;
import gamekztastik.gloria.objects.item.ItemBase;
import gamekztastik.gloria.objects.tools.ToolAxeBase;
import gamekztastik.gloria.objects.tools.ToolHoeBase;
import gamekztastik.gloria.objects.tools.ToolPickaxeBase;
import gamekztastik.gloria.objects.tools.ToolShovelBase;
import gamekztastik.gloria.objects.tools.ToolSwordBase;
import gamekztastik.gloria.util.Reference;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Armor Material
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("copper", Reference.MODID + ":copper", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0f);
	public static final ArmorMaterial ARMOR_EMERALD = EnumHelper.addArmorMaterial("emerald", Reference.MODID + ":emerald", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0f);
	public static final ArmorMaterial ARMOR_MINERS = EnumHelper.addArmorMaterial("miners", Reference.MODID + ":miners", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0f);
	public static final ArmorMaterial ARMOR_MINERS_GOLD = EnumHelper.addArmorMaterial("miners_gold", Reference.MODID + ":miners_gold", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0f);
	public static final ArmorMaterial ARMOR_REINFORCEDLEATHER = EnumHelper.addArmorMaterial("reinforcedleather", Reference.MODID + ":reinforcedleather", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0f);
	///Armor
	public static final Item MINERS_HELMET = new MinersHelmetBase("miners_helmet", ARMOR_MINERS, EntityEquipmentSlot.HEAD, Main.GLORIACOMBATSTAB, new PotionEffect(MobEffects.NIGHT_VISION, 3, 1));
	public static final Item GOLD_MINERS_HELMET = new MinersHelmetBase("gold_miners_helmet", ARMOR_COPPER, EntityEquipmentSlot.HEAD, Main.GLORIACOMBATSTAB, null);
	
	public static final Item COPPER_HELMET = new ArmourBase("copper_helmet", ARMOR_COPPER, EntityEquipmentSlot.HEAD, Main.GLORIACOMBATSTAB);
	public static final Item COPPER_CHESTPLATE = new ArmourBase("copper_chestplate", ARMOR_COPPER, EntityEquipmentSlot.CHEST, Main.GLORIACOMBATSTAB);
	public static final Item COPPER_LEGGINGS = new ArmourBase("copper_leggings", ARMOR_COPPER, EntityEquipmentSlot.LEGS, Main.GLORIACOMBATSTAB);
	public static final Item COPPER_BOOTS = new ArmourBase("copper_boots", ARMOR_COPPER, EntityEquipmentSlot.FEET, Main.GLORIACOMBATSTAB);
	
	public static final Item EMERALD_HELMET = new ArmourBase("emerald_helmet", ARMOR_EMERALD, EntityEquipmentSlot.HEAD, Main.GLORIACOMBATSTAB);
	public static final Item EMERALD_CHESTPLATE = new ArmourBase("emerald_chestplate", ARMOR_EMERALD, EntityEquipmentSlot.CHEST, Main.GLORIACOMBATSTAB);
	public static final Item EMERALD_LEGGINGS = new ArmourBase("emerald_leggings", ARMOR_EMERALD, EntityEquipmentSlot.LEGS, Main.GLORIACOMBATSTAB);
	public static final Item EMERALD_BOOTS = new ArmourBase("emerald_boots", ARMOR_EMERALD, EntityEquipmentSlot.FEET, Main.GLORIACOMBATSTAB);
	
	public static final Item REINFORCEDLEATHER_HELMET = new ReinforcedArmorBase("reinforcedleather_helmet", ARMOR_REINFORCEDLEATHER, EntityEquipmentSlot.HEAD, Main.GLORIACOMBATSTAB);
	public static final Item REINFORCEDLEATHER_CHESTPLATE = new ReinforcedArmorBase("reinforcedleather_chestplate", ARMOR_REINFORCEDLEATHER, EntityEquipmentSlot.CHEST, Main.GLORIACOMBATSTAB);
	public static final Item REINFORCEDLEATHER_LEGGINGS = new ReinforcedArmorBase("reinforcedleather_leggings", ARMOR_REINFORCEDLEATHER, EntityEquipmentSlot.LEGS, Main.GLORIACOMBATSTAB);
	public static final Item REINFORCEDLEATHER_BOOTS = new ReinforcedArmorBase("reinforcedleather_boots", ARMOR_REINFORCEDLEATHER, EntityEquipmentSlot.FEET, Main.GLORIACOMBATSTAB);
	
	//Materials
	public static final Item CHAIN = new ItemBase("chain", Main.GLORIAMATERIALSTAB);
	
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot", Main.GLORIAMATERIALSTAB);
	
	
	//Tool Materials
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 400, 3.0f, 5.0f, 20);
	//Tools
	public static final Item COPPER_AXE = new ToolAxeBase("copper_axe", TOOL_COPPER, Main.GLORIACOMBATSTAB);
	public static final Item COPPER_HOE = new ToolHoeBase("copper_hoe", TOOL_COPPER, Main.GLORIACOMBATSTAB);
	public static final Item COPPER_PICKAXE = new ToolPickaxeBase("copper_pickaxe", TOOL_COPPER, Main.GLORIACOMBATSTAB);
	public static final Item COPPER_SHOVEL = new ToolShovelBase("copper_shovel", TOOL_COPPER, Main.GLORIACOMBATSTAB);
	public static final Item COPPER_SWORD = new ToolSwordBase("copper_sword", TOOL_COPPER, Main.GLORIACOMBATSTAB);
}
