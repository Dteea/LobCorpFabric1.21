package com.lobcorp;

import com.lobcorp.Initialize.ModItemGroups;
import com.lobcorp.Initialize.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LobotomyCorporation121 implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("lobotomy-corporation-121");
	public static final String MOD_ID = "lobotomy-corporation-121";

	@Override
	public void onInitialize() {

		LOGGER.info("Loading Lobotomy Corporation...");
		ModItems.load();
		ModItemGroups.load();
	}

}