import java.util.*;

class NegativeArraySizeException extends Exception {

}

class IndexOccupiedException extends Exception {

}

class nonPositiveException extends Exception {

}

class Health {
    String name;
    double weight;
    double height;
    double BMI;

    public Health() {
        name = null;
        weight = 0.0;
        height = 0.0;
        BMI = 0.0;
    }

    public Health(String n, double w, double h) {
        name = n;
        weight = w;
        height = h;
        BMI = (weight / height);
    }

}

public class LAB_07_Prac {
    public Health arr;

    public void Save() throws nonPositiveException{
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String n = inp.nextLine();

        System.out.println("Enter Weight: ");
        double w = inp.nextDouble();

        System.out.println("Enter Height: ");
        double h = inp.nextDouble();

        if (w < 0 || h < 0)
            throw new nonPositiveException();

        System.out.println("Enter Index of array:");
        int i = inp.nextInt();

        Health h_obj = arr[i];

        try {
            if (h_obj.name == null && h_obj.weight == 0.0 && h_obj.height == 0.0) {
                Health obj = new Health(n, w, h);
                arr[i] = obj;
            } else {
                throw new IndexOccupiedException();
            }
        } catch (IndexOccupiedException ex) {
            System.out.println("Exception: " + ex);
        }
    }

    public static void main(String args[]) {
        Health h11 = new Health();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = inp.nextInt();

        arr = new Health[n];

        try {
            if (n >= 0) {
                // arr = new Health[n];
                // arr[0] = h11;

            } else {
                throw new NegativeArraySizeException();
            }
        } catch (NegativeArraySizeException ex) {
            System.out.println("Exception: " + ex);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
