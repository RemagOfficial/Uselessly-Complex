package com.remag.useless.event;

import com.remag.useless.util.ModTags;
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
                event.setCanceled(true);
            }
        }
    }
}
