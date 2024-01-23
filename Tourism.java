package smartCity;

import java.awt.Color;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Tourism extends ApplicationDriver implements SmartCityApp{

	
	public String[][] Hotels;//Tourist variables accessed by Super class
	public String[][] Resteraunts;
	public String[][] News;
	
	public String[][] HotelsTable;
	public String[][] ResterauntsTable;
	public String[][] NewsTable;
	
	public void RetrieveTable() throws SQLException {
		
		Hotels = DBInstance.Retrievetable("hotels");   //Stores table information from DBInstance with table name. 
		Resteraunts = DBInstance.Retrievetable("resteraunt");  
		News = DBInstance.Retrievetable("news");  
        
        ApplicationDriver.Hotels = Hotels;//Stores unConverted table data into local variables which can be accessed from super class and ConvertTable
        ApplicationDriver.Resteraunts = Resteraunts;
        ApplicationDriver.News = News;

        


       
	
	}
        
    public void ConvertTable() throws SQLException {//Converts local unconverted variables into table variables.
    	
    	
    	 HotelsTable = new String[Hotels.length][4]; //Initialises with row amount and column amount
    	 ResterauntsTable = new String[Resteraunts.length][4]; 
    	 NewsTable = new String[News.length][4]; 


        for (int i = 0; i < Hotels.length; i++) {//For loop iterating through variables row and converts them into TableVariables used in the tables viewed by users
        		
        		HotelsTable[i][0] = Hotels[i][1];
        		HotelsTable[i][1] = Hotels[i][2];
        		HotelsTable[i][2] = Hotels[i][3];
        		HotelsTable[i][3] = Hotels[i][4];

        		
        		
        	}
        
        
        for (int i = 0; i < Resteraunts.length; i++) {//For loop iterating through variables row and converts them into TableVariables used in the tables viewed by users
    		
	        	ResterauntsTable[i][0] = Resteraunts[i][1];
	        	ResterauntsTable[i][1] = Resteraunts[i][2];
	        	ResterauntsTable[i][2] = Resteraunts[i][3];
	        	ResterauntsTable[i][3] = Resteraunts[i][4];

    		
    		
    		}
        
        for (int i = 0; i < News.length; i++) {//For loop iterating through variables row and converts them into TableVariables used in the tables viewed by users
    		
        		NewsTable[i][0] = News[i][1];
        		NewsTable[i][1] = News[i][2];
        		NewsTable[i][2] = News[i][3];
	        	NewsTable[i][3] = News[i][4];

    		
    		
    		}
        }
    
    
    
    
    
    
    
    

    	
    	
    }




