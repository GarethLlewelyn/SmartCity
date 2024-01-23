package smartCity;

import java.sql.SQLException;

public class Buisness extends ApplicationDriver implements SmartCityApp{

	public String[][] RentableSpaces; //Business variables accessed by Super class
	public String[][] NewBuisnesses;
	public String[][] BusinessNews;
	
	
	public void RetrieveTable() throws SQLException {
		
		RentableSpaces = DBInstance.Retrievetable("rentablespace");  //Stores table information from DBInstance with table name. 
		NewBuisnesses = DBInstance.Retrievetable("business");  
		BusinessNews = DBInstance.Retrievetable("news");  

        
        ApplicationDriver.RentableSpaces = RentableSpaces; //Stores unConverted table data into local variables which can be accessed from super class and ConvertTable
        ApplicationDriver.NewBuisnesses = NewBuisnesses;
        ApplicationDriver.BusinessNews = BusinessNews;

        


	
	
	}
	
    public void ConvertTable() throws SQLException {//Converts local unconverted variables into table variables.
    	
    	
    	RentableSpacesTable = new String[RentableSpaces.length][6]; //Initialises with row amount and column amount
    	NewBuisnessesTable = new String[NewBuisnesses.length][6]; 
    	BusinessNewsTable = new String[BusinessNews.length][4]; 

          for (int i = 0; i < RentableSpaces.length; i++) { //For loop iterating through variables row and converts them into TableVariables used in the tables viewed by users
          		
        	  RentableSpacesTable[i][0] = RentableSpaces[i][1];
        	  RentableSpacesTable[i][1] = RentableSpaces[i][2];
        	  RentableSpacesTable[i][2] = RentableSpaces[i][3];
        	  RentableSpacesTable[i][3] = RentableSpaces[i][4];
        	  RentableSpacesTable[i][4] = RentableSpaces[i][5];
        	  RentableSpacesTable[i][5] = RentableSpaces[i][6];
          		
          		
          	}
          
          
          for (int i = 0; i < NewBuisnesses.length; i++) {//For loop iterating through variables row and converts them into TableVariables used in the tables viewed by users
      		
        	  NewBuisnessesTable[i][0] = NewBuisnesses[i][1];
        	  NewBuisnessesTable[i][1] = NewBuisnesses[i][2];
        	  NewBuisnessesTable[i][2] = NewBuisnesses[i][3];
        	  NewBuisnessesTable[i][3] = NewBuisnesses[i][4];
        	  NewBuisnessesTable[i][4] = NewBuisnesses[i][5];
        	  NewBuisnessesTable[i][5] = NewBuisnesses[i][6];
      		
      		}
          
          for (int i = 0; i < BusinessNews.length; i++) {//For loop iterating through variables row and converts them into TableVariables used in the tables viewed by users
        		
        	  BusinessNewsTable[i][0] = BusinessNews[i][1];
        	  BusinessNewsTable[i][1] = BusinessNews[i][2];
        	  BusinessNewsTable[i][2] = BusinessNews[i][3];
        	  BusinessNewsTable[i][3] = BusinessNews[i][4];

      		
      		
      		}
          

          }

}
