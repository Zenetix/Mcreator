
package net.mcreator.godmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.godmod.GodmodModElements;

@GodmodModElements.ModElement.Tag
public class OutilsRubisSwordItem extends GodmodModElements.ModElement {
	@ObjectHolder("godmod:outils_rubis_sword")
	public static final Item block = null;
	public OutilsRubisSwordItem(GodmodModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
				return 1;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubisItem.block, (int) (1)));
			}
		}, 3, -2.4000000000000001f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("outils_rubis_sword"));
	}
}
