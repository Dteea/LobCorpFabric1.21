package com.lobcorp.Initialize;

import com.lobcorp.LobotomyCorporation121;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static void load() {}

    // Method to easily register item
    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, LobotomyCorporation121.id(name), item);
    }
    public static final Item ZAYIN_ITEM = register("test", new Item(new Item.Settings()));


}
