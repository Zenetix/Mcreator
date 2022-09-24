
package net.mcreator.godmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.godmod.GodmodModElements;

@GodmodModElements.ModElement.Tag
public class OutilsRubisAxeItem extends GodmodModElements.ModElement {
	@ObjectHolder("godmod:outils_rubis_axe")
	public static final Item block = null;
	public OutilsRubisAxeItem(GodmodModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1669;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 5.5f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubisItem.block, (int) (1)));
			}
		}, 1, -2.2999999999999998f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("outils_rubis_axe"));
	}
}
