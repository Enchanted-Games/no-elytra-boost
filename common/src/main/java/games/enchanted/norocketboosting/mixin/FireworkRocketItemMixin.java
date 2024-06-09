package games.enchanted.norocketboosting.mixin;

import games.enchanted.norocketboosting.CommonEntrypoint;
import games.enchanted.norocketboosting.NoRocketBoostingConstants;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FireworkRocketItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FireworkRocketItem.class)
public class FireworkRocketItemMixin {
    @Inject(
        at = @At("HEAD"),
        method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResultHolder;",
        cancellable = true
    )
    // cancel elytra boost (if on server) and cancel hand animation (if on client)
    public void init(Level level, Player player, InteractionHand interactionHand, CallbackInfoReturnable<InteractionResultHolder<ItemStack>> cir) {
        boolean rocketBoostingRuleValue = level.getGameRules().getRule(CommonEntrypoint.RULE_ROCKET_BOOSTING).get();
        if (player.isFallFlying() && !rocketBoostingRuleValue) {
            cir.setReturnValue(InteractionResultHolder.pass(player.getItemInHand(interactionHand)));
        }
    }
}