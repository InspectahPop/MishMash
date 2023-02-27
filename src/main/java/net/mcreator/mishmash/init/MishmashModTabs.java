
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mishmash.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MishmashModTabs {
	public static CreativeModeTab TAB_INPOP;

	public static void load() {
		TAB_INPOP = new CreativeModeTab("tabinpop") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.TNT);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
