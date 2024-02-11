/*
Number / Data Conversion (TYPECASTING) ::
=======================
    Wrapper Classes:    
                      Premetive Types      Reference Types (Wrapper Class)
                        int                 Integer
                        float               Float
                        double              Double

    * These all Wrapper Classes are available in 'java.lang' package, which Java by default provided in our every program.
    * These Wrapper Classes are used for data conversion.

    "200.50"        ->          200.50
    Double          ->          Functions

    * These all Wrapper Classes have some functions in them for data conversions.
    There are two types of functions in these classes. One 'static' & and other 'non-static / instance function'.
*/ 

public class Wrapper_classes_Data_conversions {
    public static void main(String args[]) {
        int num1 = 8;

        // Integer num2 = new Integer(num1);   // Boxing 
        // OR
        Integer num2 = num1;        // Auto-Boxing

        System.out.println(num2);


        
        // Or, Primitive to Object
        int y = 15;
        Integer nums = Integer.valueOf(y);
        System.out.println(nums);

        // Also use to convert string to int
        String you = "12";
        Integer nums2 = Integer.valueOf(you);
        System.out.println("You : " + nums2);


        

        // int num3 = num2.intValue();       // Unboxing
        int num3 = num2;                  // Auto-Unboxing

        System.out.println("Num3 : " + num3);


        // *** STRING TO INT/DOUBLE/FLOAT ***

        // Converting string to Integer (numeric).
        int n1 = 0;
        String str1 = "12";


        // n1 = (int) str1;      // ERROR: Narrowing Conversion (Big data type i.e string cannot be assigned to small data type i.e int)

        n1 = Integer.parseInt(str1);        // String can be converted to int by using Wrapper Class.  (String Object to primitive type)

        System.out.println(n1);

        System.out.println(n1*12);



        // Converting string to Double.
        double d1 = 0.0;

        String str2 = "3.142";

        d1 = Double.parseDouble(str2);

        System.out.println(d1);

        System.out.println(d1+2);


        // Converting string to Double.
        float f1 = 0;

        String str3 = "3.1";

        f1 = Float.parseFloat(str3);

        System.out.println(f1);

        System.out.println(f1+2);


        // *** INT / FLOAT / DOUBLE TO STRING ***

        // Converting int to string
        int num = 56;
        String strr1 = "abc";

        System.out.println(strr1);
        // strr1 = (str)num;                           // ERROR; cannot convert like this...

        strr1 = Integer.toString(num);

        System.out.println(strr1);


        // Converting double to string
        double numm2 = 56.666677788889;
        String strr2 = "abcdef";

        System.out.println(strr2);
        // strr2 = (str)numm2;                           // ERROR; cannot convert like this...

        strr2 = Double.toString(numm2); 
        System.out.println(strr2);



        // Converting float to string
        float numm3 = (float)21.34;
        String strr3 = "rayan";

        System.out.println(strr3);
        // strr3 = (str)numm3;                           // ERROR; cannot convert like this...
        
        strr3 = Float.toString(numm3); 
        System.out.println(strr3);



        // *** NUMBER TO NUMBER

        // Converting int to float
        int new1 = 1;
        float fun1;

        
        fun1 = (float)new1;
        System.out.println(fun1);
        
        // OR
        fun1 = new1;
        System.out.println(fun1);


        // Converting float to int
        int new2;
        float fun2 = 5.673f;

        new2 = (int)fun2;
        System.out.println(new2);
        
        // OR
        // new2 = fun2;                 // ERROR; Narrowing Conversion.
        System.out.println(new2);




        // Converting int to double
        int new3 = 35;
        double dim1;

        
        dim1 = (double)new3;
        System.out.println(dim1);
        
        // OR
        dim1 = new3;
        System.out.println(dim1);


        // Converting double to int
        int new4;
        double dim2 = 5.67392828828;

        new4 = (int)dim2;
        System.out.println(new4);
        
        // OR
        // new4 = dim2;            // ERROR: Narrowing Conversion
        System.out.println(new4);




        // *** Char TYPE ***
        String m1 = "12";
        char data[] = {'a', 'b', 'c'};

        System.out.println(data[0]);
        System.out.println(data);



        // *** Byte Type ***
        byte b1 = 127;
        // byte bi1 = 128;                 // ERROR
        
        byte b2 = 'a';
        // byte b3 = "abc";             // ERROR

        System.out.println(b1);
        System.out.println(b2);


    }
}
