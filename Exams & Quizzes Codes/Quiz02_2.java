class Shabbir extends Exception { }
class Rayan extends Shabbir { }


public class Quiz02_2 {
    public static void main(String args[]) {
        try {
            // Here in both below cases ERROR comes, bcz 'Rayan d' is unreachable code. Every exception can easily handle in parent 'Shabbir'
            // throw new Rayan();  
            // throw new Shabbir();  

        } catch (Shabbir d)        
        {
            System.out.println("I m parent");

        } catch (Rayan d) // here ERROR comes
        {
            System.out.println("I m child");

        } 
    }
}