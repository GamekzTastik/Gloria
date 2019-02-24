package gamekztastik.gloria.util.handlers;

import gamekztastik.gloria.Main;
import gamekztastik.gloria.init.BlockInit;
import gamekztastik.gloria.init.ItemInit;
import gamekztastik.gloria.recipes.RecipesReinforcedLeatherDyes;
import gamekztastik.gloria.util.interfaces.IHasModel;
import gamekztastik.gloria.world.gen.WorldGenCustomOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}

	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
	{
	    event.getRegistry().register(new RecipesReinforcedLeatherDyes().setRegistryName("gl" + ":" + "reinforced_leather_dye"));
    }
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{		
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		for(Block block : BlockInit.BLOCKS) 
			{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
			}
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{		
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);

	}
	
	public static void initRegistries(FMLInitializationEvent event)
	{

	}
	
	public static void postInitRegistries(FMLPostInitializationEvent event)
	{

	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{

	}
}

	

