package com.lobcorp.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;



@Mixin(LivingEntity.class)
public abstract class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "takeKnockback")
	private void init(CallbackInfo info) {
		System.out.println("this is working and is being called");
	}
}