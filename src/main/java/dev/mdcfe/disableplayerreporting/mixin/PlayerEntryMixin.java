package dev.mdcfe.disableplayerreporting.mixin;

import net.minecraft.client.gui.screens.social.PlayerEntry;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntry.class)
public class PlayerEntryMixin {
    private Component tooltip = null;

    @Inject(method = "getReportButtonText", at = @At("HEAD"), cancellable = true)
    private void getReportButtonText(boolean bl, CallbackInfoReturnable<Component> cir) {
        if (tooltip == null) {
            tooltip = Component.literal("Player reporting is disabled!");
        }
        cir.setReturnValue(tooltip);
    }
}
