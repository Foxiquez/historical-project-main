package me.histordev.HistoricalCraft.utility;

import org.bukkit.Server;
import org.bukkit.event.Listener;


import me.histordev.HistoricalCraft.Main;

	/*
	|--------------------------------------------------------------------------
	| Игровой родительский супер контроллер;
	|--------------------------------------------------------------------------
	|
	| Является базовым классом предоставляющим доступ игровой к логике сервера;
	| Содержит в себе все базовые методы для "улавливания" игровых ивентов,
	| создания объектов, и отправки откликов наверх через класс Main;
	| 
	|
	|
	*/

public class GameController implements Listener {

	protected Main plugin = Main.getPlugin(Main.class);
	
	
	public Server getServer() {
		return plugin.getServer();
	}
	
	public Main getPlugin() {
		return plugin;
	}

}
