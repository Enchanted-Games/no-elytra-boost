package games.enchanted.norocketboosting;

import net.fabricmc.api.ModInitializer;

public class FabricEntrypoint implements ModInitializer {
    @Override
    public void onInitialize() {
        CommonEntrypoint.init();
    }
}
