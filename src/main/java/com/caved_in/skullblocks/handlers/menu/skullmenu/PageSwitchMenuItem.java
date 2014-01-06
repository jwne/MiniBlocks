package com.caved_in.skullblocks.handlers.menu.skullmenu;

import com.caved_in.skullblocks.handlers.item.skullblock.SkullBlockItems;
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
public class PageSwitchMenuItem extends MenuItem
{
	private Direction pageDirection;
	private int menuPage = 0;

	public PageSwitchMenuItem(Direction pageDirection, int menuPage)
	{
		super((pageDirection == Direction.NEXT ? ChatColor.GREEN + "Next Page" : ChatColor.GREEN + "Previous Page"), new MaterialData(Material.PAPER));
		this.pageDirection = pageDirection;
		this.menuPage = menuPage;
	}

	@Override
	public void onClick(Player player)
	{
		switch (pageDirection)
		{
			case NEXT:
				if (SkullBlockItems.getPages() == 0 || menuPage >= SkullBlockItems.getPages())
				{
					player.sendMessage("This is the final page, please use the previous button.");
				}
				else
				{
					this.getMenu().switchMenu(player,new SkullblockMenu(menuPage + 1).getMenu());
				}
				break;
			case PREVIOUS:
				if (menuPage == 0 || SkullBlockItems.getPages() == 0)
				{
					player.sendMessage("This is the first page, please use the next button.");
				}
				else
				{
					this.getMenu().switchMenu(player,new SkullblockMenu(menuPage - 1).getMenu());
				}
				break;
			default:
				break;
		}
	}

	public enum Direction
	{
		NEXT,
		PREVIOUS
	}
}
