package dao;

import java.sql.DriverManager;

import java.sql.Connection;

public class DBconnection {
	public Connection cn;
    public void KetNoi() throws Exception{
    	//B1: Xac dinh HQTCSDl
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	System.out.println("Da xac dinh HQLCSDL");
    	//B2: Ket Noi
    	String url="jdbc:sqlserver://DESKTOP-URI6F1G\\SQLEXPRESS:1433;databaseName=QlSach;user=sa; password=123";
    	cn= DriverManager.getConnection(url);
    	System.out.println("Da ket noi");
    }
}
