import java.sql.*;
import java.util.*;

public class JDBC_Selection_PreparedStatement_forward_move {
    public static void main(String args[]) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1/class_test";
        Connection con = DriverManager.getConnection(url, "root", "root");

        PreparedStatement pst = con.prepareStatement("Select * from info where username = ?");

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter name to search: ");
        String u_name = inp.nextLine();

        pst.setString(1, u_name);

        ResultSet rs = pst.executeQuery();

        ResultSetMetaData rsmd = rs.getMetaData();

        int numColumns = rsmd.getColumnCount();
        System.out.println("Number of Columns: " + numColumns);

        
        String cName;
        for(int i = 1; i <= numColumns; i++) {
            cName = rsmd.getColumnName(i);
            System.out.print(cName);
            System.out.print("\t \t");
        }

        System.out.println("");

        while(rs.next()) {
            System.out.print(rs.getString(1));
            System.out.print("\t \t \t");

            System.out.print(rs.getString(2));
            System.out.print("\t \t \t");

            System.out.print(rs.getString(3));
            System.out.print("\t");

            System.out.print(rs.getString(4));
            System.out.print("\t");

            System.out.print(rs.getInt(5));
            System.out.print("\t \t");
        }
    }
}
