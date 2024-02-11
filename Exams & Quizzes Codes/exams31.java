public class exams31 {
    public static void main(String args[]) {
        int sum = 0;
        try {
            int i;
            sum = 10;
            for (i = -1; i < 3; i++)
                sum = (sum/i);
        } catch (ArithmeticException e) {
            System.out.println("0 ");
            
        }
        System.out.println(sum);

    }
}
