import java.util.*;
import java.sql.*;

class AddressBook {
    public Connection con;
    public Statement st;

    public AddressBook() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/addressbook", "root", "root");
            st = con.createStatement();

        } catch (SQLException ex) {
            System.out.println("Exception at connection");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public void addPerson() throws Exception {
        System.out.println("\n*** INSERT *** \n");

		Scanner inp = new Scanner(System.in);

		System.out.println("Enter username: ");
		String name = inp.nextLine();

        System.out.println("Enter address: ");
		String addr = inp.nextLine();

		System.out.println("Enter city: ");
		String city = inp.nextLine();

		System.out.println("Enter phone: ");
		double phone = inp.nextDouble();

		String query = "INSERT INTO info (username, address, city, phone) VALUES ('" + name + "', '" + addr + "', '" + city + "', " + phone + ")";

        int rs = st.executeUpdate(query);

        if (rs > 0) {
            System.out.println("One record inserted");
        } else {
            System.out.println("No record inserted");

        }
	}

    public void searchPerson(String name) throws Exception {
        System.out.println("\n*** SELECT *** \n");

		String query = "SELECT * FROM info where username = '" + name + "'";

        ResultSet rs = st.executeQuery(query);

        if (rs.next()) {
            System.out.println("Name: " + rs.getString("username"));
            System.out.println("Address: " + rs.getString("address"));
            System.out.println("City: " + rs.getString("city"));
            System.out.println("Phone: " + rs.getInt("phone"));
        } else {
            System.out.println("No record exist for this select query (name)");

        }
	}

    public void deletePerson(String name) throws Exception {
        System.out.println("\n*** DELETE *** \n");

		String query = "DELETE FROM info where username = '" + name + "'";

        int rs = st.executeUpdate(query);

        if (rs > 0) {
            System.out.println("One record deleted");
        } else {
            System.out.println("No record deleted");

        }
	}
}

// DRIVER CLASS
public class Driver {
    public static void main(String[] args) throws Exception{
        AddressBook ab = new AddressBook();
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.println("*** Menue ***");
            System.out.println("1. Add a person to address book.");
            System.out.println("2. Delete a person from addressbook.");
            System.out.println("3. Search for a person.");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = inp.nextInt();

            inp.nextLine();

            switch (choice) {
                case 1:
                    // System.out.print("Enter name: ");
                    // String name = scanner.nextLine();
                    // System.out.print("Enter address: ");
                    // String address = scanner.nextLine();
                    // System.out.print("Enter city: ");
                    // String city = scanner.nextLine();
                    // System.out.print("Enter phone number: ");
                    // String phone = scanner.nextLine();

                    ab.addPerson();
                    break;

                case 2:
                    System.out.print("Enter name to delete: ");
                    String delName = inp.nextLine();

                    ab.deletePerson(delName);
                    break;
                case 3:

                    System.out.print("Enter name to search: ");
                    String searchName = inp.nextLine();

                    ab.searchPerson(searchName);

                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println();
        }
    }
}
