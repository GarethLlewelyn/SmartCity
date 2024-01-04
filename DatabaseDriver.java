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
	ResultSet resultSet;
	
	
	
	
	
	
	
	
	public DatabaseDriver(String userName, String password, Object Host, String serverName, int portNumber){
		
		//Constructor initialises variables
		this.userName = userName;
		this.password = password;
		this.Host = Host;
		this.serverName = serverName;
		this.portNumber = portNumber;
		this.url = "jdbc:mysql://" + this.Host + ":" + this.portNumber + "/" + this.serverName;
		DBConnect();
		
		System.out.print("DB Constructor Complete");

	}
	
	public void DBConnect() {
		//Connects to SmartCity Database 		

			try {
				
			      Properties info = new Properties();
			      info.put("user", this.userName);
			      info.put("password", this.password);
			      conn = DriverManager.getConnection(url, info);

			      if (conn != null) {
			        System.out.println("Connected to Database");
			      }

			    
				
			}
			catch (SQLException ex) {
			      System.out.println("Error while connecting the Database");
			      ex.printStackTrace();
			    }

			
		} 
	
	
	
	
	public String[][] Retrievetable(String Table) throws SQLException{
		int i = 0;
		if(Table.equals("user")) {
			Query = "SELECT * FROM `" + Table + "` WHERE Verified=0";
	        statement = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        resultSet = statement.executeQuery(Query);

		}else { 
			Query = "SELECT * FROM `" + Table + "`";
	        statement = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        resultSet = statement.executeQuery(Query);
		}

        
        int columnCount = resultSet.getMetaData().getColumnCount(); // Get number of columns
        int rowCount =0;
        
        while (resultSet.next()) {
            rowCount++; // Count rows
        }
        
        resultSet.beforeFirst(); // Reset result set to beginning
        String[][] Result = new String[rowCount][columnCount]; 
        
        
        if(Table.equals("user")) {
        	
        	
            while (resultSet.next()) {
            	int AdjustedIndex = 0;
            	for(int K = 1; K <= columnCount; K++ ) {
            		if(K == 4) {
            			continue;
            			
            		}
        			Result[i][AdjustedIndex] = resultSet.getString(K);
        			System.out.println(resultSet.getString(K));
        			//System.out.println(K);
        			AdjustedIndex++;
            		
            	}
            	
            	i++;
            }
        	
        }else {
        	
            while (resultSet.next()) {
            	
            	for(int K = 1; K <= columnCount; K++ ) {
    	        	Result[i][K-1] = resultSet.getString(K);
            	}
            	
            	i++;
            }
        	
        }
        
        

		
		
		return Result;
	
		
	}
	
	public String[] LoginVerification(String Username, String Password) throws SQLException{
	    String Query = "SELECT * FROM user WHERE UserName='" + Username + "' && Password='" + Password+ "'";
        statement = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery(Query);
        int columnCount = resultSet.getMetaData().getColumnCount(); // Get number of columns

        String[] Result = new String[columnCount+1];

        if(resultSet.next()) {
        	
        	if(resultSet.getString(7).equals("0")){
        		Result[0] = "User Unverified";
        	}else {
        		
        		Result[0] = "Success";
            	for(int J = 1; J <= columnCount; J++ ) { //starts at [1] to allow for success message.
            		if(J != 4) {
            			Result[J] = resultSet.getString(J); //Load Results full of the Users Information exluding password
            			}
            		}
            	
        	
        	
        	
        	}        	
        }else {
        	Result[0] = "Wrong Username or Password";
        }
		return Result;
	
		
	}
	
	
	
	public String UserRegister(String[] RegisterDetails) throws SQLException{
		
		
		
		try(PreparedStatement CheckUserStmt = conn.prepareStatement("Select UserName FROM user WHERE UserName = ? ")){

			CheckUserStmt.setString(1, RegisterDetails[0]);
			ResultSet QueryResult = CheckUserStmt.executeQuery();
			if(QueryResult.next()) {
				return "UserName Already Exists";
				
			}else {
				
				PreparedStatement stmt = conn.prepareStatement("insert into user (UserName, FullName, Password, Email) values (?, ?, ?, ?)");
				stmt.setString(1, RegisterDetails[0]);
				stmt.setString(2, RegisterDetails[1]);
				stmt.setString(3, RegisterDetails[2]);
				stmt.setString(4, RegisterDetails[3]);
				return "Register Succesfull";

			}
		

		}catch (SQLException e) {
	        e.printStackTrace();
	        return "Please Try Again"; 
	    }

	

		
		
	

	}
	
	public boolean UserUpdate(int ID, String Name, String Email) throws SQLException {
		
		System.out.println(ID + " " + Name + " " + Email);

		PreparedStatement UserUpdateStmt = conn.prepareStatement("Update user SET FullName=?, Email=? WHERE ID=?");
		UserUpdateStmt.setInt(3, ID);
		UserUpdateStmt.setString(1, Name);
		UserUpdateStmt.setString(2, Email);

		
		if(UserUpdateStmt.executeUpdate() == 1) {
			System.out.println("Success");

			return true;
		}else {
			return false;
		}

		

	}
	
	public boolean UserVerify(String ID) throws SQLException {
		
		PreparedStatement UserVerifyStmt = conn.prepareStatement("Update user SET Verified=? WHERE ID=?");
		UserVerifyStmt.setString(2, ID);
		UserVerifyStmt.setInt(1, 1);
		
		if(UserVerifyStmt.executeUpdate() == 1) {
			System.out.println("Verification success");

			return true;
		}else {
			return false;
		}

		
		
	}

	
	public boolean DeleteRecord(String ID, String Table) throws SQLException {
		
		
		
		
		PreparedStatement TableDeleteStmt = conn.prepareStatement("DELETE FROM `" + Table + "` WHERE `ID`=?");
		TableDeleteStmt.setString(1, ID);
		
		if(TableDeleteStmt.executeUpdate() == 1) {
			System.out.println("Delete success");

			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	public boolean UpdateRecord(String ID, String Table, String[] EditedData) throws SQLException {

		String sql = null;
		int IndexParam = 0;
		System.out.println("The table is:" + Table);

		switch(Table){
			
			case "hotels": 
				
				System.out.println("SWITCH WORK");
				sql = "Update hotels SET Name=?, Address=?, Description=?, Email=?  WHERE ID=?";
				IndexParam = 5;
				break;
				
			case"resteraunt":
				sql = "Update resteraunt SET Name=?, Address=?, Description=?, Email=?  WHERE ID=?";
				System.out.println("SWITCH WORK");
				IndexParam = 5;

				break;
				
			case"news":

				sql = "Update news SET Headline=?, Description=?, DateCreated=? WHERE ID=?";
				System.out.println("SWITCH WORK");
				IndexParam = 4;
				break;
				
			case"accomidation":

				sql = "Update accomidation SET Name=?, Address=?, Description=?, Email=?, AverageWeeklyCost=?  WHERE ID=?";
				IndexParam = 6;
				System.out.println("SWITCH WORK");

				break;
				
			case"unicol":

				sql = "Update unicol SET Name=?, Address=?, Description=?, Website=?  WHERE ID=?";
				System.out.println("SWITCH WORK");
				IndexParam = 5;
				break;
				
			case"rentablespace":

				sql = "Update rentablespace SET Company=?, Address=?, SizeSQF=?, CostPerMonth=?, Description=?, Contact=?  WHERE ID=?";
				System.out.println("SWITCH WORK");
				IndexParam = 7;
				break;
				
			case"business":

				sql = "Update business SET Company=?, Address=?, Description=?, Industry=?, Email=?  WHERE ID=?";
				System.out.println("SWITCH WORK");
				IndexParam = 6;
				break;
				
				
			case"jobposting":

				sql = "Update jobposting SET JobTitle=?, Company=?, Salary=?, Description=?, Apprentihip=?, CompanyWebsite=?  WHERE ID=?";
				System.out.println("SWITCH WORK");
				IndexParam = 7;
				break;
				
			case"volunteering":

				sql = "Update volunteering SET JobTitle=?, Address=?, Company=?, Description=?, CompanyWebsite=?, Contact=?  WHERE ID=?";
				System.out.println("SWITCH WORK");
				IndexParam = 7;
				break;
				

			
		}
		
		
		PreparedStatement TableUpdateStmt = conn.prepareStatement(sql);
		System.out.println("#####################################");

		System.out.println(EditedData.length);
		System.out.println("#####################################");

		
		
		for(int i = 0; i < IndexParam-1; i++) {
			
			if(EditedData[i] == null) {
				EditedData[i] = "N/A";
			}
			TableUpdateStmt.setString(i+1, EditedData[i]);
			System.out.println(i+1 +" //" + EditedData[i]);

			
		}
		System.out.println(ID);
		TableUpdateStmt.setString(IndexParam, ID); //Set ID

		if(TableUpdateStmt.executeUpdate() == 1) {
			System.out.println("Update success");

			return true;
		}else {
			return false;
		}
	   
		//PreparedStatement UserVerifyStmt = conn.prepareStatement("Update " + Table + " SET Verified=? WHERE ID=?");
	}
	
	
	
	
	
	
	
	public boolean AddRecord(String Table, String[] EditedData) throws SQLException {

		String sql = null;
		int IndexParam = 0;
		System.out.println("The table is:" + Table);

		switch(Table){
			
			case "hotels": 
				
				System.out.println("SWITCH WORK");
				sql = "INSERT INTO `hotels`(`Name`, `Address`, `Description`, `Email`) VALUES (?, ?, ?, ? )";
				IndexParam = 4;
				break;
				
			case"resteraunt":
				sql = "INSERT INTO `resteraunt`(`Name`, `Address`, `Description`, `Email`) VALUES (?, ?, ?, ? )";
				System.out.println("SWITCH WORK");
				IndexParam = 4;

				break;
				
			case"news":

				sql = "INSERT INTO `news`(`Headline`, `Description`) VALUES (?, ? )";
				System.out.println("SWITCH WORK");
				IndexParam = 2;
				break;
				
			case"accomidation":

				sql = "INSERT INTO `accomidation`(`Name`, `Address`, `Description`, `Email`, `AverageWeeklyCost`) VALUES (?, ?, ?, ?, ? )";
				IndexParam = 5;
				System.out.println("SWITCH WORK");

				break;
				
			case"unicol":

				sql = "INSERT INTO `unicol`(`Name`, `Address`, `Description`, `Website`) VALUES (?, ?, ?, ? )";
				System.out.println("SWITCH WORK");
				IndexParam = 4;
				break;
				
			case"rentablespace":

				sql = "INSERT INTO `rentablespace`(`Company`, `Address`, `SizeSQF`, `CostPerMonth`, `Description`, `Contact`) VALUES (?, ?, ?, ?, ?, ? )";
				System.out.println("SWITCH WORK");
				IndexParam = 6;
				break;
				
			case"business":

				sql = "INSERT INTO `business`(`Company`, `Address`, `Description`, `Industry`, `Email`) VALUES (?, ?, ?, ?, ? )";
				System.out.println("SWITCH WORK");
				IndexParam = 5;
				break;
				
				
			case"jobposting":

				sql = "INSERT INTO `jobposting`(`JobTitle`, `Company`, `Salary`, `Description`, `Apprentiship`, `CompanyWebsite`) VALUES (?, ?, ?, ?, ?, ? )";
				System.out.println("SWITCH WORK");
				IndexParam = 6;
				break;
				
			case"volunteering":

				sql = "INSERT INTO `volunteering`(`JobTitle`, `Address`, `Company`, `Description`, `CompanyWebsite`, `Contact`) VALUES (?, ?, ?, ?, ?, ? )";
				System.out.println("SWITCH WORK");
				IndexParam = 6;
				break;
				

			
		}
		
		
		PreparedStatement TableUpdateStmt = conn.prepareStatement(sql);
		System.out.println("#####################################");

		System.out.println(EditedData.length);
		System.out.println("#####################################");

		
		
		for(int i = 0; i < IndexParam; i++) {
			
			if(EditedData[i] == null) {
				EditedData[i] = "N/A";
			}
			TableUpdateStmt.setString(i+1, EditedData[i]);
			System.out.println(i+1 +" //" + EditedData[i]);

			
		}

		if(TableUpdateStmt.executeUpdate() == 1) {
			System.out.println("Update success");

			return true;
		}else {
			return false;
		}
	   
	}
		
		
}

