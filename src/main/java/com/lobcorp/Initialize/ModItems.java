package com.lobcorp.Initialize;

import com.lobcorp.LobotomyCorporation121;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    public static void load() {
    }

    public static void loadGroup() {
        Registry.register(Registries.ITEM_GROUP, LOBOTOMY_CORPORATION, ALL_ITEMS);
        ItemGroupEvents.modifyEntriesEvent(LOBOTOMY_CORPORATION).register(itemGroup -> {
            itemGroup.add(HEAVEN);
            itemGroup.add(LIFE_FOR_A_DAREDEVIL);
            itemGroup.add(PENITENCE);
            itemGroup.add(ADORATION);
            itemGroup.add(SOLEMN_LAMENT);
        });
    }

    // Method to easily register item
    private static Item register(Item item, String name) {
        Identifier itemID = Identifier.of(LobotomyCorporation121.MOD_ID, name);

        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }

    // List of modded items
    public static final Item TEST = register(new Item(new Item.Settings()), "test");
    public static final Item ADORATION = register(new Item(new Item.Settings()), "adoration");
    public static final Item HEAVEN = register(new Item(new Item.Settings()), "heaven");
    public static final Item LIFE_FOR_A_DAREDEVIL = register(new Item(new Item.Settings()), "life_for_a_daredevil");
    public static final Item PENITENCE = register(new Item(new Item.Settings()), "penitence");
    public static final Item SOLEMN_LAMENT = register(new Item(new Item.Settings()), "solemn_lament");


    // Adding item group
    public static final RegistryKey<ItemGroup> LOBOTOMY_CORPORATION = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LobotomyCorporation121.MOD_ID, "item_group"));
    public static final ItemGroup ALL_ITEMS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.ADORATION))
            .displayName(Text.literal("Lobotomy Corporation"))
            .build();
}