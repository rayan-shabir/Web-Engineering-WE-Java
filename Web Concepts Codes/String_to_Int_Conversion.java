public class String_to_Int_Conversion {
    public static void main(String args[]) {
        // Converting string to Integer (numeric).
        int n1 = 0;
        String str1 = "12";

        // n1 = (int) str1;      // ERROR: Narrowing Conversion (Big data type i.e string cannot be assigned to small data type i.e int)

        n1 = Integer.parseInt(str1);        // String can be converted to int by using Wrapper Class.  (String Object to primitive type)

        System.out.println(n1);

        System.out.println(n1*12);

    }
}
