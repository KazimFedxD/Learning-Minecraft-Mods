package net.fedxd.item;

// Local Imports
import net.fedxd.LearningMinecraftMod;

// Minecraft Imports
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

// Fabric Imports
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;


public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LearningMinecraftMod.MOD_ID, name), item);
    }

    public static void registerItems() {
        LearningMinecraftMod.LOGGER.info("Registering items...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
        });
    }
}
