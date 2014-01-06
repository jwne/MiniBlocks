package com.caved_in.skullblocks.handlers.item.skullblock;

import org.bukkit.material.MaterialData;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:42 AM
 */
public class SkullItem {
	private String skullOwner = null;

	private int itemIndex = -1;

	private MaterialData skullMaterial;

	private String skullDescription;

	public SkullItem(String skullOwner, int itemIndex) {
		this.skullOwner = skullOwner;
		this.itemIndex = itemIndex;
	}

	public SkullItem(String skullOwner, int itemIndex, String skullDescription) {
		this.skullOwner = skullOwner;
		this.itemIndex = itemIndex;
		this.skullDescription = skullDescription;
	}

	public SkullItem(String skullOwner, int itemIndex, MaterialData relativeMaterial, String skullDescription) {
		this.skullOwner = skullOwner;
		this.itemIndex = itemIndex;
		this.skullMaterial = relativeMaterial;
		this.skullDescription = skullDescription;
	}

	public String getSkullOwner() {
		return skullOwner;
	}

	public int getItemIndex() {
		return itemIndex;
	}

	public MaterialData getSkullMaterial() {
		return skullMaterial;
	}

	public String getSkullDescription() {
		return skullDescription;
	}
}
