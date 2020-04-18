package me.histordev.HistoricalCraft.utility;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.histordev.HistoricalCraft.Main;
import me.histordev.HistoricalCraft.game.CraftController;
import me.histordev.HistoricalCraft.game.CustomCraftInventory;

	/*
	|--------------------------------------------------------------------------
	| Игровой диспетчер;
	|--------------------------------------------------------------------------
	|
	| Массивы хранят ссылки на новые экземпляры классов которые будут запущены.
	| Данные классы либо необходимы для работы, либо являются игровыми модулями.
	|
	| После создания экземпляра объекта диспетчера,
	| эти массивы обрабатываються в первую очередь.
	| 
	| После вызова метода handledObjects масивы считываються и передаються,
	| ссылки на созданные ранее объекты;
	|
	| Также handledObject распределяет роли (слушатель события, выполнитель комманд),
	| с помощью заранее переданного экземпляра плагина в конструктор.
	|
	|
	*/

public class Dispatcher 
{
	protected JavaPlugin plugin;
	protected HashMap<String, Object> objects = new HashMap<String, Object>();

	public Dispatcher(Main main) {
		this.plugin = main;
	}

	public HashMap<String, Object> handledObjects() 
	{
		
		for (GameController c : controllers) 
		{
			this.objects.put(c.getClass().getSimpleName(), c);
			this.plugin.getServer().getPluginManager().registerEvents(c, this.plugin);
		}
		 

		for (CmdExecutor e : executors) 
		{
			this.objects.put(e.getClass().getSimpleName(), e);
			this.plugin.getCommand(e.getCommand()).setExecutor(e);
		}

		return this.objects;
	}
	

	protected GameController[] controllers = { 
			new CraftController(),

	};

	protected CmdExecutor[] executors = { 
			new CustomCraftInventory(),

	};
}
