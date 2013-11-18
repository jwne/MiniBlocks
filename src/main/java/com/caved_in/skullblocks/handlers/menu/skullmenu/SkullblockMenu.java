package com.caved_in.skullblocks.handlers.menu.skullmenu;

import com.caved_in.commons.handlers.menus.MenuHandler;
import com.caved_in.skullblocks.handlers.menu.skullmenu.PageSwitchMenuItem.Direction;
import com.caved_in.skullblocks.SkullBlocks;
import com.caved_in.skullblocks.handlers.item.skullblock.SkullBlockItems;
import com.caved_in.skullblocks.handlers.item.skullblock.SkullItem;
import me.xhawk87.PopupMenuAPI.MenuCloseBehaviour;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import me.xhawk87.PopupMenuAPI.PopupMenuAPI;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 18/11/13
 * Time: 9:34 AM
 */
public class SkullblockMenu
{
	private PopupMenu skullMenu;
	private int startIndex = 0;
	private int endIndex = 54;

	public SkullblockMenu(int page)
	{
		skullMenu = PopupMenuAPI.createMenu("Skull-Blocks Selection (Page " + page + ")",MenuHandler.getRows(endIndex));
		skullMenu.setExitOnClickOutside(false);
		skullMenu.addMenuItem(new PageSwitchMenuItem(Direction.PREVIOUS, page), SkullBlocks.previousPageIndex);
		skullMenu.addMenuItem(new PageSwitchMenuItem(Direction.NEXT,page), SkullBlocks.nextPageIndex);
		List<SkullItem> skullItemList = SkullBlockItems.getPage(page);
		for(int I = 0; I < skullItemList.size(); I++)
		{
			skullMenu.addMenuItem(new SkullblockMenuItem(skullItemList.get(I)), (I > SkullBlocks.previousPageIndex ? I + 1 : I));
		}
		setCloseBehaviour();
	}

	private void setCloseBehaviour()
	{
		skullMenu.setMenuCloseBehaviour(new MenuCloseBehaviour()
		{
			@Override
			public void onClose(Player player)
			{
				player.updateInventory();
			}
		});
	}

	public SkullblockMenu()
	{
		this(1);
	}

	public SkullblockMenu(Player player)
	{
		this();
		getMenu().openMenu(player);
	}

	public PopupMenu getMenu()
	{
		return skullMenu;
	}
}
