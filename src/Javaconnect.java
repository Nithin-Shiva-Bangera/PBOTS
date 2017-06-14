/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nithin S Bangera
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Javaconnect 
{ 
    Connection conn;
    
    public static Connection ConnecrDb()
    {
    try
    {
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:/home/neo/NetBeansProjects/lm/LibraryMS.sqlite");
        return conn;
    }catch(ClassNotFoundException | SQLException e)
    {
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
}
}
