package guapisimos.family.mod;

import net.fabricmc.api.ModInitializer;

public class Family implements ModInitializer {

	

	@Override
	public void onInitialize() {
		familyOre.initOre();
		familyRaw.initOreRaw();
		familyTools.initTools();
	}
}
