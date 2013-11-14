package com.caved_in.skullblocks.handlers.item.skullblock;

import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 14/11/13
 * Time: 9:58 AM
 */
public class SkullMaterialWrapper
{
	private Material skullMaterial;
	private List<SkullItem> skullItems = new ArrayList<>();

	public SkullMaterialWrapper(Material skullMaterial, SkullItem skullItem)
	{
		this.skullMaterial = skullMaterial;
		this.skullItems.add(skullItem);
	}

	public Material getSkullMaterial()
	{
		return skullMaterial;
	}

	public void addSkullItem(SkullItem skullItem)
	{
		if (!skullItems.contains(skullItem))
		{
			skullItems.add(skullItem);
		}
	}
}