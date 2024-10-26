package bfcai_studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConnectionDatabase {
    static Connection con = null;
    public static Connection connect;

    public static Connection connect() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://DB.accdb");
            //JOptionPane.showMessageDialog(null, "تم الاتصال");
        } catch (Exception ex) {
            ex.printStackTrace(); // Logging full stack trace
            JOptionPane.showMessageDialog(null, "Failed to connect to the database: " + ex.getMessage());
        }
        return con;
    }

    public static void main(String[] args) {
        con = connect();
    }
}
