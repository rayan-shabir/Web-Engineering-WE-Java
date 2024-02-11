import java.io.*;
import java.util.*;

class CustomExcepDemo extends Exception {
    private int n;
    private int d;

    public CustomExcepDemo(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public String toString() {
        String str = "CustomExcepDemo, Result of " + n + " / " + d + " is non-integer";

        return str;
    }


}

public class Exception_Handling_Throw_example02 {
    public static void main(String args[]) {
        int num[] = {4, 6, 0, 1};
        int den[] = {3, 3, 7, 8};

        for(int i = 0; i < 4; i++) {
            try {
                if (num[i] % den[i] != 0) throw new CustomExcepDemo(num[i], den[i]);
                System.out.println(num[i] + " % " + den[i] + " = " + num[i] % den[i]);

            } catch (CustomExcepDemo ex) {
                System.out.println("Exception: " + ex);
            }
        }
    }
}
