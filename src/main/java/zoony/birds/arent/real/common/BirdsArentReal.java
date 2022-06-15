package zoony.birds.arent.real.common;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BirdsArentReal implements ModInitializer {
	public static final String MODID = "birdsarentreal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing: ", MODID);
	}
}
