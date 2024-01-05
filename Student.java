package smartCity;

import java.sql.SQLException;

public class Student extends ApplicationDriver implements SmartCityApp{
	
	public String[][] Accomidation; //Student variables accessed by Super class
	public String[][] UniCol;
	
	public String[][] AccomidationTable;
	public String[][] UniColTable;
	

	
	
	public void RetrieveTable() throws SQLException {
		
		Accomidation = DBInstance.Retrievetable("accomidation");   //Stores table information from DBInstance with table name. 
		UniCol = DBInstance.Retrievetable("unicol");  
        System.out.println("/ complete student /");
        
        ApplicationDriver.Accomidation = Accomidation;//Stores unConverted table data into local variables which can be accessed from super class and ConvertTable
        ApplicationDriver.UniCol = UniCol;

        
	
	
	}
	
	
	
    public void ConvertTable() throws SQLException {//Converts local unconverted variables into table variables.
    	
    	
     AccomidationTable = new String[Accomidation.length][4]; //Initialises with row amount and column amount
     UniColTable = new String[UniCol.length][4]; 


       for (int i = 0; i < Accomidation.length; i++) {//For loop iterating through variables row and converts them into TableVariables used in the tables viewed by users
       		
    	   AccomidationTable[i][0] = Accomidation[i][1];
    	   AccomidationTable[i][1] = Accomidation[i][2];
    	   AccomidationTable[i][2] = Accomidation[i][3];
    	   AccomidationTable[i][3] = Accomidation[i][4];

       		
       		
       	}
       
       
       for (int i = 0; i < UniCol.length; i++) {//For loop iterating through variables row and converts them into TableVariables used in the tables viewed by users
   		
    	   		UniColTable[i][0] = UniCol[i][1];
    	   		UniColTable[i][1] = UniCol[i][2];
    	   		UniColTable[i][2] = UniCol[i][3];
    	   		UniColTable[i][3] = UniCol[i][4];

   		
   		
   		}
       

       }

}
