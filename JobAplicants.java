package smartCity;

import java.sql.SQLException;

public class JobAplicants extends ApplicationDriver implements SmartCityApp{
	
	
	public String[][] JobPost;
	public String[][] Volunteering;
	
	public String[][] JobPostTable;
	public String[][] VolunteeringTable;
	
	
	
	public void RetrieveTable() throws SQLException {

		
		JobPost = DBInstance.Retrievetable("jobposting");  
		Volunteering = DBInstance.Retrievetable("volunteering");  
        System.out.println("/ complete Job /");
        
        ApplicationDriver.JobPost = JobPost;
        ApplicationDriver.Volunteering = Volunteering;

	
	
	}

	
	
    public void ConvertTable() throws SQLException {
    	
    	
    	JobPostTable = new String[JobPost.length][4]; 
    	VolunteeringTable = new String[Volunteering.length][4]; 


          for (int i = 0; i < JobPost.length; i++) {
          		
        	  JobPostTable[i][0] = JobPost[i][1];
        	  JobPostTable[i][1] = JobPost[i][2];
        	  JobPostTable[i][2] = JobPost[i][5];
        	  JobPostTable[i][3] = JobPost[i][6];

          		
          		
          	}
          
          
          for (int i = 0; i < Volunteering.length; i++) {
      		
        	  VolunteeringTable[i][0] = Volunteering[i][1];
        	  VolunteeringTable[i][1] = Volunteering[i][2];
        	  VolunteeringTable[i][2] = Volunteering[i][5];
        	  VolunteeringTable[i][3] = Volunteering[i][6];

      		
      		
      		}
          

          }
}
