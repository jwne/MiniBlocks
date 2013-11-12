package com.caved_in.skullblocks.handlers.item.skullblock;

import com.caved_in.skullblocks.handlers.item.ItemHandler;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

/**
 * Created By: TheGamersCave (Brandon)
 * Date: 12/11/13
 * Time: 9:39 AM
 */
public class SkullBlockItems
{
	private static HashMap<Integer, SkullItem> skullItems = new HashMap<>();
	private static String[] skullNames = new String[] {
			"Koebasti", //Pumpkin with face
			"GalacticPumpkin", //Pumpkin without face
			"GalacticMelon", //Water Melon
			"LaxPride", //Cactus
			"rsfx", //Leaves
			"Dynasaur", //Wood (6 Sided Bark)
			"Stone", //Wood (4 Sided Bark)
			"terryxu", //Wooden Planks
			"Robbydeezle", //Stone Block
			"Khrenan", //Mossy Cobblestone
			"HCTNT", //TNT Block
			"C418", //Jukebox
			"scemm", //Dispenser
			"Panda4994", //Sticky Piston
			"JL2579", //Piston
			"Coblestone", //Cobblestone
			"akaBruce", //Diamond Ore
			"annayirb", //Redstone Ore
			"Tereneckla", //Emerald Ore
			"pomi44", //SPONGE! EEK!
			"bubbadawg01", //Quartz
			"abb3_1337", //Book Stack
			"BowAimbot", //Bookshelf
			"Bendablob", //Haybale
			"GAMEZENMASTER", //Monster Spawner
			"MrSlavi", //Chest
			"samstine11", //Glowstone
			"PhasePvP", //Podzol
			"zachman228", //Dirt
			"Fyspyguy", //Diamond Block
			"teachdaire", //Gold Block
			"metalhedd", //Iron Block
			"loiwiol", //Obsidian Block
			"dylansams", //Bedrock Block
			"rugofluk", //Sand Block
			"Omnisulfur", //Red Sand
			"AutoSoup", //Redstone Lamp
			"MHF_ArrowUp", //Up Arrow
			"MHF_ArrowDown", //Down Arrow
			"MHF_ArrowLeft", //Left Arrow
			"MHF_ArrowRight", //Right Arrow
			"MHF_Exclamation", //Exclamation
			"MHF_Question", //Question Mark
			"AlexDr0ps", //Redstone Block
			"MHF_OakLog", //Oak Log
			"MechaUnit", //Cactus Top
			//==============//
			//   Mob Heads  //
			//==============//
			"Troax", //Enderman
			"GLaDOS", //Snowman
			"Zisteau", //Pigman No Skin
			"Blaze_Head", //Blaze Head
			"_QuBra_", //Ghast Head
			"Kelevra_V", //Spider Head
			"BlackJake", //Slime Head
			"brinkley26", //Lava Slime
			"XlexerX", //Pig
			"HyperBeam567", //Sheep
			"Villager", //Villager Head
			"Seann_G", //Cow Head
			"SeanBreen97", //Cat (Ocelot)
			"JustSmall", //Squid
			"MHF_Squid", //Another Squid
			"radeoactivesoup", //Iron Golem
			"luci999", //Puffer Fish
			"Famastic", //Clown Fish
			"MHF_MushroomCow", //Mushroom Cow
			"MHF_PigZombie", //Pig Zombie
			"theangryman", //Bloody Skull
			"MHF_Chicken", //Chicken
			"MHF_Herobrine", //Herobrine
			"Herobrine", //Another Herobrine
			//=============//
			//    Food     //
			//=============//
			"ZachWarnerHD", //Popcorn
			"ChoclateMuffin", //Cupcake
			"food", //Hamburger
			"MHF_Cake", //Cake
			"QuadratCookie", //Cookie
			//=============//
			//    Other    //
			//=============//
			"Endercreeper7253", //Globe
			"Numba_one_Stunna", //Netherrack
			"CoderPuppy", //Computer
			"sysfailure", //TV
			"uioz", //Radio
			"Edna_I", //Ender Eye
			"KylexDavis", //Red Apple
			"KyleWDM", //Coconut
			"Chuzard", //Pokeball
			"L_H_2012", //Master Ball
			"benbick", //Rubiks Cube
			"jarrettgabe"//Question Box

	};

	static
	{
		for (int I = 0; I < skullNames.length; I++)
		{
			skullItems.put(I, new SkullItem(skullNames[I],I));
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
