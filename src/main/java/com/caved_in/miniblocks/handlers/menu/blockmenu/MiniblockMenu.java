package com.caved_in.miniblocks.handlers.menu.blockmenu;

import com.caved_in.commons.menus.MenuHandler;
import com.caved_in.miniblocks.MiniBlocks;
import com.caved_in.miniblocks.handlers.item.miniblock.MiniBlockItems;
import com.caved_in.miniblocks.handlers.item.miniblock.MiniItem;
import com.caved_in.miniblocks.handlers.menu.blockmenu.PageSwitchMenuItem.Direction;
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
public class MiniblockMenu {
	private PopupMenu blockMenu;
	private int startIndex = 0;
	private int endIndex = 54;

	public MiniblockMenu(int page) {
		blockMenu = PopupMenuAPI.createMenu("Skull-Blocks Selection (Page " + page + ")", MenuHandler.getRows(endIndex));
		blockMenu.setExitOnClickOutside(false);
		blockMenu.addMenuItem(new PageSwitchMenuItem(Direction.PREVIOUS, page), MiniBlocks.previousPageIndex);
		blockMenu.addMenuItem(new PageSwitchMenuItem(Direction.NEXT, page), MiniBlocks.nextPageIndex);
		List<MiniItem> miniItemList = MiniBlockItems.getPage(page);
		for (int i = 0; i < miniItemList.size(); i++) {
			blockMenu.addMenuItem(new MiniblockMenuItem(miniItemList.get(i)), (i > MiniBlocks.previousPageIndex ? i + 1 : i));
		}
		setCloseBehaviour();
	}

	private void setCloseBehaviour() {
		blockMenu.setMenuCloseBehaviour(new MenuCloseBehaviour() {
			@Override
			public void onClose(Player player) {
				player.updateInventory();
			}
		});
	}

	public MiniblockMenu() {
		this(1);
	}

	public MiniblockMenu(Player player) {
		this();
		getMenu().openMenu(player);
	}

	public PopupMenu getMenu() {
		return blockMenu;
	}
}
