
package hkmng;

import java.sql.*;

public class Conn {
    
    Connection c; //create a connection object
    Statement s; //create a statement object

    public Conn() {
        
     
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver"); //load the driver
            c = DriverManager.getConnection("jdbc:mysql:///project","root","Rushali08041971");
            s=c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
}
