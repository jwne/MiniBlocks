package com.caved_in.miniblocks.handlers.item.miniblock;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 14/11/13
 * Time: 9:58 AM
 */
public class MiniMaterialWrapper {
	private MaterialData materialData;
	private List<MiniItem> miniItems = new ArrayList<>();

	public MiniMaterialWrapper(Material materialData, MiniItem miniItem) {
		this.materialData = new MaterialData(materialData);
		this.miniItems.add(miniItem);
	}

	public MiniMaterialWrapper(MaterialData materialData, MiniItem miniItem) {
		this.materialData = materialData;
		this.miniItems.add(miniItem);
	}

	public MaterialData getMaterial() {
		return materialData;
	}

	public List<MiniItem> getItems() {
		return miniItems;
	}

	public void addItem(MiniItem miniItem) {
		if (!miniItems.contains(miniItem)) {
			miniItems.add(miniItem);
		}
	}
}
