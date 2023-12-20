package smartCity;

import java.sql.SQLException;

public class JobAplicants extends ApplicationDriver implements SmartCityApp{
	
	
	public String[][] JobPost;
	public String[][] Volunteering;
	
	public JobAplicants(String[][] JobPost, String[][] Volunteering) throws SQLException {
		
		this.JobPost = JobPost;
		this.Volunteering = Volunteering;
		
	}
	
	
	public void RetrieveTable() throws SQLException {
		
		String[][] TempJobPost = DBInstance.Retrievetable("jobposting");  // Access DBInstance through the static field
		String[][] TempVolunteering = DBInstance.Retrievetable("volunteering");  // Access DBInstance through the static field
        new JobAplicants(TempJobPost, TempVolunteering);  // Pass null since data will be retrieved later
        System.out.println("complete");


	
	
	}

}
