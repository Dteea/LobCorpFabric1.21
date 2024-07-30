package com.lobcorp.Initialize;

import com.lobcorp.LobotomyCorporation121;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

//TODO: add tabs with all risk levels, maybe separate the blocks and maybe also have a tab for weapons/armor
public class ModItemGroups {
    public static void load() {

        // Adding the items to the designated tabs
        Registry.register(Registries.ITEM_GROUP, LOBOTOMY_CORPORATION, ALL_ITEMS);
        ItemGroupEvents.modifyEntriesEvent(LOBOTOMY_CORPORATION).register(itemGroup -> {
            itemGroup.add(ModItems.HEAVEN);
            itemGroup.add(ModItems.LIFE_FOR_A_DAREDEVIL);
            itemGroup.add(ModItems.ADORATION);
            itemGroup.add(ModItems.SOLEMN_LAMENT);

    });
        Registry.register(Registries.ITEM_GROUP, WEAPONS, WEAPON);
        ItemGroupEvents.modifyEntriesEvent(WEAPONS).register(entries -> {
            entries.add(ModItems.PENITENCE);
        });

}

    // Create names for the tabs and labeling them
    public static final RegistryKey<ItemGroup> WEAPONS = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LobotomyCorporation121.MOD_ID, "weapon_group"));
    public static final RegistryKey<ItemGroup> LOBOTOMY_CORPORATION = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LobotomyCorporation121.MOD_ID, "all_group"));

    public static final ItemGroup ALL_ITEMS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.ADORATION))
            .displayName(Text.literal("Lobotomy Corporation"))
            .build();


    public static final ItemGroup WEAPON = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.PENITENCE))
            .displayName(Text.literal("Weapons"))
            .build();
}
