package me.histordev.HistoricalCraft;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import me.histordev.HistoricalCraft.utility.Container;
import me.histordev.HistoricalCraft.utility.Dispatcher;

public class Main extends JavaPlugin
{
	
	/*
	|--------------------------------------------------------------------------
	| Функция запуска плагина;
	|--------------------------------------------------------------------------
	|
	| Подтягивает с помощью диспетчера ссылки на созданные в нём экземпляры классов,
	| необходимых для работы плагина (например слушателей событий или выполнителей команд).
	| 
	| После получения массива ссылок от диспетчера, создает новый экземпляр контейнера, 
	| и передает в него для быстрого доступа все созданные экземпляры.
	|
	| Передает также с помощью фукнции log доступ к логированию в консоль.
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
