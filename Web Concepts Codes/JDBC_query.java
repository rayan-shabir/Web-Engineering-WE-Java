import java.sql.*;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class JDBC_query{

    public static void main(String[] args) throws Exception 
    {

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1/employee";
        Connection con = DriverManager.getConnection(url, "root", "root");
        
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE ,ResultSet.CONCUR_UPDATABLE);

        Scanner inp = new Scanner(System.in);

        String query = "Select * from myemployee1 ";

        ResultSet rs = st.executeQuery(query);

        rs.next();
        rs.next();


        System.out.println(rs.getString("id") + rs.getString("name"));

        rs.updateString("name", "Shahmeer");
        // rs.updateRow();

        System.out.println(rs.getString("id") + rs.getString("name"));

    }

}