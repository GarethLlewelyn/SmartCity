package smartCity;

import java.io.IOException;
import java.sql.SQLException;

public class ApplicationDriver {
	
	
    public static DatabaseDriver DBInstance;  // Declare DBInstance as static
    public static String RegisterResult;
    public static boolean LoggedIn = false;
    static String[] UserResult;
    
	public static String[][] Hotels; //Tourist global variables
	public static String[][] Resteraunts;
	public static String[][] WhatsOn;
	public static String[][] Accomidation; //Student global variables
	public static String[][] UniCol;
	public static String[][] JobPost;//Job global variables
	public static String[][] Volunteering;
	public static String[][] RentableSpaces;//Business global variables
	public static String[][] NewBuisnesses;
	public static String[][] BusinessNews;
	
	
	public static String[][] HotelsTable; 
	public static String[][] ResterauntsTable;
	public static String[][] WhatsOnTable;
	public static String[][] AccomidationTable; //Student global variables
	public static String[][] UniColTable;
	public static String[][] JobPostTable;//Job global variables
	public static String[][] VolunteeringTable;
	public static String[][] RentableSpacesTable;//Business global variables
	public static String[][] NewBuisnessesTable;
	public static String[][] BusinessNewsTable;
	public static String[][] ApprentishipTable;
    
    
	public static void main(String[] args) throws SQLException, IOException {
		DBInstance = new DatabaseDriver("root", "", "127.0.0.1", "smartcity", 3306); //Start DB Intance for global access
		
		

		
        Tourism tourism = new Tourism();  // Retrieve Tourism information from database and keep as global variable
        tourism.RetrieveTable();
        tourism.ConvertTable();
        HotelsTable = tourism.HotelsTable;
        ResterauntsTable = tourism.ResterauntsTable;
        WhatsOnTable = tourism.WhatsOnTable;
        Student student = new Student();  // Retrieve Student information from database and keep as global variable
        student.RetrieveTable();
        student.ConvertTable();
        AccomidationTable = student.AccomidationTable;
        UniColTable = student.UniColTable;
        JobAplicants Job = new JobAplicants();  // Retrieve Job information from database and keep as global variable
        Job.RetrieveTable();
        Job.ConvertTable();
        JobPostTable = Job.JobPostTable;
        VolunteeringTable = Job.VolunteeringTable;
        Buisness business = new Buisness();  // Retrieve Business information from database and keep as global variable
        business.RetrieveTable();
        business.ConvertTable();
        RentableSpacesTable = business.RentableSpacesTable;
        NewBuisnessesTable = business.NewBuisnessesTable;
        BusinessNewsTable = business.BusinessNewsTable;

		
		if(!LoggedIn) {

			//new GUI();
			GUI.SmartCityPage();
		}else {
			
			System.out.println("SIGN IN SUCCESS");
		}
		

		
		

	}

}
