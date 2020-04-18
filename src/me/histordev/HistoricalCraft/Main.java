package me.histordev.HistoricalCraft;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import me.histordev.HistoricalCraft.utility.Container;
import me.histordev.HistoricalCraft.utility.Dispatcher;

public class Main extends JavaPlugin
{
	
	/*
	|--------------------------------------------------------------------------
	| ‘ункци€ запуска плагина;
	|--------------------------------------------------------------------------
	|
	| ѕодт€гивает с помощью диспетчера ссылки на созданные в нЄм экземпл€ры классов,
	| необходимых дл€ работы плагина (например слушателей событий или выполнителей команд).
	| 
	| ѕосле получени€ массива ссылок от диспетчера, создает новый экземпл€р контейнера, 
	| и передает в него дл€ быстрого доступа все созданные экземпл€ры.
	|
	| ѕередает также с помощью фукнции log доступ к логированию в консоль.
	| 
	*/

	protected Logger log = getLogger();
	
	public void onEnable() 
	{
		this.log.info("Historical Craft Mode starting!");
		
		//getServer().getPluginManager().registerEvents(new GameController(), this);
		//getServer().getPluginManager().registerEvents(new CraftController(), this);
		//this.getCommand("inventory").setExecutor(new CmdExecutor());
		//this.getCommand("inventory").setExecutor(new CraftCmdExecutor());
		
		Dispatcher d = new Dispatcher(this);
		Container.getInstance().setObjects(d.handledObjects());
		
		
		//this.log.info();
		//System.out.println(((CmdExecutor) Container.getInstance().getObject("CustomCraftInventory")).getCommand());
		
	}
	
	public void onDisable() 
	{
		this.log.info("Historical Craft Mode disabled.");
	}

	public void log(String string) 
	{
		this.log.info(string);
	}
}
