package com.caved_in.skullblocks.handlers.item.skullblock;

import com.caved_in.skullblocks.handlers.item.ItemHandler;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:39 AM
 */
public class SkullBlockItems
{
	private static HashMap<Integer, SkullItem> skullItems = new HashMap<>();
	private static HashMap<Material, SkullMaterialWrapper> skullMaterialWrapper = new HashMap<>();

	private static SkullWrapper[] skullNames = new SkullWrapper[] {
			new SkullWrapper("Koebasti", Material.PUMPKIN), //Pumpkin with face
			new SkullWrapper("GalacticPumpkin",Material.PUMPKIN), //Pumpkin without face
			new SkullWrapper("GalacticMelon",Material.MELON), //Water Melon
			new SkullWrapper("LaxPride",Material.CACTUS), //Cactus
			new SkullWrapper("rsfx",Material.LEAVES), //Leaves
			new SkullWrapper("Dynasaur",Material.LOG), //Wood (6 Sided Bark)
			new SkullWrapper("Stone",Material.LOG), //Wood (4 Sided Bark)
			new SkullWrapper("terryxu",Material.WOOD), //Wooden Planks
			new SkullWrapper("Robbydeezle",Material.STONE), //Stone Block
			new SkullWrapper("Khrenan",Material.MOSSY_COBBLESTONE), //Mossy Cobblestone
			new SkullWrapper("HCTNT",Material.TNT), //TNT Block
			new SkullWrapper("C418",Material.JUKEBOX), //Jukebox
			new SkullWrapper("scemm",Material.DISPENSER), //Dispenser
			new SkullWrapper("Panda4994",Material.PISTON_STICKY_BASE), //Sticky Piston
			new SkullWrapper("JL2579",Material.PISTON_BASE), //Piston
			new SkullWrapper("Coblestone",Material.COBBLESTONE), //Cobblestone
			new SkullWrapper("akaBruce",Material.DIAMOND),//Diamond Ore
			new SkullWrapper("annayirb",Material.REDSTONE), //Redstone Ore
			new SkullWrapper("Tereneckla", Material.EMERALD), //Emerald Ore
			new SkullWrapper("pomi44",Material.SPONGE), //SPONGE! EEK!
			new SkullWrapper("bubbadawg01",Material.QUARTZ), //Quartz
			new SkullWrapper("abb3_1337",Material.BOOK), //Book Stack
			new SkullWrapper("BowAimbot",Material.BOOKSHELF), //Bookshelf
			new SkullWrapper("Bendablob",Material.WHEAT), //Haybale
			new SkullWrapper("GAMEZENMASTER",Material.MOB_SPAWNER), //Monster Spawner
			new SkullWrapper("MrSlavi",Material.CHEST), //Chest
			new SkullWrapper("samstine11",Material.GLOWSTONE), //Glowstone
			new SkullWrapper("PhasePvP",Material.DIRT), //Podzol
			new SkullWrapper("zachman228",Material.DIRT), //Dirt
			new SkullWrapper("Fyspyguy",Material.DIAMOND), //Diamond Block
			new SkullWrapper("teachdaire",Material.GOLD_INGOT), //Gold Block
			new SkullWrapper("metalhedd",Material.IRON_INGOT), //Iron Block
			new SkullWrapper("loiwiol",Material.OBSIDIAN), //Obsidian Block
			new SkullWrapper("dylansams",Material.BEDROCK), //Bedrock Block
			new SkullWrapper("rugofluk",Material.SAND), //Sand Block
			new SkullWrapper("Omnisulfur",Material.SAND), //Red Sand
			new SkullWrapper("AutoSoup",Material.GLOWSTONE), //Redstone Lamp
			new SkullWrapper("MHF_ArrowUp",Material.BLAZE_POWDER), //Up Arrow
			new SkullWrapper("MHF_ArrowDown",Material.BLAZE_POWDER), //Down Arrow
			new SkullWrapper("MHF_ArrowLeft",Material.BLAZE_POWDER), //Left Arrow
			new SkullWrapper("MHF_ArrowRight",Material.BLAZE_POWDER), //Right Arrow
			new SkullWrapper("MHF_Exclamation",Material.BLAZE_POWDER), //Exclamation
			new SkullWrapper("MHF_Question",Material.BLAZE_POWDER), //Question Mark
			new SkullWrapper("AlexDr0ps",Material.REDSTONE), //Redstone Block
			new SkullWrapper("MHF_OakLog",Material.LOG), //Oak Log
			new SkullWrapper("MechaUnit",Material.CACTUS), //Cactus Top
			//==============//
			//   Mob Heads  //
			//==============//
			new SkullWrapper("Troax",Material.EGG,Material.ENDER_PEARL,Material.EYE_OF_ENDER), //Enderman
			new SkullWrapper("GLaDOS",Material.EGG,Material.SNOW_BALL), //Snowman
			new SkullWrapper("Zisteau",Material.EGG,Material.PORK,Material.ROTTEN_FLESH), //Pigman No Skin
			new SkullWrapper("Blaze_Head",Material.EGG,Material.BLAZE_ROD), //Blaze Head
			new SkullWrapper("_QuBra_",Material.EGG,Material.GHAST_TEAR), //Ghast Head
			new SkullWrapper("Kelevra_V",Material.EGG,Material.STRING), //Spider Head
			new SkullWrapper("BlackJake",Material.EGG,Material.SLIME_BALL), //Slime Head
			new SkullWrapper("brinkley26",Material.EGG,Material.SLIME_BALL), //Lava Slime
			new SkullWrapper("XlexerX",Material.EGG,Material.PORK), //Pig
			new SkullWrapper("HyperBeam567",Material.EGG,Material.WOOL), //Sheep
			new SkullWrapper("Villager",Material.EGG,Material.MONSTER_EGG), //Villager Head
			new SkullWrapper("Seann_G",Material.EGG,Material.RAW_BEEF,Material.COOKED_BEEF,Material.MILK_BUCKET,Material.LEATHER), //Cow Head
			new SkullWrapper("SeanBreen97",Material.EGG,Material.MILK_BUCKET), //Cat (Ocelot)
			new SkullWrapper("JustSmall", Material.EGG,Material.INK_SACK,Material.RAW_FISH), //Squid
			new SkullWrapper("MHF_Squid",Material.EGG,Material.INK_SACK,Material.RAW_FISH), //Another Squid
			new SkullWrapper("radeoactivesoup",Material.EGG,Material.IRON_INGOT,Material.IRON_BLOCK,Material.IRON_ORE), //Iron Golem
			new SkullWrapper("luci999",Material.RAW_FISH,Material.EGG,Material.INK_SACK), //Puffer Fish
			new SkullWrapper("Famastic",Material.RAW_FISH,Material.INK_SACK,Material.EGG), //Clown Fish
			new SkullWrapper("MHF_MushroomCow",Material.BROWN_MUSHROOM,Material.RED_MUSHROOM,Material.RAW_BEEF,Material.LEATHER,Material.EGG), //Mushroom Cow
			new SkullWrapper("MHF_PigZombie",Material.EGG,Material.ROTTEN_FLESH,Material.PORK), //Pig Zombie
			new SkullWrapper("theangryman",Material.EGG), //Bloody Skull
			new SkullWrapper("MHF_Chicken",Material.EGG,Material.FEATHER,Material.RAW_CHICKEN), //Chicken
			new SkullWrapper("MHF_Herobrine",Material.EGG), //Herobrine
			new SkullWrapper("Herobrine",Material.EGG), //Another Herobrine
			//=============//
			//    Food     //
			//=============//
			new SkullWrapper("ZachWarnerHD",Material.BLAZE_POWDER), //Popcorn
			new SkullWrapper("ChoclateMuffin",Material.COOKIE,Material.BLAZE_POWDER), //Cupcake
			new SkullWrapper("food",Material.BLAZE_POWDER,Material.BREAD), //Hamburger
			new SkullWrapper("MHF_Cake",Material.BLAZE_POWDER,Material.CAKE), //Cake
			new SkullWrapper("QuadratCookie",Material.COOKIE,Material.BLAZE_POWDER), //Cookie
			//=============//
			//    Other    //
			//=============//
			new SkullWrapper("Endercreeper7253",Material.BLAZE_POWDER), //Globe
			new SkullWrapper("Numba_one_Stunna",Material.NETHERRACK), //Netherrack
			new SkullWrapper("CoderPuppy",Material.BLAZE_POWDER), //Computer
			new SkullWrapper("sysfailure",Material.BLAZE_POWDER), //TV
			new SkullWrapper("uioz",Material.BLAZE_POWDER), //Radio
			new SkullWrapper("Edna_I",Material.BLAZE_POWDER,Material.EYE_OF_ENDER,Material.ENDER_PEARL), //Ender Eye
			new SkullWrapper("KylexDavis",Material.APPLE,Material.GOLDEN_APPLE), //Red Apple
			new SkullWrapper("KyleWDM",Material.BLAZE_POWDER), //Coconut
			new SkullWrapper("Chuzard",Material.BLAZE_POWDER), //Pokeball
			new SkullWrapper("L_H_2012",Material.BLAZE_POWDER), //Master Ball
			new SkullWrapper("benbick",Material.BLAZE_POWDER), //Rubiks Cube
			new SkullWrapper("jarrettgabe",Material.BLAZE_POWDER)//Question Box

	};

	static
	{
		for (int I = 0; I < skullNames.length; I++)
		{
			List<Material> materialList = skullNames[I].getRelativeMaterials();
			SkullWrapper skullWrapper = skullNames[I];
			SkullItem skullItem = new SkullItem(skullWrapper.getSkullOwnerName(),I,materialList);
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
	}

	public static SkullItem getSkullItem(int index)
	{
		return skullItems.get(index);
	}

	public static ItemStack getItemStack(SkullItem skullItem)
	{
		return ItemHandler.getSkull(skullItem.getSkullOwner());
	}
}
