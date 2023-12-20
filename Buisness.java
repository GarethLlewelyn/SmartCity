package smartCity;

import java.sql.SQLException;

public class Buisness extends ApplicationDriver implements SmartCityApp{

	public String[][] RentableSpaces;
	public String[][] NewBuisnesses;
	public String[][] News;
	
	public Buisness(String[][] RentableSpaces, String[][] NewBuisnesses, String[][] News) throws SQLException {
		
		this.RentableSpaces = RentableSpaces;
		this.NewBuisnesses = NewBuisnesses;
		this.News = News;
		
	}
	
	
	public void RetrieveTable() throws SQLException {
		
		String[][] TempRentableSpaces = DBInstance.Retrievetable("rentablespace");  // Access DBInstance through the static field
		String[][] TempNewBuisnesses = DBInstance.Retrievetable("buisness");  // Access DBInstance through the static field
		String[][] TempNews = DBInstance.Retrievetable("news");  // Access DBInstance through the static field
        new Buisness(TempRentableSpaces, TempNewBuisnesses, TempNews);  // Pass null since data will be retrieved later
        System.out.println("complete");


	
	
	}

}
