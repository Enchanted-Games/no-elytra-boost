package games.enchanted.norocketboosting;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(NoRocketBoostingConstants.MOD_ID)
public class NeoForgeEntrypoint {
    public NeoForgeEntrypoint(IEventBus eventBus) {
        CommonEntrypoint.init();
    }
}