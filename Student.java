package smartCity;

import java.sql.SQLException;

public class Student extends ApplicationDriver implements SmartCityApp{
	
	public String[][] Accomidation;
	public String[][] UniCol;
	public String[][] Libraries;
	
	public Student(String[][] Accomidation, String[][] UniCol, String[][] Libraries) throws SQLException {
		
		this.Accomidation = Accomidation;
		this.UniCol = UniCol;
		this.Libraries = Libraries;

		
	}
	
	
	public void RetrieveTable() throws SQLException {
		
		String[][] TempAccomidation = DBInstance.Retrievetable("accomidation");  // Access DBInstance through the static field
		String[][] TempUniCol = DBInstance.Retrievetable("unicol");  // Access DBInstance through the static field
		String[][] TempLibraries = DBInstance.Retrievetable("libraries");  // Access DBInstance through the static field

		new Student(TempAccomidation, TempUniCol, TempLibraries);  // Pass null since data will be retrieved later
        System.out.println("complete");


	
	
	}
	

}
