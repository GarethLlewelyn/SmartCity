package smartCity;

import java.sql.SQLException;

public class Student extends ApplicationDriver implements SmartCityApp{
	
	public String[][] Accomidation;
	public String[][] UniCol;
	
	public String[][] AccomidationTable;
	public String[][] UniColTable;
	

	
	
	public void RetrieveTable() throws SQLException {
		
		Accomidation = DBInstance.Retrievetable("accomidation");  
		UniCol = DBInstance.Retrievetable("unicol");  
        System.out.println("/ complete student /");
        
        ApplicationDriver.Accomidation = Accomidation;
        ApplicationDriver.UniCol = UniCol;

        
	
	
	}
	
	
	
    public void ConvertTable() throws SQLException {
    	
    	
     AccomidationTable = new String[Accomidation.length][4]; 
     UniColTable = new String[UniCol.length][4]; 


       for (int i = 0; i < Accomidation.length; i++) {
       		
    	   AccomidationTable[i][0] = Accomidation[i][1];
    	   AccomidationTable[i][1] = Accomidation[i][2];
    	   AccomidationTable[i][2] = Accomidation[i][5];
    	   AccomidationTable[i][3] = Accomidation[i][6];

       		
       		
       	}
       
       
       for (int i = 0; i < UniCol.length; i++) {
   		
    	   		UniColTable[i][0] = UniCol[i][1];
    	   		UniColTable[i][1] = UniCol[i][2];
    	   		UniColTable[i][2] = UniCol[i][5];
    	   		UniColTable[i][3] = UniCol[i][6];

   		
   		
   		}
       

       }

}
