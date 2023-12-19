package smartCity;

import java.sql.*;
//Importing required classes
import java.util.*;
import java.sql.DriverManager;


public class DatabaseDriver {
	
	String userName; 
	String password; 
	String serverName; 
	String url;
	Object Host;
	int portNumber;
	Connection conn;
	
	public DatabaseDriver(String userName, String password, Object Host, String serverName, int portNumber){
		
		//Constructor initialises variables
		this.userName = userName;
		this.password = password;
		this.Host = Host;
		this.serverName = serverName;
		this.portNumber = portNumber;
		this.url = "jdbc:mysql://" + this.Host + ":" + this.portNumber + "/" + this.serverName;
		System.out.print("ran");
		
		DBConnect();
	}
	
	public void DBConnect() {
		//Connects to SmartCity Database 		

			try {
				
			      Properties info = new Properties();
			      info.put("user", this.userName);
			      info.put("password", this.password);
			      conn = DriverManager.getConnection(url, info);

			      if (conn != null) {
			        System.out.println("Successfully connected to MySQL database test");
			      }

			    
				
			    System.out.println("Connected to database");
			}
			catch (SQLException ex) {
			      System.out.println("An error occurred while connecting MySQL databse");
			      ex.printStackTrace();
			    }

			
		} 
		
	public static void main(String[] args){
		
		new DatabaseDriver("root", "", "127.0.0.1", "smartcity", 3306);
		//new DBConnect();

	}
	

		
}

