package me.histordev.HistoricalCraft.utility;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.histordev.HistoricalCraft.Main;

	/*
	|--------------------------------------------------------------------------
	| Родитель исполнителей комманд;
	|--------------------------------------------------------------------------
	|
	| Является базовым классом предоставляющим доступ к методу onCommand;
	| Потомки класса должны иметь лишь логику связанную с этим методом.
	|
	|
	*/

public abstract class CmdExecutor implements CommandExecutor {

	protected String command;
	
	public String getCommand()
	{
		return this.command;
	}
	
	protected Server server = Main.getPlugin(Main.class).getServer();
	
	public Server getServer() {
		return server;
	}

	
	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
