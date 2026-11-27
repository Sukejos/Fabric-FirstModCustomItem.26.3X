package net.sukejos.com;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;
import net.sukejos.com.Item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomItemFirstMod implements ModInitializer {
	public static final String MOD_ID = "custom-item-ftime";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
