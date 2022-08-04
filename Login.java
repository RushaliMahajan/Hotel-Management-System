
package hkmng;

//Used for text colors
import java.awt.*;

//used for GUI/Swing concepts
import javax.swing.*;
import java.awt.event.*;

//sql queries
import java.sql.*; 


public class Login extends JFrame implements ActionListener{

    //Always create these as global variables
    JLabel l1,l2;
    JButton b1,b2;
    JTextField t1;
    JPasswordField t2;
    public Login()  {
        
        //Working is always done inside a constructor
        
        setBounds(500,300,600,400);
        
        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        add(l1);
        
        t1 = new JTextField();
        t1.setBounds(150,22,200,30);
        add(t1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        add(l2);
        
        t2 = new JPasswordField(); //to hide the entered input
        t2.setBounds(150,72,200,30);
        add(t2);
    
        b1 = new JButton("Login");
        b1.setBounds(40,160,120,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBounds(200,160,120,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hkmng/icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);//to change the size of the image 
        ImageIcon i3 = new ImageIcon(i2);//created bcs only image icon can be put on labels 
        JLabel l3 = new JLabel(i3);
        l3.setBounds(360,20,200,200);
        add(l3);
        
        
        setLayout(null);
        setVisible(true);
         
    }
    
    
    //writing the defination of this function bcs interface
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            
            String username = t1.getText();
            String password = t2.getText();
            Conn c = new Conn(); //obj of Conn class bcs we need to use statment obj for sql query
            
            String str = "SELECT * FROM loginAdmin WHERE username = '"+username+"' and password = '"+password+"' ";
            //always try catch block when dealing with external files
            try {
              
                //this ResultSet is a class from java.sql to store the result after sql query is performed
               ResultSet rs = c.s.executeQuery(str);
               
               if(rs.next()){
                   
                    new Dashboard().setVisible(true);//first page is made visible
                    this.setVisible(false);//login page is made invisible
                    
               }else{
                  JOptionPane.showMessageDialog(null,"Invalid Username or Password");//pop up message
                  this.setVisible(false);
               }
            } catch (Exception e) {
            }
            
        }else if(ae.getSource()==b2){
            System.exit(0); //exit program
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
    
    
}
