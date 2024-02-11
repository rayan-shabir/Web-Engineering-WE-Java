public class Static_Function {
    public static void main(String args[]) {
        int no1 = 50, no2 = 100;

        // As, addition is a static function. So we can call it without creating object of class.
        int result = addition(no1, no2);

        System.out.println("Result = " + result);
    }

    
    public static int addition(int n1, int n2) {
        return n1 + n2;
    }
}
