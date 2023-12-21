package smartCity;

import java.io.IOException;
import java.sql.SQLException;

public class ApplicationDriver {
	
	
    public static DatabaseDriver DBInstance;  // Declare DBInstance as static
    public static boolean LoggedIn = false;
    static String[] UserResult;
    
    
	public static void main(String[] args) throws SQLException, IOException {
		DBInstance = new DatabaseDriver("root", "", "127.0.0.1", "smartcity", 3306);
		
		
		if(!LoggedIn) {

			//new GUI();
			GUI.Login();
		}
		
		
		//String[][] TempHotel = DBInstance.Retrievetable("hotels");
        Tourism tourism = new Tourism(null, null, null);  // Pass null since data will be retrieved later
        tourism.RetrieveTable();

		
		
		
		

		
		

	}

}
