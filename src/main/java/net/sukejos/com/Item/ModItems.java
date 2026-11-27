package net.sukejos.com.Item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.sukejos.com.CustomItemFirstMod;
import java.util.function.Function;

public class ModItems {

    public static final Item CRYSTALITE  = registerItem("crystalite", Item::new);


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(CustomItemFirstMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CustomItemFirstMod.MOD_ID, name)))));
    }

    public static void registerModItems(){
        CustomItemFirstMod.LOGGER.info("Registering mods for " + CustomItemFirstMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output ->
                output.accept(CRYSTALITE) );
    }

}
