package com.caved_in.miniblocks.config;

import com.caved_in.commons.items.ItemHandler;
import org.bukkit.Material;
import org.bukkit.material.MaterialData;
import org.simpleframework.xml.Element;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 18/11/13
 * Time: 1:24 PM
 */

public class XMLBlock {
	@Element
	private String playerName;

	@Element
	private String material;

	private MaterialData materialData;

	@Element
	private String displayName;

	public XMLBlock(@Element(name = "playerName") String playerName,
					@Element(name = "material") String material,
					@Element(name = "displayName") String displayName) {
		this.playerName = playerName;
		this.displayName = displayName;
		this.material = material;
		if (material.contains(":")) {
			materialData = ItemHandler.getMaterialDataFromString(material);
		} else {
			materialData = new MaterialData(Material.getMaterial(Integer.parseInt(material)));
		}
	}

	public XMLBlock() {
		this.playerName = "TheGamersCave";
		this.material = "397:3";
		this.displayName = "Finn Head";
		materialData = ItemHandler.getMaterialDataFromString(material);
	}
}
