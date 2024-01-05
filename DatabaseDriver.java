package smartCity;

import java.sql.*;
//Importing required classes
import java.util.*;


public class DatabaseDriver {
	
	String userName; //Local variables, not accessed by external classes
	String password; 
	String serverName; 
	String url;
	Object Host;
	int portNumber;
	Connection conn;
	String Query;
	Statement statement;
	ResultSet resultSet;
	
	private PreparedStatement Registerstmt;

	
	
	
	
	
	
	public DatabaseDriver(String userName, String password, Object Host, String serverName, int portNumber){//Constructor
		
		//Constructor initialises variables
		this.userName = userName;
		this.password = password;
		this.Host = Host;
		this.serverName = serverName;
		this.portNumber = portNumber;
		this.url = "jdbc:mysql://" + this.Host + ":" + this.portNumber + "/" + this.serverName; //Sets variable for connection with the SQL server. Combines multiple variables for access
		DBConnect();
		
		System.out.print("DB Constructor Complete");

	}
	
	public void DBConnect() {
		//Connects to SmartCity Database 		

			try {
				
			      Properties info = new Properties();
			      info.put("user", this.userName); //Inserts the database username and password for acces to the database
			      info.put("password", this.password);
			      conn = DriverManager.getConnection(url, info);

			      if (conn != null) { //if connection is not equals to null, then program is connected to the database
			        System.out.println("Connected to Database");
			      }

			    
				
			}
			catch (SQLException ex) { //if error is caught then connection with database failed
			      System.out.println("Error while connecting the Database");
			      ex.printStackTrace();
			    }

			
		} 
	
	
	
	
	public String[][] Retrievetable(String Table) throws SQLException{
		int i = 0;
		if(Table.equals("user")) { //Set query to search for unverified users
			Query = "SELECT * FROM `" + Table + "` WHERE Verified=0";
	        statement = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        resultSet = statement.executeQuery(Query);

		}else if(Table.equals("Apprentiship")){ //sets query to search for apprentiships within the jobposting table
			Query = "SELECT * FROM `jobposting` WHERE Apprentiship=1 ORDER BY ID DESC";
	        statement = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        resultSet = statement.executeQuery(Query);
			
		} else { //sets query to search for given table
			Query = "SELECT * FROM `" + Table + "` ORDER BY ID DESC";
	        statement = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        resultSet = statement.executeQuery(Query);
		}

        
        int columnCount = resultSet.getMetaData().getColumnCount(); // Get number of columns
        int rowCount =0;
        
        while (resultSet.next()) {
            rowCount++; // Count rows
        }
        
        resultSet.beforeFirst(); // Reset result set to beginning
        String[][] Result = new String[rowCount][columnCount]; //set array size
        
        
        if(Table.equals("user")) {
        	
        	
            while (resultSet.next()) {//Itterates to next row of results
            	int AdjustedIndex = 0;
            	for(int K = 1; K <= columnCount; K++ ) {
            		if(K == 4) { //4th Iteration is password therefore this is skipped to ensure security
            			continue;
            			
            		}
        			Result[i][AdjustedIndex] = resultSet.getString(K); //Sets 2nd dimension of array to Itterated value
        			System.out.println(resultSet.getString(K));
        			//System.out.println(K);
        			AdjustedIndex++;
            		
            	}
            	
            	i++;
            }
        	
        }else { //If result is not for Users then algorithm does not exclude any itteration
        	
            while (resultSet.next()) {
            	
            	for(int K = 1; K <= columnCount; K++ ) {
    	        	Result[i][K-1] = resultSet.getString(K);
            	}
            	
            	i++;
            }
        	
        }
        
        

		
		
		return Result;
	
		
	}
	
	public String[] LoginVerification(String Username, String Password) throws SQLException{ //Used to verify a login, then returns boolean based on result
	    String Query = "SELECT * FROM user WHERE UserName='" + Username + "' && Password='" + Password+ "'"; //Set query to search for user and password, return result if both match an existing user
        statement = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery(Query);
        int columnCount = resultSet.getMetaData().getColumnCount(); // Get number of columns

        String[] Result = new String[columnCount+1];

        if(resultSet.next()) {
        	
        	if(resultSet.getString(7).equals("0")){ //If 7th iteration of resultSet is 0 then return User Unverified string. USer will not be able to login
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
        	Result[0] = "Wrong Username or Password"; //If no match was found from query then return Wrong Username or Password
        }
		return Result;
	
		
	}
	
	
	
	public String UserRegister(String[] RegisterDetails) throws SQLException{ //Registers user 
		
		
		try(PreparedStatement CheckUserStmt = conn.prepareStatement("Select UserName FROM user WHERE UserName = ? ")){ //Checks if username already exists

			CheckUserStmt.setString(1, RegisterDetails[0]);
			ResultSet QueryResult = CheckUserStmt.executeQuery();
			if(QueryResult.next()) { //If query returns result, return UserName Already Exists
				return "UserName Already Exists"; 
				
			}else { //If user does not exist, attempt register
				Registerstmt = conn.prepareStatement("insert into user (UserName, FullName, Password, Email) values (?, ?, ?, ?)");
				Registerstmt.setString(1, RegisterDetails[0]); //Enter RegisterDetails array into Registerstmt
				Registerstmt.setString(2, RegisterDetails[1]);
				Registerstmt.setString(3, RegisterDetails[2]);
				Registerstmt.setString(4, RegisterDetails[3]);
				if(Registerstmt.executeUpdate() == 1) {//execute prepared statement
					return "Register Succesfull"; //If successful, return following

				}else {
					 return "Register Unsuccesfull"; //If unsuccessful, return following
				}
			}
		
			
			

		}catch (SQLException e) {
	        e.printStackTrace();
	        return "Please Try Again"; //If error is caught, return following
	    }

	

		
		
	

	}
	
	public boolean UserUpdate(int ID, String Name, String Email) throws SQLException { //Update user details method for Users
		
		System.out.println(ID + " " + Name + " " + Email);

		PreparedStatement UserUpdateStmt = conn.prepareStatement("Update user SET FullName=?, Email=? WHERE ID=?");
		UserUpdateStmt.setInt(3, ID); //Set ID of what user to edit
		UserUpdateStmt.setString(1, Name); //Set changed details
		UserUpdateStmt.setString(2, Email);

		
		if(UserUpdateStmt.executeUpdate() == 1) { //If successful, run following
			System.out.println("Success");

			return true;
		}else {
			return false;
		}

		

	}
	
	public boolean UserVerify(String ID) throws SQLException { //Verify user method for Admins
		
		PreparedStatement UserVerifyStmt = conn.prepareStatement("Update user SET Verified=? WHERE ID=?");
		UserVerifyStmt.setString(2, ID); //Set ID of what user to Verify
		UserVerifyStmt.setInt(1, 1); //Set verification status
		
		if(UserVerifyStmt.executeUpdate() == 1) { //If successful, run following
			System.out.println("Verification success");

			return true;
		}else {
			return false;
		}

		
		
	}

	
	public boolean DeleteRecord(String ID, String Table) throws SQLException { //Delete record method for admins
		
		
		
		
		PreparedStatement TableDeleteStmt = conn.prepareStatement("DELETE FROM `" + Table + "` WHERE `ID`=?");
		TableDeleteStmt.setString(1, ID); //Set ID of what user to delete
		
		if(TableDeleteStmt.executeUpdate() == 1) { //If deletion is successful, run following
			System.out.println("Delete success");

			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	public boolean UpdateRecord(String ID, String Table, String[] EditedData) throws SQLException { //Update record method for admins. Edits records in tables for users to view

		String sql = null;
		int IndexParam = 0;
		System.out.println("The table is:" + Table);

		switch(Table){ //Switch function for efficient coding practice. Each table will be checked and a sql statement along with index parameter will be set according to each tables columns
			
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
		
		PreparedStatement TableUpdateStmt = conn.prepareStatement(sql); //Prepare prepared statement with the sql string set from switch case

		for(int i = 0; i < IndexParam-1; i++) { //For loop iterates through indexParam(this dictated how many columns must be set for each table). 
			
			if(EditedData[i] == null) {
				EditedData[i] = "N/A";
			}
			TableUpdateStmt.setString(i+1, EditedData[i]); //i+1 required as Prepared statement requires index to start from 1, not 0
			System.out.println(i+1 +" //" + EditedData[i]);

			
		}

		TableUpdateStmt.setString(IndexParam, ID); //Set ID of record to edit. Index parameter will always dictate the WHERE function in sql

		if(TableUpdateStmt.executeUpdate() == 1) {
			System.out.println("Update success");

			return true;
		}else {
			return false;
		}
	   
	}
	
	
	
	
	
	
	
	public boolean AddRecord(String Table, String[] EditedData) throws SQLException { //AddRecord method adds a record to a table, similar function to updateRecord method

		String sql = null;//Initialise local variables
		int IndexParam = 0; 

		switch(Table){//Switch function for efficient coding practice. Each table will be checked and a sql statement along with index parameter will be set according to each tables columns
			
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
		
		
		PreparedStatement TableUpdateStmt = conn.prepareStatement(sql);//Prepare prepared statement with the sql string set from switch case


		for(int i = 0; i < IndexParam; i++) {//For loop iterates through indexParam(this dictated how many columns must be set for each table). 
			
			if(EditedData[i] == null) {
				EditedData[i] = "N/A";
			}
			TableUpdateStmt.setString(i+1, EditedData[i]);//i+1 required as Prepared statement requires index to start from 1, not 0
			System.out.println(i+1 +" //" + EditedData[i]);

			
		}
		//No ID is set as this will be automatic through MySQL

		if(TableUpdateStmt.executeUpdate() == 1) {  //If successful, run following
			System.out.println("Update success");

			return true;
		}else {
			return false;
		}
	   
	}
		
		
}

