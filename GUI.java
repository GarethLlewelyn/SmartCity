package smartCity;



import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import java.awt.Desktop;
import java.net.URI;


public class GUI extends ApplicationDriver implements ActionListener{

    private static JPopupMenu popupMenu;//Essential variables for program framework
    private static JMenuItem Expand; //JMenuItems for all Tables
    private static JMenuItem CopyRowLink;
    private int clicks = 0; //confirm changes variable / Used for verification
	private String SelectedSQL = "hotel"; //Sets what table is currently loaded in certain tables. Used in Admin panel 

	
	private static JLabel UserNamelabel; //initialising Login page variables
	private static JTextField UserNameText;
	private static JLabel Passwordlabel;
	private static JPasswordField PasswordText;
	private static JButton LoginButton;
	private static JButton RegisterButton;
	private static JPanel panel;
	private static JFrame frame;
	private static JLabel SuccessLabel;
	
	private static JLabel RegisterPageUserNamelabel; //initialising Register page Variables
	private static JLabel RegisterPageLabel; 
	private static JTextField RegisterPageUserNameText;
	private static JLabel RegisterPageFullNameLabel; 
	private static JTextField RegisterPageFullNameText;
	
	private static JLabel RegisterPagePasswordlabel; //Register page variables
	private static JPasswordField RegisterPagePasswordText;
	private static JLabel RegisterPageRePasswordlabel;
	private static JPasswordField RegisterPageRePasswordText;
	private static JLabel RegisterPageEmaillabel;
	private static JTextField RegisterPageEmaillText;
	private static JButton RegisterPageButton;
	private static JButton RegisterBackButton;
	private static JLabel RegisterSuccessLabel;
	
	private static JPanel TouristPanel = new JPanel(); //initialising Smart City page Variables
	private static JPanel StudentPanel = new JPanel(); 
	private static JPanel JobPanel = new JPanel(); 
	private static JPanel BusinessPanel = new JPanel(); 
	
	private static JPanel HotelPanel = new JPanel();  //Tourist Sub-Panels
	private static JPanel ResterauntPanel = new JPanel();
	private static JPanel WhatsonPanel = new JPanel();
	private static JLabel WhatsonLabel; 
	private static JButton MapButton = new JButton("Expand Map");
	private static JLabel HotelLabel; 
	private static JLabel ResterauntLabel;
    private static JTable Hoteltable;
	
	private static JPanel AccomidationPanel = new JPanel();  //Student Sub-Panels
	private static JPanel ColUniPanel = new JPanel();
	private static JLabel ColUniLabel;
	private static JPanel StudentImagePanel = new JPanel();
	private static JLabel AccomidationLabel; 
	private static JTable Accomidationtable;
	private static JTable ColUnitable;
	
	private static JPanel JobPostingPanel = new JPanel();  //Job Sub-Panels
	private static JPanel ApprentishipsPanel = new JPanel();
	private static JLabel ApprentishipsLabel;
	private static JPanel IndustriesPanel = new JPanel();
	private static JPanel JobSeekersPanel = new JPanel();
	private static JLabel JobPostingLabel; 
	private static JTable JobPostingtable;
	private static JTable Apprentishipstable;
	private static JPanel JobPostingImage = new JPanel();
	
	private static JPanel BuisnessPhotoPanel;  //Business Sub-Panels
	private static JPanel UnitsPanel = new JPanel();
	private static JLabel UnitsLabel;
	private static JTable Unitstable;
	private static JPanel NewBuinessPanel = new JPanel();
	private static JLabel NewBuinessLabel; 
	private static JTable NewBuinesstable;
	private static JPanel BusinessNewsPanel = new JPanel();
	private static JLabel BusinessNewsLabel; 
	private static JTable BusinessNewstable;
    
	private static JPanel ChangeDetailspanel;//Change Details variables
	private static JFrame ChangeDetailframe;
	private static JLabel ChangeDetailsPageFullNameLabel; 
	private static JTextField ChangeDetailsFullNameText;
	private static JLabel ChangeDetailsEmaillabel;
	private static JTextField ChangeDetailsEmailText;
	private static JButton ChangeDetailsPageButton;
	private static JLabel ChangeDetailsSuccessLabel = new JLabel();
    
    
	private JFrame AdminNavFrame; //Admin Navigation Panel
	private JPanel AdminNavPanel;
	private JLabel AdminNavLabel;
	private JButton SmartCityNavButton;
	private JButton UserVerificationNavButton;
	private JButton RecordViewerNavButton;
	private JPanel AdminUserVerificationPanel;
	private JFrame AdminUserVerificationFrame;
	private JTable UserVerificationTable;
	private String[][] Users;
	private JButton VerifyUserRowButton;
	private JButton DeleteUserButton;

	
    private JComboBox<String> categoryComboBox = new JComboBox<>(); //Admin record viewer panel variables
	private JTable AdminRecordViewerTable;
	private JPanel AdminRecordViewerPanel;
	private JFrame AdminRecordViewerFrame;
	private String[][] AdminTableData;
	private String[] AdminColumnNames;
	TableColumn AdminHiddenCollumn0;
	private JButton DeleteRecordButton;
	private JButton AddRecordButton;
	private JTextField AdminRecordSearch;
	private JButton AdminSearchRecordButton;
	private JButton EditRecordButton;
	int IntSkip;
	private DefaultTableModel DefaultRecordModel;
	
	public static boolean Login() throws IOException {

		boolean logged = false;
		
		if(!logged) { //Only loads following if user is not logged in
			panel = new JPanel();
			frame = new JFrame();
			
			frame.setSize(400,250);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			
			panel.setLayout(null);//Set Null Layout to for .setBounds to function
			
			UserNamelabel = new JLabel("UserName"); //Set labels 
			UserNamelabel.setBounds(167, 20, 80, 25);
			panel.add(UserNamelabel);
			
			UserNameText = new JTextField(20); //Set textboxes for user input
			UserNameText.setBounds(110, 40, 170, 25);
			panel.add(UserNameText);
			
			
			Passwordlabel = new JLabel("Password");
			Passwordlabel.setBounds(167, 70, 80, 25);
			panel.add(Passwordlabel);
			
			PasswordText = new JPasswordField();
			PasswordText.setBounds(110, 90, 170, 25);
			PasswordText.setEchoChar('*'); //Password text is masked with * for protection
			panel.add(PasswordText);
			
			LoginButton = new JButton("login");
			LoginButton.setBounds(110,120,80,25);
			LoginButton.addActionListener(new GUI());
			panel.add(LoginButton);
			
			RegisterButton = new JButton("Register");
			RegisterButton.setBounds(200,120,80,25);
			RegisterButton.addActionListener(new GUI());
			panel.add(RegisterButton);
			
			SuccessLabel = new JLabel("");
			SuccessLabel.setBounds(110, 140, 300, 25);
			panel.add(SuccessLabel);
			
			
			
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);

			
			
		}
		
		
		
		return logged; //Return result after sign in attempt
	}
	
	
	
	public static void Register() throws IOException{ //Register Method, allows users to create new accounts
		
		
		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);//Set Null Layout to for .setBounds to function
		
		RegisterPageLabel = new JLabel("Register your account");
		RegisterPageLabel.setBounds(130, 20, 170, 25);
		panel.add(RegisterPageLabel);
		
		
		RegisterPageUserNamelabel = new JLabel("UserName");
		RegisterPageUserNamelabel.setBounds(167, 50, 80, 25);
		panel.add(RegisterPageUserNamelabel);
		
		RegisterPageUserNameText = new JTextField(20);
		RegisterPageUserNameText.setBounds(110, 70, 170, 25);
		panel.add(RegisterPageUserNameText);
		
		
		RegisterPageFullNameLabel = new JLabel("Full Name");
		RegisterPageFullNameLabel.setBounds(167, 100, 80, 25);
		panel.add(RegisterPageFullNameLabel);
		
		RegisterPageFullNameText = new JTextField(20);
		RegisterPageFullNameText.setBounds(110, 120, 170, 25);
		panel.add(RegisterPageFullNameText);

		
		RegisterPagePasswordlabel = new JLabel("Password");
		RegisterPagePasswordlabel.setBounds(167, 150, 80, 25);
		panel.add(RegisterPagePasswordlabel);
		
		RegisterPagePasswordText = new JPasswordField();
		RegisterPagePasswordText.setBounds(110, 170, 170, 25);
		RegisterPagePasswordText.setEchoChar('*');
		panel.add(RegisterPagePasswordText);
		
		
		RegisterPageRePasswordlabel = new JLabel("Re-Enter Password");
		RegisterPageRePasswordlabel.setBounds(140, 200, 150, 25);
		panel.add(RegisterPageRePasswordlabel);
		
		RegisterPageRePasswordText = new JPasswordField();
		RegisterPageRePasswordText.setBounds(110, 220, 170, 25);
		RegisterPageRePasswordText.setEchoChar('*');
		panel.add(RegisterPageRePasswordText);

		RegisterPageEmaillabel = new JLabel("Email");
		RegisterPageEmaillabel.setBounds(177, 245, 80, 25);
		panel.add(RegisterPageEmaillabel);
		
		RegisterPageEmaillText = new JTextField(100);
		RegisterPageEmaillText.setBounds(110, 265, 170, 25);
		panel.add(RegisterPageEmaillText);
		
		RegisterBackButton = new JButton("Back");
		RegisterBackButton.setBounds(0,0, 80,25);
		RegisterBackButton.addActionListener(new GUI());
		panel.add(RegisterBackButton);
		
		RegisterPageButton = new JButton("Register Account");
		RegisterPageButton.setBounds(110,300, 170,25);
		RegisterPageButton.addActionListener(new GUI());
		panel.add(RegisterPageButton);
		
		RegisterSuccessLabel = new JLabel(""); //Success label lets the user know if there were any errors in the register function
		RegisterSuccessLabel.setBounds(110, 330, 300, 25);
		panel.add(RegisterSuccessLabel);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	
	private static void createMenuItems() { //Navigation Menu Method / Is stored in a seperate method to SmartCityApp method as to avoid duplication of menu items
		JMenuBar MenuBar = new JMenuBar();
		JMenu Menu, Navigate, Profile; //Variables packed for efficient space usage
		JMenuItem Quit, ChangeDetails, Tourist, Student, Job, Business, LogOut;
		
		Menu = new JMenu("Menu"); //Set Menu navigation items
		Navigate = new JMenu("Navigate");
		Profile = new JMenu("Profile");
		
		Tourist = new JMenuItem("Tourist"); //Set Menu Items
		Student = new JMenuItem("Student");
		Job = new JMenuItem("Job");
		Business = new JMenuItem("Business");
		Quit = new JMenuItem("Quit");
		ChangeDetails = new JMenuItem("Change Details");
		LogOut = new JMenuItem("Log Out");
		
		
		
		
		
		MenuBar.add(Menu); //Add menu navigation to MenuBar
		MenuBar.add(Navigate);
		MenuBar.add(Box.createHorizontalGlue()); //Ensures Profile menu item is at the right side
		MenuBar.add(Profile);
		Menu.add(Quit);
		Navigate.add(Tourist);
		Navigate.add(Student);
		Navigate.add(Job);
		Navigate.add(Business);
		Profile.add(ChangeDetails);
		Profile.add(LogOut);
		
		
		Tourist.addActionListener(new GUI()); //Creates ActionListeners for buttons
		Student.addActionListener(new GUI());
		Job.addActionListener(new GUI());
		Business.addActionListener(new GUI());
		Quit.addActionListener(new GUI());
		ChangeDetails.addActionListener(new GUI());
		LogOut.addActionListener(new GUI());
		
		frame.setJMenuBar(MenuBar);
		
	}

	public static void SmartCityPage() throws IOException{//SmartCityPage is the method which runs after the user is logged in. this is the primary window

		
		
		
		TouristPanel.setVisible(true); //Set TouristPanel visible as this will be the default page
		
		frame = new JFrame();
		frame.setSize(900,670);	
		frame.setBackground(Color.LIGHT_GRAY);

		createMenuItems(); //Calls Navigation Menus through variable as to avoid duplicate JMenu Items with frame disposals

		
        popupMenu = new JPopupMenu();
        Expand = new JMenuItem("Expand");
        CopyRowLink = new JMenuItem("Copy Link");
        Expand.addActionListener(new GUI());
        CopyRowLink.addActionListener(new GUI());

		
		
		
		//TOURIST PANEL
	
		TouristPanel.setBackground(Color.gray);
		TouristPanel.setLayout(null); //Set Null Layout to for .setBounds to function
		
		HotelPanel.setBounds(455,250,420,350);
		HotelPanel.setBackground(Color.red);
		
		HotelLabel = new JLabel("Hotels");
		HotelPanel.add(HotelLabel);

        
        
        

        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        

        String[] HotelcolumnNames = {"Name", "Address", "Column 2", "Column 2"};
        DefaultTableModel Hotelmodel = new DefaultTableModel(ApplicationDriver.HotelsTable, HotelcolumnNames); //Set Table model to the 2D array in ApplicationDriver that is relevent to the panel
        Hoteltable = new JTable(Hotelmodel);
        Hoteltable.putClientProperty("title", "Hotel");//Sets Title for access from Expand() and CopyLink()

        TableColumn HotelcolumnToHide0 = Hoteltable.getColumnModel().getColumn(0);
        TableColumn HotelcolumnToHide1 = Hoteltable.getColumnModel().getColumn(2);
        TableColumn HotelcolumnToHide2 = Hoteltable.getColumnModel().getColumn(3);

        HotelcolumnToHide0.setPreferredWidth(150);
        HotelcolumnToHide0.setMinWidth(150);
        HotelcolumnToHide0.setMaxWidth(150);
        HotelcolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer Hoteldtcr = new DefaultTableCellRenderer();  
        Hoteldtcr.setHorizontalAlignment(SwingConstants.CENTER); //Set Column text to centre of column 
        HotelcolumnToHide0.setCellRenderer(Hoteldtcr);

        
        HotelcolumnToHide1.setPreferredWidth(0);
        HotelcolumnToHide1.setMinWidth(0);
        HotelcolumnToHide1.setMaxWidth(0);
        HotelcolumnToHide1.setResizable(false);  // Prevent resizing
        
        HotelcolumnToHide2.setPreferredWidth(0);
        HotelcolumnToHide2.setMinWidth(0);
        HotelcolumnToHide2.setMaxWidth(0);
        HotelcolumnToHide2.setResizable(false);  // Prevent resizing
        
        
        Hoteltable.setComponentPopupMenu(popupMenu);
        Hoteltable.addMouseListener(new TableMouseListener(Hoteltable));
        
        JScrollPane HotelscrollPane = new JScrollPane(Hoteltable);// Create scrollable table
        
        
        HotelPanel.add(HotelscrollPane);
		HotelPanel.setBounds(455,300,420,300);

		ResterauntPanel.setBounds(455,10,420,280);//455,10,420,230
		ResterauntPanel.setBackground(Color.red);//10,200,430,400
		ResterauntLabel = new JLabel("Resteraunts");
		ResterauntLabel.setBounds(50,0, 100, 100);
		ResterauntPanel.add(ResterauntLabel);
		
		
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        String[] ResterauntcolumnNames = {"Name", "Address", "Column 2", "Column 3"};
        DefaultTableModel Resterauntmodel = new DefaultTableModel(ApplicationDriver.ResterauntsTable, ResterauntcolumnNames);//Set Table model to the 2D array in ApplicationDriver that is relevent to the panel
        JTable Resteraunttable = new JTable(Resterauntmodel);
        Resteraunttable.putClientProperty("title", "Resteraunt"); //Sets Title for access from Expand() and CopyLink()

        
        TableColumn ResterauntcolumnToHide0 = Resteraunttable.getColumnModel().getColumn(0);
        TableColumn ResterauntcolumnToHide1 = Resteraunttable.getColumnModel().getColumn(2);
        TableColumn ResterauntcolumnToHide2 = Resteraunttable.getColumnModel().getColumn(3);

        ResterauntcolumnToHide0.setPreferredWidth(150);
        ResterauntcolumnToHide0.setMinWidth(150);
        ResterauntcolumnToHide0.setMaxWidth(150);
        ResterauntcolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer Resterauntdtcr = new DefaultTableCellRenderer();  
        Resterauntdtcr.setHorizontalAlignment(SwingConstants.CENTER); //Set Column text to centre of column 
        ResterauntcolumnToHide0.setCellRenderer(Resterauntdtcr);

        
        ResterauntcolumnToHide1.setPreferredWidth(0);
        ResterauntcolumnToHide1.setMinWidth(0);
        ResterauntcolumnToHide1.setMaxWidth(0);
        ResterauntcolumnToHide1.setResizable(false);  // Prevent resizing
        
        ResterauntcolumnToHide2.setPreferredWidth(0);
        ResterauntcolumnToHide2.setMinWidth(0);
        ResterauntcolumnToHide2.setMaxWidth(0);
        ResterauntcolumnToHide2.setResizable(false);  // Prevent resizing
        
        
        Resteraunttable.setComponentPopupMenu(popupMenu);
        Resteraunttable.addMouseListener(new TableMouseListener(Resteraunttable));
        
        JScrollPane ResterauntscrollPane = new JScrollPane(Resteraunttable);// Create scrollable table
        ResterauntPanel.add(ResterauntscrollPane);
		
		WhatsonPanel.setBounds(10,260,430,340);
		WhatsonPanel.setBackground(Color.yellow);
		
		
		WhatsonLabel = new JLabel("Whats on?");
		WhatsonPanel.add(WhatsonLabel);
		
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        String[] WhatsoncolumnNames = {"ID", "Recent News", "Collumn", "Collumn"};
        DefaultTableModel WhatsOnmodel = new DefaultTableModel(ApplicationDriver.News, WhatsoncolumnNames);//Set Table model to the 2D array in ApplicationDriver that is relevent to the panel
        JTable WhatsOnTable = new JTable(WhatsOnmodel);
        WhatsOnTable.putClientProperty("title", "WhatsOn"); //Sets Title for access from Expand() and CopyLink()

        TableColumn WhatsOncolumnCenter = WhatsOnTable.getColumnModel().getColumn(1);
        TableColumn WhatsOncolumnToHide1 = WhatsOnTable.getColumnModel().getColumn(0);
        TableColumn WhatsOncolumnToHide2 = WhatsOnTable.getColumnModel().getColumn(2);
        TableColumn WhatsOncolumnToHide3 = WhatsOnTable.getColumnModel().getColumn(3); 
        

        
        DefaultTableCellRenderer WhatsOndtcr = new DefaultTableCellRenderer();  
        WhatsOndtcr.setHorizontalAlignment(SwingConstants.CENTER); //Set Column text to centre of column 
        WhatsOncolumnCenter.setCellRenderer(Resterauntdtcr);

        
        WhatsOncolumnToHide1.setPreferredWidth(0);
        WhatsOncolumnToHide1.setMinWidth(0);
        WhatsOncolumnToHide1.setMaxWidth(0);
        WhatsOncolumnToHide1.setResizable(false);  // Prevent resizing
        
        WhatsOncolumnToHide2.setPreferredWidth(0);
        WhatsOncolumnToHide2.setMinWidth(0);
        WhatsOncolumnToHide2.setMaxWidth(0);
        WhatsOncolumnToHide2.setResizable(false);  // Prevent resizing
        
        WhatsOncolumnToHide3.setPreferredWidth(0);
        WhatsOncolumnToHide3.setMinWidth(0);
        WhatsOncolumnToHide3.setMaxWidth(0);
        WhatsOncolumnToHide3.setResizable(false);  // Prevent resizing
        

        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);

        
        WhatsOnTable.setComponentPopupMenu(popupMenu);
        WhatsOnTable.addMouseListener(new TableMouseListener(WhatsOnTable));
        
        JScrollPane WhatsOnscrollPane = new JScrollPane(WhatsOnTable);// Create scrollable table
        
        
        WhatsonPanel.add(WhatsOnscrollPane);
		
        MapButton.setBounds(10,10,430,240);
        MapButton.setBackground(Color.black);

        ImageIcon MapIcon = new ImageIcon(ImageIO.read(new File("C:\\Users\\garet\\eclipse-workspace\\SmartCity\\src\\smartCity\\GoogleMaps.png")));
        MapButton.setIcon(MapIcon);
        MapButton.addActionListener(new ActionListener() {
            @Override

            
            public void actionPerformed(ActionEvent e) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.google.com/maps/d/edit?mid=1LAimr8E1d0XCBIL4-oAF2yc3Hb2s2W8&usp=sharing")); // Replace with your desired URL
                    } catch (Exception ex) {
                        ex.printStackTrace(); // Handle any errors gracefully
                    }
                }
            });
		
		
		
		
		TouristPanel.add(WhatsonPanel);
		TouristPanel.add(MapButton);
		TouristPanel.add(ResterauntPanel);
		TouristPanel.add(HotelPanel);
		
		//End of TouristPanel
			
			
		//Student Panel
		
		
		
		
		StudentPanel.setBackground(Color.gray);
		StudentPanel.setLayout(null);//Set Null Layout to for .setBounds to function
		
		AccomidationPanel.setBounds(455,250,420,350);
		AccomidationPanel.setBackground(Color.red);
		AccomidationLabel = new JLabel("Avaliable Accomidation");
		AccomidationPanel.add(AccomidationLabel);


        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        
        String[] AccomidationcolumnNames = {"Name", "Address", "Column 2", "Column 2"};
        DefaultTableModel Accomidationmodel = new DefaultTableModel(ApplicationDriver.AccomidationTable, AccomidationcolumnNames);//Set Table model to the 2D array in ApplicationDriver that is relevent to the panel
        Accomidationtable = new JTable(Accomidationmodel);
        Accomidationtable.putClientProperty("title", "Accomidation"); //Sets Title for access from Expand() and CopyLink()

        TableColumn AccomidationcolumnToHide0 = Accomidationtable.getColumnModel().getColumn(0);
        TableColumn AccomidationcolumnToHide1 = Accomidationtable.getColumnModel().getColumn(2);
        TableColumn AccomidationcolumnToHide2 = Accomidationtable.getColumnModel().getColumn(3);

        AccomidationcolumnToHide0.setPreferredWidth(150);
        AccomidationcolumnToHide0.setMinWidth(150);
        AccomidationcolumnToHide0.setMaxWidth(150);
        AccomidationcolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer Accomidationdtcr = new DefaultTableCellRenderer();  
        Accomidationdtcr.setHorizontalAlignment(SwingConstants.CENTER); //Set Column text to centre of column 
        AccomidationcolumnToHide0.setCellRenderer(Accomidationdtcr);

        
        AccomidationcolumnToHide1.setPreferredWidth(0);
        AccomidationcolumnToHide1.setMinWidth(0);
        AccomidationcolumnToHide1.setMaxWidth(0);
        AccomidationcolumnToHide1.setResizable(false);  // Prevent resizing
        
        AccomidationcolumnToHide2.setPreferredWidth(0);
        AccomidationcolumnToHide2.setMinWidth(0);
        AccomidationcolumnToHide2.setMaxWidth(0);
        AccomidationcolumnToHide2.setResizable(false);  // Prevent resizing
        
        
        Accomidationtable.setComponentPopupMenu(popupMenu);
        Accomidationtable.addMouseListener(new TableMouseListener(Accomidationtable));
   
        JScrollPane AccomidationscrollPane = new JScrollPane(Accomidationtable);// Create scrollable table
        
        
        AccomidationPanel.add(AccomidationscrollPane);
        AccomidationPanel.setBounds(455,250,420,350);

        ColUniPanel.setBounds(10,250,430,350);
		ColUniPanel.setBackground(Color.red);
		
		ColUniLabel = new JLabel("ColUni");
		ColUniLabel.setBounds(50,0, 100, 100);
		ColUniPanel.add(ColUniLabel);
		
		
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        String[] ColUnicolumnNames = {"Name", "Address", "Column 2", "Column 3"};
        DefaultTableModel ColUnimodel = new DefaultTableModel(ApplicationDriver.UniColTable, ColUnicolumnNames);//Set Table model to the 2D array in ApplicationDriver that is relevent to the panel
        ColUnitable = new JTable(ColUnimodel);
        ColUnitable.putClientProperty("title", "ColUni"); //Sets Title for access from Expand() and CopyLink()

        TableColumn ColUnicolumnToHide0 = ColUnitable.getColumnModel().getColumn(0);
        TableColumn ColUnicolumnToHide1 = ColUnitable.getColumnModel().getColumn(2);
        TableColumn ColUnicolumnToHide2 = ColUnitable.getColumnModel().getColumn(3);

        ColUnicolumnToHide0.setPreferredWidth(150);
        ColUnicolumnToHide0.setMinWidth(150);
        ColUnicolumnToHide0.setMaxWidth(150);
        ColUnicolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer ColUnidtcr = new DefaultTableCellRenderer();  
        ColUnidtcr.setHorizontalAlignment(SwingConstants.CENTER); //Set Column text to centre of column 
        ColUnicolumnToHide0.setCellRenderer(ColUnidtcr);

        
        ColUnicolumnToHide1.setPreferredWidth(0);
        ColUnicolumnToHide1.setMinWidth(0);
        ColUnicolumnToHide1.setMaxWidth(0);
        ColUnicolumnToHide1.setResizable(false);  // Prevent resizing
        
        ColUnicolumnToHide2.setPreferredWidth(0);
        ColUnicolumnToHide2.setMinWidth(0);
        ColUnicolumnToHide2.setMaxWidth(0);
        ColUnicolumnToHide2.setResizable(false);  // Prevent resizing
        
        
        ColUnitable.setComponentPopupMenu(popupMenu);
        ColUnitable.addMouseListener(new TableMouseListener(ColUnitable));
        JScrollPane ColUniscrollPane = new JScrollPane(ColUnitable);// Create scrollable table
        ColUniPanel.add(ColUniscrollPane);
		
        //FinanceInfoPanel.setBounds(10,10,430,180);
        //FinanceInfoPanel.setBackground(Color.yellow);
		
        StudentImagePanel.setBounds(10,10,865,230);
		
		
		JLabel StudentimageLabel = new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\garet\\eclipse-workspace\\SmartCity\\src\\smartCity\\StudentPhoto.jfif"))));
		StudentImagePanel.add(StudentimageLabel); // Add the label to the panel
		
		StudentPanel.add(ColUniPanel);
		StudentPanel.add(AccomidationPanel);
		StudentPanel.add(StudentImagePanel);
		
		
		//End of Student Panel
			
		//Start of Job Panel
		
		
		
		
		

		JobPanel.setBackground(Color.gray);
		JobPanel.setLayout(null);//Set Null Layout to for .setBounds to function
		
		JobPostingPanel.setBounds(235,10,300,590);
		JobPostingPanel.setBackground(Color.red);
		
		JobPostingLabel = new JLabel("Job Posting");
		JobPostingPanel.add(JobPostingLabel);

        
        
        

        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);    
        
        String[] JobPostingcolumnNames = {"Id", "Name", "Column 2", "Column 3", "Column 4", "Column 5", "Column 6"};
        DefaultTableModel JobPostingmodel = new DefaultTableModel(ApplicationDriver.JobPostTable, JobPostingcolumnNames);//Set Table model to the 2D array in ApplicationDriver that is relevent to the panel
        JobPostingtable = new JTable(JobPostingmodel);
        JobPostingtable.putClientProperty("title", "JobPosting"); //Sets Title for access from Expand() and CopyLink()

        
        TableColumn JobPostingcolumnToHide0 = JobPostingtable.getColumnModel().getColumn(0);
        TableColumn JobPostingcolumnToHide1 = JobPostingtable.getColumnModel().getColumn(2);
        TableColumn JobPostingcolumnToHide2 = JobPostingtable.getColumnModel().getColumn(3);
        TableColumn JobPostingcolumnToHide3 = JobPostingtable.getColumnModel().getColumn(4);
        TableColumn JobPostingcolumnToHide4 = JobPostingtable.getColumnModel().getColumn(5);
        TableColumn JobPostingcolumnToHide5 = JobPostingtable.getColumnModel().getColumn(6);

        JobPostingcolumnToHide0.setPreferredWidth(150);
        JobPostingcolumnToHide0.setMinWidth(150);
        JobPostingcolumnToHide0.setMaxWidth(150);
        JobPostingcolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer JobPostingdtcr = new DefaultTableCellRenderer();  
        JobPostingdtcr.setHorizontalAlignment(SwingConstants.CENTER); //Set Column text to centre of column 
        JobPostingcolumnToHide0.setCellRenderer(JobPostingdtcr);

        
        JobPostingcolumnToHide1.setPreferredWidth(0);
        JobPostingcolumnToHide1.setMinWidth(0);
        JobPostingcolumnToHide1.setMaxWidth(0);
        JobPostingcolumnToHide1.setResizable(false);  // Prevent resizing
        
        JobPostingcolumnToHide2.setPreferredWidth(0);
        JobPostingcolumnToHide2.setMinWidth(0);
        JobPostingcolumnToHide2.setMaxWidth(0);
        JobPostingcolumnToHide2.setResizable(false);  // Prevent resizing
        
        JobPostingcolumnToHide3.setPreferredWidth(0);
        JobPostingcolumnToHide3.setMinWidth(0);
        JobPostingcolumnToHide3.setMaxWidth(0);
        JobPostingcolumnToHide3.setResizable(false);  // Prevent resizing
        
        JobPostingcolumnToHide4.setPreferredWidth(0);
        JobPostingcolumnToHide4.setMinWidth(0);
        JobPostingcolumnToHide4.setMaxWidth(0);
        JobPostingcolumnToHide4.setResizable(false);  // Prevent resizing
        
        JobPostingcolumnToHide5.setPreferredWidth(0);
        JobPostingcolumnToHide5.setMinWidth(0);
        JobPostingcolumnToHide5.setMaxWidth(0);
        JobPostingcolumnToHide5.setResizable(false);  // Prevent resizing
        
        
        JobPostingtable.setComponentPopupMenu(popupMenu);
        JobPostingtable.addMouseListener(new TableMouseListener(JobPostingtable));
        
        JScrollPane JobPostingscrollPane = new JScrollPane(JobPostingtable);// Create scrollable table
        JobPostingscrollPane.setPreferredSize(new Dimension(300,590));

        
        JobPostingPanel.add(JobPostingscrollPane);


        ApprentishipsPanel.setBounds(545,10,330,325);
        ApprentishipsPanel.setBackground(Color.red);
		
        ApprentishipsLabel = new JLabel("Apprentiships");
        ApprentishipsLabel.setBounds(50,0, 100, 100);
        ApprentishipsPanel.add(ApprentishipsLabel);
		
        

        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        String[] ApprentishipscolumnNames = {"Id", "Name", "Company", "Column 3", "Column 4", "Column 5", "Column 6"};
        DefaultTableModel Apprentishipsmodel = new DefaultTableModel(ApplicationDriver.ApprentishipTable, ApprentishipscolumnNames);//Set Table model to the 2D array in ApplicationDriver that is relevent to the panel
        Apprentishipstable = new JTable(Apprentishipsmodel);
        Apprentishipstable.putClientProperty("title", "Apprentiships"); //Sets Title for access from Expand() and CopyLink()

        TableColumn ApprentishipscolumnToHide0 = Apprentishipstable.getColumnModel().getColumn(1);
        TableColumn ApprentishipscolumnToHide1 = Apprentishipstable.getColumnModel().getColumn(0);
        TableColumn ApprentishipscolumnToHide2 = Apprentishipstable.getColumnModel().getColumn(3);
        TableColumn ApprentishipscolumnToHide3 = Apprentishipstable.getColumnModel().getColumn(4);
        TableColumn ApprentishipscolumnToHide4 = Apprentishipstable.getColumnModel().getColumn(5);
        TableColumn ApprentishipscolumnToHide5 = Apprentishipstable.getColumnModel().getColumn(6);

        
        ApprentishipscolumnToHide0.setPreferredWidth(150);
        ApprentishipscolumnToHide0.setMinWidth(150);
        ApprentishipscolumnToHide0.setMaxWidth(150);
        ApprentishipscolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer Apprentishipsdtcr = new DefaultTableCellRenderer();  
        Apprentishipsdtcr.setHorizontalAlignment(SwingConstants.CENTER); //Set Column text to centre of column 
        ApprentishipscolumnToHide0.setCellRenderer(Apprentishipsdtcr);

        
        ApprentishipscolumnToHide1.setPreferredWidth(0);
        ApprentishipscolumnToHide1.setMinWidth(0);
        ApprentishipscolumnToHide1.setMaxWidth(0);
        ApprentishipscolumnToHide1.setResizable(false);  // Prevent resizing
        
        ApprentishipscolumnToHide2.setPreferredWidth(0);
        ApprentishipscolumnToHide2.setMinWidth(0);
        ApprentishipscolumnToHide2.setMaxWidth(0);
        ApprentishipscolumnToHide2.setResizable(false);  // Prevent resizing
        
        ApprentishipscolumnToHide3.setPreferredWidth(0);
        ApprentishipscolumnToHide3.setMinWidth(0);
        ApprentishipscolumnToHide3.setMaxWidth(0);
        ApprentishipscolumnToHide3.setResizable(false);  // Prevent resizing

        ApprentishipscolumnToHide4.setPreferredWidth(0);
        ApprentishipscolumnToHide4.setMinWidth(0);
        ApprentishipscolumnToHide4.setMaxWidth(0);
        ApprentishipscolumnToHide4.setResizable(false);  // Prevent resizing
        
        ApprentishipscolumnToHide5.setPreferredWidth(0);
        ApprentishipscolumnToHide5.setMinWidth(0);
        ApprentishipscolumnToHide5.setMaxWidth(0);
        ApprentishipscolumnToHide5.setResizable(false);  // Prevent resizing 
        
        Apprentishipstable.setComponentPopupMenu(popupMenu);
        Apprentishipstable.addMouseListener(new TableMouseListener(Apprentishipstable));
        JScrollPane ApprentishipsscrollPane = new JScrollPane(Apprentishipstable);// Create scrollable table
        ApprentishipsscrollPane.setPreferredSize(new Dimension(330,325));
        
        ApprentishipsPanel.add(ApprentishipsscrollPane);
        
        
        
        //Avaliable Industries
        
        IndustriesPanel.setBounds(545,340,335,260);
        IndustriesPanel.setBackground(Color.red);
		
        JLabel IndustriesLabel = new JLabel("Avaliable Indurstries");
        IndustriesLabel.setBounds(50,0, 100, 100);
        IndustriesPanel.add(IndustriesLabel);
        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        String[] IndustriescolumnNames = {"Industry"};
        DefaultTableModel Industriesmodel = new DefaultTableModel(ApplicationDriver.HotelsTable, IndustriescolumnNames);//Set Table model to the 2D array in ApplicationDriver that is relevent to the panel
        JTable Industriestable = new JTable(Industriesmodel);

        JScrollPane IndustriesscrollPane = new JScrollPane(Industriestable);// Create scrollable table
        IndustriesscrollPane.setPreferredSize(new Dimension(335,260));

        IndustriesPanel.add(IndustriesscrollPane);
        JobPostingImage.setBounds(10,10,220,590);		
		JLabel JobPostingLabel = new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\garet\\eclipse-workspace\\SmartCity\\src\\smartCity\\businessPhoto.jpg")).getScaledInstance(230, 610, Image.SCALE_SMOOTH)));
		JobPostingImage.add(JobPostingLabel); // Add the label to the panel
		
		
		
        JobPanel.add(JobPostingPanel);
        JobPanel.add(ApprentishipsPanel);
        JobPanel.add(JobSeekersPanel);
        JobPanel.add(JobPostingImage);
        JobPanel.add(IndustriesPanel);

		
		
		//End of Job Panel
		
		
		//Start of Business Panel
		
        
        
        
        

		BusinessPanel.setBackground(Color.gray);
		BusinessPanel.setLayout(null);//Set Null Layout to for .setBounds to function
		UnitsPanel.setBounds(545,340,335,260);
		UnitsPanel.setBackground(Color.red);
		
		BuisnessPhotoPanel = new JPanel(new BorderLayout());  //Business Sub-Panels
		BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\garet\\eclipse-workspace\\SmartCity\\src\\smartCity\\CardiffskylineBusiness.JPG"));
		Image scaledImage = myPicture.getScaledInstance(215, 590, Image.SCALE_SMOOTH); 
		JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
		BuisnessPhotoPanel.add(imageLabel); // Add the label to the panel



		UnitsLabel = new JLabel("Rentable units");
		UnitsPanel.add(UnitsLabel);
		
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        String[] UnitscolumnNames = {"Name", "Address", "Column 1", "Column 2", "Column 3", "Column 4"};
        DefaultTableModel Unitsmodel = new DefaultTableModel(ApplicationDriver.RentableSpacesTable, UnitscolumnNames);//Set Table model to the 2D array in ApplicationDriver that is relevent to the panel
        Unitstable = new JTable(Unitsmodel);
        Unitstable.putClientProperty("title", "RentableSpaces"); //Sets Title for access from Expand() and CopyLink()

        TableColumn UnitscolumnToHide0 = Unitstable.getColumnModel().getColumn(0);
        TableColumn UnitscolumnToHide1 = Unitstable.getColumnModel().getColumn(2);
        TableColumn UnitscolumnToHide2 = Unitstable.getColumnModel().getColumn(3);
        TableColumn UnitscolumnToHide3 = Unitstable.getColumnModel().getColumn(4);
        TableColumn UnitscolumnToHide4 = Unitstable.getColumnModel().getColumn(5);
        
        
        UnitscolumnToHide0.setPreferredWidth(150);
        UnitscolumnToHide0.setMinWidth(150);
        UnitscolumnToHide0.setMaxWidth(150);
        UnitscolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer Unitsdtcr = new DefaultTableCellRenderer();  
        Unitsdtcr.setHorizontalAlignment(SwingConstants.CENTER); //Set Column text to centre of column 
        UnitscolumnToHide0.setCellRenderer(Unitsdtcr);

        
        UnitscolumnToHide1.setPreferredWidth(0);
        UnitscolumnToHide1.setMinWidth(0);
        UnitscolumnToHide1.setMaxWidth(0);
        UnitscolumnToHide1.setResizable(false);  // Prevent resizing
        
        UnitscolumnToHide2.setPreferredWidth(0);
        UnitscolumnToHide2.setMinWidth(0);
        UnitscolumnToHide2.setMaxWidth(0);
        UnitscolumnToHide2.setResizable(false);  // Prevent resizing
        
        UnitscolumnToHide3.setPreferredWidth(0);
        UnitscolumnToHide3.setMinWidth(0);
        UnitscolumnToHide3.setMaxWidth(0);
        UnitscolumnToHide3.setResizable(false);  // Prevent resizing
        
        UnitscolumnToHide4.setPreferredWidth(0);
        UnitscolumnToHide4.setMinWidth(0);
        UnitscolumnToHide4.setMaxWidth(0);
        UnitscolumnToHide4.setResizable(false);  // Prevent resizing
        
        Unitstable.setComponentPopupMenu(popupMenu);
        Unitstable.addMouseListener(new TableMouseListener(Unitstable));
        
        JScrollPane UnitsscrollPane = new JScrollPane(Unitstable);// Create scrollable table
        UnitsscrollPane.setPreferredSize(new Dimension(334, 258));
        
        UnitsPanel.add(UnitsscrollPane);
        NewBuinessPanel.setBounds(545,10,330,325);
        NewBuinessPanel.setBackground(Color.red);
        NewBuinessLabel = new JLabel("New Businesses");
        NewBuinessLabel.setBounds(50,0, 100, 100);
        NewBuinessPanel.add(NewBuinessLabel);
        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        String[] NewBuinesscolumnNames = {"Name", "Description", "Column 2", "Column 3", "Column 4", "Column 5"};
        DefaultTableModel NewBuinessmodel = new DefaultTableModel(ApplicationDriver.NewBuisnessesTable, NewBuinesscolumnNames);//Set Table model to the 2D array in ApplicationDriver that is relevent to the panel
        NewBuinesstable = new JTable(NewBuinessmodel);
        NewBuinesstable.putClientProperty("title", "NewBuiness"); //Sets Title for access from Expand() and CopyLink()


        TableColumn NewBuinesscolumnToHide0 = NewBuinesstable.getColumnModel().getColumn(0);
        TableColumn NewBuinesscolumnToHide1 = NewBuinesstable.getColumnModel().getColumn(2);
        TableColumn NewBuinesscolumnToHide2 = NewBuinesstable.getColumnModel().getColumn(3);
        TableColumn NewBuinesscolumnToHide3 = NewBuinesstable.getColumnModel().getColumn(4);
        TableColumn NewBuinesscolumnToHide4 = NewBuinesstable.getColumnModel().getColumn(5);
        
        NewBuinesscolumnToHide0.setPreferredWidth(150);
        NewBuinesscolumnToHide0.setMinWidth(150);
        NewBuinesscolumnToHide0.setMaxWidth(150);
        NewBuinesscolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer NewBuinessdtcr = new DefaultTableCellRenderer();  
        NewBuinessdtcr.setHorizontalAlignment(SwingConstants.CENTER); //Set Column text to centre of column 
        NewBuinesscolumnToHide0.setCellRenderer(NewBuinessdtcr);

        
        NewBuinesscolumnToHide1.setPreferredWidth(0);
        NewBuinesscolumnToHide1.setMinWidth(0);
        NewBuinesscolumnToHide1.setMaxWidth(0);
        NewBuinesscolumnToHide1.setResizable(false);  // Prevent resizing
        
        NewBuinesscolumnToHide2.setPreferredWidth(0);
        NewBuinesscolumnToHide2.setMinWidth(0);
        NewBuinesscolumnToHide2.setMaxWidth(0);
        NewBuinesscolumnToHide2.setResizable(false);  // Prevent resizing
        
        NewBuinesscolumnToHide3.setPreferredWidth(0);
        NewBuinesscolumnToHide3.setMinWidth(0);
        NewBuinesscolumnToHide3.setMaxWidth(0);
        NewBuinesscolumnToHide3.setResizable(false);  // Prevent resizing
        
        NewBuinesscolumnToHide4.setPreferredWidth(0);
        NewBuinesscolumnToHide4.setMinWidth(0);
        NewBuinesscolumnToHide4.setMaxWidth(0);
        NewBuinesscolumnToHide4.setResizable(false);  // Prevent resizing
        
        NewBuinesstable.setComponentPopupMenu(popupMenu);
        NewBuinesstable.addMouseListener(new TableMouseListener(NewBuinesstable));

        JScrollPane NewBuinessscrollPane = new JScrollPane(NewBuinesstable);// Create scrollable table
        NewBuinessscrollPane.setPreferredSize(new Dimension(330,325));
        NewBuinessPanel.add(NewBuinessscrollPane);
        
        //News Panel
        

        BusinessNewsPanel.setBounds(235,10,300,590);
        BusinessNewsPanel.setBackground(Color.red);
		
        BusinessNewsLabel = new JLabel("Business News");
        BusinessNewsLabel.setBounds(50,0, 100, 100);
        BusinessNewsPanel.add(BusinessNewsLabel);
		
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        String[] BusinessNewscolumnNames = {"Name", "Description", "Column 2", "Column 3"};
        DefaultTableModel BusinessNewsmodel = new DefaultTableModel(ApplicationDriver.BusinessNewsTable, BusinessNewscolumnNames);//Set Table model to the 2D array in ApplicationDriver that is relevent to the panel
        BusinessNewstable = new JTable(BusinessNewsmodel);
        BusinessNewstable.putClientProperty("title", "BusinessNews"); //Sets Title for access from Expand() and CopyLink()

        TableColumn BusinessNewscolumnToHide0 = BusinessNewstable.getColumnModel().getColumn(0);
        TableColumn BusinessNewscolumnToHide1 = BusinessNewstable.getColumnModel().getColumn(2);
        TableColumn BusinessNewscolumnToHide2 = BusinessNewstable.getColumnModel().getColumn(3);
        TableColumn BusinessNewscolumnToHide3 = BusinessNewstable.getColumnModel().getColumn(1);


        BusinessNewscolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer BusinessNewsdtcr = new DefaultTableCellRenderer();  
        BusinessNewsdtcr.setHorizontalAlignment(SwingConstants.CENTER); //Set Column text to centre of column 
        BusinessNewscolumnToHide0.setCellRenderer(BusinessNewsdtcr);

        
        BusinessNewscolumnToHide1.setPreferredWidth(0);
        BusinessNewscolumnToHide1.setMinWidth(0);
        BusinessNewscolumnToHide1.setMaxWidth(0);
        BusinessNewscolumnToHide1.setResizable(false);  // Prevent resizing
        
        BusinessNewscolumnToHide2.setPreferredWidth(0);
        BusinessNewscolumnToHide2.setMinWidth(0);
        BusinessNewscolumnToHide2.setMaxWidth(0);
        BusinessNewscolumnToHide2.setResizable(false);  // Prevent resizing
        
        BusinessNewscolumnToHide3.setPreferredWidth(0);
        BusinessNewscolumnToHide3.setMinWidth(0);
        BusinessNewscolumnToHide3.setMaxWidth(0);
        BusinessNewscolumnToHide3.setResizable(false);  // Prevent resizing
        
        BusinessNewstable.setComponentPopupMenu(popupMenu); //Required to have the right click functioning
        BusinessNewstable.addMouseListener(new TableMouseListener(BusinessNewstable));

        JScrollPane BusinessNewsscrollPane = new JScrollPane(BusinessNewstable);// Create scrollable table
        BusinessNewsscrollPane.setPreferredSize(new Dimension(300,590));
        BusinessNewsPanel.add(BusinessNewsscrollPane);
		
        BuisnessPhotoPanel.setBounds(10,10,215,590);
        BuisnessPhotoPanel.setBackground(Color.yellow);

        BusinessPanel.add(NewBuinessPanel);
        BusinessPanel.add(UnitsPanel);
        BusinessPanel.add(BuisnessPhotoPanel);
        BusinessPanel.add(BusinessNewsPanel);


		//End of Business Panel
		

		frame.add(TouristPanel); //Adds tourist panel as to set the panel as default
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	
	private void AdminNavigator() { //Admin navigator is used as a menu between 3 different windows for the admin
		
		AdminNavPanel = new JPanel();
		AdminNavFrame = new JFrame();
		AdminNavFrame.setSize(300,180);
		AdminNavFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdminNavFrame.add(AdminNavPanel);
		
		
		AdminNavLabel = new JLabel("Admin Navigation Panel");
		AdminNavLabel.setBounds(150, 30, 100, 25);
		AdminNavPanel.add(AdminNavLabel);
		
		
		
		SmartCityNavButton = new JButton("Navigate to Smart City App");
		SmartCityNavButton.setBounds(50, 50, 200,50);
		SmartCityNavButton.addActionListener(new GUI());
		AdminNavPanel.add(SmartCityNavButton);
		
		UserVerificationNavButton = new JButton("Navigate to User Verification");
		UserVerificationNavButton.setBounds(50, 150, 200,50);
		UserVerificationNavButton.addActionListener(new GUI());
		AdminNavPanel.add(UserVerificationNavButton);
		
		RecordViewerNavButton = new JButton("Navigate to Record Viewer");
		RecordViewerNavButton.setBounds(50, 250, 200,50);
		RecordViewerNavButton.addActionListener(new GUI());
		AdminNavPanel.add(RecordViewerNavButton);
		
		
		
		AdminNavFrame.setLocationRelativeTo(null);
		AdminNavFrame.setVisible(true);

		
	}
	
	private void AdminUserVerification() {
		
		
		
		AdminUserVerificationPanel = new JPanel();
		AdminUserVerificationFrame = new JFrame();
		AdminUserVerificationFrame.setSize(440,500);
		AdminUserVerificationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //DISPOSE_ON_CLOSE stops exit button closing the entire program
		AdminUserVerificationFrame.add(AdminUserVerificationPanel);
		

		
        String[] UnitscolumnNames = {"ID", "UserName", "Fullname", "Email", "DateCreated"}; //Collumn names
        DefaultTableModel UserVerificationModel = new DefaultTableModel(Users, UnitscolumnNames);//Set Table model to the 2D array in ApplicationDriver that is relevent to the panel

        
        UserVerificationTable = new JTable(UserVerificationModel); //Sets Table
        
        
        TableColumn UnitscolumnToHide0 = UserVerificationTable.getColumnModel().getColumn(0);//Hides Column
        UnitscolumnToHide0.setPreferredWidth(0); 
        UnitscolumnToHide0.setMinWidth(0);
        UnitscolumnToHide0.setMaxWidth(0);
        UnitscolumnToHide0.setResizable(false);  // Prevent resizing


        
        JScrollPane UserVerificationScrollPane = new JScrollPane(UserVerificationTable); //Creates scrollable table
        
        UserVerificationScrollPane.setPreferredSize(new Dimension(400, 300)); //Sets dimensions 
        AdminUserVerificationPanel.add(UserVerificationScrollPane);


		DeleteUserButton = new JButton("Delete User");
		DeleteUserButton.setBounds(90, 600, 200,50);
		DeleteUserButton.addActionListener(e -> {
		    int selectedRow = UserVerificationTable.getSelectedRow(); //Get selected row

		    if (selectedRow != -1) {
		        String userId = (String) UserVerificationTable.getValueAt(selectedRow, 0); // Retrieve ID at column 0

		        
		        // Confirmation pop-up
		        int confirmation = JOptionPane.showConfirmDialog(
		                AdminUserVerificationFrame,
		                "Are you sure you want to Delete the selected user?", //Popup verifying if admin wants to delete user
		                "Confirm Deletion",
		                JOptionPane.YES_NO_OPTION
		        );
		        
		        
		        
		        if (confirmation == JOptionPane.YES_OPTION) {

		        	
		        	try {
						if(DBInstance.DeleteRecord(userId, "user")) {
					        System.out.println("user verified");
					        UserVerificationModel.removeRow(selectedRow); //Removes newly Deleted user from table

							
							
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}


		        }
		        
		        
		    } else {
		        JOptionPane.showMessageDialog(AdminUserVerificationFrame, "Please select a user to delete.");
		    }
		});
		AdminUserVerificationPanel.add(DeleteUserButton);
		
		
		
		VerifyUserRowButton = new JButton("Verify User");
		VerifyUserRowButton.setBounds(250, 450, 100,50);
		VerifyUserRowButton.addActionListener(e -> {
		    int selectedRow = UserVerificationTable.getSelectedRow();//Get selected row

		    if (selectedRow != -1) {
		        String userId = (String) UserVerificationTable.getValueAt(selectedRow, 0); // Retrieve ID at column 0

		        
		        // Confirmation pop-up
		        int confirmation = JOptionPane.showConfirmDialog( //popup confirming if to verify the user
		                AdminUserVerificationFrame,
		                "Are you sure you want to verify the selected user?",
		                "Confirm Verification",
		                JOptionPane.YES_NO_OPTION
		        );
		        
		        
		        
		        if (confirmation == JOptionPane.YES_OPTION) {

		        	
		        	try {
						if(DBInstance.UserVerify(userId)) {
					        System.out.println("user verified");
					        UserVerificationModel.removeRow(selectedRow); //Removes newly verified user from table

							
							
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}


		        }
		        
		        
		    } else {
		        JOptionPane.showMessageDialog(AdminUserVerificationFrame, "Please select a user to delete.");
		    }
		});
		AdminUserVerificationPanel.add(VerifyUserRowButton);
		
		
		
        AdminUserVerificationFrame.setLocationRelativeTo(null);
        AdminUserVerificationFrame.setVisible(true);
		
	}
	
	
	
	
	private void AdminRecordViewer() {//Allows Admin to view tables within the Database, excluding users
		
        categoryComboBox.addItem("Hotels"); //Adds options to combobox where the admin can select their desired table
        categoryComboBox.addItem("Resteraunts");
        categoryComboBox.addItem("News");
        categoryComboBox.addItem("Accomidation");
        categoryComboBox.addItem("UniCol");
        categoryComboBox.addItem("JobPost");
        categoryComboBox.addItem("Volunteering");
        categoryComboBox.addItem("RentableSpaces");
        categoryComboBox.addItem("NewBuisnesses");
        AdminRecordViewerTable = new JTable();
   
        LoadNewTable("Hotels");//Loads hotels Table as default option
        
        AdminRecordViewerPanel = new JPanel();
        AdminRecordViewerFrame = new JFrame();
        JPanel AdminRecordViewerTablePanel = new JPanel();

        AdminRecordViewerFrame.setSize(440,500);
		AdminRecordViewerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //DISPOSE_ON_CLOSE stops exit button closing the entire program
		

		
        DefaultRecordModel = new DefaultTableModel(AdminTableData, AdminColumnNames);//Sets AdminTableData as default option
        AdminRecordViewerTable = new JTable(DefaultRecordModel);
        AdminRecordViewerTable.setAutoCreateColumnsFromModel(true); // Adapt to model changes
        AdminHiddenCollumn0 = AdminRecordViewerTable.getColumnModel().getColumn(0); //Hides ID 


        AdminHiddenCollumn0.setPreferredWidth(0);
        AdminHiddenCollumn0.setMinWidth(0);
        AdminHiddenCollumn0.setMaxWidth(0);
        AdminHiddenCollumn0.setResizable(false);  // Prevent resizing


        
        JScrollPane AdminRecordViewerScrollPane = new JScrollPane(AdminRecordViewerTable);// Create scrollable table
        AdminRecordViewerScrollPane.setPreferredSize(new Dimension(400, 300));

        AdminRecordViewerTablePanel.setBounds(15, 50, 400, 300);
        AdminRecordSearch = new JTextField(20); // Create a text box with a width of 20 columns
        AdminRecordSearch.setBounds(167, 0, 150, 50);
        
        
        AdminSearchRecordButton = new JButton("Search");
        AdminSearchRecordButton.setBounds(320, 0, 95,50);
        AdminSearchRecordButton.addActionListener(e -> { //Sets action listener for search button


        	for(int I = 0; I < AdminTableData.length; I++ ) { //Iterate through each row in AdminTableData 
        		
        		if(AdminTableData[I][0].equals(AdminRecordSearch.getText())) {//If current row is equals to search input run the following
        			
    		        // Confirmation pop-up
        			String[] Options = {"Delete", "Edit"}; //Options for Pop up
        			int answer = JOptionPane.showOptionDialog(
        		               frame,
        		               "Select following action for ID: " + AdminRecordSearch.getText(), 
        		               "Select",            
        		               JOptionPane.YES_NO_OPTION,
        		               JOptionPane.QUESTION_MESSAGE,
        		               null,     //no custom icon
        		               Options,  //button titles
        		               null
        		            );

    		        
    		        
    		        
    		        if (answer == JOptionPane.YES_OPTION) { //If option selected is delete record

    		        	
    		        	try {
    		        		String SearchID = AdminRecordSearch.getText(); //Convert given variable into string
    						if(DBInstance.DeleteRecord(SearchID, SelectedSQL)) { //Delete record with ID and current selected table
    					        System.out.println("Record Deleted");
    					        DefaultRecordModel.removeRow(I); //Removes Record from table

    							
    							
    						}
    					} catch (SQLException e1) {
    						e1.printStackTrace();
    					}


    		        }else if(answer == JOptionPane.NO_OPTION){//If option selected i Edit record
    		            String[] rowData = new String[AdminTableData[I].length];//Initialise rowData with length of current row

    		            for (int i = 0; i < rowData.length; i++) { //Iterates through AdminTableData and sets column value to rowData
    		                rowData[i] = (String) AdminTableData[I][i];
    		            }
    		            
    		            
    		            try {
							showEditRecordFrame(AdminColumnNames, rowData);//Runs pop up to edit record. provides column names and previously created rowData
						} catch (SQLException e1) {
							e1.printStackTrace();
						}

    		        }
        			
        			
        			
        			
        			
        			
        		}
        		
        		if(I == AdminTableData.length) { //No row with the matching ID was found
    		        JOptionPane.showMessageDialog(AdminUserVerificationFrame, "Please Enter a valid ID"); //Shows dialogue telling user to enter valid id

        		}
        		
        		
        	}

	        
	        
		    
		    
		        
		        
		    
		});
        
        
        categoryComboBox.setBounds(15, 0, 150, 50);
        categoryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	LoadNewTable((String) categoryComboBox.getSelectedItem()); //When new combobox item is selected, run LoadNewTable method.
            }
        });
        
        




		DeleteRecordButton = new JButton("Delete Record");
		DeleteRecordButton.setBounds(40, 360, 100,50);
		DeleteRecordButton.addActionListener(e -> {
		    int selectedRow = AdminRecordViewerTable.getSelectedRow(); //Gets selected row from table
	        System.out.println(selectedRow);

		    if (selectedRow != -1) { //If a row is selected run the following
		        String userId = (String) AdminRecordViewerTable.getValueAt(selectedRow, 0); // Retrieve ID at column 0

		        
		        // Confirmation pop-up
		        int confirmation = JOptionPane.showConfirmDialog( //Confirm Deletion pop up
		        		AdminRecordViewerFrame,
		                "Are you sure you want to delete the selected record?",
		                "Confirm Deletion",
		                JOptionPane.YES_NO_OPTION
		        );
		        
		        
		        
		        if (confirmation == JOptionPane.YES_OPTION) {

		        	
		        	try {
						if(DBInstance.DeleteRecord(userId, SelectedSQL)) { //Deletes record from table with ID
					        System.out.println("Record Deleted");
					        DefaultRecordModel.removeRow(selectedRow); //Removes Record from table

							
							
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}


		        }
		        
		        
		    } else {
		        JOptionPane.showMessageDialog(AdminUserVerificationFrame, "Please select a user to delete."); //If no row is selected show pop up
		    }
		});
		
		
		
		
		EditRecordButton = new JButton("Edit Record");
		EditRecordButton.setBounds(150, 360, 100,50);
		EditRecordButton.addActionListener(e -> {
			
			
		    int selectedRow = AdminRecordViewerTable.getSelectedRow(); //Gets selected row from table
            String[] rowData = new String[AdminTableData[selectedRow].length];//Initialises rowData with length of selected row

            for (int i = 0; i < rowData.length; i++) {//Iterates through rowData length
                rowData[i] = (String) AdminTableData[selectedRow][i]; //Iterates AdminTableData and inserts columns in rowData
            }
            
            
            try {
				showEditRecordFrame(AdminColumnNames, rowData); //Runs showEditRecordFrame method with included parameters
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			
			
			
		});
		
		
		
		
		AddRecordButton = new JButton("Add Record");
		AddRecordButton.setBounds(260, 360, 100,50);
		AddRecordButton.addActionListener(e -> {
			
			
            try {
				showAddRecordFrame(AdminColumnNames); //Runs showAddRecordFrame method with the column names
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		});
		
		
		
		
		
		
		
		
		AdminRecordViewerPanel.add(AddRecordButton); //Adds all components to parent panel
		AdminRecordViewerPanel.add(EditRecordButton);
		AdminRecordViewerPanel.add(AdminSearchRecordButton);
		AdminRecordViewerPanel.add(AdminRecordSearch);
		AdminRecordViewerPanel.add(DeleteRecordButton);
        AdminRecordViewerPanel.add(categoryComboBox);
        AdminRecordViewerTablePanel.add(AdminRecordViewerScrollPane);
        AdminRecordViewerPanel.add(AdminRecordViewerTablePanel);
		
		
        
		AdminRecordViewerFrame.add(AdminRecordViewerPanel); //Adds parent panel to Jframe
        AdminRecordViewerPanel.setLayout(null);//Set Null Layout to for .setBounds to function
        AdminRecordViewerFrame.setLocationRelativeTo(null);
        AdminRecordViewerFrame.setVisible(true);
		
	}

	
	private void ChangeDetails() {//Change details method for users to change UserName and Email
		
		
		
		ChangeDetailspanel = new JPanel();
		ChangeDetailframe = new JFrame();
		ChangeDetailframe.setSize(400,260);
		ChangeDetailframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //DISPOSE_ON_CLOSE stops exit button closing the entire program
		ChangeDetailframe.add(ChangeDetailspanel);
		
		ChangeDetailspanel.setLayout(null);//Set Null Layout to for .setBounds to function
		
		JLabel ChangeDetailsLabel = new JLabel("Change account details");
		ChangeDetailsLabel.setBounds(130, 20, 170, 25);
		ChangeDetailspanel.add(ChangeDetailsLabel);
		
		
		ChangeDetailsPageFullNameLabel = new JLabel("Full Name");
		ChangeDetailsPageFullNameLabel.setBounds(167, 50, 80, 25);
		ChangeDetailspanel.add(ChangeDetailsPageFullNameLabel);
		
		ChangeDetailsFullNameText = new JTextField(20);
		ChangeDetailsFullNameText.setBounds(110, 70, 170, 25);
		ChangeDetailsFullNameText.setText(ApplicationDriver.UserResult[3]);
		ChangeDetailspanel.add(ChangeDetailsFullNameText);
		
		ChangeDetailsEmaillabel = new JLabel("Email");
		ChangeDetailsEmaillabel.setBounds(177, 100, 80, 25);
		ChangeDetailspanel.add(ChangeDetailsEmaillabel);
		
		ChangeDetailsEmailText = new JTextField(100);
		ChangeDetailsEmailText.setBounds(110, 120, 170, 25);
		ChangeDetailsEmailText.setText(ApplicationDriver.UserResult[5]);
		ChangeDetailspanel.add(ChangeDetailsEmailText);
		
		
		ChangeDetailsPageButton = new JButton("Update Details");
		ChangeDetailsPageButton.setBounds(110, 150, 170,25);
		ChangeDetailsPageButton.addActionListener(new GUI());
		ChangeDetailspanel.add(ChangeDetailsPageButton);
		
		ChangeDetailsSuccessLabel = new JLabel(""); //Notifies user if change is successful or failed
		ChangeDetailsSuccessLabel.setBounds(110, 180, 300, 25);
		ChangeDetailspanel.add(ChangeDetailsSuccessLabel);
		
		
		
		
		ChangeDetailframe.setLocationRelativeTo(null);
		ChangeDetailframe.setVisible(true);

		
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		

		 System.out.println(e.getActionCommand());
		
		if(!LoggedIn) {  //Only run following if not logged in
			
			
			if(e.getActionCommand() == "login") { //If button Login pressed
				String userName = UserNameText.getText(); //Gets both user entries
				String Password = PasswordText.getText();
			
			
				
				try {
					 ApplicationDriver.UserResult = DBInstance.LoginVerification(userName, Password); //Store returned result of LoginVerification
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
				if(ApplicationDriver.UserResult[0].equals("User Unverified")) { //If first column of UserResult returns User Unverified then run following
					SuccessLabel.setText("Please Wait to be verified"); //Change SuccessLabel in Login()
				
				}else if(ApplicationDriver.UserResult[0].equals("Wrong Username or Password")){ //If password or username incorrect
					SuccessLabel.setText("Wrong Username or Password!");//Change SuccessLabel in Login()
				
				}else if(ApplicationDriver.UserResult[0].equals("Success")){//If first column returns Success
						if(ApplicationDriver.UserResult[8].equals("0")) {//If user is not an admin

							frame.dispose(); //Dispose of Login frame
							ApplicationDriver.LoggedIn = true; //Set Parent variable to true
							LoggedIn = true; //Set local variable to true
							ApplicationDriver.FrameStopper = 0; //Allows thread to enter into SmartCityApp

						}else {
							frame.dispose(); //Dispose of Login frame
							AdminNavigator(); //Opens Admin navigator
							ApplicationDriver.LoggedIn = true; //Set Parent variable to true
							LoggedIn = true;//Set local variable to true
						}

				}
				
			
			}
			
			if(e.getActionCommand() == "Back") { //Back button in the Register page
				frame.dispose();//Dispose of register page
				ApplicationDriver.FrameStopper = 0; //Allows thread to enter into Login

			}

			
			if(e.getActionCommand() == "Register") { 

					frame.dispose();//Dispose of Login page
					try {
						Register(); //Run Register() method
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			
			}
			
			if(e.getActionCommand() == "Register Account") { //If register button pressed in Register page

				
				System.out.println("Register Account");
				String RegUserName = RegisterPageUserNameText.getText();//Set local variables from textbox inputs from the Register page
				String RegFullName = RegisterPageFullNameText.getText();
				String RegPassword = RegisterPagePasswordText.getText();
				String RegRePassword = RegisterPageRePasswordText.getText();
				Pattern EmailPattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"); //Regex pattern for Email entry verification
				String RegEmail = RegisterPageEmaillText.getText();
				if(!EmailPattern.matcher(RegEmail).matches()) { //Regex checker for the email to ensure no spam or false emails
					RegisterSuccessLabel.setText("Enter a valid email");

					System.out.println("Email is incorrect");
					return;
				}
	
				
				String[] UserDetails = new String[4]; //Initalise UserDetails array 
				UserDetails[0] = RegUserName; //Insert Texboxes into array
				UserDetails[1] = RegFullName;
				UserDetails[2] = RegPassword;
				UserDetails[3] = RegEmail;

				

				if(RegPassword.equals(RegRePassword) && !RegPassword.isEmpty()) { //If password is equals to retype password and password is not empty, run the following
					if(!UserDetails[3].isEmpty() && !UserDetails[0].isEmpty()) { //If email and Username is not empty, run the follwoing
						 try {
							 String Register = DBInstance.UserRegister(UserDetails); //Attempt register
							if(Register.equals("Register Succesfull")) { //If Register returns Register Succesfull. account has been created
								frame.dispose(); //Dispose of register frame and run login()
								Login();
								SuccessLabel.setText("Register Success");
								
								
							}else {
								RegisterSuccessLabel.setText(Register);//If Register is unsuccesfull, show Return array on Label
								
							}
						} catch (SQLException | IOException e1) {
							e1.printStackTrace();
						}
						
						}else {
							RegisterSuccessLabel.setText("Do not leave boxes blank"); //If Username or Email is blank return following
						}
					
				}else {
					RegisterSuccessLabel.setText("Passwords do not match"); //If the passwords are empty or do not match return the following
				}
				
				
				
			}
		}else{

			
			if(ApplicationDriver.UserResult[8].equals("1")) { //If user is admin, return following
				
				if(e.getActionCommand().equals("Navigate to Smart City App")) { //If Smart city app button is pressed, run SmartCityPage() method
					System.out.println("Navigation");
					try {
						SmartCityPage();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}else if(e.getActionCommand().equals("Navigate to User Verification")) {//If Verify user button is pressed, run AdminUserVerification() method
					System.out.println("User Verification");
					try {
						Users = DBInstance.Retrievetable("user"); //Collect User information from database for user verification. Will only return unverified users
					} catch (SQLException e1) {
						e1.printStackTrace();
					}  
					AdminUserVerification();

					
				}else if(e.getActionCommand().equals("Navigate to Record Viewer")) { //if Record Viewer pressed, open AdminRecordViewer()
					System.out.println("Table Editors");
					AdminRecordViewer();
					
				}

			
			}
			
			

			if (e.getSource() instanceof JMenuItem) {//Is the source of e a JMenuItem?
	
				JMenuItem Tablemenu = (JMenuItem) e.getSource(); //Gets component source of the tables. used for right click feature
				String TableMenuToString = Tablemenu.toString(); //Turn retrieved Tablemenu data into string
				String TableMenuText = TableMenuToString.substring(TableMenuToString.indexOf("text=")).replace("]", "").replace("text=", ""); //Accesses the "Text=" key in the JTableMenu array for the buttons text
	
				if(TableMenuText.equals("Expand")) {
	
					Expand(e); //run the Expand() method to expand selected row
					
				}else if(TableMenuText.equals("Copy Link")) {
					CopyLink(e); //Run CopyLink() method to copy email or website
					
				}
			
			}
			
			if(e.getActionCommand().equals("Update Details") || e.getActionCommand().equals("Confirm Update")) { //if both are clicked at diffrent times then run the following / Used in changing users Details
				
				
                clicks++;
                if (clicks == 1) { //clicks maintains the confirmation process where a user will have to click twice to update their details
                	ChangeDetailsPageButton.setText("Confirm Update");
                }else if (clicks == 2) {
                	clicks = 0;//return int to 0 
                	ChangeDetailsPageButton.setText("Update Details"); //Return to original button text

					String FullName = ChangeDetailsFullNameText.getText(); //Get full name and email
					String Email = ChangeDetailsEmailText.getText();
	
					if(!ApplicationDriver.UserResult[3].equals(FullName) || !ApplicationDriver.UserResult[5].equals(Email)) { //Checks if provided user information is the same as current user information
						
						
	
						try {
							if(DBInstance.UserUpdate(Integer.parseInt(ApplicationDriver.UserResult[1]), FullName, Email)) { //Provides ID, fullname and email to UserUpdate() method.
								ChangeDetailsSuccessLabel.setText("Details Updated"); //If succesfull then set label text
	
							}else {
								ChangeDetailsSuccessLabel.setText("User Update failed");//if UserUpdate failed, return following
							}
						} catch (NumberFormatException | SQLException e1) {
							e1.printStackTrace();
						}
						
					}else {
						ChangeDetailsSuccessLabel.setText("No changes made");//change label if information has not changes
					}
                }
			}
			
		}
		
		
		

		
		if(e.getActionCommand().equals("Quit")) { //Quit is included in the Menu sextion of the navbar
	        System.exit(0); // Terminates the program

		}
		
		if(e.getActionCommand().equals("Tourist")) { //Changes to tourist by removing the other panels and adding tourist
			System.out.println("Tourist print");
			
			
			frame.remove(StudentPanel);
			frame.add(TouristPanel);
			frame.remove(JobPanel);
			frame.remove(BusinessPanel);
			TouristPanel.setVisible(true);
			StudentPanel.setVisible(false);
			JobPanel.setVisible(false);
			BusinessPanel.setVisible(false);
			
			
			
		}else if(e.getActionCommand().equals("Student")) {//Changes to Student by removing the other panels and adding tourist
			System.out.println("Student print");
			frame.remove(TouristPanel);
			frame.add(StudentPanel);
			frame.remove(JobPanel);
			frame.remove(BusinessPanel);
			TouristPanel.setVisible(false);
			StudentPanel.setVisible(true);
			JobPanel.setVisible(false);
			BusinessPanel.setVisible(false);


			
		}else if(e.getActionCommand().equals("Job")) {//Changes to JobPosting by removing the other panels and adding tourist
			System.out.println("Job print");
			
			frame.remove(TouristPanel);
			frame.remove(StudentPanel);
			frame.add(JobPanel);
			frame.remove(BusinessPanel);
			TouristPanel.setVisible(false);
			StudentPanel.setVisible(false);
			JobPanel.setVisible(true);
			BusinessPanel.setVisible(false);

			
		}else if(e.getActionCommand().equals("Business")) {//Changes to Business by removing the other panels and adding tourist
			System.out.println("Business print");
			frame.remove(TouristPanel);
			frame.remove(StudentPanel);
			frame.remove(JobPanel);
			frame.add(BusinessPanel);
			TouristPanel.setVisible(false);
			StudentPanel.setVisible(false);
			JobPanel.setVisible(false);
			BusinessPanel.setVisible(true);
		}
		
		
		
		if(e.getActionCommand().equals("Log Out")) { 
			
			
			frame.dispose(); //Dispose of SmartCityApp frame
			ApplicationDriver.LoggedIn = false; //Changes login state for super class
			LoggedIn = false;
			ApplicationDriver.FrameStopper = 0; //Allows thread to enter into Login page

			
		}
		if(e.getActionCommand().equals("Change Details")) { //Opens the ChangeDetails method 
			ChangeDetails();
			
		}
		

		}
	
	
	private void showAddRecordFrame(String[] columnNames) throws SQLException { //Adds record to desired table
		
	    JTextField[] editTextFields = new JTextField[columnNames.length - 1]; //Initialises 1D arrays, -1 is included to exclude the array
	    String[] editedData = new String[columnNames.length - 1];

	    JFrame AddRecordFrame = new JFrame("Add Record to: " + SelectedSQL); //Sets title to SelectedSQL variable
	    AddRecordFrame.setSize(400, 300);
	    AddRecordFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Dispose on close to ensure program does not fully stop when this window is closed

	    JPanel contentPane = new JPanel();
	    contentPane.setLayout(new GridLayout(0, 2, 5, 5)); //Grid layout includes 2 columns and 5px Vgap and Hgap
	    int Skip = 0;
	    // Create labels and text fields for each textbox other than id
	    for (int i = 1; i < columnNames.length; i++) {
	    	
	    	if(columnNames[i].equals("Date Created") || columnNames[i].equals("Date Published")) {//If statement skips columns with Dates as these are automatically assigned to record via SQL
	    		IntSkip = i-1;
	    		Skip = 1;
	    		continue; //Continue skips i

	    		
	    	}else if(Skip == 0){
	    		IntSkip = 10; //Sets IntSkip to a number that will not be used. Null would make the algorithm cease to function
	    	}
	    		
	        JLabel label = new JLabel(columnNames[i]); // Set label as column name
	        contentPane.add(label);
	        JTextField textField = new JTextField(); 
	        editTextFields[i - 1] = textField; //Adds textField to editTextFields array which can then be accessed once the save button is pressed
	        contentPane.add(textField);
	    }

	    // Add save and cancel buttons for the frame
	    JButton saveButton = new JButton("Save");
	    saveButton.addActionListener(new ActionListener() {
	        @Override    
				public void actionPerformed(ActionEvent e) { //If save button is pressed
				            // Package edited data into 1D array
				            for (int i = 0; i < editedData.length; i++) {
				            	if(i == IntSkip) { //Will skip the iteration if current itteration is the date

					                continue; //skip
				            	}
				            	
				                editedData[i] = editTextFields[i].getText(); //Get text from each textbox
				                System.out.println("/////////////" + editTextFields[i].getText()); 
				            }
				            AddRecordFrame.setVisible(false); // Close the frame
				            
				            try {
								if(DBInstance.AddRecord(SelectedSQL, editedData)) {//With the editedData, a new record will be created with SelectedSQL
									DefaultRecordModel.addRow(editedData); //Adds new row into table
									DefaultRecordModel.fireTableDataChanged(); //Updates table

								}
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
					    	
				        }
				    });
	    contentPane.add(saveButton); //Adds save button to panel
	    
	    JButton cancelButton = new JButton("Cancel");
	    cancelButton.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	AddRecordFrame.setVisible(false); // Close the frame when button is clicked
	        }
	    });
	    contentPane.add(cancelButton);

	    AddRecordFrame.setContentPane(contentPane);
	    AddRecordFrame.setVisible(true);

	}
	
	
	private void showEditRecordFrame(String[] columnNames, String[] rowData) throws SQLException { //showEditRecordFrame method Edits given record
	    JTextField[] editTextFields = new JTextField[columnNames.length - 1]; //Initialises 1D arrays, -1 is included to exclude the array
	    String[] editedData = new String[columnNames.length - 1];

	    JFrame editFrame = new JFrame("Edit Record"); //Sets title
	    editFrame.setSize(400, 300);
	    editFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Dispose on close to ensure program does not fully stop when this window is closed

	    JPanel contentPane = new JPanel();
	    contentPane.setLayout(new GridLayout(0, 2, 5, 5));//Grid layout includes 2 columns and 5px Vgap and Hgap

	    // Create labels and text fields for each textbox other than id
	    for (int i = 1; i < columnNames.length; i++) {
	        JLabel label = new JLabel(columnNames[i]);
	        contentPane.add(label);
	        JTextField textField = new JTextField(rowData[i]); // Fill with record data for editing
	        editTextFields[i - 1] = textField;//Adds textField to editTextFields array which can then be accessed once the save button is pressed
	        contentPane.add(textField);
	    }

	    // Add Save and Cancel buttons
	    JButton saveButton = new JButton("Save");
	    saveButton.addActionListener(new ActionListener() {
	        @Override    
				public void actionPerformed(ActionEvent e) { //If save button is pressed
				            // Package edited data into 1D array
				            for (int i = 0; i < editedData.length; i++) {
				                editedData[i] = editTextFields[i].getText();//Get text from each textbox
				            }
				            editFrame.setVisible(false); // Close the frame
				            
				            try {
								if(DBInstance.UpdateRecord(rowData[0], SelectedSQL, editedData)) { //Calls UpdateRecord method ID, current table, and the edited data
									System.out.println("SQL SELECTED IS: " + SelectedSQL);

								}
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
					    	
				        }
				    });
	    contentPane.add(saveButton); //Adds save button
	    
	    JButton cancelButton = new JButton("Cancel");
	    cancelButton.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            editFrame.setVisible(false); // Close the frame
	        }
	    });
	    contentPane.add(cancelButton);

	    editFrame.setContentPane(contentPane);
	    editFrame.setVisible(true);

	}
	
	
	
	
	private void Expand(ActionEvent e) { //Expand function creates a pop-up to display additional information
		
		JLabel label = null;  // Initialize a variable to store the found label

		
		JMenuItem menuItem = (JMenuItem) e.getSource(); //Get source of JMenu
	    JPopupMenu popupMenu = (JPopupMenu) menuItem.getParent();
	    JTable table = (JTable) popupMenu.getInvoker();  //Get the table 
	    String TableTitle = (String) table.getClientProperty("title");
    	int Row = table.getSelectedRow();
    	System.out.println(TableTitle);
    	
        String header = null;
        String mainText = null;
        String Website = null;
    	
    	
    	
		switch (TableTitle){ //Switch case for efficiency 
		
		
	
			case"Hotel": //Checks if TableQuery is the following, if so set column amount to represent Title, Description and Email/Website
				System.out.println("Hotel");

		        header = table.getModel().getValueAt(Row, 0).toString();  //Sets Header, Email or website and mainText to popup
		        mainText = table.getModel().getValueAt(Row, 2).toString(); 
		        Website = table.getModel().getValueAt(Row, 3).toString();  
	
				break;
				
			case"Resteraunt"://Checks if TableQuery is the following, if so set column amount to represent Title, Description and Email/Website
				System.out.println("Resteraunt");

		        header = table.getModel().getValueAt(Row, 0).toString();  //Sets Header, Email or website and mainText to popup
		        mainText = table.getModel().getValueAt(Row, 2).toString(); 
		        Website = table.getModel().getValueAt(Row,3).toString();  
	
				break;
				
			case"WhatsOn"://NEWS - Checks if TableQuery is the following, if so set column amount to represent Title, Description and Email/Website
				System.out.println("WhatsOn");
				
		        header = table.getModel().getValueAt(Row, 1).toString();  //Sets Header, Email or website and mainText to popup
		        mainText = table.getModel().getValueAt(Row, 2).toString(); 
		        Website = null;  
				
				
				break;
				
			case"Accomidation"://Checks if TableQuery is the following, if so set column amount to represent Title, Description and Email/Website
				System.out.println("Accomidation");

				
		        header = table.getModel().getValueAt(Row, 0).toString();  //Sets Header, Email or website and mainText to popup
		        mainText = table.getModel().getValueAt(Row, 2).toString(); 
		        Website = table.getModel().getValueAt(Row, 3).toString();  
				
				
				break;
				
			case"ColUni"://Checks if TableQuery is the following, if so set column amount to represent Title, Description and Email/Website
				System.out.println("UniCol");
				
				
		        header = table.getModel().getValueAt(Row, 0).toString();  //Sets Header, Email or website and mainText to popup
		        mainText = table.getModel().getValueAt(Row, 2).toString(); 
		        Website = table.getModel().getValueAt(Row, 3).toString();  

				break;
				
			case"RentableSpaces"://Checks if TableQuery is the following, if so set column amount to represent Title, Description and Email/Website
				System.out.println("RentableSpaces");

				
		        header = table.getModel().getValueAt(Row, 0).toString();  //Sets Header, Email or website and mainText to popup
		        mainText = table.getModel().getValueAt(Row, 4).toString(); 
		        Website = table.getModel().getValueAt(Row, 5).toString();  
		        
				break;
				
			case"NewBuiness"://Checks if TableQuery is the following, if so set column amount to represent Title, Description and Email/Website
				System.out.println("NewBuisnesses");
				
		        header = table.getModel().getValueAt(Row, 0).toString();  //Sets Header, Email or website and mainText to popup
		        mainText = table.getModel().getValueAt(Row, 2).toString(); 
		        Website = table.getModel().getValueAt(Row, 4).toString();  
				
				break;
				
				
			case"BusinessNews"://Checks if TableQuery is the following, if so set column amount to represent Title, Description and Email/Website
				System.out.println("BusinessNews");

		        header = table.getModel().getValueAt(Row, 0).toString();  //Sets Header, Email or website and mainText to popup
		        mainText = table.getModel().getValueAt(Row, 1).toString(); 
		        Website = null;    
		        
				break;
				
				
			case"JobPosting"://Checks if TableQuery is the following, if so set column amount to represent Title, Description and Email/Website
				System.out.println("JobPosting");
				
		        header = table.getModel().getValueAt(Row, 0).toString();  //Sets Header, Email or website and mainText to popup
		        mainText = table.getModel().getValueAt(Row, 3).toString(); 
		        Website = table.getModel().getValueAt(Row, 5).toString();  
		        
		        
				break;
				
			case"Volunteering"://Checks if TableQuery is the following, if so set column amount to represent Title, Description and Email/Website
				System.out.println("Volunteering");
				
		        header = table.getModel().getValueAt(Row, 0).toString();  //Sets Header, Email or website and mainText to popup
		        mainText = table.getModel().getValueAt(Row, 2).toString(); 
		        Website = table.getModel().getValueAt(Row, 1).toString();  
		        
		        
				break;
				
			case"Apprentiships"://Checks if TableQuery is the following, if so set column amount to represent Title, Description and Email/Website
				System.out.println("Apprentiships");
				
		        header = table.getModel().getValueAt(Row, 1).toString();  //Sets Header, Email or website and mainText to popup
		        mainText = table.getModel().getValueAt(Row, 4).toString(); 
		        Website = table.getModel().getValueAt(Row, 6).toString();  

				break;

		
	}
    	
    	
    	
    	
    	
    	
    	
			
        // Retrieve data from the table


        // Create the new window
        JFrame detailsFrame = new JFrame();
        	

        detailsFrame.setTitle(header);
        detailsFrame.setLayout(new BorderLayout());

        // Create header label
        JLabel headerLabel = new JLabel(header, JLabel.CENTER);
        detailsFrame.add(headerLabel, BorderLayout.NORTH);



       
        JTextArea mainTextArea = new JTextArea(mainText); // Create main text area with scrolling
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(mainTextArea);// Create scrollable table
        detailsFrame.add(scrollPane, BorderLayout.CENTER); //Add scrollplane in case description is large

        if(Website != null) { //If website variable is not null then add a Email/Website label
	        JLabel addressLabel = new JLabel("Contact: " + Website, JLabel.CENTER);// Create Address label
	        detailsFrame.add(addressLabel, BorderLayout.SOUTH);  //Places label at the south of the JFrame
        }
        
        // Center the frame
        detailsFrame.setSize(400,300);
        detailsFrame.setLocationRelativeTo(null);  // Center relative to screen
        detailsFrame.setVisible(true);
			
		}

	private void CopyLink(ActionEvent e) { //Creates a popup which alerts the user that a link has been copied to clipboard
			JMenuItem menuItem = (JMenuItem) e.getSource();//Get source of JMenu
		    JPopupMenu popupMenu = (JPopupMenu) menuItem.getParent();
		    JTable table = (JTable) popupMenu.getInvoker();  //Get the table
        	int Row = table.getSelectedRow();
			String Website = table.getModel().getValueAt(Row, 3).toString(); //Get the Email or website Column

		    StringSelection selection = new StringSelection(Website);
		    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		    clipboard.setContents(selection, selection); //copy website or email link
			
			JOptionPane.showMessageDialog(frame,
					Website + " Has been copied"); //Show that website or email has been copied
			
			
			
			
		}

	
	
	private void LoadNewTable(String TableQuery) { //Loads new table, used in Admin record viewer
		
		switch (TableQuery){ //Switch case for efficiency 
		
		

			case"Hotels": //Checks if TableQuery is the following, if so set column amount and initialise AdminTableData
				System.out.println("Hotels");
				AdminColumnNames = new String[5];  // Create the array with size 3
				
				AdminColumnNames[0] = "ID";
				AdminColumnNames[1] = "Name";
				AdminColumnNames[2] = "Address";
				AdminColumnNames[3] = "Description";
				AdminColumnNames[4] = "Email";
				
				AdminTableData = new String[ApplicationDriver.Hotels.length][AdminColumnNames.length];
				AdminTableData = ApplicationDriver.Hotels; //Retrieves data from 2D array in the super class
				SelectedSQL = "hotels";

				break;
				
			case"Resteraunts"://Checks if TableQuery is the following, if so set column amount and initialise AdminTableData
				System.out.println("Resteraunts");
				AdminColumnNames = new String[5];  // Create the array with size 3
				
				AdminColumnNames[0] = "ID";
				AdminColumnNames[1] = "Name";
				AdminColumnNames[2] = "Address";
				AdminColumnNames[3] = "Description";
				AdminColumnNames[4] = "Email";

				
				AdminTableData = ApplicationDriver.Resteraunts;//Retrieves data from 2D array in the super class
				SelectedSQL = "resteraunt";

				break;
				
			case"News"://Checks if TableQuery is the following, if so set column amount and initialise AdminTableData
				System.out.println("News");
				
				AdminColumnNames = new String[4];  // Create the array with size 3
				
				AdminColumnNames[0] = "ID";
				AdminColumnNames[1] = "Headline";
				AdminColumnNames[2] = "Description";
				AdminColumnNames[3] = "Date Created";
				
				AdminTableData = ApplicationDriver.News;//Retrieves data from 2D array in the super class
				SelectedSQL = "news";

				break;
				
			case"Accomidation"://Checks if TableQuery is the following, if so set column amount and initialise AdminTableData
				System.out.println("Accomidation");
				
				AdminColumnNames = new String[6];  // Create the array with size 3
				
				AdminColumnNames[0] = "ID";
				AdminColumnNames[1] = "Name";
				AdminColumnNames[2] = "Address";
				AdminColumnNames[3] = "Description";
				AdminColumnNames[4] = "Email";
				AdminColumnNames[5] = "Weekly Cost";

				AdminTableData = ApplicationDriver.Accomidation;//Retrieves data from 2D array in the super class
				SelectedSQL = "accomidation";

				break;
				
			case"UniCol"://Checks if TableQuery is the following, if so set column amount and initialise AdminTableData
				System.out.println("UniCol");
				
				AdminColumnNames = new String[5];  // Create the array with size 3
				
				AdminColumnNames[0] = "ID";
				AdminColumnNames[1] = "Name";
				AdminColumnNames[2] = "Address";
				AdminColumnNames[3] = "Description";
				AdminColumnNames[4] = "Website";

				AdminTableData = ApplicationDriver.UniCol;//Retrieves data from 2D array in the super class
				SelectedSQL = "unicol";

				break;
				
			case"RentableSpaces"://Checks if TableQuery is the following, if so set column amount and initialise AdminTableData
				System.out.println("RentableSpaces");
				
				AdminColumnNames = new String[8];  // Create the array with size 3
				
				AdminColumnNames[0] = "ID";
				AdminColumnNames[1] = "Company";
				AdminColumnNames[2] = "Address";
				AdminColumnNames[3] = "SizeSQF";
				AdminColumnNames[4] = "Cost per month";
				AdminColumnNames[5] = "Description";
				AdminColumnNames[6] = "Contact";
				AdminColumnNames[7] = "Date Published";

				AdminTableData = ApplicationDriver.RentableSpaces;//Retrieves data from 2D array in the super class
				SelectedSQL = "rentablespace";

				break;
				
			case"NewBuisnesses"://Checks if TableQuery is the following, if so set column amount and initialise AdminTableData
				System.out.println("NewBuisnesses");
				AdminColumnNames = new String[7];  // Create the array with size 3
				
				AdminColumnNames[0] = "ID";
				AdminColumnNames[1] = "Company";
				AdminColumnNames[2] = "Address";
				AdminColumnNames[3] = "Description";
				AdminColumnNames[4] = "Industry";
				AdminColumnNames[6] = "Email";
				AdminColumnNames[5] = "Date Published";

				AdminTableData = ApplicationDriver.NewBuisnesses;//Retrieves data from 2D array in the super class
				SelectedSQL = "business";

				break;
				
				
			case"JobPost"://Checks if TableQuery is the following, if so set column amount and initialise AdminTableData
				System.out.println("JobPost");
				
				AdminColumnNames = new String[7];  // Create the array with size 3
				
				AdminColumnNames[0] = "ID";
				AdminColumnNames[1] = "Job Title";
				AdminColumnNames[2] = "Company";
				AdminColumnNames[3] = "Salary";
				AdminColumnNames[4] = "Description";
				AdminColumnNames[5] = "Apprentiship";
				AdminColumnNames[6] = "Website";
				AdminTableData = ApplicationDriver.JobPost;//Retrieves data from 2D array in the super class
				SelectedSQL = "jobposting";

				break;
				
			case"Volunteering"://Checks if TableQuery is the following, if so set column amount and initialise AdminTableData
				System.out.println("Volunteering");
				
				AdminColumnNames = new String[7];  // Create the array with size 3
				
				AdminColumnNames[0] = "ID";
				AdminColumnNames[1] = "Job Title";
				AdminColumnNames[2] = "Address";
				AdminColumnNames[3] = "Company";
				AdminColumnNames[4] = "Description";
				AdminColumnNames[5] = "Website";
				AdminColumnNames[6] = "Contact";
				AdminTableData = ApplicationDriver.Volunteering;//Retrieves data from 2D array in the super class
				SelectedSQL = "volunteering";

				break;

			
		}

		DefaultTableModel tableModel = (DefaultTableModel) AdminRecordViewerTable.getModel(); //Set new DefaultTableModel from AdminRecordViewerTable

		

		
        
		tableModel.setDataVector(AdminTableData, AdminColumnNames);//Set new dataVector  for tableModel
		tableModel.fireTableDataChanged(); //Update table
		
		TableColumnModel columnModel = AdminRecordViewerTable.getColumnModel(); //Hides the ID in the new table
		AdminHiddenCollumn0 = columnModel.getColumn(0);
        AdminHiddenCollumn0.setPreferredWidth(0);
        AdminHiddenCollumn0.setMinWidth(0);
        AdminHiddenCollumn0.setMaxWidth(0);
        AdminHiddenCollumn0.setResizable(false);  // Prevent resizing


		
		}
	}

