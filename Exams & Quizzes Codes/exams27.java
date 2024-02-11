public class exams27 {
    public static void main(String args[]) {
        System.out.println(m());
    }

    static String m() {
        int q;
        try {
            q = 1/0;
        } catch (Exception ex) {
            return "catch";
            // System.out.println("catch");
        } finally {
            System.out.println("finally");
            // return "finally";
        }
        return "q";
    }
}
