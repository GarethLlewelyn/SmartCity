package smartCity;

import java.sql.SQLException;

public class Buisness extends ApplicationDriver implements SmartCityApp{

	public String[][] RentableSpaces;
	public String[][] NewBuisnesses;
	public String[][] BusinessNews;
	
	
	public void RetrieveTable() throws SQLException {
		
		RentableSpaces = DBInstance.Retrievetable("rentablespace");  
		NewBuisnesses = DBInstance.Retrievetable("business");  
		BusinessNews = DBInstance.Retrievetable("news");  

        System.out.println("/ complete business /");
        
        ApplicationDriver.RentableSpaces = RentableSpaces;
        ApplicationDriver.NewBuisnesses = NewBuisnesses;
        ApplicationDriver.BusinessNews = BusinessNews;

        


	
	
	}
	
    public void ConvertTable() throws SQLException {
    	
    	
    	RentableSpacesTable = new String[RentableSpaces.length][4]; 
    	NewBuisnessesTable = new String[NewBuisnesses.length][4]; 
    	BusinessNewsTable = new String[BusinessNews.length][4]; 

          for (int i = 0; i < RentableSpaces.length; i++) {
          		
        	  RentableSpacesTable[i][0] = RentableSpaces[i][1];
        	  RentableSpacesTable[i][1] = RentableSpaces[i][2];
        	  RentableSpacesTable[i][2] = RentableSpaces[i][5];
        	  RentableSpacesTable[i][3] = RentableSpaces[i][6];

          		
          		
          	}
          
          
          for (int i = 0; i < NewBuisnesses.length; i++) {
      		
        	  NewBuisnessesTable[i][0] = NewBuisnesses[i][1];
        	  NewBuisnessesTable[i][1] = NewBuisnesses[i][2];
        	  NewBuisnessesTable[i][2] = NewBuisnesses[i][5];
        	  NewBuisnessesTable[i][3] = NewBuisnesses[i][6];

      		
      		
      		}
          
          for (int i = 0; i < BusinessNews.length; i++) {
        		
        	  BusinessNewsTable[i][0] = BusinessNews[i][1];
        	  BusinessNewsTable[i][1] = BusinessNews[i][2];
        	  BusinessNewsTable[i][2] = BusinessNews[i][5];
        	  BusinessNewsTable[i][3] = BusinessNews[i][6];

      		
      		
      		}
          

          }

}
