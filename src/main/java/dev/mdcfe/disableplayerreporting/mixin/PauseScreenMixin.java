package dev.mdcfe.disableplayerreporting.mixin;

import net.minecraft.client.gui.screens.PauseScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PauseScreen.class)
public class PauseScreenMixin {

    @Redirect(
        method = "createPauseMenu",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/network/chat/Component;translatable(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;")
    )
    private MutableComponent renamePlayerReportingButton(String key) {
        if (key.equals("menu.playerReporting")) {
            return Component.translatable("gui.socialInteractions.title");
        }
        return Component.translatable(key);
    }
}
