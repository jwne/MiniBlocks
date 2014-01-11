package com.caved_in.miniblocks.commands;


import com.caved_in.commons.commands.CommandController;
import com.caved_in.commons.items.ItemHandler;
import com.caved_in.commons.player.PlayerHandler;
import com.caved_in.miniblocks.MiniBlockPermissions;
import com.caved_in.miniblocks.MiniBlocks;
import com.caved_in.miniblocks.handlers.menu.blockmenu.MiniblockMenu;
import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:35 AM
 */
public class MiniBlockCommands {
	@CommandController.CommandHandler(name = "miniwand", aliases = {"mw", "mbw", "mbwnd"}, permission = MiniBlockPermissions.skullWandCommand)
	public void onSkullWandCommand(Player player, String[] commandArgs) {
		player.getInventory().addItem(ItemHandler.makeItemStack(MiniBlocks.wandMaterial, ChatColor.YELLOW + MiniBlocks.wandName));
	}

	@CommandController.CommandHandler(name = "miniblocks", aliases = {"mb", "minblk", "mbl", "mbk"}, permission = MiniBlockPermissions.skullBlocksCommand)
	public void onSkullGenerateCommand(Player player, String[] commandArgs) {
		int itemPage = 1;
		if (commandArgs.length > 0) {
			String pageArg = commandArgs[0];
			if (StringUtils.isNumeric(pageArg)) {
				itemPage = Integer.parseInt(pageArg);
			}
		}
		new MiniblockMenu(itemPage).getMenu().openMenu(player);
		PlayerHandler.sendMessage(player, "&aTo go to the next page, use &e/miniblocks " + (int) (itemPage + 1));
	}
}
