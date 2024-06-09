package games.enchanted.norocketboosting.platform;

import games.enchanted.norocketboosting.platform.services.IPlatformHelper;
import net.minecraft.world.level.GameRules;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

public class NeoForgePlatformHelper implements IPlatformHelper {
    @Override
    public String getPlatformName() {
        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return !FMLLoader.isProduction();
    }

    @Override
    public <T extends GameRules.Value<T>> GameRules.Key<T> registerGameRule(String ruleName, GameRules.Category ruleCategory, GameRules.Type<T> ruleType) {
        return GameRules.register(ruleName, ruleCategory, ruleType);
    };

    @Override
    public GameRules.Type<GameRules.BooleanValue> basicBooleanRuleType(Boolean defaultValue) {
        return GameRules.BooleanValue.create(defaultValue);
    };
}