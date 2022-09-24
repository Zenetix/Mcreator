
package net.mcreator.godmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.godmod.GodmodModElements;

@GodmodModElements.ModElement.Tag
public class OutilsRubisShovelItem extends GodmodModElements.ModElement {
	@ObjectHolder("godmod:outils_rubis_shovel")
	public static final Item block = null;
	public OutilsRubisShovelItem(GodmodModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
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
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubisItem.block, (int) (1)));
			}
		}, 1, -1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("outils_rubis_shovel"));
	}
}
