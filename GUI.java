package smartCity;



import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.regex.Pattern;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;



public class GUI extends ApplicationDriver implements ActionListener{

	private static JLabel UserNamelabel; //initialising needed variables
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
	
	private static JLabel RegisterPagePasswordlabel;
	private static JPasswordField RegisterPagePasswordText;
	private static JLabel RegisterPageRePasswordlabel;
	private static JPasswordField RegisterPageRePasswordText;
	private static JLabel RegisterPageEmaillabel;
	private static JTextField RegisterPageEmaillText;
	private static JButton RegisterPageButton;
	private static JButton RegisterBackButton;
	private static JLabel RegisterSuccessLabel;

	private static JMenuBar MenuBar = new JMenuBar();
	private static JMenu Menu, Navigate, Profile; //Variables packed for efficient space usage
	private static JMenuItem Quit, ChangeDetails, Tourist, Student, Job, Business, LogOut;
	
	private static JPanel TouristPanel = new JPanel(); //initialising Smart City page Variables
	private static JPanel StudentPanel = new JPanel(); 
	private static JPanel JobPanel = new JPanel(); 
	private static JPanel BusinessPanel = new JPanel(); 


    private static JMenuItem Expand; //JMenuItems for all Tables
    private static JMenuItem CopyRowLink;
	
	private static JPanel HotelPanel = new JPanel();  //Tourist Sub-Panels
	private static JPanel ResterauntPanel = new JPanel();
	private static JPanel WhatsonPanel = new JPanel();
	private static JPanel MapPanel = new JPanel();
	private static JLabel HotelLabel; 
	private static JLabel ResterauntLabel;
    private static JTable Hoteltable;

	
	
	private static JPanel AccomidationPanel = new JPanel();  //Student Sub-Panels
	private static JPanel ColUniPanel = new JPanel();
	private static JLabel ColUniLabel;
	private static JPanel FinanceInfoPanel = new JPanel();
	private static JPanel LocationsPanel = new JPanel();
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
	private static JPanel VolunteeringPanel = new JPanel();
	
	private static JPanel OpportunitiesPanel = new JPanel();  //Business Sub-Panels
	private static JPanel UnitsPanel = new JPanel();
	private static JLabel UnitsLabel;
	private static JTable Unitstable;
	private static JPanel NewBuinessPanel = new JPanel();
	private static JLabel NewBuinessLabel; 
	private static JTable NewBuinesstable;
	private static JPanel BuinessNewsPanel = new JPanel();
	private static JLabel BuinessNewsLabel; 
	private static JTable BuinessNewstable;
	
    private static JPopupMenu popupMenu;

	
	public static boolean Login() throws IOException {

		boolean logged = false;
		
		if(!logged) {
			panel = new JPanel();
			frame = new JFrame();
			
			frame.setSize(400,250);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			
			panel.setLayout(null);
			
			UserNamelabel = new JLabel("UserName");
			UserNamelabel.setBounds(167, 20, 80, 25);
			panel.add(UserNamelabel);
			
			UserNameText = new JTextField(20);
			UserNameText.setBounds(110, 40, 170, 25);
			panel.add(UserNameText);
			
			
			Passwordlabel = new JLabel("Password");
			Passwordlabel.setBounds(167, 70, 80, 25);
			panel.add(Passwordlabel);
			
			PasswordText = new JPasswordField();
			PasswordText.setBounds(110, 90, 170, 25);
			PasswordText.setEchoChar('*');
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
		
		
		
		return logged;
	}
	
	
	
	public static void Register() throws IOException{
		
		
		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
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
		
		RegisterSuccessLabel = new JLabel("");
		RegisterSuccessLabel.setBounds(110, 330, 300, 25);
		panel.add(RegisterSuccessLabel);
		
		
		
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public static void SmartCityPage() throws IOException{

		
		
		
		StudentPanel.setVisible(false);
		TouristPanel.setVisible(true);
		
		frame = new JFrame();
		frame.setSize(900,670);	
		frame.setBackground(Color.LIGHT_GRAY);
		
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
		
			
		//TOURIST PANEL
	
		TouristPanel.setBackground(Color.gray);
		TouristPanel.setLayout(null);
		
		HotelPanel.setBounds(455,250,420,350);
		HotelPanel.setBackground(Color.red);
		
		HotelLabel = new JLabel("Hotels");
		HotelPanel.add(HotelLabel);
        String[] HotelcolumnNames = {"Name", "Address", "Column 2", "Column 2"};
        DefaultTableModel Hotelmodel = new DefaultTableModel(ApplicationDriver.HotelsTable, HotelcolumnNames);
        
        
        
        
        popupMenu = new JPopupMenu();
        Expand = new JMenuItem("Expand");
        CopyRowLink = new JMenuItem("Copy Link");
        
        Expand.addActionListener(new GUI());
        CopyRowLink.addActionListener(new GUI());
        
        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        
        
        // Create scrollable table
        Hoteltable = new JTable(Hotelmodel);
        TableColumn HotelcolumnToHide0 = Hoteltable.getColumnModel().getColumn(0);
        TableColumn HotelcolumnToHide1 = Hoteltable.getColumnModel().getColumn(2);
        TableColumn HotelcolumnToHide2 = Hoteltable.getColumnModel().getColumn(3);

        HotelcolumnToHide0.setPreferredWidth(150);
        HotelcolumnToHide0.setMinWidth(150);
        HotelcolumnToHide0.setMaxWidth(150);
        HotelcolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer Hoteldtcr = new DefaultTableCellRenderer();  
        Hoteldtcr.setHorizontalAlignment(SwingConstants.CENTER);
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
        
        JScrollPane HotelscrollPane = new JScrollPane(Hoteltable);
        
        
        HotelPanel.add(HotelscrollPane);

		HotelPanel.setBounds(455,250,420,350);

		ResterauntPanel.setBounds(10,200,430,400);
		ResterauntPanel.setBackground(Color.red);
		
		ResterauntLabel = new JLabel("Resteraunts");
		ResterauntLabel.setBounds(50,0, 100, 100);
		ResterauntPanel.add(ResterauntLabel);
		
		
		
        String[] ResterauntcolumnNames = {"Name", "Column 1", "Column 2", "Column 3"};
        DefaultTableModel Resterauntmodel = new DefaultTableModel(ApplicationDriver.HotelsTable, ResterauntcolumnNames);
        // Create scrollable table
        JTable Resteraunttable = new JTable(Resterauntmodel);
        
        
        
        popupMenu = new JPopupMenu();
        Expand = new JMenuItem("Expand");
        CopyRowLink = new JMenuItem("Copy Link");
        
        Expand.addActionListener(new GUI());
        CopyRowLink.addActionListener(new GUI());
        
        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        
        
        // Create scrollable table
        Hoteltable = new JTable(Hotelmodel);
        TableColumn ResterauntcolumnToHide0 = Resteraunttable.getColumnModel().getColumn(0);
        TableColumn ResterauntcolumnToHide1 = Resteraunttable.getColumnModel().getColumn(2);
        TableColumn ResterauntcolumnToHide2 = Resteraunttable.getColumnModel().getColumn(3);

        ResterauntcolumnToHide0.setPreferredWidth(150);
        ResterauntcolumnToHide0.setMinWidth(150);
        ResterauntcolumnToHide0.setMaxWidth(150);
        ResterauntcolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer Resterauntdtcr = new DefaultTableCellRenderer();  
        Resterauntdtcr.setHorizontalAlignment(SwingConstants.CENTER);
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
        
        
        
        
        
        
        JScrollPane ResterauntscrollPane = new JScrollPane(Resteraunttable);
        ResterauntPanel.add(ResterauntscrollPane);
		
		WhatsonPanel.setBounds(10,10,430,180);
		WhatsonPanel.setBackground(Color.yellow);
		
		MapPanel.setBounds(455,10,420,230);
		MapPanel.setBackground(Color.black);
		
		
		
		
		TouristPanel.add(WhatsonPanel);
		TouristPanel.add(MapPanel);
		TouristPanel.add(ResterauntPanel);
		TouristPanel.add(HotelPanel);
		
		//End of TouristPanel
			
			
		//Student Panel
		
		
		
		
		StudentPanel.setBackground(Color.gray);
		StudentPanel.setLayout(null);
		
		AccomidationPanel.setBounds(455,250,420,350);
		AccomidationPanel.setBackground(Color.red);
		
		AccomidationLabel = new JLabel("Resteraunt");
		AccomidationPanel.add(AccomidationLabel);
        String[] AccomidationcolumnNames = {"Name", "Address", "Column 2", "Column 2"};
        DefaultTableModel Accomidationmodel = new DefaultTableModel(ApplicationDriver.HotelsTable, AccomidationcolumnNames);
        
        
        
        
        popupMenu = new JPopupMenu();
        Expand = new JMenuItem("Expand");
        CopyRowLink = new JMenuItem("Copy Link");
        
        Expand.addActionListener(new GUI());
        CopyRowLink.addActionListener(new GUI());
        
        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        
        
        // Create scrollable table
        Accomidationtable = new JTable(Accomidationmodel);
        TableColumn AccomidationcolumnToHide0 = Accomidationtable.getColumnModel().getColumn(0);
        TableColumn AccomidationcolumnToHide1 = Accomidationtable.getColumnModel().getColumn(2);
        TableColumn AccomidationcolumnToHide2 = Accomidationtable.getColumnModel().getColumn(3);

        AccomidationcolumnToHide0.setPreferredWidth(150);
        AccomidationcolumnToHide0.setMinWidth(150);
        AccomidationcolumnToHide0.setMaxWidth(150);
        AccomidationcolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer Accomidationdtcr = new DefaultTableCellRenderer();  
        Accomidationdtcr.setHorizontalAlignment(SwingConstants.CENTER);
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
        
        JScrollPane AccomidationscrollPane = new JScrollPane(Accomidationtable);
        
        
        AccomidationPanel.add(AccomidationscrollPane);

        AccomidationPanel.setBounds(455,250,420,350);

        ColUniPanel.setBounds(10,200,430,400);
		ColUniPanel.setBackground(Color.red);
		
		ColUniLabel = new JLabel("ColUni");
		ColUniLabel.setBounds(50,0, 100, 100);
		ColUniPanel.add(ColUniLabel);
		
		
		
        String[] ColUnicolumnNames = {"Name", "Column 1", "Column 2", "Column 3"};
        DefaultTableModel ColUnimodel = new DefaultTableModel(ApplicationDriver.HotelsTable, ColUnicolumnNames);
        // Create scrollable table
        
        
        
        popupMenu = new JPopupMenu();
        Expand = new JMenuItem("Expand");
        CopyRowLink = new JMenuItem("Copy Link");
        
        Expand.addActionListener(new GUI());
        CopyRowLink.addActionListener(new GUI());
        
        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        
        
        // Create scrollable table
        ColUnitable = new JTable(ColUnimodel);
        TableColumn ColUnicolumnToHide0 = ColUnitable.getColumnModel().getColumn(0);
        TableColumn ColUnicolumnToHide1 = ColUnitable.getColumnModel().getColumn(2);
        TableColumn ColUnicolumnToHide2 = ColUnitable.getColumnModel().getColumn(3);

        ColUnicolumnToHide0.setPreferredWidth(150);
        ColUnicolumnToHide0.setMinWidth(150);
        ColUnicolumnToHide0.setMaxWidth(150);
        ColUnicolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer ColUnidtcr = new DefaultTableCellRenderer();  
        ColUnidtcr.setHorizontalAlignment(SwingConstants.CENTER);
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
        
        
        
        
        
        
        JScrollPane ColUniscrollPane = new JScrollPane(ColUnitable);
        ColUniPanel.add(ColUniscrollPane);
		
        FinanceInfoPanel.setBounds(10,10,430,180);
        FinanceInfoPanel.setBackground(Color.yellow);
		
        LocationsPanel.setBounds(455,10,420,230);
        LocationsPanel.setBackground(Color.black);
		
		
		
		
		StudentPanel.add(FinanceInfoPanel);
		StudentPanel.add(ColUniPanel);
		StudentPanel.add(AccomidationPanel);
		StudentPanel.add(LocationsPanel);
		
		
		//End of Student Panel
			
		//Start of Job Panel
		
		
		
		
		

		JobPanel.setBackground(Color.gray);
		JobPanel.setLayout(null);
		
		JobPostingPanel.setBounds(235,10,300,590);
		JobPostingPanel.setBackground(Color.red);
		
		JobPostingLabel = new JLabel("Job Posting");
		JobPostingPanel.add(JobPostingLabel);
        String[] JobPostingcolumnNames = {"Name", "Address", "Column 2", "Column 2"};
        DefaultTableModel JobPostingmodel = new DefaultTableModel(ApplicationDriver.HotelsTable, JobPostingcolumnNames);
        
        
        
        
        popupMenu = new JPopupMenu();
        Expand = new JMenuItem("Expand");
        CopyRowLink = new JMenuItem("Copy Link");
        
        Expand.addActionListener(new GUI());
        CopyRowLink.addActionListener(new GUI());
        
        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        
        
        // Create scrollable table
        JobPostingtable = new JTable(JobPostingmodel);
        TableColumn JobPostingcolumnToHide0 = JobPostingtable.getColumnModel().getColumn(0);
        TableColumn JobPostingcolumnToHide1 = JobPostingtable.getColumnModel().getColumn(2);
        TableColumn JobPostingcolumnToHide2 = JobPostingtable.getColumnModel().getColumn(3);

        JobPostingcolumnToHide0.setPreferredWidth(150);
        JobPostingcolumnToHide0.setMinWidth(150);
        JobPostingcolumnToHide0.setMaxWidth(150);
        JobPostingcolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer JobPostingdtcr = new DefaultTableCellRenderer();  
        JobPostingdtcr.setHorizontalAlignment(SwingConstants.CENTER);
        JobPostingcolumnToHide0.setCellRenderer(JobPostingdtcr);

        
        JobPostingcolumnToHide1.setPreferredWidth(0);
        JobPostingcolumnToHide1.setMinWidth(0);
        JobPostingcolumnToHide1.setMaxWidth(0);
        JobPostingcolumnToHide1.setResizable(false);  // Prevent resizing
        
        JobPostingcolumnToHide2.setPreferredWidth(0);
        JobPostingcolumnToHide2.setMinWidth(0);
        JobPostingcolumnToHide2.setMaxWidth(0);
        JobPostingcolumnToHide2.setResizable(false);  // Prevent resizing
        
        
        JobPostingtable.setComponentPopupMenu(popupMenu);
        JobPostingtable.addMouseListener(new TableMouseListener(JobPostingtable));
        
        JScrollPane JobPostingscrollPane = new JScrollPane(JobPostingtable);
        
        
        JobPostingPanel.add(JobPostingscrollPane);


        ApprentishipsPanel.setBounds(545,10,330,325);
        ApprentishipsPanel.setBackground(Color.red);
		
        ApprentishipsLabel = new JLabel("Apprentiships");
        ApprentishipsLabel.setBounds(50,0, 100, 100);
        ApprentishipsPanel.add(ApprentishipsLabel);
		
		
		
        String[] ApprentishipscolumnNames = {"Name", "Column 1", "Column 2", "Column 3"};
        DefaultTableModel Apprentishipsmodel = new DefaultTableModel(ApplicationDriver.HotelsTable, ApprentishipscolumnNames);
        // Create scrollable table
        
        
        
        popupMenu = new JPopupMenu();
        Expand = new JMenuItem("Expand");
        CopyRowLink = new JMenuItem("Copy Link");
        
        Expand.addActionListener(new GUI());
        CopyRowLink.addActionListener(new GUI());
        
        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        
        
        // Create scrollable table
        Apprentishipstable = new JTable(Apprentishipsmodel);
        TableColumn ApprentishipscolumnToHide0 = Apprentishipstable.getColumnModel().getColumn(0);
        TableColumn ApprentishipscolumnToHide1 = Apprentishipstable.getColumnModel().getColumn(2);
        TableColumn ApprentishipscolumnToHide2 = Apprentishipstable.getColumnModel().getColumn(3);

        ApprentishipscolumnToHide0.setPreferredWidth(150);
        ApprentishipscolumnToHide0.setMinWidth(150);
        ApprentishipscolumnToHide0.setMaxWidth(150);
        ApprentishipscolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer Apprentishipsdtcr = new DefaultTableCellRenderer();  
        Apprentishipsdtcr.setHorizontalAlignment(SwingConstants.CENTER);
        ApprentishipscolumnToHide0.setCellRenderer(Apprentishipsdtcr);

        
        ApprentishipscolumnToHide1.setPreferredWidth(0);
        ApprentishipscolumnToHide1.setMinWidth(0);
        ApprentishipscolumnToHide1.setMaxWidth(0);
        ApprentishipscolumnToHide1.setResizable(false);  // Prevent resizing
        
        ApprentishipscolumnToHide2.setPreferredWidth(0);
        ApprentishipscolumnToHide2.setMinWidth(0);
        ApprentishipscolumnToHide2.setMaxWidth(0);
        ApprentishipscolumnToHide2.setResizable(false);  // Prevent resizing
        
        
        Apprentishipstable.setComponentPopupMenu(popupMenu);
        Apprentishipstable.addMouseListener(new TableMouseListener(Apprentishipstable));
        
        
        
        
        
        
        JScrollPane ApprentishipsscrollPane = new JScrollPane(Apprentishipstable);
        ApprentishipsPanel.add(ApprentishipsscrollPane);
        
        
        
        //Avaliable Industries
        
        IndustriesPanel.setBounds(545,340,335,260);
        IndustriesPanel.setBackground(Color.red);
		
        JLabel IndustriesLabel = new JLabel("Avaliable Indurstries");
        IndustriesLabel.setBounds(50,0, 100, 100);
        IndustriesPanel.add(IndustriesLabel);
		
        String[] IndustriescolumnNames = {"Industry"};
        DefaultTableModel Industriesmodel = new DefaultTableModel(ApplicationDriver.HotelsTable, IndustriescolumnNames);
        // Create scrollable table
        JTable Industriestable = new JTable(Industriesmodel);
 
        
        
        
        
        JScrollPane IndustriesscrollPane = new JScrollPane(Industriestable);
        IndustriesPanel.add(IndustriesscrollPane);
        
        
        
        
        
        
		
        JobSeekersPanel.setBounds(10,100,215,205);
        JobSeekersPanel.setBackground(Color.yellow);
		
        VolunteeringPanel.setBounds(10,315,215,200);
        VolunteeringPanel.setBackground(Color.black);
		
		
		
		
        JobPanel.add(JobPostingPanel);
        JobPanel.add(ApprentishipsPanel);
        JobPanel.add(JobSeekersPanel);
        JobPanel.add(VolunteeringPanel);
        JobPanel.add(IndustriesPanel);

		
		
		//End of Job Panel
		
		
		//Start of Business Panel
		
        
        
        
        

		BusinessPanel.setBackground(Color.gray);
		BusinessPanel.setLayout(null);
		UnitsPanel.setBounds(545,340,335,260);
		UnitsPanel.setBackground(Color.red);
		
		UnitsLabel = new JLabel("Rentable units");
		UnitsPanel.add(UnitsLabel);
        String[] UnitscolumnNames = {"Name", "Address", "Column 2", "Column 2"};
        DefaultTableModel Unitsmodel = new DefaultTableModel(ApplicationDriver.HotelsTable, UnitscolumnNames);
        
        
        
        
        popupMenu = new JPopupMenu();
        Expand = new JMenuItem("Expand");
        CopyRowLink = new JMenuItem("Copy Link");
        
        Expand.addActionListener(new GUI());
        CopyRowLink.addActionListener(new GUI());
        
        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        
        
        // Create scrollable table
        Unitstable = new JTable(Unitsmodel);
        TableColumn UnitscolumnToHide0 = Unitstable.getColumnModel().getColumn(0);
        TableColumn UnitscolumnToHide1 = Unitstable.getColumnModel().getColumn(2);
        TableColumn UnitscolumnToHide2 = Unitstable.getColumnModel().getColumn(3);

        UnitscolumnToHide0.setPreferredWidth(150);
        UnitscolumnToHide0.setMinWidth(150);
        UnitscolumnToHide0.setMaxWidth(150);
        UnitscolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer Unitsdtcr = new DefaultTableCellRenderer();  
        Unitsdtcr.setHorizontalAlignment(SwingConstants.CENTER);
        UnitscolumnToHide0.setCellRenderer(Unitsdtcr);

        
        UnitscolumnToHide1.setPreferredWidth(0);
        UnitscolumnToHide1.setMinWidth(0);
        UnitscolumnToHide1.setMaxWidth(0);
        UnitscolumnToHide1.setResizable(false);  // Prevent resizing
        
        UnitscolumnToHide2.setPreferredWidth(0);
        UnitscolumnToHide2.setMinWidth(0);
        UnitscolumnToHide2.setMaxWidth(0);
        UnitscolumnToHide2.setResizable(false);  // Prevent resizing
        
        
        Unitstable.setComponentPopupMenu(popupMenu);
        Unitstable.addMouseListener(new TableMouseListener(Unitstable));
        
        JScrollPane UnitsscrollPane = new JScrollPane(Unitstable);
        
        
        UnitsPanel.add(UnitsscrollPane);


        NewBuinessPanel.setBounds(545,10,330,325);
        NewBuinessPanel.setBackground(Color.red);
		
        NewBuinessLabel = new JLabel("New Businesses");
        NewBuinessLabel.setBounds(50,0, 100, 100);
        NewBuinessPanel.add(NewBuinessLabel);
		
		
		
        String[] NewBuinesscolumnNames = {"Name", "Column 1", "Column 2", "Column 3"};
        DefaultTableModel NewBuinessmodel = new DefaultTableModel(ApplicationDriver.HotelsTable, NewBuinesscolumnNames);
        // Create scrollable table
        
        
        
        popupMenu = new JPopupMenu();
        Expand = new JMenuItem("Expand");
        CopyRowLink = new JMenuItem("Copy Link");
        
        Expand.addActionListener(new GUI());
        CopyRowLink.addActionListener(new GUI());
        
        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        
        
        // Create scrollable table
        NewBuinesstable = new JTable(NewBuinessmodel);
        TableColumn NewBuinesscolumnToHide0 = NewBuinesstable.getColumnModel().getColumn(0);
        TableColumn NewBuinesscolumnToHide1 = NewBuinesstable.getColumnModel().getColumn(2);
        TableColumn NewBuinesscolumnToHide2 = NewBuinesstable.getColumnModel().getColumn(3);

        NewBuinesscolumnToHide0.setPreferredWidth(150);
        NewBuinesscolumnToHide0.setMinWidth(150);
        NewBuinesscolumnToHide0.setMaxWidth(150);
        NewBuinesscolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer NewBuinessdtcr = new DefaultTableCellRenderer();  
        NewBuinessdtcr.setHorizontalAlignment(SwingConstants.CENTER);
        NewBuinesscolumnToHide0.setCellRenderer(NewBuinessdtcr);

        
        NewBuinesscolumnToHide1.setPreferredWidth(0);
        NewBuinesscolumnToHide1.setMinWidth(0);
        NewBuinesscolumnToHide1.setMaxWidth(0);
        NewBuinesscolumnToHide1.setResizable(false);  // Prevent resizing
        
        NewBuinesscolumnToHide2.setPreferredWidth(0);
        NewBuinesscolumnToHide2.setMinWidth(0);
        NewBuinesscolumnToHide2.setMaxWidth(0);
        NewBuinesscolumnToHide2.setResizable(false);  // Prevent resizing
        
        NewBuinesstable.setComponentPopupMenu(popupMenu);
        NewBuinesstable.addMouseListener(new TableMouseListener(NewBuinesstable));

        JScrollPane NewBuinessscrollPane = new JScrollPane(NewBuinesstable);
        NewBuinessPanel.add(NewBuinessscrollPane);
        
        //News Panel
        

        BuinessNewsPanel.setBounds(235,10,300,590);
        BuinessNewsPanel.setBackground(Color.red);
		
        BuinessNewsLabel = new JLabel("Business News");
        BuinessNewsLabel.setBounds(50,0, 100, 100);
        BuinessNewsPanel.add(BuinessNewsLabel);
		
		
		
        String[] BuinessNewscolumnNames = {"Name", "Column 1", "Column 2", "Column 3"};
        DefaultTableModel BuinessNewsmodel = new DefaultTableModel(ApplicationDriver.HotelsTable, BuinessNewscolumnNames);
        // Create scrollable table
        
        
        
        popupMenu = new JPopupMenu();
        Expand = new JMenuItem("Expand");
        CopyRowLink = new JMenuItem("Copy Link");
        
        Expand.addActionListener(new GUI());
        CopyRowLink.addActionListener(new GUI());
        
        
        popupMenu.add(Expand);
        popupMenu.add(CopyRowLink);
        
        
        // Create scrollable table
        BuinessNewstable = new JTable(BuinessNewsmodel);
        TableColumn BuinessNewscolumnToHide0 = BuinessNewstable.getColumnModel().getColumn(0);
        TableColumn BuinessNewscolumnToHide1 = BuinessNewstable.getColumnModel().getColumn(2);
        TableColumn BuinessNewscolumnToHide2 = BuinessNewstable.getColumnModel().getColumn(3);

        BuinessNewscolumnToHide0.setPreferredWidth(150);
        BuinessNewscolumnToHide0.setMinWidth(150);
        BuinessNewscolumnToHide0.setMaxWidth(150);
        BuinessNewscolumnToHide0.setResizable(false);  // Prevent resizing
        DefaultTableCellRenderer BuinessNewsdtcr = new DefaultTableCellRenderer();  
        BuinessNewsdtcr.setHorizontalAlignment(SwingConstants.CENTER);
        BuinessNewscolumnToHide0.setCellRenderer(BuinessNewsdtcr);

        
        BuinessNewscolumnToHide1.setPreferredWidth(0);
        BuinessNewscolumnToHide1.setMinWidth(0);
        BuinessNewscolumnToHide1.setMaxWidth(0);
        BuinessNewscolumnToHide1.setResizable(false);  // Prevent resizing
        
        BuinessNewscolumnToHide2.setPreferredWidth(0);
        BuinessNewscolumnToHide2.setMinWidth(0);
        BuinessNewscolumnToHide2.setMaxWidth(0);
        BuinessNewscolumnToHide2.setResizable(false);  // Prevent resizing
        
        BuinessNewstable.setComponentPopupMenu(popupMenu);
        BuinessNewstable.addMouseListener(new TableMouseListener(BuinessNewstable));

        JScrollPane BuinessNewsscrollPane = new JScrollPane(BuinessNewstable);
        BuinessNewsPanel.add(BuinessNewsscrollPane);
        
        
        

        
        
        
        
        
        
		
        OpportunitiesPanel.setBounds(10,100,215,205);
        OpportunitiesPanel.setBackground(Color.yellow);
		
		
		
		
        BusinessPanel.add(NewBuinessPanel);
        BusinessPanel.add(UnitsPanel);
        BusinessPanel.add(OpportunitiesPanel);
        BusinessPanel.add(BuinessNewsPanel);

        
        
        
        
        
        
		
		//End of Business Panel
		
		
		
		MenuBar.add(Menu);
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



		

		frame.add(TouristPanel);

		frame.setJMenuBar(MenuBar);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public GUI() {
		
		
		
		
		
	}

	
	private void ChangeDetails() {
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 System.out.println(e.getActionCommand());
		
		LoggedIn = true; //temp
		if(!LoggedIn) { 
			
			
			if(e.getActionCommand() == "login") {
				String userName = UserNameText.getText();
				String Password = PasswordText.getText();
			
			
				
				try {
					 ApplicationDriver.UserResult = DBInstance.LoginVerification(userName, Password);
					 System.out.println(UserResult[0]);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
				if(ApplicationDriver.UserResult[0].equals("User Unverified")) {
					System.out.println("User is unverified");
					SuccessLabel.setText("Please Wait to be verified");
				}else if(ApplicationDriver.UserResult[0].equals("Wrong Username or Password")){
					//System.out.println("Wrong Username or Password!");
					SuccessLabel.setText("Wrong Username or Password!");
				}else if(ApplicationDriver.UserResult[0].equals("Success")){
					System.out.println("LogIn Success");
					SuccessLabel.setText("Temp Label Success");
					LoggedIn = true;
				}
				
			
			}
			
			if(e.getActionCommand() == "Back") { 
				frame.dispose();
				try {
					Login();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			
			if(e.getActionCommand() == "Register") { 

					System.out.println("Register");
					frame.dispose();
					try {
						Register();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			
			}
			
			if(e.getActionCommand() == "Register Account") { 

				
				System.out.println("Register Account");
				String RegUserName = RegisterPageUserNameText.getText();
				String RegFullName = RegisterPageFullNameText.getText();
				String RegPassword = RegisterPagePasswordText.getText();
				String RegRePassword = RegisterPageRePasswordText.getText();
				Pattern EmailPattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
				String RegEmail = RegisterPageEmaillText.getText();
				if(!EmailPattern.matcher(RegEmail).matches()) { //Regex checker for the email to ensure no spam
					RegisterSuccessLabel.setText("Enter a valid email");

					System.out.println("Email is incorrect");
					return;
				}
	
				
				String[] UserDetails = new String[4];
				UserDetails[0] = RegUserName;
				UserDetails[1] = RegFullName;
				UserDetails[2] = RegPassword;
				UserDetails[3] = RegEmail;

				

				if(RegPassword.equals(RegRePassword) && !RegPassword.isEmpty()) {
					if(!UserDetails[3].isEmpty() && !UserDetails[0].isEmpty()) {
						 try {
							 String Register = DBInstance.UserRegister(UserDetails);
							if(Register.equals("Register Succesfull")) {
								frame.dispose();
								Login();
								SuccessLabel.setText("Register Success");
								
								
							}else {
								System.out.println(Register);
								RegisterSuccessLabel.setText(Register);
								
							}
						} catch (SQLException | IOException e1) {
							e1.printStackTrace();
						}
						
						}else {
							RegisterSuccessLabel.setText("Do not leave boxes blank");
						}
					
				}else {
					RegisterSuccessLabel.setText("Passwords do not match");
				}
				
				
				
			}
		}else{
			

			JMenuItem Tablemenu = (JMenuItem) e.getSource();

			String TableMenuToString = Tablemenu.toString();
			String TableMenuText = TableMenuToString.substring(TableMenuToString.indexOf("text=")).replace("]", "").replace("text=", ""); //Accesses the "Text=" key in the JTableMenu array for the buttons text
			if(TableMenuText.equals("Expand")) {

				Expand(e);
				
			}else if(TableMenuText.equals("Copy Link")) {
				CopyLink(e);
				
			}
			
		}
		
		if(e.getActionCommand().equals("Quit")) {
	        System.exit(0); // Terminates the program

		}
		
		if(e.getActionCommand().equals("Tourist")) {
			System.out.println("Tourist print");
			
			
			frame.remove(StudentPanel);
			frame.add(TouristPanel);
			frame.remove(JobPanel);
			frame.remove(BusinessPanel);
			TouristPanel.setVisible(true);
			StudentPanel.setVisible(false);
			JobPanel.setVisible(false);
			BusinessPanel.setVisible(false);
			
			frame.revalidate();
			frame.repaint();
			
			
		}else if(e.getActionCommand().equals("Student")) {
			System.out.println("Student print");
			frame.remove(TouristPanel);
			frame.add(StudentPanel);
			frame.remove(JobPanel);
			frame.remove(BusinessPanel);


			TouristPanel.setVisible(false);
			StudentPanel.setVisible(true);
			JobPanel.setVisible(false);
			BusinessPanel.setVisible(false);
			frame.revalidate();
			frame.repaint();

			
		}else if(e.getActionCommand().equals("Job")) {
			System.out.println("Job print");
			
			frame.remove(TouristPanel);
			frame.remove(StudentPanel);
			frame.add(JobPanel);
			frame.remove(BusinessPanel);

			
			
			TouristPanel.setVisible(false);
			StudentPanel.setVisible(false);
			JobPanel.setVisible(true);
			BusinessPanel.setVisible(false);

			
		}else if(e.getActionCommand().equals("Business")) {
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
			
			
			frame.dispose();
			LoggedIn = false;
			try {
				Login();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			
		}
		
		
		
		}
	
	private void Expand(ActionEvent e) {
		JMenuItem menuItem = (JMenuItem) e.getSource();
	    JPopupMenu popupMenu = (JPopupMenu) menuItem.getParent();
	    JTable table = (JTable) popupMenu.getInvoker();  
    	int Row = table.getSelectedRow();
			
        // Retrieve data from the table
        String header = table.getModel().getValueAt(Row, 0).toString();  // Assuming header is in column 0
        String address = table.getModel().getValueAt(Row, 1).toString();  // Assuming address is in column 1
        String mainText = table.getModel().getValueAt(Row, 2).toString(); // Assuming main text is in column 2

        // Create the new window
        JFrame detailsFrame = new JFrame();
        	

        detailsFrame.setTitle(header);
        detailsFrame.setLayout(new BorderLayout());

        // Create header label
        JLabel headerLabel = new JLabel(header, JLabel.CENTER);
        detailsFrame.add(headerLabel, BorderLayout.NORTH);



        // Create main text area with scrolling
        JTextArea mainTextArea = new JTextArea(mainText);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(mainTextArea);
        detailsFrame.add(scrollPane, BorderLayout.CENTER);

        // Create Address label
        JLabel addressLabel = new JLabel("Email: " + address, JLabel.CENTER);
        detailsFrame.add(addressLabel, BorderLayout.SOUTH);

        // Center the frame
        detailsFrame.setSize(400,300);
        detailsFrame.setLocationRelativeTo(null);  // Center relative to screen
        detailsFrame.setVisible(true);
			
		}

	private void CopyLink(ActionEvent e) {
			JMenuItem menuItem = (JMenuItem) e.getSource();
		    JPopupMenu popupMenu = (JPopupMenu) menuItem.getParent();
		    JTable table = (JTable) popupMenu.getInvoker();  
        	int Row = table.getSelectedRow();
			String Website = table.getModel().getValueAt(Row, 3).toString();

		    StringSelection selection = new StringSelection(Website);
		    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		    clipboard.setContents(selection, selection); //copy website or email link
			
			JOptionPane.showMessageDialog(frame,
					Website + " Has been copied");
			
			
			
			
		}

	}

