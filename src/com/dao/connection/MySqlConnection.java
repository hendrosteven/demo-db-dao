package com.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
	private static Connection conn;

	public static Connection getConnection() {
		// set connection mysql
		String URL = "jdbc:mysql://localhost:3306/dbsiswa?autoReconnect=true&useSSL=false";
		String USER = "root";
		String PWD = "root";
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(URL, USER, PWD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}
}
