package me.histordev.HistoricalCraft.utility;

import java.util.HashMap;

	/*
	|--------------------------------------------------------------------------
	| Контейнер созданных объектов;
	|--------------------------------------------------------------------------
	|
	| Имеет реализацию шаблона Singleton, то есть хранит в своем статическом поле
	| ссылку на экземпляр самого себя.
	| 
	| После вызова метода getInstance, происходит создание экземпляра и его запись,
	| а если экземпляр уже существует то передается ссылка на него.
	|
	| В поле objects храниться объект HashMap<String, Object> который и содежит все ссылки.
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
