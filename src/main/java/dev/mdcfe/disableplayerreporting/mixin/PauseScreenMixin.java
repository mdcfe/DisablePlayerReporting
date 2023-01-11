package dev.mdcfe.disableplayerreporting.mixin;

import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.PauseScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.function.Supplier;

@Mixin(PauseScreen.class)
public class PauseScreenMixin {

    @Shadow
    @Final
    @SuppressWarnings("java:S3008")
    private static Component PLAYER_REPORTING;

    @Shadow
    private Button openScreenButton(Component component, Supplier<Screen> supplier) {
        // shadow stub
        return null;
    }

    @Redirect(
        method = "createPauseMenu",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/PauseScreen;openScreenButton(Lnet/minecraft/network/chat/Component;Ljava/util/function/Supplier;)Lnet/minecraft/client/gui/components/Button;")
    )
    private Button renamePlayerReportingButton(PauseScreen instance, Component component, Supplier<Screen> supplier) {
        if (component == PLAYER_REPORTING) {
            component = Component.translatable("gui.socialInteractions.title");
        }
        return openScreenButton(component, supplier);
    }
}
