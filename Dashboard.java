package hkmng;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
//Database name is project
//admin table is loginAdmin

public class Dashboard extends JFrame {

    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4;
    
    Dashboard(){
        
        mb = new JMenuBar();
        add(mb);
        
        m1 = new JMenu("HOTEL MANAGEMENT");
        m1.setForeground(Color.RED);
        mb.add(m1);
        
        m2 = new JMenu("ADMIN");
        m2.setForeground(Color.BLUE);
        mb.add(m2);
        
        i1 = new JMenuItem("RECEPTION");
        m1.add(i1);
        
        i2 = new JMenuItem("ADD EMPLOYEE");
        m2.add(i2);
        
        i3 = new JMenuItem("ADD ADMIN/STAFF");
        m2.add(i3);
        
        i4 = new JMenuItem("ADD DRIVER");
        m2.add(i4);
        
        mb.setBounds(0,0,1500,40);
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("HkMng/icons/Dashboard.jpg"));
        JLabel l = new JLabel(i);
        l.setBounds(0,0,1500,900);
        add(l);
        
        JLabel l2 = new JLabel("THE MAHAJAN HOTEL WELCOMES YOU");
        l2.setBounds(300,100,1000,50);
        l2.setForeground( Color.BLACK);
        l2.setFont(new Font("Tohoma",Font.PLAIN,50) {
        });
        l.add(l2);
        
        setLayout(null);
        setBounds(20,0,1500,900);
        setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        new Dashboard().setVisible(true);
        
    }
    
}
