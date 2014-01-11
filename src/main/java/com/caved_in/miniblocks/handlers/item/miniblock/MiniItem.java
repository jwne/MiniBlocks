package com.caved_in.miniblocks.handlers.item.miniblock;

import org.bukkit.material.MaterialData;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:42 AM
 */
public class MiniItem {
	private String playerName = null;

	private int itemIndex = -1;

	private MaterialData materialData;

	private String description;

	public MiniItem(String playerName, int itemIndex) {
		this.playerName = playerName;
		this.itemIndex = itemIndex;
	}

	public MiniItem(String playerName, int itemIndex, String description) {
		this.playerName = playerName;
		this.itemIndex = itemIndex;
		this.description = description;
	}

	public MiniItem(String playerName, int itemIndex, MaterialData relativeMaterial, String description) {
		this.playerName = playerName;
		this.itemIndex = itemIndex;
		this.materialData = relativeMaterial;
		this.description = description;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getItemIndex() {
		return itemIndex;
	}

	public MaterialData getMaterialData() {
		return materialData;
	}

	public String getDescription() {
		return description;
	}
}
