package zoony.birds.arent.real.mixin;

import zoony.birds.arent.real.common.BirdsArentReal;

import net.minecraft.client.gui.screen.TitleScreen;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class BirdsArentRealMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		BirdsArentReal.LOGGER.info("Initializing: ", BirdsArentReal.MODID, " (mixin)");
	}
}
