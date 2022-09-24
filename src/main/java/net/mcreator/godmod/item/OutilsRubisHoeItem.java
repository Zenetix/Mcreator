
package net.mcreator.godmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.godmod.GodmodModElements;

@GodmodModElements.ModElement.Tag
public class OutilsRubisHoeItem extends GodmodModElements.ModElement {
	@ObjectHolder("godmod:outils_rubis_hoe")
	public static final Item block = null;
	public OutilsRubisHoeItem(GodmodModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1669;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubisItem.block, (int) (1)));
			}
		}, 0f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("outils_rubis_hoe"));
	}
}
