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
                event.getPlayer().hurt(DamageSource.FLY_INTO_WALL, 1.0f);
                event.setCanceled(true);
            }
        }
    }
}
