import java.sql.*;
import java.util.*;

public class JDBC_Selection_PreparedStatement_backward_move {
    public static void main(String args[]) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1/class_test";
        Connection con = DriverManager.getConnection(url, "root", "root");

        PreparedStatement pst = con.prepareStatement("Select * from info", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        ResultSet rs = pst.executeQuery();

        rs.next();
        System.out.println("\nMoving cursor Forward\n");
        String name = rs.getString("username");
        System.out.println("Username: " + name);

        rs.next();
        rs.next();

        rs.previous();
        System.out.println("\nMoving cursor Backward\n");
        name = rs.getString("username");
        System.out.println("Username: " + name);


        

        rs.absolute(3);
        System.out.println("\nMoving cursor on Third Line\n");
        name = rs.getString("username");
        System.out.println("Username: " + name);



        rs.updateString("city", "Karachi");
        rs.updateString(3, "Pucit");
        rs.updateRow();

        System.out.println("\nAfter Updation \n");
        String adr = rs.getString(3);
        System.out.println("Address is: " + adr);
    }
}
