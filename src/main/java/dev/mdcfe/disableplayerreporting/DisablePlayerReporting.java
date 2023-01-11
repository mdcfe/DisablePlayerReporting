package dev.mdcfe.disableplayerreporting;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class DisablePlayerReporting implements ModInitializer {

    private static final Logger LOGGER = LogUtils.getLogger();

    private static final List<String> MESSAGES = List.of(
            "Protecting you from toxic behaviour since 1985!",
            "This mod was brought to you by Microsoft's Rat Army",
            "Now you too can play 2b2t without the fear of accidentally reporting someone!",
            "Also check out kennytv's epic force close loading screen mod for Fabric!",
            "Who needs player safety anyway?",
            "Why are you reading this?",
            "Scientifically proven to be 1000% safer than NoChatReports",
            "Don't forget to save your world #saveminecraft",
            "kennyt26Puffy",
            "Now available on Modrinth!",
            "Not available on Hangar!",
            "Not available on Hannah... Who's Hannah?"
    );

    @Override
    public void onInitialize() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        String message = MESSAGES.get(random.nextInt(MESSAGES.size()));
        LOGGER.info(message);
    }
}
