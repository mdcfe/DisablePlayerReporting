package dev.mdcfe.disableplayerreporting.mixin;

import net.minecraft.client.multiplayer.chat.report.AbuseReportSender;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbuseReportSender.Services.class)
public class AbuseReportSenderServicesMixin {

    @Inject(method = "isEnabled", at = @At("HEAD"), cancellable = true)
    private void isEnabled(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

}
