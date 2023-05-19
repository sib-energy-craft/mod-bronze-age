package com.github.sib_energy_craft.bronze_age.load;

import com.github.sib_energy_craft.energy_api.utils.Identifiers;
import com.github.sib_energy_craft.sec_utils.load.DefaultModInitializer;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

import static com.github.sib_energy_craft.sec_utils.utils.ItemUtils.register;

/**
 * @since 0.0.1
 * @author sibmaks
 */
public final class Armors implements DefaultModInitializer {

    public static final ArmorItem BRONZE_HELMET;
    public static final ArmorItem BRONZE_CHESTPLATE;
    public static final ArmorItem BRONZE_LEGGINGS;
    public static final ArmorItem BRONZE_BOOTS;

    static {
        var commonSettings = new Item.Settings();

        var bronzeHelmet = new ArmorItem(ArmorMaterials.BRONZE, ArmorItem.Type.HELMET, commonSettings);
        BRONZE_HELMET = register(ItemGroups.COMBAT, Identifiers.of("bronze_helmet"), bronzeHelmet);

        var bronzeChestplate = new ArmorItem(ArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, commonSettings);
        BRONZE_CHESTPLATE = register(ItemGroups.COMBAT, Identifiers.of("bronze_chestplate"), bronzeChestplate);

        var bronzeLeggings = new ArmorItem(ArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, commonSettings);
        BRONZE_LEGGINGS = register(ItemGroups.COMBAT, Identifiers.of("bronze_leggings"), bronzeLeggings);

        var bronzeBoots = new ArmorItem(ArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, commonSettings);
        BRONZE_BOOTS = register(ItemGroups.COMBAT, Identifiers.of("bronze_boots"), bronzeBoots);

    }
}
