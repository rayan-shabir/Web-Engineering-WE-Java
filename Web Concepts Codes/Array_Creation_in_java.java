import java.util.Scanner;

public class Array_Creation_in_java {
    public static void main(String args[]) {
        //There are three ways of creating array in JAVA.
        System.out.println("***Array_Creation***");

        // 1. Declaration and memory allocation
        System.out.println("Way # 01");

        // int n1 = 5;
        int[] array1 = new int[5];
        // OR
        // int arr[] = new int[n1];

        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        array1[3] = 40;
        array1[4] = 50;

        // array1[5] = 50;          // ERROR: Array out of bound Exception.

        System.out.println("Array1[4] = " + array1[4]);



        // 2. Declaration and then memory allocation. (By taking size from user)
        System.out.println("\nWay # 02");

        System.out.println("Enter the size of array: ");
        Scanner in = new Scanner(System.in);

        int array2[];
        int n = in.nextInt();

        array2 = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("\nInput value at Array[" + i + "]: ");
            array2[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.println("Array[" + i + "]: " + array2[i]);
        }



        // 3. Declaration, memory allocation & initialization together. 
        System.out.println("\nWay # 03");

        int array3[] = {1, 2, 3, 4};         // Here size will assume by Java itself, only by seeing at total values.

        for(int i = 0; i < array3.length; i++) {
            System.out.println("Array[" + i + "]: " + array3[i]);
        }
    }
}
