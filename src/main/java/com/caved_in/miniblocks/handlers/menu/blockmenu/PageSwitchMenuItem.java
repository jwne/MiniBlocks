package com.caved_in.miniblocks.handlers.menu.blockmenu;

import com.caved_in.miniblocks.handlers.item.miniblock.MiniBlockItems;
import me.xhawk87.PopupMenuAPI.MenuItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 18/11/13
 * Time: 1:43 PM
 */
public class PageSwitchMenuItem extends MenuItem {
	private Direction pageDirection;
	private int menuPage = 0;

	public PageSwitchMenuItem(Direction pageDirection, int menuPage) {
		super((pageDirection == Direction.NEXT ? ChatColor.GREEN + "Next Page" : ChatColor.GREEN + "Previous Page"), new MaterialData(Material.PAPER));
		this.pageDirection = pageDirection;
		this.menuPage = menuPage;
	}

	@Override
	public void onClick(Player player) {
		switch (pageDirection) {
			case NEXT:
				if (MiniBlockItems.getPages() == 0 || menuPage >= MiniBlockItems.getPages()) {
					player.sendMessage("This is the final page, please use the previous button.");
				} else {
					getMenu().switchMenu(player, new MiniblockMenu(menuPage + 1).getMenu());
				}
				break;
			case PREVIOUS:
				if (menuPage <= 1 || MiniBlockItems.getPages() == 0) {
					player.sendMessage("This is the first page, please use the next button.");
				} else {
					getMenu().switchMenu(player, new MiniblockMenu(menuPage - 1).getMenu());
				}
				break;
			default:
				break;
		}
	}

	public enum Direction {
		NEXT,
		PREVIOUS
	}
}
