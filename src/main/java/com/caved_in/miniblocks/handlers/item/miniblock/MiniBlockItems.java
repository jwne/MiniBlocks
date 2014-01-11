package com.caved_in.miniblocks.handlers.item.miniblock;

import com.caved_in.commons.items.ItemHandler;
import com.google.common.collect.Lists;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:39 AM
 */
public class MiniBlockItems {
	private static Map<Integer, MiniItem> miniblockItems = new HashMap<>();
	private static Map<Material, MiniMaterialWrapper> miniblockMaterialWrappers = new HashMap<>();
	private static int itemPages = 0;
	private static List<List<MiniItem>> miniblockItemPages;

	private static MiniWrapper[] skullNames = new MiniWrapper[]{
			new MiniWrapper("Koebasti", Material.PUMPKIN, "Pumpkin with face"), //Pumpkin with face
			new MiniWrapper("GalacticPumpkin", Material.PUMPKIN, "Pumpkin without face"), //Pumpkin without face
			new MiniWrapper("GalacticMelon", Material.MELON, "Watermelon"), //Water Melon
			new MiniWrapper("LaxPride", Material.CACTUS, "Cactus - Non default"), //Cactus
			new MiniWrapper("rsfx", Material.LEAVES, "Leaves / Foliage (Oak)"), //Leaves
			new MiniWrapper("Dynasaur", Material.LOG, "6 Sided log (All bark)"), //Wood (6 Sided Bark)
			new MiniWrapper("Stone", Material.LOG, "4 Sided log (Bark)"), //Wood (4 Sided Bark)
			new MiniWrapper("terryxu", Material.WOOD, "Wooden planks"), //Wooden Planks
			new MiniWrapper("Robbydeezle", Material.STONE, "Stone Block"), //Stone Block
			new MiniWrapper("Khrenan", Material.MOSSY_COBBLESTONE, "Mossy Cobblestone"), //Mossy Cobblestone
			new MiniWrapper("HCTNT", Material.TNT, "Alternate TNT"), //TNT Block
			new MiniWrapper("C418", Material.JUKEBOX, "Jukebox"), //Jukebox
			new MiniWrapper("scemm", Material.DISPENSER, "Dispenser"), //Dispenser
			new MiniWrapper("Panda4994", Material.PISTON_STICKY_BASE, "Sticky Piston"), //Sticky Piston
			new MiniWrapper("JL2579", Material.PISTON_BASE, "Regular Piston"), //Piston
			new MiniWrapper("Coblestone", Material.COBBLESTONE, "Cobblestone"), //Cobblestone
			new MiniWrapper("akaBruce", Material.DIAMOND_ORE, "Diamond Ore"),//Diamond Ore
			new MiniWrapper("annayirb", Material.REDSTONE_ORE, "Redstone Ore"), //Redstone Ore
			new MiniWrapper("Tereneckla", Material.EMERALD_ORE, "Emerald Ore"), //Emerald Ore
			new MiniWrapper("pomi44", Material.SPONGE, "Sponge"), //SPONGE! EEK!
			new MiniWrapper("bubbadawg01", Material.QUARTZ, "Quartz"), //Quartz
			new MiniWrapper("abb3_1337", Material.BOOK, "Stack of books"), //Book Stack
			new MiniWrapper("BowAimbot", Material.BOOKSHELF, "Bookshelf"), //Bookshelf
			new MiniWrapper("Bendablob", Material.WHEAT, "Haybale"), //Haybale
			new MiniWrapper("GAMEZENMASTER", Material.MOB_SPAWNER, "Mob Spawner"), //Monster Spawner
			new MiniWrapper("MrSlavi", Material.CHEST, "Chest"), //Chest
			new MiniWrapper("samstine11", Material.GLOWSTONE, "Glowstone"), //Glowstone
			new MiniWrapper("PhasePvP", Material.DIRT, "Podzol"), //Podzol
			new MiniWrapper("zachman228", Material.DIRT, "Dirt"), //Dirt
			new MiniWrapper("Fyspyguy", Material.DIAMOND_BLOCK, "Diamond Block"), //Diamond Block
			new MiniWrapper("teachdaire", Material.GOLD_INGOT, "Gold Block"), //Gold Block
			new MiniWrapper("metalhedd", Material.IRON_INGOT, "Iron Block"), //Iron Block
			new MiniWrapper("loiwiol", Material.OBSIDIAN, "Obsidian Block"), //Obsidian Block
			new MiniWrapper("dylansams", Material.BEDROCK, "Bedrock"), //Bedrock Block
			new MiniWrapper("rugofluk", Material.SAND, "Sand"), //Sand Block
			new MiniWrapper("Omnisulfur", Material.SAND, "Red Sand"), //Red Sand
			new MiniWrapper("AutoSoup", Material.REDSTONE, "Redstone Lamp"), //Redstone Lamp
			new MiniWrapper("MHF_ArrowUp", Material.BLAZE_POWDER, "Up Arrow"), //Up Arrow
			new MiniWrapper("MHF_ArrowDown", Material.BLAZE_POWDER, "Down Arrow"), //Down Arrow
			new MiniWrapper("MHF_ArrowLeft", Material.BLAZE_POWDER, "Left Arrow"), //Left Arrow
			new MiniWrapper("MHF_ArrowRight", Material.BLAZE_POWDER, "Right Arrow"), //Right Arrow
			new MiniWrapper("MHF_Exclamation", Material.BLAZE_POWDER, "Exclamation"), //Exclamation
			new MiniWrapper("MHF_Question", Material.BLAZE_POWDER, "Question Mark"), //Question Mark
			new MiniWrapper("AlexDr0ps", Material.REDSTONE_BLOCK, "Redstone Block"), //Redstone Block
			new MiniWrapper("MHF_OakLog", Material.LOG, "Oak Log"), //Oak Log
			new MiniWrapper("MechaUnit", Material.CACTUS, "Cactus Top"), //Cactus Top
			new MiniWrapper("Troax", Material.ENDER_PEARL, "Enderman face"), //Enderman
			new MiniWrapper("GLaDOS", Material.SNOW_BALL, "Snowman face"), //Snowman
			new MiniWrapper("Zisteau", Material.ROTTEN_FLESH, "Zombie pigman no skin"), //Pigman No Skin
			new MiniWrapper("Blaze_Head", Material.BLAZE_ROD, "Generic blaze head"), //Blaze Head
			new MiniWrapper("_QuBra_", Material.GHAST_TEAR, "Ghast head"), //Ghast Head
			new MiniWrapper("Kelevra_V", Material.STRING, "Spider Head"), //Spider Head
			new MiniWrapper("BlackJake", Material.SLIME_BALL, "Slime Head"), //Slime Head
			new MiniWrapper("brinkley26", Material.SLIME_BALL, "Lava slime head"), //Lava Slime
			new MiniWrapper("XlexerX", Material.PORK, "Pig face"),  //Pig
			new MiniWrapper("HyperBeam567", Material.WOOL, "Sheep head"),  //Sheep
			new MiniWrapper("Villager", Material.MONSTER_EGG, "Villager head"),  //Villager Head
			new MiniWrapper("Seann_G", Material.MILK_BUCKET, "Cow head"), //Cow Head
			new MiniWrapper("SeanBreen97", Material.COOKED_FISH, "Cat (Ocelot) head"), //Cat (Ocelot)
			new MiniWrapper("JustSmall", Material.INK_SACK, "Squid face (Non-Default"), //Squid
			new MiniWrapper("MHF_Squid", Material.INK_SACK, "Actual Squid Face"), //Another Squid
			new MiniWrapper("radeoactivesoup", Material.IRON_INGOT, "Iron Golem"), //Iron Golem
			new MiniWrapper("luci999", Material.RAW_FISH, "Puffer Fish"), //Puffer Fish
			new MiniWrapper("Famastic", Material.RAW_FISH, "Clown Fish"), //Clown Fish
			new MiniWrapper("MHF_MushroomCow", Material.RED_MUSHROOM, "Mushroom Cow"), //Mushroom Cow
			new MiniWrapper("MHF_PigZombie", Material.ROTTEN_FLESH, "Zombie Pigman"), //Pig Zombie
			new MiniWrapper("theangryman", Material.SKULL_ITEM, "Bloody Skull"), //Bloody Skull
			new MiniWrapper("MHF_Chicken", Material.FEATHER, "Chicken"), //Chicken
			new MiniWrapper("MHF_Herobrine", Material.SKULL_ITEM, "Herobrine"), //Herobrine
			new MiniWrapper("Herobrine", Material.SKULL_ITEM, "Another Herobrine"), //Another Herobrine
			new MiniWrapper("ZachWarnerHD", Material.PUMPKIN_SEEDS, "Popcorn"), //Popcorn
			new MiniWrapper("ChoclateMuffin", Material.COOKIE, "Cupcake"), //Cupcake
			new MiniWrapper("food", Material.BREAD, "Hamburger"), //Hamburger
			new MiniWrapper("MHF_Cake", Material.CAKE, "Cake!"), //Cake
			new MiniWrapper("QuadratCookie", Material.COOKIE, "Cookie"), //Cookie
			new MiniWrapper("Endercreeper7253", Material.PAPER, "Globe"), //Globe
			new MiniWrapper("Numba_one_Stunna", Material.NETHERRACK, "Netherrach"), //Netherrack
			new MiniWrapper("CoderPuppy", Material.REDSTONE, "Computer"), //Computer
			new MiniWrapper("sysfailure", Material.REDSTONE, "TV"), //TV
			new MiniWrapper("uioz", Material.REDSTONE, "Radio"), //Radio
			new MiniWrapper("Edna_I", Material.EYE_OF_ENDER, "Ender Eye"), //Ender Eye
			new MiniWrapper("MHF_Apple", Material.APPLE, "Apple (Un-Ripe)"), //Red Apple
			new MiniWrapper("KylexDavis", Material.APPLE, "Apple (Ripe)"),
			new MiniWrapper("greenskull27", Material.APPLE, "Green Apple"),
			new MiniWrapper("hi1232", Material.MAGMA_CREAM, "Orange (Fruit)"),
			new MiniWrapper("Aesixx", Material.MAGMA_CREAM, "Lemon (Fruit)"),
			new MiniWrapper("TheDwarvenJaffa", Material.REDSTONE, "Cieling Fan"),
			new MiniWrapper("Sedzzz", Material.EXP_BOTTLE, "Pint 'o' Beer"),
			new MiniWrapper("sk8erace1", Material.SKULL_ITEM, "Companion Cube"),
			new MiniWrapper("Taizun", Material.SPIDER_EYE, "Human-Esque Eyeball"),
			new MiniWrapper("KyleWDM", Material.COCOA, "Coconut"), //Coconut
			new MiniWrapper("Chuzard", Material.BLAZE_POWDER, "Pokeball"), //Pokeball
			new MiniWrapper("Blopdsand",Material.BLAZE_POWDER, "Pokeball"),
			new MiniWrapper("L_H_2012", Material.BLAZE_POWDER, "Master Ball"), //Master Ball
			new MiniWrapper("benbick", Material.BLAZE_POWDER, "Rubiks Cube"), //Rubiks Cube
			new MiniWrapper("jarrettgabe", Material.BLAZE_POWDER, "Question Box"),
			new MiniWrapper("awesome10987", Material.SKULL_ITEM, "Witches Head"),
			new MiniWrapper("FHG_Cam", Material.REDSTONE, "Camera / VideoCam"),//Question Box
			new MiniWrapper("Sugar_Cane_", Material.SUGAR_CANE, "Sugar Cane"),
			new MiniWrapper("raxo55", Material.BOOK, "Pile of Books"),
			new MiniWrapper("Nixteen", Material.CHEST, "Mail Box"),
			new MiniWrapper("gumbo632", Material.REDSTONE_BLOCK, "Red 6-Sided Die"),
			new MiniWrapper("jmars213", Material.QUARTZ_BLOCK, "White 6-Sided Die"),
			new MiniWrapper("b1418", Material.REDSTONE, "Speaker"),
			new MiniWrapper("ddrl46", Material.REDSTONE, "Missing Block"),
			new MiniWrapper("PARTY_P01S0N", Material.SPIDER_EYE, "Green Eyeball"),
			new MiniWrapper("Metroidling", Material.REDSTONE, "TV (Off)"),
			new MiniWrapper("Cheapshot", Material.REDSTONE, "TV (Transmit Error)"),
			new MiniWrapper("Ethegj", Material.PAPER, "Ass Wipe"),
			new MiniWrapper("poisonedsoul", ItemHandler.getMaterialDataFromString("" + Material.SKULL_ITEM.getId() + ":1"), "Wither (Red Eyes)")

	};

	static {
		for (int I = 0; I < skullNames.length; I++) {
			MiniWrapper miniWrapper = skullNames[I];
			MaterialData materialData = miniWrapper.getRelativeMaterial();
			Material material = materialData.getItemType();
			MiniItem miniItem = new MiniItem(miniWrapper.getPlayerName(), I, materialData, miniWrapper.getDescription());
			if (!miniblockMaterialWrappers.containsKey(material)) {
				miniblockMaterialWrappers.put(material, new MiniMaterialWrapper(material, miniItem));
			} else {
				miniblockMaterialWrappers.get(material).addItem(miniItem);
			}
		}

		int pI = 0;
		for (MiniMaterialWrapper materialWrapper : miniblockMaterialWrappers.values()) {
			List<MiniItem> wrapperMiniItems = materialWrapper.getItems();
			for (int I = 0; I < wrapperMiniItems.size(); I++) {
				miniblockItems.put(pI, wrapperMiniItems.get(I));
				pI += 1;
			}
		}

		miniblockItemPages = Lists.partition(new ArrayList<>(miniblockItems.values()), 52);
		itemPages = miniblockItemPages.size();
	}

	public static ItemStack getItemStack(MiniItem miniItem) {
		ItemStack skullItemStack = ItemHandler.getSkull(miniItem.getPlayerName());
		ItemMeta itemMeta = skullItemStack.getItemMeta();
		itemMeta.setDisplayName(miniItem.getDescription());
		skullItemStack.setItemMeta(itemMeta);
		return skullItemStack;
	}

	public static int getPages() {
		return itemPages;
	}

	public static List<MiniItem> getPage(int itemPage) {
		return miniblockItemPages.get(itemPage - 1);
	}
}
