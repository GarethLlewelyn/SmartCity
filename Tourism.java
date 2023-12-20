package smartCity;

import java.sql.SQLException;

public class Tourism extends ApplicationDriver implements SmartCityApp{

	
	private String[][] TempHotels;
	private String[][] TempResteraunts;
	private String[][] TempWhatsOn;
	
	public String[][] Hotels;
	public String[][] Resteraunts;
	public String[][] WhatsOn;
	
	
	
	public Tourism(String[][] Hotels, String[][] Resteraunts, String[][] WhatsOn) throws SQLException {
		
		this.Hotels = Hotels;
		this.Resteraunts = Resteraunts;
		this.WhatsOn = WhatsOn;
		
	}
	
	
	public void RetrieveTable() throws SQLException {
		
        TempHotels = DBInstance.Retrievetable("hotels");  // Access DBInstance through the static field
        TempResteraunts = DBInstance.Retrievetable("resteraunt");  // Access DBInstance through the static field
        TempWhatsOn = DBInstance.Retrievetable("whatson");  // Access DBInstance through the static field
        new Tourism(TempHotels, TempResteraunts, TempWhatsOn);  // Pass null since data will be retrieved later
        System.out.println("complete");


	
	
	}
}
