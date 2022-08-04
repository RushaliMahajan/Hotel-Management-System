
package hkmng;

import javax.swing.*; //For GUI
import java.awt.*;  //For text colors
import java.awt.event.*;// For ActionsListener

public class HkMng extends JFrame implements ActionListener {

    public HkMng() {
        
        
        setSize(1500,700);
        setLocation(10,30);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HkMng/icons/first.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1550,700); //x asis, y axis, width, height
        add(l1);
        
        setLayout(null);
        setVisible(true);
        
        
        JLabel l2 = new JLabel("Housekeeping Manangement System");
        l2.setBounds(0,550,1150,70);
        l1.add(l2);
        
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif",Font.BOLD,70) {
        });
        
        JButton b1 = new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setBounds(1300,570,150,50);
        b1.addActionListener(this);
        l1.add(b1);
    }

    //since it was an interface, so we need to write the definition of this fumction
    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true); //login constructor is called and made visible
        this.setVisible(false); //to make this front page contents not visible after click
    }
    
   
    public static void main(String[] args) {
       
        new HkMng();
        
    }
    
}
