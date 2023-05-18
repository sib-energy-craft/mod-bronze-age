package com.github.sib_energy_craft.bronze_age.load;

import com.github.sib_energy_craft.metallurgy.metals.load.Items;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
@AllArgsConstructor
public enum ToolMaterials implements ToolMaterial {
    BRONZE(2, 200, 10f, 1, 16,
            Ingredient.ofItems(Items.BRONZE_INGOT));

    private final int miningLevel;
    private final int durability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;
}
