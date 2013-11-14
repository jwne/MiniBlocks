package com.caved_in.skullblocks.handlers.item.skullblock;

import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:42 AM
 */
public class SkullItem
{
	private String skullOwner = null;

	private int itemIndex = -1;

	private List<Material> skullMaterials = new ArrayList<>();

	public SkullItem(String skullOwner, int itemIndex)
	{
		this.skullOwner = skullOwner;
		this.itemIndex = itemIndex;
	}

	public SkullItem(String skullOwner, int itemIndex, List<Material> relativeMaterials)
	{
		this.skullOwner = skullOwner;
		this.itemIndex = itemIndex;
		this.skullMaterials = relativeMaterials;
	}

	public String getSkullOwner()
	{
		return skullOwner;
	}

	public int getItemIndex()
	{
		return itemIndex;
	}

	public List<Material> getSkullMaterials()
	{
		return skullMaterials;
	}

	public boolean hasMaterial(Material material)
	{
		return this.skullMaterials.contains(material);
	}
}
