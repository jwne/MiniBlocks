package com.caved_in.skullblocks.handlers.menu.skullmenu;

import com.caved_in.commons.handlers.menus.MenuHandler;
import com.caved_in.skullblocks.handlers.item.skullblock.SkullBlockItems;
import com.caved_in.skullblocks.handlers.item.skullblock.SkullItem;
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
		List<SkullItem> skullItemList = SkullBlockItems.getPage(page);
		for(int I = 0; I < skullItemList.size(); I++)
		{
			skullMenu.addMenuItem(new SkullblockMenuItem(skullItemList.get(I)), I);
		}
	}

	public SkullblockMenu(int startIndex, int endIndex)
	{
		skullMenu = PopupMenuAPI.createMenu("Skull-Blocks Selection",MenuHandler.getRows(endIndex));
		skullMenu.setExitOnClickOutside(false);
		List<SkullItem> skullItemList = SkullBlockItems.getSkullItems(startIndex, endIndex);
		for(int I = 0; I < skullItemList.size(); I++)
		{
			skullMenu.addMenuItem(new SkullblockMenuItem(skullItemList.get(I)), I);
		}
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
