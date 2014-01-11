package com.caved_in.miniblocks.handlers.menu.blockmenu;

import com.caved_in.miniblocks.handlers.item.miniblock.MiniBlockItems;
import com.caved_in.miniblocks.handlers.item.miniblock.MiniItem;
import me.xhawk87.PopupMenuAPI.MenuItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 18/11/13
 * Time: 9:34 AM
 */
public class MiniblockMenuItem extends MenuItem {
	private ItemStack skullItemStack;
	private int skullItemIndex;

	public MiniblockMenuItem(MiniItem miniItem) {
		super(miniItem.getDescription(), miniItem.getMaterialData());
		this.skullItemStack = MiniBlockItems.getItemStack(miniItem);
		this.skullItemIndex = miniItem.getItemIndex();
	}

	@Override
	public void onClick(Player player) {
		player.getInventory().addItem(skullItemStack);
	}

	public int getSkullItemIndex() {
		return skullItemIndex;
	}
}
