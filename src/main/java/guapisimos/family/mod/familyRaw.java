package guapisimos.family.mod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class familyRaw {

    public static final Item HOMER_RAW = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item HOMER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void startRaw(String name) {
        Registry.register(Registry.ITEM, new Identifier("family", name + "_raw"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("family", name + "_ingot"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    }

    public static void initOreRaw() {
        Registry.register(Registry.ITEM, new Identifier("family", "homer_raw"),HOMER_RAW);
        Registry.register(Registry.ITEM, new Identifier("family", "homer_ingot"), HOMER_INGOT);
        startRaw("marge");
        startRaw("bart");
        startRaw("lisa");
        startRaw("maggie");
        startRaw("snowball");
        startRaw("santa");
    }
}