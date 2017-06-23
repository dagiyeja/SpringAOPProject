package com.sist.aspect;

public class MyData implements DataBase{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("select call...");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("insert call...");
	}

}
