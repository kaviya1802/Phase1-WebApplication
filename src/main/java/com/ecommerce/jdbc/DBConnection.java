package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public Connection connection;
	
//	Initialize Connection
	public DBConnection(String url, String userName, String password) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.connection = DriverManager.getConnection(url, userName, password);
	}
	
//	get Connection
	public Connection getConnection() {
		return connection;
	}
	
//	close Connection
	public void closeConnection() throws SQLException {
		if(this.connection != null) {
			this.connection.close();
		}
		
	}
	

}
