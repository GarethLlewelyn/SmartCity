package smartCity;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class TableMouseListener extends MouseAdapter {
	
	private JTable SelectedTable;

	public TableMouseListener(JTable table) { //Constructor
		
		this.SelectedTable = table;
	}
	
	public void mousePressed(MouseEvent event)//Method retrieves variable on right click
	 
	{
	    int currentRow = SelectedTable.rowAtPoint(event.getPoint());//Select table row at mouse click
	    SelectedTable.setRowSelectionInterval(currentRow, currentRow); //Set current row to SelectedTable 
	}
}
