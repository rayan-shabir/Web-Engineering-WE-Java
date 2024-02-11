public class exams18 {

    public void method(StringBuffer sb) {
        System.out.println("StringBufferVersion");

    }

    public void method(String s) {
        System.out.println("String Version");
    }
    public static void main(String args[]) throws Exception{
        exams18 q = new exams18();
        q.method(null);
    }
}
