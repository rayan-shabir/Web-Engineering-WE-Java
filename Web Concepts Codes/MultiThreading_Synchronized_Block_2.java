//Synchronized code block synchronization provides a way to force the
//thread to not to enter in the shared code until other thread finishes its working
class Message {

    void Go(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted " + e.getMessage());
        }
        System.out.println("]");
    }
}

class Rayan {

}

// class implements the Runnable interface
class NewThread implements Runnable {
    Rayan ray= new Rayan();
    // synchronized int r = 5;
    int r = 5;
    Thread t; // holds the thread information
    Message obj_m; // holds the Message class object
    String msg; // holds the message string

    NewThread(Message obj_m, String msg) {
        this.obj_m = obj_m; // initializing Message object
        this.msg = msg; // initializing the message
        t = new Thread(this);
        t.start(); // starting the thread
    }

    // defining the run method, (entry point for the thread)

    public void run() {
        // synchronized (r) {
        // System.out.println("Inside run()");
        // // Thread.sleep(3000);
        // System.out.println("Inside me");
        // // Thread.sleep(3000);
        // }

        // synchronized (ray) {
        synchronized (obj_m) {
            try {
                System.out.println("Inside run()");
                Thread.sleep(3000);
                System.out.println("Inside me");
                Thread.sleep(3000);
                
            } catch(Exception ex) {
                System.out.println("Exception");

            }
        }
    }
}

class MultiThreading_Synchronized_Block_2 {

    public static void main(String[] args) throws Exception {
        // creating object of Message class
        Message obj_msg = new Message();

        // creating threads
        NewThread t1 = new NewThread(obj_msg, "Hello");
        NewThread t2 = new NewThread(obj_msg, "World");

    }
}
