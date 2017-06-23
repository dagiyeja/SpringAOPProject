package com.sist.aspect;

public class MainClass {
	public static void main(String[] args) {
		DataBase db=new MyData();
		db.select();
		db.insert();
		
		db=new Proxy(new MyData());
		db.select();
		db.insert(); 
	}
}
