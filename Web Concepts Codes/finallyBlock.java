import java.io.*;

class finallyBlock {
	public static void main(String[] args) {
		FileInputStream fos = null;
		try {
			System.out.println("1st try block");
			// int qu = 5/0;
			// fos = new FileInputStream(new File("bbbbb.txt"));
		} catch (ArrayIndexOutOfBoundsException ex) {
			
			System.out.println("1st Catch Block");
		} finally {
			System.out.println("1st Finally Block");
		}
		
		try {
			System.out.println("2nd try block");
		} finally {
			System.out.println("2nd finally block");
		}

		System.out.println("OUTSIDE TRY-FINALLY");

	}
}
