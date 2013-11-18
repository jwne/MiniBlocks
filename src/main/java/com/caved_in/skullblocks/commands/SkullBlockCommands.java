package com.caved_in.skullblocks.commands;


import com.caved_in.commons.handlers.player.PlayerHandler;
import com.caved_in.skullblocks.SkullBlockPermissions;
import com.caved_in.skullblocks.handlers.menu.skullmenu.SkullblockMenu;
import org.apache.commons.lang.StringUtils;
import org.bukkit.entity.Player;

import com.caved_in.skullblocks.commands.CommandController;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:35 AM
 */
public class SkullBlockCommands
{
	@CommandController.CommandHandler(name = "skullwand", aliases = {"sw", "skw", "sklwnd"}, permission = SkullBlockPermissions.skullWandCommand)
	public void onSkullWandCommand(Player player, String[] commandArgs)
	{

	}

	@CommandController.CommandHandler(name = "skullblocks",aliases = {"skb", "sklblk", "sbl"}, permission = SkullBlockPermissions.skullBlocksCommand)
	public void onSkullGenerateCommand(Player player, String[] commandArgs)
	{
		int itemPage = 1;
		if (commandArgs.length > 0)
		{
			String pageArg = commandArgs[0];
			if (StringUtils.isNumeric(pageArg))
			{
				itemPage = Integer.parseInt(pageArg);
			}
		}
		new SkullblockMenu(itemPage).getMenu().openMenu(player);
		PlayerHandler.sendMessage(player, "&aTo go to the next page, use &e/skullblocks " + (int)(itemPage + 1));
	}
}
