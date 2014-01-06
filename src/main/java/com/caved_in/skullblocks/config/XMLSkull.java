package com.caved_in.skullblocks.config;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;
import org.simpleframework.xml.Element;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 18/11/13
 * Time: 1:24 PM
 */

public class XMLSkull {
	@Element
	private String playerName;

	@Element
	private String material;

	private MaterialData materialData;

	@Element
	private String displayName;

	public XMLSkull(@Element(name = "playerName") String playerName,
					@Element(name = "material") String material,
					@Element(name = "displayName") String displayName) {
		this.playerName = playerName;
		this.displayName = displayName;
		this.material = material;
		getMaterialData();
	}

	public XMLSkull() {
		this.playerName = "TheGamersCave";
		this.material = "397:3";
		this.displayName = "Finn Head";
		getMaterialData();
	}

	private void getMaterialData() {
		if (material.contains(":")) {
			String[] materialSplit = material.split(":");
			int materialId = Integer.parseInt(materialSplit[0]);
			int dataValue = Integer.parseInt(materialSplit[1]);
			materialData = new MaterialData(Material.getMaterial(materialId), (byte) dataValue);
		} else {
			materialData = new MaterialData(Material.getMaterial(Integer.parseInt(material)));
		}
	}
}
