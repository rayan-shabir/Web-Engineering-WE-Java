// import java.lang.Thread.State;
import java.sql.*;
import java.util.*;

public class JDBC_Selection_simple_Statement {
    public static void main(String args[]) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost/class_test";

        Connection con = DriverManager.getConnection(url, "root", "root");

        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String u_name = inp.nextLine();

        String query = "select * from info where username = '" + u_name + "' ";

        ResultSet rs = st.executeQuery(query);

        rs.next();
        rs.previous();
        
        if(rs.next()) {
            String name = rs.getString("username");
            String adress = rs.getString("address");
            //String city = rs.getString(3);

            System.out.println("Name: " + name + "\tAdress: " + adress);
        } else {
            System.out.println("No record found...");
        }
    }
}
