package com.caved_in.skullblocks.listeners;

import com.caved_in.skullblocks.SkullBlocks;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:29 AM
 */
public class EventListeners implements Listener
{
	public EventListeners(SkullBlocks plugin)
	{
		plugin.getServer().getPluginManager().registerEvents(this,plugin);
	}

	@EventHandler
	public void onBlockBreak(BlockBreakEvent event)
	{

	}
}
