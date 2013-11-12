package com.caved_in.skullblocks.handlers.item.skullblock;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:42 AM
 */
public class SkullItem
{
	private String skullOwner = null;

	private int itemIndex = -1;

	public SkullItem(String skullOwner, int itemIndex)
	{
		this.skullOwner = skullOwner;
		this.itemIndex = itemIndex;
	}

	public String getSkullOwner()
	{
		return skullOwner;
	}

	public int getItemIndex()
	{
		return itemIndex;
	}
}
