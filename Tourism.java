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

	
	public String[][] Hotels;
	public String[][] Resteraunts;
	public String[][] News;
	
	public String[][] HotelsTable;
	public String[][] ResterauntsTable;
	public String[][] NewsTable;
	
	public void RetrieveTable() throws SQLException {
		
		Hotels = DBInstance.Retrievetable("hotels");  
		Resteraunts = DBInstance.Retrievetable("resteraunt");  
		News = DBInstance.Retrievetable("news");  
        System.out.println("complete Tourist");
        
        ApplicationDriver.Hotels = Hotels;
        ApplicationDriver.Resteraunts = Resteraunts;
        ApplicationDriver.News = News;

        


       
	
	}
        
    public void ConvertTable() throws SQLException {
    	
    	
    	 HotelsTable = new String[Hotels.length][4]; 
    	 ResterauntsTable = new String[Resteraunts.length][4]; 
    	 NewsTable = new String[News.length][4]; 


        for (int i = 0; i < Hotels.length; i++) {
        		
        		HotelsTable[i][0] = Hotels[i][1];
        		HotelsTable[i][1] = Hotels[i][2];
        		HotelsTable[i][2] = Hotels[i][5];
        		HotelsTable[i][3] = Hotels[i][6];

        		
        		
        	}
        
        
        for (int i = 0; i < Resteraunts.length; i++) {
    		
	        	ResterauntsTable[i][0] = Resteraunts[i][1];
	        	ResterauntsTable[i][1] = Resteraunts[i][2];
	        	ResterauntsTable[i][2] = Resteraunts[i][5];
	        	ResterauntsTable[i][3] = Resteraunts[i][6];

    		
    		
    		}
        
        for (int i = 0; i < News.length; i++) {
    		
        		NewsTable[i][0] = News[i][1];
        		NewsTable[i][1] = News[i][2];
        		NewsTable[i][2] = News[i][3];
	        	NewsTable[i][3] = News[i][4];

    		
    		
    		}
        }
    
    
    
    
    
    
    
    

    	
    	
    }




