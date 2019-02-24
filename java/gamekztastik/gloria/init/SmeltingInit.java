package gamekztastik.gloria.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingInit {
	
	public static void init( ) {
		GameRegistry.addSmelting(BlockInit.ORE_COPPER, new ItemStack(ItemInit.COPPER_INGOT), 0.45F);
	}

}
