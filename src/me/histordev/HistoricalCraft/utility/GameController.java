package me.histordev.HistoricalCraft.utility;

import org.bukkit.Server;
import org.bukkit.event.Listener;


import me.histordev.HistoricalCraft.Main;

	/*
	|--------------------------------------------------------------------------
	| ������� ������������ ����� ����������;
	|--------------------------------------------------------------------------
	|
	| �������� ������� ������� ��������������� ������ ������� � ������ �������;
	| �������� � ���� ��� ������� ������ ��� "�����������" ������� �������,
	| �������� ��������, � �������� �������� ������ ����� ����� Main;
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
