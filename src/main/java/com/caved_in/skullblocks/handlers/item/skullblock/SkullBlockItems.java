package com.caved_in.skullblocks.handlers.item.skullblock;

import com.caved_in.commons.handlers.items.ItemHandler;
import com.google.common.collect.Lists;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.*;

import static com.caved_in.skullblocks.Lang.varargs;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:39 AM
 */
public class SkullBlockItems
{
	private static Map<Integer, SkullItem> skullItems = new HashMap<>();
	private static Map<Material, SkullMaterialWrapper> skullMaterialWrapper = new HashMap<>();
	private static int itemPages = 0;

	private static SkullWrapper[] skullNames = new SkullWrapper[] {
			new SkullWrapper("Koebasti", Material.PUMPKIN, "Pumpkin with face"), //Pumpkin with face
			new SkullWrapper("GalacticPumpkin",Material.PUMPKIN, "Pumpkin without face"), //Pumpkin without face
			new SkullWrapper("GalacticMelon",Material.MELON, "Watermelon"), //Water Melon
			new SkullWrapper("LaxPride",Material.CACTUS, "Cactus - Non default"), //Cactus
			new SkullWrapper("rsfx",Material.LEAVES, "Leaves / Foliage (Oak)"), //Leaves
			new SkullWrapper("Dynasaur",Material.LOG, "6 Sided log (All bark)"), //Wood (6 Sided Bark)
			new SkullWrapper("Stone",Material.LOG, "4 Sided log (Bark) with top/bottom default"), //Wood (4 Sided Bark)
			new SkullWrapper("terryxu",Material.WOOD, "Wooden planks"), //Wooden Planks
			new SkullWrapper("Robbydeezle",Material.STONE, "Stone Block"), //Stone Block
			new SkullWrapper("Khrenan",Material.MOSSY_COBBLESTONE, "Mossy Cobblestone"), //Mossy Cobblestone
			new SkullWrapper("HCTNT",Material.TNT, "Alternate TNT"), //TNT Block
			new SkullWrapper("C418",Material.JUKEBOX, "Jukebox"), //Jukebox
			new SkullWrapper("scemm",Material.DISPENSER, "Dispenser"), //Dispenser
			new SkullWrapper("Panda4994",Material.PISTON_STICKY_BASE, "Sticky Piston"), //Sticky Piston
			new SkullWrapper("JL2579",Material.PISTON_BASE, "Regular Piston"), //Piston
			new SkullWrapper("Coblestone",Material.COBBLESTONE, "Cobblestone"), //Cobblestone
			new SkullWrapper("akaBruce",Material.DIAMOND_ORE, "Diamond Ore"),//Diamond Ore
			new SkullWrapper("annayirb",Material.REDSTONE_ORE, "Redstone Ore"), //Redstone Ore
			new SkullWrapper("Tereneckla", Material.EMERALD_ORE, "Emerald Ore"), //Emerald Ore
			new SkullWrapper("pomi44",Material.SPONGE, "Sponge"), //SPONGE! EEK!
			new SkullWrapper("bubbadawg01",Material.QUARTZ, "Quartz"), //Quartz
			new SkullWrapper("abb3_1337",Material.BOOK, "Stack of books"), //Book Stack
			new SkullWrapper("BowAimbot",Material.BOOKSHELF, "Bookshelf"), //Bookshelf
			new SkullWrapper("Bendablob",Material.WHEAT, "Haybale"), //Haybale
			new SkullWrapper("GAMEZENMASTER",Material.MOB_SPAWNER,"Mob Spawner"), //Monster Spawner
			new SkullWrapper("MrSlavi",Material.CHEST, "Chest"), //Chest
			new SkullWrapper("samstine11",Material.GLOWSTONE, "Glowstone"), //Glowstone
			new SkullWrapper("PhasePvP",Material.DIRT, "Podzol"), //Podzol
			new SkullWrapper("zachman228",Material.DIRT, "Dirt"), //Dirt
			new SkullWrapper("Fyspyguy",Material.DIAMOND_BLOCK, "Diamond Block"), //Diamond Block
			new SkullWrapper("teachdaire",Material.GOLD_INGOT, "Gold Block"), //Gold Block
			new SkullWrapper("metalhedd",Material.IRON_INGOT, "Iron Block"), //Iron Block
			new SkullWrapper("loiwiol",Material.OBSIDIAN, "Obsidian Block"), //Obsidian Block
			new SkullWrapper("dylansams",Material.BEDROCK, "Bedrock"), //Bedrock Block
			new SkullWrapper("rugofluk",Material.SAND, "Sand"), //Sand Block
			new SkullWrapper("Omnisulfur",Material.SAND, "Red Sand"), //Red Sand
			new SkullWrapper("AutoSoup",Material.REDSTONE_LAMP_ON, "Redstone Lamp"), //Redstone Lamp
			new SkullWrapper("MHF_ArrowUp",Material.BLAZE_POWDER, "Up Arrow"), //Up Arrow
			new SkullWrapper("MHF_ArrowDown",Material.BLAZE_POWDER, "Down Arrow"), //Down Arrow
			new SkullWrapper("MHF_ArrowLeft",Material.BLAZE_POWDER, "Left Arrow"), //Left Arrow
			new SkullWrapper("MHF_ArrowRight",Material.BLAZE_POWDER, "Right Arrow"), //Right Arrow
			new SkullWrapper("MHF_Exclamation",Material.BLAZE_POWDER, "Exclamation"), //Exclamation
			new SkullWrapper("MHF_Question",Material.BLAZE_POWDER, "Question Mark"), //Question Mark
			new SkullWrapper("AlexDr0ps",Material.REDSTONE_BLOCK,"Redstone Block"), //Redstone Block
			new SkullWrapper("MHF_OakLog",Material.LOG, "Oak Log"), //Oak Log
			new SkullWrapper("MechaUnit",Material.CACTUS, "Cactus Top"), //Cactus Top
			//==============//
			//   Mob Heads  //
			//==============//
			new SkullWrapper("Troax",Material.ENDER_PEARL,"Enderman face"), //Enderman
			new SkullWrapper("GLaDOS",Material.SNOW_BALL,"Snowman face"), //Snowman
			new SkullWrapper("Zisteau",Material.ROTTEN_FLESH, "Zombie pigman no skin"), //Pigman No Skin
			new SkullWrapper("Blaze_Head",Material.BLAZE_ROD, "Generic blaze head"), //Blaze Head
			new SkullWrapper("_QuBra_",Material.GHAST_TEAR, "Ghast head"), //Ghast Head
			new SkullWrapper("Kelevra_V",Material.STRING,"Spider Head"), //Spider Head
			new SkullWrapper("BlackJake",Material.SLIME_BALL, "Slime Head"), //Slime Head
			new SkullWrapper("brinkley26",Material.SLIME_BALL, "Lava slime head"), //Lava Slime
			new SkullWrapper("XlexerX",Material.PORK,"Pig face"),  //Pig
			new SkullWrapper("HyperBeam567",Material.WOOL,"Sheep head"),  //Sheep
			new SkullWrapper("Villager",Material.MONSTER_EGG,"Villager head"),  //Villager Head
			new SkullWrapper("Seann_G",Material.MILK_BUCKET,"Cow head"), //Cow Head
			new SkullWrapper("SeanBreen97",Material.COOKED_FISH, "Cat (Ocelot) head"), //Cat (Ocelot)
			new SkullWrapper("JustSmall", Material.INK_SACK,"Squid face (Non-Default"), //Squid
			new SkullWrapper("MHF_Squid",Material.INK_SACK,"Actual Squid Face"), //Another Squid
			new SkullWrapper("radeoactivesoup",Material.IRON_INGOT, "Iron Golem"), //Iron Golem
			new SkullWrapper("luci999",Material.RAW_FISH, "Puffer Fish"), //Puffer Fish
			new SkullWrapper("Famastic",Material.RAW_FISH,"Clown Fish"), //Clown Fish
			new SkullWrapper("MHF_MushroomCow",Material.RED_MUSHROOM,"Mushroom Cow"), //Mushroom Cow
			new SkullWrapper("MHF_PigZombie",Material.ROTTEN_FLESH,"Zombie Pigman"), //Pig Zombie
			new SkullWrapper("theangryman",varargs(Material.SKULL_ITEM), "Bloody Skull"), //Bloody Skull
			new SkullWrapper("MHF_Chicken",Material.FEATHER, "Chicken"), //Chicken
			new SkullWrapper("MHF_Herobrine",Material.SKULL_ITEM,"Herobrine"), //Herobrine
			new SkullWrapper("Herobrine",Material.SKULL_ITEM,"Another Herobrine"), //Another Herobrine
			//=============//
			//    Food     //
			//=============//
			new SkullWrapper("ZachWarnerHD",Material.PUMPKIN_SEEDS, "Popcorn"), //Popcorn
			new SkullWrapper("ChoclateMuffin",Material.COOKIE,"Cupcake"), //Cupcake
			new SkullWrapper("food",Material.BREAD,"Hamburger"), //Hamburger
			new SkullWrapper("MHF_Cake",Material.CAKE,"Cake!"), //Cake
			new SkullWrapper("QuadratCookie",Material.COOKIE,"Cookie"), //Cookie
			//=============//
			//    Other    //
			//=============//
			new SkullWrapper("Endercreeper7253",Material.PAPER,"Globe"), //Globe
			new SkullWrapper("Numba_one_Stunna",Material.NETHERRACK,"Netherrach"), //Netherrack
			new SkullWrapper("CoderPuppy",Material.REDSTONE,"Computer"), //Computer
			new SkullWrapper("sysfailure",Material.REDSTONE,"TV"), //TV
			new SkullWrapper("uioz",Material.REDSTONE, "Radio"), //Radio
			new SkullWrapper("Edna_I",Material.EYE_OF_ENDER,"Ender Eye"), //Ender Eye
			new SkullWrapper("KylexDavis",Material.APPLE), //Red Apple
			new SkullWrapper("KyleWDM",Material.COCOA,"Coconuts"), //Coconut
			new SkullWrapper("Chuzard",Material.BLAZE_POWDER,"Pokeball"), //Pokeball
			new SkullWrapper("L_H_2012",Material.BLAZE_POWDER,"Master Ball"), //Master Ball
			new SkullWrapper("benbick",Material.BLAZE_POWDER, "Rubiks Cube"), //Rubiks Cube
			new SkullWrapper("jarrettgabe",Material.BLAZE_POWDER, "Question Box")//Question Box

	};

	static
	{
		for (int I = 0; I < skullNames.length; I++)
		{
			SkullWrapper skullWrapper = skullNames[I];
			List<Material> materialList = skullWrapper.getRelativeMaterials();
			SkullItem skullItem = new SkullItem(skullWrapper.getSkullOwnerName(),I,new MaterialData(materialList.get(0)),skullWrapper.getSkullDescription());
			skullItems.put(I, skullItem);
			for(Material material : materialList)
			{
				if (!skullMaterialWrapper.containsKey(material))
				{
					skullMaterialWrapper.put(material,new SkullMaterialWrapper(material,skullItem));
				}
				else
				{
					skullMaterialWrapper.get(material).addSkullItem(skullItem);
				}
			}
		}
		itemPages = Lists.partition(new ArrayList<>(skullItems.values()),53).size();
	}

	private static List<SkullItem> getSkullItems()
	{
		return new ArrayList<>(skullItems.values());
	}

	public static SkullItem getSkullItem(int index)
	{
		return skullItems.get(index);
	}

	public static ItemStack getItemStack(SkullItem skullItem)
	{
		ItemStack skullItemStack = ItemHandler.getSkull(skullItem.getSkullOwner());
		ItemMeta itemMeta = skullItemStack.getItemMeta();
		itemMeta.setDisplayName(skullItem.getSkullDescription());
		skullItemStack.setItemMeta(itemMeta);
		//skullItemStack.setAmount(64);
		return skullItemStack;
	}

	public static ItemStack getItemStack(int itemIndex)
	{
		return getItemStack(skullItems.get(itemIndex));
	}

	public static List<SkullItem> getSkullItems(int startIndex, int endIndex)
	{
		LinkedList<SkullItem> skullItemsList = new LinkedList<SkullItem>();
		if (skullItems.size() >= startIndex && skullItems.size() <= endIndex)
		{
			for(int I = startIndex; I < endIndex; I++)
			{
				skullItemsList.add(skullItems.get(I));
			}
		}
		return skullItemsList;
	}

	public static int getPages()
	{
		return itemPages;
	}

	public static List<SkullItem> getPage(int itemPage)
	{
		return Lists.partition(getSkullItems(),53).get(itemPage - 1);
	}
}
