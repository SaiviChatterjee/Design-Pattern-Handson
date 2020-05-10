package com.cognizant.com;

public class DBConn {

	private static DBConn instance = new DBConn();
	
	private DBConn() {}
	
	static DBConn getInstance() {
		return instance;
	}
		
	void display() {
		System.out.println("Singleton Demo Project");
	}
}
