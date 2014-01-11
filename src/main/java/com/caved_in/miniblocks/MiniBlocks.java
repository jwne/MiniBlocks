package com.caved_in.miniblocks;

import com.caved_in.commons.commands.CommandController;
import com.caved_in.miniblocks.commands.MiniBlockCommands;
import com.caved_in.miniblocks.listeners.EventListeners;
import org.bukkit.Material;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:19 AM
 */
public class MiniBlocks extends JavaPlugin {
	public static final int previousPageIndex = 45;
	public static final int nextPageIndex = 53;
	public static Material wandMaterial = Material.BLAZE_ROD;
	public static String wandName = "Miniblocks Wand";

	@Override
	public void onEnable() {
		CommandController.registerCommands(this, new MiniBlockCommands());
		new EventListeners(this);
	}

	@Override
	public void onDisable() {
		HandlerList.unregisterAll(this);
		getServer().getScheduler().cancelTasks(this);
	}
}
