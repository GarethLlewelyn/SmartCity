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
	private static JMenuItem Quit, ChangeDetails, Tourist, Student, Job, Buisness, LogOut;
	
	private static JPanel TouristPanel = new JPanel(); //initialising Smart City page Variables

	private static JLabel ExpandTitleLabel;
	private static JLabel ExpandAddressLabel;
	private static JLabel ExpandDescriptionLabel;
	private static JLabel ExpandEmailLabel;


	
	
	private static JPanel HotelPanel = new JPanel(); 
	private static JPanel ResterauntPanel = new JPanel();
	private static JPanel WhatsonPanel = new JPanel();
	private static JPanel MapPanel = new JPanel();
	
	private static JLabel HotelLabel; 
	private static JLabel ResterauntLabel;
	
    private static JPopupMenu HotelpopupMenu;
    private static JMenuItem HotelExpand;
    private static JMenuItem CopyRowLink;
    private static JTable Hoteltable;
	//private static JLabel JobPanel = new JPanel();
	//private static JLabel BuisnessPanel = new JPanel();
    private static JPopupMenu ResterauntpopupMenu;
    private static JMenuItem ResterauntExpand;
    private static JMenuItem ResterauntCopyRowLink;

	
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

		frame = new JFrame();
		frame.setSize(900,670);	
		frame.setBackground(Color.LIGHT_GRAY);
		
		Menu = new JMenu("Menu"); //Set Menu navigation items
		Navigate = new JMenu("Navigate");
		Profile = new JMenu("Profile");
		
		Tourist = new JMenuItem("Tourist"); //Set Menu Items
		Student = new JMenuItem("Student");
		Job = new JMenuItem("Job");
		Buisness = new JMenuItem("Buisness");
		Quit = new JMenuItem("Quit");
		ChangeDetails = new JMenuItem("Change Details");
		LogOut = new JMenuItem("Log Out");
		


		TouristPanel.setBackground(Color.gray);
		TouristPanel.setLayout(null);
		
		HotelPanel.setBounds(455,250,420,350);
		HotelPanel.setBackground(Color.red);
		
		HotelLabel = new JLabel("Hotels");
		HotelPanel.add(HotelLabel);
        String[] HotelcolumnNames = {"Name", "Address", "Column 2", "Column 2"};
        DefaultTableModel Hotelmodel = new DefaultTableModel(ApplicationDriver.HotelsTable, HotelcolumnNames);
        
        
        
        
        HotelpopupMenu = new JPopupMenu();
        HotelExpand = new JMenuItem("Expand");
        CopyRowLink = new JMenuItem("Copy Link");
        
        HotelExpand.addActionListener(new GUI());
        CopyRowLink.addActionListener(new GUI());
        
        
        HotelpopupMenu.add(HotelExpand);
        HotelpopupMenu.add(CopyRowLink);
        
        
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
        
        
        Hoteltable.setComponentPopupMenu(HotelpopupMenu);
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
        
        
        
        ResterauntpopupMenu = new JPopupMenu();
        ResterauntExpand = new JMenuItem("Expand");
        ResterauntCopyRowLink = new JMenuItem("Copy Link");
        
        ResterauntExpand.addActionListener(new GUI());
        ResterauntCopyRowLink.addActionListener(new GUI());
        
        
        ResterauntpopupMenu.add(ResterauntExpand);
        ResterauntpopupMenu.add(ResterauntCopyRowLink);
        
        
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
        
        
        Resteraunttable.setComponentPopupMenu(ResterauntpopupMenu);
        Resteraunttable.addMouseListener(new TableMouseListener(Resteraunttable));
        
        
        
        
        
        
        JScrollPane ResterauntscrollPane = new JScrollPane(Resteraunttable);
        ResterauntPanel.add(ResterauntscrollPane);
		
		WhatsonPanel.setBounds(10,10,430,180);
		WhatsonPanel.setBackground(Color.yellow);
		
		MapPanel.setBounds(455,10,420,230);
		MapPanel.setBackground(Color.black);
		
		
		
		
		
		
		
		
		
		
		
		
		MenuBar.add(Menu);
		MenuBar.add(Navigate);
		MenuBar.add(Box.createHorizontalGlue()); //Ensures Profile menu item is at the right side
		MenuBar.add(Profile);
		Menu.add(Quit);
		Navigate.add(Tourist);
		Navigate.add(Student);
		Navigate.add(Job);
		Navigate.add(Buisness);
		Profile.add(ChangeDetails);
		Profile.add(LogOut);
		
		
		
		
		
		
		
		Tourist.addActionListener(null);
		Student.addActionListener(null);
		Job.addActionListener(null);
		Buisness.addActionListener(null);
		
		frame.setJMenuBar(MenuBar);
		
		frame.add(WhatsonPanel);
		frame.add(MapPanel);
		frame.add(ResterauntPanel);
		frame.add(HotelPanel);
		frame.add(TouristPanel);
		
		

		//TouristPanel.setBackground(Color.red);
		//StudentPanel.setBackground(Color.red);
		//JobPanel.setBackground(Color.red);
		//BuisnessPanel.setBackground(Color.red);

		;
		//TouristPanel.setLayout(null);
		//StudentPanel.setLayout(null);
		//JobPanel.setLayout(null);
		//BuisnessPanel.setLayout(null);

		
		
		
		
		
		//frame.add(TouristPanel);
		//frame.add(StudentPanel);
		//frame.add(JobPanel);
		//frame.add(BuisnessPanel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public GUI() {
		
		
		
		
		
	}

	
	private void ExpandGUI() {
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
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

