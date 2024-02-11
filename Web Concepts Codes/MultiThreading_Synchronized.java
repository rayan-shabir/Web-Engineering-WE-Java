class Message 
{
    synchronized void Go(String msg) {
        System.out.print("[ " + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Interrupted Exception " + ex.getMessage());
        }
        
        System.out.println(" ]");
    }
}

class NewThread implements Runnable {
    Message obj_m;        // holds the Message class object
    Thread t;           // holds the Thread Information
    String msg;         // holds the message string

    // Parametrize Constructor
    NewThread(Message obj_m, String msg) {
        this.obj_m = obj_m;                 // Initializing Messgae object
        this.msg = msg;                     // Initializing the message 

        // Creating Thread by calling the constructor of Thread class with Thread name
        t = new Thread(this, msg);

        t.start();          // starting the thread
    }

    public void run() {
        obj_m.Go(msg);          // calls the Go(String msg) method of Message class with message
    }
}

public class MultiThreading_Synchronized {
    public static void main(String args[]) {
        // Creating object of Message class
        Message obj = new Message();

        // Creating Threads
        NewThread t1 = new NewThread(obj, "Hello");
        NewThread t2 = new NewThread(obj, "World");

        try {
            Thread.sleep(4000);
        } catch(InterruptedException ex) {
            System.out.println("Exception" + ex.getMessage());
        }

    }
}
