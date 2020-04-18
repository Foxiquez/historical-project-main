package me.histordev.HistoricalCraft.game;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.histordev.HistoricalCraft.utility.GameController;

public class CraftController extends GameController implements Listener
{
	public CraftController()
	{
		this.getPlugin().log("start recipes!");
	}
	
	public void newInventory(Player player)
	{
		System.out.println("debug!");
		Inventory i = this.getServer().createInventory(null, 45, ChatColor.RED + "CRAFT CONTROLLER");
		
		int healthint = (int) player.getHealth();
		int foodint = player.getFoodLevel();
		
		
		  ItemStack empty = new ItemStack(Material.RED_STAINED_GLASS_PANE, 1);
		  ItemMeta emptyMeta = empty.getItemMeta(); 
		  emptyMeta.setDisplayName(" ");
		  empty.setItemMeta(emptyMeta);
		  
		 /* ItemStack health = new ItemStack(Material.INK_SACK, healthint, (byte) 1);
		 * ItemMeta hmeta = health.getItemMeta(); hmeta.setDisplayName(ChatColor.RED +
		 * "HEALTH"); health.setItemMeta(hmeta);
		 */
		
		ItemStack food = new ItemStack(Material.APPLE, foodint);
		ItemMeta fmeta = food.getItemMeta();
		fmeta.setDisplayName(ChatColor.YELLOW + "FOOD");
		food.setItemMeta(fmeta);
		
		for (int e = 0; e < 45; e++) 
		{
			if (
				(e != 10) & (e != 11) & (e != 12) &
				(e != 19) & (e != 20) & (e != 21) &
				(e != 28) & (e != 29) & (e != 30) & (e != 24)
			)
				i.setItem(e, empty); 
		}
		 
		
		 //i.setItem(3, health); 
		// i.setItem(4,empty);
		 
		//i.setItem(5, food);
		/*
		 * i.setItem(6,empty); i.setItem(7,empty); i.setItem(8,empty);
		 */
		
		player.openInventory(i);
	}


}
