import java.util.*;

public class Finalize_and_static_variable {
    public static int count;        // All the objects share 1 copy of static variable.

    Finalize_and_static_variable() {
        System.out.println("\n***Creating Object...***\n");

        count++;
    }


    // overriden object class function finalize()
    public void finalize() {
        System.out.println("\n***Deleting Object...***\n");

        count --;
    }

    public void display() {
        System.out.println("\nTotal No. of Object exists: " + count + "\n");
    }

    public static void main(String args[]) {
        Finalize_and_static_variable arr[] = new Finalize_and_static_variable[10];

        Scanner in = new Scanner(System.in);
        int choice = 1;
        int cnt = 0;

        while (choice != 0) {
            System.out.println("*** Possible Course of Action ***");
            System.out.println("\n1. To Create Object. \n2. To Destroy Object. \n3.To display Count of Object. \nTo 'QUIT' press 0.");

            System.out.println("\nEnter your choice ...");
            choice = in.nextInt();

            switch(choice) {

                case 1:
                    Finalize_and_static_variable obj1 = new Finalize_and_static_variable();
                    arr[cnt++] = obj1;
                    break;

                case 2:
                    if (cnt != 0)
                        arr[cnt-1].finalize();
                    else 
                        System.out.println("No Object exists to destroy!...");

                    break;
                case 3:
                    arr[cnt-1].display();

                    break;

                default:
                    if (choice != 0) System.out.println("\nInvalid Input...");
                    else System.out.println("\nYou are Quiting. Thnakyou.");
            }

            if (cnt == 10) break;
        }
            
        in.close();
    }

}
