package me.histordev.HistoricalCraft.game;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.histordev.HistoricalCraft.utility.CmdExecutor;
import me.histordev.HistoricalCraft.utility.Container;

public class CustomCraftInventory extends CmdExecutor implements CommandExecutor {
	
	protected String command = "crafts";
	
	public String getCommand()
	{
		return this.command;
	}
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		((CraftController) Container.getInstance().getObject("CraftController")).newInventory(player);
		return true;
	}

}
