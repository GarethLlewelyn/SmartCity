package smartCity;



import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.*;



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
	
	
	public GUI() {
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
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
				String RegEmail = RegisterPageEmaillText.getText();
				
	
				
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
		}
		
		
		
		}
	}

