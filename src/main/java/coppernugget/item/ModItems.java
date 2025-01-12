package coppernugget.item;

import coppernugget.CopperNugget;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CopperNugget.MOD_ID,"copper_nugget")))));


    private static Item registerItem (String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(CopperNugget.MOD_ID, name), item);
    }

    public static void registerModItems(){
        CopperNugget.LOGGER.info("Registering Mod Items for " + CopperNugget.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(COPPER_NUGGET);
        });
    }
}
