package com.caved_in.skullblocks.handlers.item.skullblock;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

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
	private MaterialData relativeMaterial;
	private String skullDescription;

	public SkullWrapper(String skullOwnerName, MaterialData relativeMaterial)
	{
		this.skullOwnerName = skullOwnerName;
		this.relativeMaterial = relativeMaterial;
	}

	public SkullWrapper(String skullOwnerName, Material relativeMaterial)
	{
		this.skullOwnerName = skullOwnerName;
		this.relativeMaterial = new MaterialData(relativeMaterial);
	}

	public SkullWrapper(String skullOwnerName, Material relativeMaterial, String skullDescription)
	{
		this(skullOwnerName,relativeMaterial);
		this.skullDescription = skullDescription;
	}

	public SkullWrapper(String skullOwnerName, MaterialData relativeMaterial, String skullDescription)
	{
		this(skullOwnerName,relativeMaterial);
		this.skullDescription = skullDescription;
	}


	public MaterialData getRelativeMaterial()
	{
		return relativeMaterial;
	}

	public String getSkullOwnerName()
	{
		return skullOwnerName;
	}

	public String getSkullDescription()
	{
		return skullDescription;
	}
}
