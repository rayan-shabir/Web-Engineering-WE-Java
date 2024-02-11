class Shabbir extends Exception { }
class Rayan extends Shabbir { }


public class Quiz02_1 {
    public static void main(String args[]) {
        try {
            throw new Rayan();   // here warning comes, bcz 'Shabbir d' exception can occur but we are not occurring it.
            
            // throw new Shabbir();  

        } catch (Rayan d) 
        {
            System.out.println("I m child");

        } catch (Shabbir d)        // here warning comes, bcz 'Shabbir d' exception can occur but we are not occurring it.
        {
            System.out.println("I m parent");

        }
    }
}