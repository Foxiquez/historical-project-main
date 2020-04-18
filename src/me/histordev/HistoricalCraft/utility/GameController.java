package me.histordev.HistoricalCraft.utility;

import org.bukkit.Server;
import org.bukkit.event.Listener;


import me.histordev.HistoricalCraft.Main;

	/*
	|--------------------------------------------------------------------------
	| »гровой родительский супер контроллер;
	|--------------------------------------------------------------------------
	|
	| явл€етс€ базовым классом предоставл€ющим доступ игровой к логике сервера;
	| —одержит в себе все базовые методы дл€ "улавливани€" игровых ивентов,
	| создани€ объектов, и отправки откликов наверх через класс Main;
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
