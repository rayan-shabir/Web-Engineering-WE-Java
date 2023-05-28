import java.util.*;

abstract class TwoDimensionalShape {

    abstract double getArea();
}

class Circle extends TwoDimensionalShape {
    private static final double pi = 3.142;
    private static double radius;

    public void getInput() {
        System.out.println("*** Input Circle ***");

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter radius: ");
        radius = inp.nextDouble();

        // inp.close();
    }

    double getArea() {
        double area = (pi * Math.pow(radius, 2));

        return area;
    }

    public String toString() {
        return "Circle:: radius = " + radius;
    }
}

class Square extends TwoDimensionalShape {
    private static double a;

    public void getInput() {
        System.out.println("*** Square ***");

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter side of Square: ");
        a = inp.nextDouble();

        // inp.close();
    }

    double getArea() {
        double area = (Math.pow(a, 2));

        return area;
    }

    public String toString() {
        return "Square:: a (side) = " + a;
    }
}

class Triangle extends TwoDimensionalShape {
    private static double base;
    private static double height;

    public void getInput() {
        System.out.println("*** Triangle ***");

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter base: ");
        base = inp.nextDouble();

        System.out.println("Enter height: ");
        height = inp.nextDouble();

        // inp.close();
    }

    double getArea() {
        double area = (0.5 * base * height);

        return area;
    }

    public String toString() {
        return "Triangle:: base = " + base + " height = " + height;
    }
}

public class Lab_02_Shape_Inheritence {
    public static void main(String args[]) throws Exception {
        Circle c = new Circle();
        Square s = new Square();
        Triangle t = new Triangle();

        TwoDimensionalShape arr[] = { c, s, t };

        for (int i = 0; i < 3; i++) {
            System.out.println("\nDescription: " + arr[i]);
            System.out.println("");

            if (arr[i] instanceof Circle) {
                Circle objC = (Circle) arr[i];
                objC.getInput();

                double area = objC.getArea();
                System.out.println("Area: " + area);

            } else if (arr[i] instanceof Square) {
                Square objS = (Square) arr[i];
                objS.getInput();

                double area = objS.getArea();
                System.out.println("Area: " + area);

            } else if (arr[i] instanceof Triangle) {
                Triangle objT = (Triangle) arr[i];
                objT.getInput();

                double area = objT.getArea();
                System.out.println("Area: " + area);

            }
        }

    }
}
