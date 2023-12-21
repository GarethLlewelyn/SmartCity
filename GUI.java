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
			
			frame.setVisible(true);

			
			
		}
		
		
		
		return logged;
	}
	
	
	
	
	
	
	public GUI() {
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(!LoggedIn) { 
			
			
			if(e.getActionCommand() == "login") { //If the button pressed is login then run the following
				String userName = UserNameText.getText();
				String Password = PasswordText.getText();
				//System.out.println(userName);
			
			
				
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
					System.out.println("User is unverified");
					SuccessLabel.setText("Wrong Username or Password!");
				}else if(ApplicationDriver.UserResult[0].equals("Success")){
					System.out.println("LogIn Success");
					SuccessLabel.setText("Temp Label Success");
				}
				
			
			}
			

			
			
		}
		
		
		
		}
	}

