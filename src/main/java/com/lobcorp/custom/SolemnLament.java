package com.lobcorp.custom;

import com.lobcorp.Initialize.ModItems;
import com.lobcorp.LobotomyCorporation121;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.LlamaSpitEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SolemnLament extends Item {
    public SolemnLament(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }

        DamageSource damageSource = new DamageSource(
                world.getRegistryManager()
                        .get(RegistryKeys.DAMAGE_TYPE)
                        .entryOf(ModItems.SANITY_DAMAGE));
                user.damage(damageSource, 9.0f);


        LlamaSpitEntity hi = new LlamaSpitEntity(EntityType.LLAMA_SPIT, world);
        hi.setVelocity(user, user.getPitch(), user.getYaw(), 1,2, 0);
        hi.setPosition(user.getPos().add(user.getHandPosOffset(user.getStackInHand(hand).getItem())).add(0, .8, 0));
        world.spawnEntity(hi);

        return super.use(world, user, hand);
    }
}
