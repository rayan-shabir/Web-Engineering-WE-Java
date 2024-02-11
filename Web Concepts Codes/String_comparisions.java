public class String_comparisions {
    public static void main(String args[]) {
        String str1 = "Rayan";
        String str2 = "Rayan";
        String str3 = new String("Rayan");

        // == equal operator only compares reference of object, not values.
        System.out.println("Comparing str1 & str2");
        if (str1 == str2) System.out.println("Same");
        else System.out.println("Not Same");

        System.out.println(str1 == str2);


        System.out.println("\nComparing str1 & str3");
        if (str1 == str3) System.out.println("Same");
        else System.out.println("Not Same");

        System.out.println(str1 == str3);

        /* NOTE::
            You should not use == (equality operator) to compare these strings because they compare the reference of the string, i.e. whether they are the same object or not. On the other hand, equals() method compares whether the value of the strings is equal, and not the object itself.
        */

        System.out.println("\nUsing equals() function:: " + str1.equals(str3));


        /*
        The String class compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.

        Suppose s1 and s2 are two String objects. If:

        s1 == s2 : The method returns 0.
        s1 > s2 : The method returns a positive value.
        s1 < s2 : The method returns a negative value. 

         */
        System.out.println("\nUsing compareTo() function:: " + str1.compareTo(str3));
    }
}
