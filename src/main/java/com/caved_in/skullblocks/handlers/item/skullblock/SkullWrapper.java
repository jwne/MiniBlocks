package com.caved_in.skullblocks.handlers.item.skullblock;

import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 14/11/13
 * Time: 9:19 AM
 */
public class SkullWrapper
{
	private String skullOwnerName;
	private boolean hasMultipleMaterials = false;
	private List<Material> relativeMaterials = new ArrayList<>();

	public SkullWrapper(String skullOwnerName, Material relativeMaterial)
	{
		this.skullOwnerName = skullOwnerName;
		this.relativeMaterials.add(relativeMaterial);
	}

	public SkullWrapper(String skullOwnerName, Material... relativeMaterials)
	{
		this.skullOwnerName = skullOwnerName;
		for(Material material : relativeMaterials)
		{
			this.relativeMaterials.add(material);
		}
		this.hasMultipleMaterials = true;
	}


	public List<Material> getRelativeMaterials()
	{
		return relativeMaterials;
	}

	public String getSkullOwnerName()
	{
		return skullOwnerName;
	}

	public boolean isHasMultipleMaterials()
	{
		return hasMultipleMaterials;
	}
}
