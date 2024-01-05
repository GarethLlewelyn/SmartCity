package smartCity;

import java.sql.SQLException;

public interface SmartCityApp {

	
	void RetrieveTable() throws SQLException;//Initialise classes in child classes / Tourist, Student, Buisness and JobApplicant
	
	void ConvertTable() throws SQLException;

	
	
}
