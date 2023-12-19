package smartCity;

import java.sql.*;
//Importing required classes
import java.util.*;


public class DatabaseDriver {
	
	String userName; 
	String password; 
	String serverName; 
	String url;
	Object Host;
	int portNumber;
	Connection conn;
	String Query;
	Statement statement;
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
	
	
	
	
	public String[][] Retrievetable(String Table) throws SQLException{
		int i = 0;
		Query = "SELECT * FROM `" + Table + "`";
        statement = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery(Query);
        
        int columnCount = resultSet.getMetaData().getColumnCount(); // Get number of columns
        int rowCount =0;
        
        while (resultSet.next()) {
            rowCount++; // Count rows
        }
        
        resultSet.beforeFirst(); // Reset result set to beginning
        String[][] Result = new String[rowCount][columnCount]; 

        while (resultSet.next()) {
        	
        	for(int K = 1; K <= columnCount; K++ ) {
	        	Result[i][K-1] = resultSet.getString(K);
	        	System.out.println(resultSet.getString(K));
        	}
        	
        	i++;
        }
		
		
		return Result;
	
		
	}
	
	public String LoginVerification(String Username, String Password) throws SQLException{
	    String Query = "SELECT * FROM user WHERE UserName='" + Username + "' && Password='" + Password+ "'";
        statement = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery(Query);
        String Result = null;


        if(resultSet.next()) {
        	
        	Result = resultSet.getString(1);
        	
        }
		
		
		return Result;
	
		
	}
	
		
	public static void main(String[] args) throws SQLException{
		
		DatabaseDriver Instance = new DatabaseDriver("root", "", "127.0.0.1", "smartcity", 3306);
		//new DBConnect();
		
		//String[][] Result = Instance.Retrievetable("user");
		//System.out.println(Result[0][0]);
		
		String LoginID = Instance.LoginVerification("Gaza", "Gaza123");
		System.out.println(LoginID);
		
	}
	

		
}

