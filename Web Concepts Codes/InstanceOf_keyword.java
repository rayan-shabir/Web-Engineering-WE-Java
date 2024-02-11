abstract class Parent {
    Parent( ) {
        System.out.println("I am Constststts");
    }
    void show() {

    }
}

class Check1 extends Parent{

}

class Rayan extends Parent {

}

abstract class MEEE {
    private int wow;

    // abstract public MEEE() {             // ERROR

    // }

    // abstract MEEE(int wipee) {           // ERROR
    //     wow = wipee;
    // }

    MEEE(int wipee) {
        wow = wipee;
    }
}


public class InstanceOf_keyword {
    public static void main(String args[]) {
        Rayan obj1 = new Rayan();
        Check1 obj2 = new Check1();

        if(obj1 instanceof Rayan) 
            System.out.println("I am Rayan...");
        if(obj1 instanceof Rayan) 
            System.out.println("I am Rayan...");
        if(obj2 instanceof Check1) 
            System.out.println("I am Check1");
        if(obj1 instanceof Parent) 
            System.out.println("I am Parent");
        if(obj2 instanceof Parent) 
            System.out.println("I am Parent");
        // if(obj1 instanceof Check1)                 // ERROR!!!
        //     System.out.println("I am Rayan");       
        // if(obj2 instanceof Rayan)                  // ERROR!!!
        //     System.out.println("I am Parent");
    }
}
