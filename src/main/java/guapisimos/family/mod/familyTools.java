package guapisimos.family.mod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class familyTools {
    public static final AxeItem FAMILY_AXE = new familyAxe(familyMaterial.FAMILY_RAW, 8f, 1f, new FabricItemSettings().group(ItemGroup.TOOLS));

    public static void initTools() {
        Registry.register(Registry.ITEM, new Identifier("family", "family_axe"), FAMILY_AXE);
    }
}