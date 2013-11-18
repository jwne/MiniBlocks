package com.caved_in.skullblocks;

import com.caved_in.skullblocks.commands.CommandController;
import com.caved_in.skullblocks.commands.SkullBlockCommands;
import com.caved_in.skullblocks.listeners.EventListeners;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:19 AM
 */
public class SkullBlocks extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		CommandController.registerCommands(this, new SkullBlockCommands());
		new EventListeners(this);
	}


	@Override
	public void onDisable()
	{
		HandlerList.unregisterAll(this);
		getServer().getScheduler().cancelTasks(this);
	}

}
