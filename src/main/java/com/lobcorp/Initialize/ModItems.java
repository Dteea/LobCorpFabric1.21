package com.lobcorp.Initialize;

import com.lobcorp.LobotomyCorporation121;
import com.lobcorp.custom.SolemnLament;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static void load() {}



    // Method to easily register item
    private static Item register(Item item, String name) {
        Identifier itemID = Identifier.of(LobotomyCorporation121.MOD_ID, name);
        return Registry.register(Registries.ITEM, itemID, item);
    }
    // List of modded items
    public static final Item ADORATION = register(new Item(new Item.Settings()), "adoration");
    public static final Item HEAVEN = register(new Item(new Item.Settings()), "heaven");
    public static final Item LIFE_FOR_A_DAREDEVIL = register(new Item(new Item.Settings()), "life_for_a_daredevil");
    public static final Item PENITENCE = register(new Item(new Item.Settings()), "penitence");
    public static final Item SOLEMN_LAMENT = register(new SolemnLament(new Item.Settings()), "solemn_lament");


}