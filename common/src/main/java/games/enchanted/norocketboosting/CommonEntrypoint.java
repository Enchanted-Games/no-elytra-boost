package games.enchanted.norocketboosting;

import games.enchanted.norocketboosting.platform.Services;
import net.minecraft.world.level.GameRules;

public class CommonEntrypoint {
    public static final GameRules.Key<GameRules.BooleanValue> RULE_ROCKET_BOOSTING = Services.PLATFORM.registerGameRule(
        "eg_EnableElytraRocketBoosting", GameRules.Category.PLAYER, Services.PLATFORM.basicBooleanRuleType(false)
    );
    public static final GameRules.Key<GameRules.BooleanValue> RULE_PUNCH_BOOSTING = Services.PLATFORM.registerGameRule(
        "eg_EnablePunchBowBoosting", GameRules.Category.PLAYER, Services.PLATFORM.basicBooleanRuleType(true)
    );

    public static void init() {

    }
}