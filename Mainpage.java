
import java.awt.*;
import javax.swing.*;

public class Mainpage extends JFrame{
	JPanel panel1,panel2,panel3;
	JTextField text1,text2,text3,text4,text5;
	JLabel lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10;
	JButton addbt,updatebt,deletebt;
	//ImageIcon ip3;
	Mainpage(){
		//image
		//ip3=new ImageIcon(this.getClass().getResource("file:///C:/Users/frealem/eclipse-workspace/frew/src/abstract-grunge-decorative-relief-navy-blue-stucco-wall-texture-wide-angle-rough-colored-background_1258-28311.jpg"));
		//panels
		panel1=new JPanel();
		panel2=new JPanel();
		panel1.setBounds(10,50 ,800, 600);
		panel2.setBounds(10, 650,800, 300);
		panel1.setBackground(Color.black);
		panel2.setBackground(Color.PINK);
		//label1 with text-field
		lab1=new JLabel("FirstName"); 
		lab1.setBounds(20, 70, 200, 60);
		lab1.setBackground(Color.pink);
		lab1.setFont(new Font("",Font.BOLD,20)); 
		lab1.setForeground(Color.pink);
		
		text1=new JTextField();  
		text1.setBounds(250, 70, 500,60);
		text1.setBackground(Color.pink);
		text1.setForeground(Color.black);
		text1.setFont(new Font("",Font.BOLD,20));
		
		//label2
		lab2=new JLabel("LastName"); 
		lab2.setBounds(20, 155, 200, 60);
		lab2.setForeground(Color.pink);
		lab2.setFont(new Font("",Font.BOLD,20));
		
		text2=new JTextField();  
		text2.setBounds(250, 155, 500,60);
		text2.setBackground(Color.pink);
		text2.setForeground(Color.black);
		text2.setFont(new Font("",Font.BOLD,20));
		
		//label3
		lab3=new JLabel("PARTNER"); 
		lab3.setBounds(20, 240, 200, 60);
		lab3.setForeground(Color.pink);
		lab3.setFont(new Font("",Font.BOLD,20));
		
		text3=new JTextField();  
		text3.setBounds(250, 240, 500,60);
		text3.setBackground(Color.pink);
		text3.setForeground(Color.black);
		text3.setFont(new Font("",Font.BOLD,20));
		
		//label4
		lab4=new JLabel("ID"); 
		lab4.setBounds(20, 325, 200, 60);
		lab4.setForeground(Color.pink);
		lab4.setFont(new Font("",Font.BOLD,20));
		
		text4=new JTextField();  
		text4.setBounds(250, 325, 500,60);
		text4.setBackground(Color.pink);
		text4.setFont(new Font("",Font.BOLD,20));
		text4.setForeground(Color.black);
		//label5
		lab5=new JLabel("No_Family"); 
		lab5.setBounds(20, 400, 200, 60);
		lab5.setFont(new Font("",Font.BOLD,20));
		lab5.setForeground(Color.pink);
		
		text5=new JTextField();  
		text5.setBounds(250, 400, 500,60);
		text5.setBackground(Color.pink);
		text5.setFont(new Font("",Font.BOLD,20));
		text5.setForeground(Color.black);
		//panel2 with its button
		addbt=new JButton("REGISTER");
		addbt.setBounds(20, 700, 150,60);
		addbt.setBackground(Color.black);
		addbt.setForeground(Color.pink);
        addbt.setFont(new Font("",Font.BOLD,20));
		
		updatebt=new JButton("EDIT");
		updatebt.setBounds(180, 700, 150,60);
		updatebt.setBackground(Color.black);
		updatebt.setForeground(Color.pink);
		updatebt.setFont(new Font("",Font.BOLD,20));
		
		deletebt=new JButton("CLEAR");
		deletebt.setBounds(340, 700, 150,60);
		deletebt.setBackground(Color.black);
		deletebt.setForeground(Color.pink);
		deletebt.setFont(new Font("",Font.BOLD,20));
		//panel3 database part
		panel3=new JPanel();
		panel3.setBounds(815, 50, 1800, 900);
		panel3.setBackground(Color.BLACK);
		
		//label in panel3 
		lab6=new JLabel("ID");
		lab6.setBounds(830, 70, 180, 100);
		lab6.setBackground(Color.black);
		lab6.setForeground(Color.pink);
		lab6.setFont(new Font("",Font.BOLD,20));
		
		lab7=new JLabel("FirstName");
		lab7.setBounds(1010, 70, 250, 100);
		lab7.setBackground(Color.black);
		lab7.setForeground(Color.pink);
		lab7.setFont(new Font("",Font.BOLD,20));
		
		lab8=new JLabel("LastName");
		lab8.setBounds(1260, 60, 250, 100);
		lab8.setBackground(Color.black);
		lab8.setForeground(Color.pink);
		lab8.setFont(new Font("",Font.BOLD,20));
		
		lab9=new JLabel("PARTNER");
		lab9.setBounds(1510, 70, 250, 100);
		lab9.setBackground(Color.black);
		lab9.setForeground(Color.pink);
		lab9.setFont(new Font("",Font.BOLD,20));
		
		lab10=new JLabel("No_Family");
		lab10.setBounds(1760, 70, 250, 100);
		lab10.setBackground(Color.black);
		lab10.setForeground(Color.pink);
		lab10.setFont(new Font("",Font.BOLD,20));
		
		
		//add	
		this.add(lab6);
		this.add(lab7);
		this.add(lab8);
		this.add(lab9);
		this.add(lab10);
		this.add(lab1);
		this.add(text1);
		this.add(lab2);
		this.add(text2);
		this.add(lab3);
		this.add(text3);
		this.add(lab4);
		this.add(text4);
		this.add(lab5);
		this.add(text5);
		//add button
		this.add(addbt);
		this.add(updatebt);
		this.add(deletebt);
 this.add(panel1);
this.add(panel2);
this.add(panel3);


        this.setResizable(true);     
        this.setTitle("CSD EDIR ROSTER");
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1024, 800);
		this.setVisible(true);
	}

	

	public static void main(String[] args) {
		new Mainpage();
	}

}

