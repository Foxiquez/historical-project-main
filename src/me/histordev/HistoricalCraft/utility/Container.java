package me.histordev.HistoricalCraft.utility;

import java.util.HashMap;

	/*
	|--------------------------------------------------------------------------
	| ��������� ��������� ��������;
	|--------------------------------------------------------------------------
	|
	| ����� ���������� ������� Singleton, �� ���� ������ � ����� ����������� ����
	| ������ �� ��������� ������ ����.
	| 
	| ����� ������ ������ getInstance, ���������� �������� ���������� � ��� ������,
	| � ���� ��������� ��� ���������� �� ���������� ������ �� ����.
	|
	| � ���� objects ��������� ������ HashMap<String, Object> ������� � ������� ��� ������.
	|
	*/

public class Container {

	private static Container instance;
	
	protected HashMap<String, Object> objects = new HashMap<String, Object>();
	
	private Container() {}
	
	public static Container getInstance()
	{
		if (instance == null)
		{
			instance = new Container();
		}
		return instance;
	}
	
	public HashMap<String, Object> getObjects()
	{
		return this.objects;
	}
	
	public Object getObject(String className)
	{
		return this.objects.get(className);
	}
	
	public void setObjects(HashMap<String, Object> o)
	{
		this.objects = o;
	}
	
}
