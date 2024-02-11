class Shabbir extends Exception { }
class Rayan extends Shabbir { }


public class Quiz02_3 {
    public static void main(String args[]) {
        // No ERROR, No Warning in this code.
        try {
            throw new Shabbir();  

        } catch (Rayan d)   // it only checks, then bypass
        {
            System.out.println("I m child");

        } catch (Shabbir d)        // here exception occurs
        {
            System.out.println("I m parent");

        }
    }
}