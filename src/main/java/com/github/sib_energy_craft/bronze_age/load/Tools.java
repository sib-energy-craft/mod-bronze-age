package com.github.sib_energy_craft.bronze_age.load;

import com.github.sib_energy_craft.energy_api.utils.Identifiers;
import com.github.sib_energy_craft.sec_utils.load.DefaultModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;

import static com.github.sib_energy_craft.sec_utils.utils.ItemUtils.register;

/**
 * @since 0.0.1
 * @author sibmaks
 */
public final class Tools implements DefaultModInitializer {

    public static final AxeItem BRONZE_AXE;
    public static final HoeItem BRONZE_HOE;
    public static final PickaxeItem BRONZE_PICKAXE;
    public static final ShovelItem BRONZE_SHOVEL;
    public static final SwordItem BRONZE_SWORD;

    static {
        var commonSettings = new Item.Settings();

        var bronzeAxe = new AxeItem(ToolMaterials.BRONZE, 7, -3.1f, commonSettings);
        BRONZE_AXE = register(ItemGroups.TOOLS, Identifiers.of("bronze_axe"), bronzeAxe);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.add(BRONZE_AXE));

        var bronzeHoe = new HoeItem(ToolMaterials.BRONZE, -1, -1.5f, commonSettings);
        BRONZE_HOE = register(ItemGroups.TOOLS, Identifiers.of("bronze_hoe"), bronzeHoe);

        var bronzePickaxe = new PickaxeItem(ToolMaterials.BRONZE, 1, -2.8f, commonSettings);
        BRONZE_PICKAXE = register(ItemGroups.TOOLS, Identifiers.of("bronze_pickaxe"), bronzePickaxe);

        var bronzeShovel = new ShovelItem(ToolMaterials.BRONZE, 2, -3f, commonSettings);
        BRONZE_SHOVEL = register(ItemGroups.TOOLS, Identifiers.of("bronze_shovel"), bronzeShovel);

        var bronzeSword = new SwordItem(ToolMaterials.BRONZE, 3, -2.4f, commonSettings);
        BRONZE_SWORD = register(ItemGroups.COMBAT, Identifiers.of("bronze_sword"), bronzeSword);
    }
}
