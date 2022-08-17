package com.remag.useless.event;

import com.remag.useless.util.ModTags;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class ModEvents
{
    @SubscribeEvent
    public void onLogBreakWithFist(BlockEvent.BreakEvent event)
    {
        if(event.getState().getBlock().is(ModTags.Blocks.LOGS))
        {
            if(!event.getPlayer().getMainHandItem().getItem().is(ModTags.Items.AXES)) {
                if (event.getWorld().getDifficulty().getId() == 0) {
                    event.getPlayer().hurt(DamageSource.FLY_INTO_WALL, 2.0f);
                    event.setCanceled(true);
                } else {
                    event.getPlayer().hurt(DamageSource.FLY_INTO_WALL, (2.0f * event.getWorld().getDifficulty().getId()));
                    event.setCanceled(true);
                }
            }
        }
    }
}
