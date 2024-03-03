package me.nyaaa.nobreakdelay;

import net.minecraft.client.multiplayer.PlayerControllerMP;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(PlayerControllerMP.class)
public class PlayerControllerMPMixin {
    @ModifyConstant(method = "clickBlock", constant = @Constant(intValue = 5))
    public int meow(int constant) {
        return 0;
    }

    @ModifyConstant(method = "onPlayerDamageBlock", constant = @Constant(intValue = 5))
    public int arff(int constant) {
        return 0;
    }
}
