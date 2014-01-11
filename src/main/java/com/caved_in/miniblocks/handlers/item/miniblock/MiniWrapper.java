package com.caved_in.miniblocks.handlers.item.miniblock;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 14/11/13
 * Time: 9:19 AM
 */
public class MiniWrapper {
	private String skullOwnerName;
	private boolean hasMultipleMaterials = false;
	private MaterialData relativeMaterial;
	private String description;

	public MiniWrapper(String skullOwnerName, MaterialData relativeMaterial) {
		this.skullOwnerName = skullOwnerName;
		this.relativeMaterial = relativeMaterial;
	}

	public MiniWrapper(String skullOwnerName, Material relativeMaterial) {
		this.skullOwnerName = skullOwnerName;
		this.relativeMaterial = new MaterialData(relativeMaterial);
	}

	public MiniWrapper(String skullOwnerName, Material relativeMaterial, String description) {
		this(skullOwnerName, relativeMaterial);
		this.description = description;
	}

	public MiniWrapper(String skullOwnerName, MaterialData relativeMaterial, String description) {
		this(skullOwnerName, relativeMaterial);
		this.description = description;
	}


	public MaterialData getRelativeMaterial() {
		return relativeMaterial;
	}

	public String getPlayerName() {
		return skullOwnerName;
	}

	public String getDescription() {
		return description;
	}
}
