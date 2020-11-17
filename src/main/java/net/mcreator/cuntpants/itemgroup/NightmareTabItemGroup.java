
package net.mcreator.cuntpants.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.cuntpants.item.NTIconItem;
import net.mcreator.cuntpants.CuntpantsModElements;

@CuntpantsModElements.ModElement.Tag
public class NightmareTabItemGroup extends CuntpantsModElements.ModElement {
	public NightmareTabItemGroup(CuntpantsModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnightmare_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(NTIconItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
