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

import java.util.Optional;

public class ModItemGroups {
    public static void load() {

        // Adding the items to the designated tabs
        Registry.register(Registries.ITEM_GROUP, LOBOTOMY_CORPORATION, ALL_ITEMS);
        ItemGroupEvents.modifyEntriesEvent(LOBOTOMY_CORPORATION).register(item -> {
            item.add(ModItems.HEAVEN);
            item.add(ModItems.LIFE_FOR_A_DAREDEVIL);
            item.add(ModItems.ADORATION);
            item.add(ModItems.SOLEMN_LAMENT);
            item.add(ModItems.PENITENCE);
        });

        Registry.register(Registries.ITEM_GROUP, WEAPONS, WEAPON);
        ItemGroupEvents.modifyEntriesEvent(WEAPONS).register(weapon -> {
            weapon.add(ModItems.PENITENCE);
        });


        Registry.register(Registries.ITEM_GROUP, ARMORS, ARMOR);
        ItemGroupEvents.modifyEntriesEvent(ARMORS).register(armor -> {
            armor.add(ModItems.PENITENCE);
        });

        Registry.register(Registries.ITEM_GROUP, ZAYINS, ZAYIN);
        ItemGroupEvents.modifyEntriesEvent(ZAYINS).register(zayin -> {
            zayin.add(ModItems.ZAYIN);
        });

        Registry.register(Registries.ITEM_GROUP, TETHS, TETH);
        ItemGroupEvents.modifyEntriesEvent(TETHS).register(teth -> {
            teth.add(ModItems.TETH);
        });

        Registry.register(Registries.ITEM_GROUP, HES, HE);
        ItemGroupEvents.modifyEntriesEvent(HES).register(he -> {
            he.add(ModItems.HE);
        });

        Registry.register(Registries.ITEM_GROUP, WAWS, WAW);
        ItemGroupEvents.modifyEntriesEvent(WAWS).register(waw -> {
            waw.add(ModItems.WAW);
        });

        Registry.register(Registries.ITEM_GROUP, ALEPHS, ALEPH);
        ItemGroupEvents.modifyEntriesEvent(ALEPHS).register(aleph -> {
            aleph.add(ModItems.ALEPH);
        });


}

    // Create names for the tabs and labeling them
    public static final RegistryKey<ItemGroup> WEAPONS = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LobotomyCorporation121.MOD_ID, "weapon_group"));
    public static final RegistryKey<ItemGroup> LOBOTOMY_CORPORATION = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LobotomyCorporation121.MOD_ID, "all_group"));
    public static final RegistryKey<ItemGroup> ARMORS = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LobotomyCorporation121.MOD_ID, "armor_group"));
    public static final RegistryKey<ItemGroup> ZAYINS = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LobotomyCorporation121.MOD_ID, "zayin_group"));
    public static final RegistryKey<ItemGroup> TETHS = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LobotomyCorporation121.MOD_ID, "teth_group"));
    public static final RegistryKey<ItemGroup> HES = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LobotomyCorporation121.MOD_ID, "he_group"));
    public static final RegistryKey<ItemGroup> WAWS = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LobotomyCorporation121.MOD_ID, "waw_group"));
    public static final RegistryKey<ItemGroup> ALEPHS = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LobotomyCorporation121.MOD_ID, "aleph_group"));

    public static final ItemGroup ALL_ITEMS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.LCLOGO))
            .displayName(Text.translatable("item.lobotomy-corporation-121.lcorp_logo"))
            .build();


    public static final ItemGroup WEAPON = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.PENITENCE))
            .displayName(Text.translatable("item.lobotomy-corporation-121.penitence"))
            .build();


    public static final ItemGroup ARMOR = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.PENITENCE))
            .displayName(Text.translatable("item.lobotomy-corporation-121.penitence"))
            .build();


    public static final ItemGroup ZAYIN = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.ZAYIN))
            .displayName(Text.translatable("item.lobotomy-corporation-121.zayin_logo"))
            .build();

    public static final ItemGroup TETH = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.TETH))
            .displayName(Text.translatable("item.lobotomy-corporation-121.teth_logo"))
            .build();


    public static final ItemGroup HE = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.HE))
            .displayName(Text.translatable("item.lobotomy-corporation-121.he_logo"))
            .build();


    public static final ItemGroup WAW = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.WAW))
            .displayName(Text.translatable("item.lobotomy-corporation-121.waw_logo"))
            .build();


    public static final ItemGroup ALEPH = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.ALEPH))
            .displayName(Text.translatable("item.lobotomy-corporation-121.aleph_logo"))
            .build();
}
