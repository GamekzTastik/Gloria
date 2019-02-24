package gamekztastik.gloria;

import gamekztastik.gloria.creativetabs.GloriaBlockTab;
import gamekztastik.gloria.creativetabs.GloriaCombatTab;
import gamekztastik.gloria.creativetabs.GloriaMaterialTab;
import gamekztastik.gloria.init.BlockInit;
import gamekztastik.gloria.init.ItemInit;
import gamekztastik.gloria.init.SmeltingInit;
import gamekztastik.gloria.proxy.CommonProxy;
import gamekztastik.gloria.util.Reference;
import gamekztastik.gloria.util.handlers.RegistryHandler;
import gamekztastik.gloria.init.SmeltingInit;
import gamekztastik.gloria.event.CommonEventHandler;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	 @Instance
	 public static Main instance;
	 
	 @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	 public static CommonProxy proxy;
	 
	 public static final CreativeTabs GLORIAMATERIALSTAB = new GloriaMaterialTab();
	 public static final CreativeTabs GLORIABLOCKSSTAB = new GloriaBlockTab();
	 public static final CreativeTabs GLORIACOMBATSTAB = new GloriaCombatTab();
	{
	}

	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
	{

	}

	 @EventHandler
	 public static void preInit(FMLPreInitializationEvent event) {
		 MinecraftForge.EVENT_BUS.register(new CommonEventHandler()); 
		 RegistryHandler.preInitRegistries(event);
	 }
	 @EventHandler
	 public static void Init(FMLInitializationEvent event) {
		 
		 BlockInit.ORE_COPPER.setHarvestLevel("pickaxe", 1);
		 SmeltingInit.init();
	 }
	 @EventHandler
	 public static void postInit(FMLPostInitializationEvent event) {}
}
