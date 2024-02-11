public class exams28 {
    static String s = "";
    public static void main(String args[]) {
        try {
            s += "a";
            throw new Exception();
        } catch (Exception ex) {
            s += "b";
        } finally {
            s += "c";
            m();
            // return "finally";
            s += "d";
        }
        System.out.println(s);
    }

    static void m() {
        try {

            throw new NullPointerException();
        } catch (Exception e) {}
    }
}
