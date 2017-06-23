package com.sist.aspect;

public class Proxy implements DataBase{
	Common com=new Common();
	MyData md;
	public Proxy(MyData md){
		this.md=md;
	}
	@Override
	public void select() {
		// TODO Auto-generated method stub
		com.getConnection();
		md.select();
		com.disConnection();
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		com.getConnection();
		md.select();
		com.disConnection();
	}
	
}
