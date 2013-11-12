package com.caved_in.skullblocks.commands;

import com.caved_in.skullblocks.SkullBlockPermissions;
import org.bukkit.entity.Player;

import com.caved_in.skullblocks.commands.CommandController;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:35 AM
 */
public class SkullBlockCommands
{
	@CommandController.CommandHandler(name = "skullwand", permission = SkullBlockPermissions.skullWandCommand)
	public void onSkullWandCommand(Player player, String[] commandArgs)
	{

	}
}
