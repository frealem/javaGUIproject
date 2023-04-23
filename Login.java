package frew;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
//import java.sql.*;
class Login extends JFrame implements ActionListener{
   public ImageIcon icon;
   public JTextField text1,text2;
   public JLabel label1,label2,label,labg;
    public JButton button;
   // Connection con=null;
    GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice device = graphics.getDefaultScreenDevice();
    
   public Login(){
button=new JButton("Login");
text1=new JTextField("");
text2=new JPasswordField("");
label1=new JLabel("Email");
label2=new JLabel("password");
label=new JLabel("CSD EDIR SYSTEM");

label.setHorizontalTextPosition(JLabel.CENTER);
label.setVerticalTextPosition(JLabel.TOP);
label.setForeground(Color.cyan);
label1.setForeground(Color.cyan);
label2.setForeground(Color.cyan);
text1.setBackground(Color.black);
text2.setBackground(Color.black);
text1.setForeground(Color.cyan);
text2.setForeground(Color.cyan);
      button.setBackground(Color.cyan);
      button.setForeground(Color.black);
      button.setBounds(400, 500, 100, 30);
label.setFont(new Font("",Font.BOLD,38));
label1.setFont(new Font("",Font.BOLD,18));
label2.setFont(new Font("",Font.BOLD,18));
label1.setBounds(50, 250, 200, 60);
label2.setBounds(50, 340, 200,60);
label.setBounds(100, 10, 600, 300);
text1.setBounds(200, 250, 600, 60);
text2.setBounds(200, 340, 600, 60);
text1.setFont(new Font("",Font.BOLD,18));
text2.setFont(new Font("",Font.BOLD,18));
      
        icon=new ImageIcon(this.getClass().getResource("big.jpg"));
        labg=new JLabel(icon);
        labg.setBounds(600, 0, 2000, 1900);
        
        button.addActionListener(this);
        this.add(labg);
        this.add(label1);
        this.add(text1);
        this.add(label2);
        this.add(text2);
        this.add(label);
        this.add(button);
        this.setLayout(null);
        this.setTitle("CSD EDIR");
        this.setResizable(false);
        device.setFullScreenWindow(this);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.getContentPane().setBackground(Color.black);
        
    }
  
    public void actionPerformed (ActionEvent e){
     if(e.getSource()==button) {
    	/*try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?user=root,password=66782412");
    		 String userName=text1.getText();
    		 String password=text2.getText();
    		 
    		 Statement stm=con.createStatement();
    		 String sql=("select * from login where userName='"+userName+"' and password='"+password+"'");
    	ResultSet rs=stm.executeQuery(sql);
    	if(rs.next()) {
    	dispose();
    	welcome wl=new welcome();
    	wl.show();
    	}
    	else {
    		JOptionPane.showMessageDialog(this,"check your password or username!");
    		text1.setText("");
    		text2.setText("");
    	}
    	
    	} 
    	
    	catch (Exception e1 ) {
		
    		JOptionPane.showInternalMessageDialog(null, e1);
		}
    	
    	}
    	*/
    	 welcome w=new welcome();}

    public static void main(String[] args) {
        Login lg=new Login();
        
    }
}