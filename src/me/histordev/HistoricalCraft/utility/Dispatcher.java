package me.histordev.HistoricalCraft.utility;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.histordev.HistoricalCraft.Main;
import me.histordev.HistoricalCraft.game.CraftController;
import me.histordev.HistoricalCraft.game.CustomCraftInventory;

	/*
	|--------------------------------------------------------------------------
	| ������� ���������;
	|--------------------------------------------------------------------------
	|
	| ������� ������ ������ �� ����� ���������� ������� ������� ����� ��������.
	| ������ ������ ���� ���������� ��� ������, ���� �������� �������� ��������.
	|
	| ����� �������� ���������� ������� ����������,
	| ��� ������� ��������������� � ������ �������.
	| 
	| ����� ������ ������ handledObjects ������ ������������ � �����������,
	| ������ �� ��������� ����� �������;
	|
	| ����� handledObject ������������ ���� (��������� �������, ����������� �������),
	| � ������� ������� ����������� ���������� ������� � �����������.
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
