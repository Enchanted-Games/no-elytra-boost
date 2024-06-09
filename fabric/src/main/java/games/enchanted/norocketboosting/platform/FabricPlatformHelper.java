package games.enchanted.norocketboosting.platform;

import games.enchanted.norocketboosting.platform.services.IPlatformHelper;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.level.GameRules;

public class FabricPlatformHelper implements IPlatformHelper {
    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public <T extends GameRules.Value<T>> GameRules.Key<T> registerGameRule(String ruleName, GameRules.Category ruleCategory, GameRules.Type<T> ruleType) {
        return GameRuleRegistry.register(ruleName, ruleCategory, ruleType);
    };

    @Override
    public GameRules.Type<GameRules.BooleanValue> basicBooleanRuleType(Boolean defaultValue) {
        return GameRuleFactory.createBooleanRule(defaultValue);
    };
}
