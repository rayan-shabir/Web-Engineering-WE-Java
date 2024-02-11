// import java.beans.Statement;
// import java.beans.*;
import java.sql.*;
import java.util.*;

class JDBC_Insertion_simple_Statement {
    public static void main(String args[]) throws Exception
    {
        // load Driver
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/class_test";
        // create Connection
        Connection con = DriverManager.getConnection(url, "root", "root");
        // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
        
        // creating statement object
        Statement st = con.createStatement();

        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter your Name: ");
        String u_name = inp.nextLine();

        System.out.println("Enter your Password: ");
        String pass = inp.nextLine();

        System.out.println("Enter your Adress: ");
        String adress = inp.nextLine();

        System.out.println("Enter your City: ");
        String city = inp.nextLine();

        System.out.println("Enter your Phone: ");
        double phone = inp.nextDouble();


        String query = "insert into info(username, password, address, city, phone) values('" + u_name + "', '" + pass + "', '" + adress + "', '" + city + "' , " + phone + ")";

        System.out.println("\n" + query);
        // write query
        int rs = st.executeUpdate(query);

        System.out.println(rs);

        if(rs > 0) System.out.println("\nRecord Inserted Successfully");
        else System.out.println("\nNo record Inserted.");
    }
}
