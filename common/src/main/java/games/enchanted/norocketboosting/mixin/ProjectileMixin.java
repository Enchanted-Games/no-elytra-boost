package games.enchanted.norocketboosting.mixin;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TraceableEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Projectile.class)
public abstract class ProjectileMixin extends Entity implements TraceableEntity {
    public ProjectileMixin(EntityType<?> $$0, Level $$1) {
        super($$0, $$1);
    }

    @Inject(
        at = @At("HEAD"),
        method = "checkLeftOwner()Z",
        cancellable = true
    )
    // allow projectiles to hit their owner before leaving owners hitbox while owner is flying
    protected void checkLeftOwner(CallbackInfoReturnable<Boolean> cir) {
        Entity owner = this.getOwner();
        if(owner instanceof ServerPlayer) {
            if(((ServerPlayer) owner).isFallFlying()) {
                cir.setReturnValue(true);
            }
        }
    }
}
