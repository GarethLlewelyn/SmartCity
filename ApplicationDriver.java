package smartCity;

import java.io.IOException;
import java.sql.SQLException;


public class ApplicationDriver {
	
	
    public static DatabaseDriver DBInstance;  // Declare DBInstance as static
    public static String RegisterResult;
    public static boolean LoggedIn = false;
    static String[] UserResult;//User Results contain key user information such as ID, Sign in result, Username, and emails
    public static int FrameStopper = 0; //Frame stopper variable ensures JFrames do not open multiple times whilst thread is running
    
    
	public static String[][] Hotels; //Tourist global variables
	public static String[][] Resteraunts;
	public static String[][] News;
	public static String[][] Accomidation; //Student global variables
	public static String[][] UniCol;
	public static String[][] JobPost;//Job global variables
	public static String[][] Volunteering;
	public static String[][] RentableSpaces;//Business global variables
	public static String[][] NewBuisnesses;
	public static String[][] BusinessNews;
	
	
	public static String[][] HotelsTable; 
	public static String[][] ResterauntsTable;
	public static String[][] NewsTable;
	public static String[][] AccomidationTable; //Student global variables
	public static String[][] UniColTable;
	public static String[][] JobPostTable;//Job global variables
	public static String[][] VolunteeringTable;
	public static String[][] RentableSpacesTable;//Business global variables
	public static String[][] NewBuisnessesTable;
	public static String[][] BusinessNewsTable;
	public static String[][] ApprentishipTable;
    
    
	public static void main(String[] args) throws SQLException, IOException {


        Thread databaseThread = new Thread(() -> { //Creates new thread for the Database
        	DBInstance = new DatabaseDriver("root", "", "127.0.0.1", "smartcity", 3306); //Initialises the database constructor then saves as instance

        	while (true) { //Continuously run. Allowing for constant record updates
	
        		try {
        		
                Tourism tourism = new Tourism();  // Retrieve Tourism information from database and keep as global variable
                tourism.RetrieveTable();//Retrieve tables and convert into user friendly tables
                tourism.ConvertTable();
                HotelsTable = tourism.HotelsTable;//Retrieve following arrays from child class and insert into local public array variable
                ResterauntsTable = tourism.ResterauntsTable;
                NewsTable = tourism.NewsTable;
                
                Student student = new Student();  // Retrieve Student information from database and keep as global variable
                student.RetrieveTable();//Retrieve tables and convert into user friendly tables
                student.ConvertTable();
                AccomidationTable = student.AccomidationTable;//Retrieve following arrays from child class and insert into local public array variable
                UniColTable = student.UniColTable;
                
                JobAplicants Job = new JobAplicants();  // Retrieve Job information from database and keep as global variable
                Job.RetrieveTable();//Retrieve tables and convert into user friendly tables
                Job.ConvertTable();
                JobPostTable = Job.JobPostTable;//Retrieve following arrays from child class and insert into local public array variable
                VolunteeringTable = Job.VolunteeringTable;
                
                Buisness business = new Buisness();  // Retrieve Business information from database and keep as global variable
                business.RetrieveTable(); //Retrieve tables and convert into user friendly tables
                business.ConvertTable();
                RentableSpacesTable = business.RentableSpacesTable; //Retrieve following arrays from child class and insert into local public array variable
                NewBuisnessesTable = business.NewBuisnessesTable;
                BusinessNewsTable = business.BusinessNewsTable;
                
                try {
					Thread.sleep(10000); //Thread sleeps for 10 seconds to ensure lower strain on database and users computer
				} catch (InterruptedException e) { //Catch any interruptions 
					
					e.printStackTrace();
				} 

        		} catch ( SQLException e) { //Catch any SQL error
			        e.printStackTrace();
			    }
        		

			}
        });
        databaseThread.start(); //Start database thread
		
        
        Thread guiThread = new Thread(() -> {//GUI thread better performance on computer
        	try {
        		while(true) { //Continuously runs
	        		if(!LoggedIn && FrameStopper == 0) { //Checks if user is not logged in and if frame stopper is 0. 
	                    GUI.Login();
	                    FrameStopper++; //Adds frame stopper to ensure multiple GUI windows do not open
        			} else if(LoggedIn && FrameStopper == 0){//Checks if user is logged in and if frame stopper is 0. 
	                    GUI.SmartCityPage();
	                    FrameStopper++;//Adds frame stopper to ensure multiple GUI windows do not open
	                    
	                }
	        		Thread.sleep(1000); //Threads runs every second 
        		}
        		
        	}catch(IOException | InterruptedException e) {
        		
        	}
            
        });
		
        guiThread.start(); //Start GUI thread


	}

}
