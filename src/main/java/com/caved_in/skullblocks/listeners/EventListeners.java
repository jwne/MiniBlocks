package com.caved_in.skullblocks.listeners;

import com.caved_in.skullblocks.SkullBlocks;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:29 AM
 */
public class EventListeners implements Listener
{
	private SkullBlocks plugin;
	public EventListeners(SkullBlocks plugin)
	{
		plugin.getServer().getPluginManager().registerEvents(this,plugin);
		this.plugin = plugin;
	}

	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event)
	{
		final Player player = event.getPlayer();
		final ItemStack itemStack = event.getItemInHand();
		if (itemStack.getType() == Material.SKULL_ITEM || itemStack.getType() == Material.SKULL)
		{
			Bukkit.getScheduler().runTaskLater(plugin,new Runnable()
			{
				@Override
				public void run()
				{
					player.setItemInHand(itemStack);
					player.updateInventory();
				}
			}, 4L);
		}
	}
}
