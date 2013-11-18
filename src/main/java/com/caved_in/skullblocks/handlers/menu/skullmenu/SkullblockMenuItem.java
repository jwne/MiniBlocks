package com.caved_in.skullblocks.handlers.menu.skullmenu;

import com.caved_in.skullblocks.handlers.item.skullblock.SkullBlockItems;
import com.caved_in.skullblocks.handlers.item.skullblock.SkullItem;
import me.xhawk87.PopupMenuAPI.MenuItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 18/11/13
 * Time: 9:34 AM
 */
public class SkullblockMenuItem extends MenuItem
{
	private ItemStack skullItemStack;
	private int skullItemIndex;
	public SkullblockMenuItem(SkullItem skullItem)
	{
		super(skullItem.getSkullDescription(), skullItem.getSkullMaterial());
		this.skullItemStack = SkullBlockItems.getItemStack(skullItem);
		this.skullItemIndex = skullItem.getItemIndex();
	}

	@Override
	public void onClick(Player player)
	{
		player.getInventory().addItem(skullItemStack);
		player.updateInventory();
	}

	public int getSkullItemIndex()
	{
		return skullItemIndex;
	}
}
