package smartCity;

import java.sql.SQLException;

public class JobAplicants extends ApplicationDriver implements SmartCityApp{
	
	
	public String[][] JobPost;//JobApllicant variables accessed by Super class
	public String[][] Volunteering;
	public String[][] Apprentiship;

	public String[][] JobPostTable;
	public String[][] VolunteeringTable;
	public String[][] ApprentishipTable;

	
	
	public void RetrieveTable() throws SQLException {

		
		JobPost = DBInstance.Retrievetable("jobposting");  //Stores table information from DBInstance with table name. 
		Volunteering = DBInstance.Retrievetable("volunteering");  
		Apprentiship = DBInstance.Retrievetable("Apprentiship");  

		System.out.println("/ complete Job /");
        
        ApplicationDriver.JobPost = JobPost;//Stores unConverted table data into local variables which can be accessed from super class and ConvertTable
        ApplicationDriver.Volunteering = Volunteering;
        ApplicationDriver.ApprentishipTable = Apprentiship;

	
	
	}

	
	
    public void ConvertTable() throws SQLException {//Converts local unconverted variables into table variables.
    	
    	
    	JobPostTable = new String[JobPost.length][4]; //Initialises with row amount and column amount
    	VolunteeringTable = new String[Volunteering.length][4]; 
    	ApprentishipTable = new String[Apprentiship.length][4]; 


          for (int i = 0; i < JobPost.length; i++) {//For loop iterating through variables row and converts them into TableVariables used in the tables viewed by users
          		
        	  JobPostTable[i][0] = JobPost[i][1];
        	  JobPostTable[i][1] = JobPost[i][2];
        	  JobPostTable[i][2] = JobPost[i][3];
        	  JobPostTable[i][3] = JobPost[i][4];

          		
          		
          	}
          
          
          for (int i = 0; i < Volunteering.length; i++) {//For loop iterating through variables row and converts them into TableVariables used in the tables viewed by users
      		
        	  VolunteeringTable[i][0] = Volunteering[i][1];
        	  VolunteeringTable[i][1] = Volunteering[i][2];
        	  VolunteeringTable[i][2] = Volunteering[i][3];
        	  VolunteeringTable[i][3] = Volunteering[i][4];

      		
      		
      		}
          for (int i = 0; i < Apprentiship.length; i++) {//For loop iterating through variables row and converts them into TableVariables used in the tables viewed by users
        		
        	  ApprentishipTable[i][0] = Apprentiship[i][1];
        	  ApprentishipTable[i][1] = Apprentiship[i][2];
        	  ApprentishipTable[i][2] = Apprentiship[i][3];
        	  ApprentishipTable[i][3] = Apprentiship[i][4];

      		
      		
      		}

          }
}
