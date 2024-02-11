//import java.util.Scanner;
//
//public class My_First_Program {
//
//    // Static Function
//    static float sum(int a, float b) {
//        float c =  a+b;
//
//        return c;
//    }
//
//    //Non-Static Function
//    float subtract(int a, float b) {
//        float c = a - b;
//
//        return c;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("***INPUT***");
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter integer number: ");
//        int a = in.nextInt();
//
//        System.out.print("Enter Float number: ");
//        float b = in.nextFloat();
//
//        System.out.print("Enter a Word: ");
//        String s1 = in.next();   // It Reads One Word Only
//
//        // InputStream.skip();
//
//        String enter = in.nextLine();   // To accept ENTER
//
//        System.out.print("Enter a Line: ");
//        String s2 = in.nextLine();  // It Reads Full Line
//
//        System.out.println("***OUTPUT***");
//
//        System.out.println("The Word you entered is : " + s1);
//
//        System.out.println("The Line you entered is : " + s2);
//        //Main calling static function
//        float c1 = sum(a, b);
//        System.out.println("Value of a + b is : " + c1);
//
//        //Main calling non-static function (It will only be done using/creating class object)
//        My_First_Program obj = new My_First_Program();
//
//        float c2 = obj.subtract(a, b);
//        System.out.println("Value of a - b is : " + c2);
//    }
//}


public class extra {
    public static void main(String args[]) {
        int n1 = 5;
        double d1 = 0.0;

        String str1 = "12";
        char data[] = {'a', 'b', 'c'};

        // System.out.println(data[0]);

        // str1 = Integer.toString(n1); 
        // System.out.println(str1);

        
        // str1 = Double.toString(d1); 
        // System.out.println(str1);

        // d1 = (double)n1;
        // d1 = n1;

        // System.out.println(d1);

        // n1 = (int)d1;

        // System.out.println(n1);


        byte b1 = 127;
        // byte bi1 = 128;                 // ERROR
        
        byte b2 = 'a';
        // byte b3 = "abc";             // ERROR

        System.out.println(b1);
        System.out.println(b2);

        // n1 = (int) str1;      // ERROR: Narrowing Conversion (Big data type i.e string cannot be assigned to small data type i.e int)

        // n1 = Integer.parseInt(str1);        // String can be converted to int by using Wrapper Class.  (String Object to primitive type)

        // System.out.println(n1);

        // System.out.println(n1*12);

    }
}