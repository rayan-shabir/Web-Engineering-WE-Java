import javax.swing.*;

public class LAB_01_Sculpture {
	public static void main(String args[]) {
		double area = 0;
		int f = 0;
		
		if (args.length != 0) {

			while(f != 1) {
				if(args[0].equals("Square")) {
					double side = Double.parseDouble(args[1]);
					area = side * side;
					f = 1;
				} else if (args[0].equals("Rectangle")) {
					double length = Double.parseDouble(args[1]);
					double width= Double.parseDouble(args[2]);
					area = length * width;
					f = 1;

				} else if (args[0].equals("Parallelogram")) {
					double base = Integer.parseInt(args[1]);
					double height = Integer.parseInt(args[2]);
					area = base * height;
					f = 1;

				} else if (args[0].equals("Trapezoid")) {
					double b1 = Integer.parseInt(args[1]);
					double b2 = Integer.parseInt(args[2]);
					double h = Integer.parseInt(args[3]);

					area = ((b1 + b2) / 2) * h;
					f = 1;

				} else if (args[0].equals("Triangle")) {
					double b = Integer.parseInt(args[1]);
					double height = Integer.parseInt(args[2]);

					area = (1 / 2) * b * height;
					f = 1;

				} else if (args[0].equals("Circle")) {
					double r = Integer.parseInt(args[1]);

					area = (3.142)*(r*r);
					f = 1;

				} else if (args[0].equals("Ellipse")) {
					double a = Integer.parseInt(args[1]);
					double b = Integer.parseInt(args[1]);

					area = (3.142)*a*b;

					f = 1;
				} else {
					System.out.println("You enter an invalid input... Please Try again");
				}
			}

		} else {
			System.out.println("Exception:: Command Line arguments not passed...");

		}

		

		JOptionPane.showMessageDialog(null, "Area of " + args[0] + " is: " + area);
	}
}