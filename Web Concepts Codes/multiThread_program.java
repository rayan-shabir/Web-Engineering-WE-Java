class newThread extends Thread{
    Thread t;
    newThread() {
        t = new Thread(this, "My Thread");
        t.start();
    }

    public void run() {
        try {
            System.out.println("Exc ");
            t.join();
            System.out.println(t.getName());
        } catch(Exception ex) {
            System.out.println("Exception");
        }
    }
}


public class multiThread_program {
    public static void main(String args[]) {
        new newThread();
    }
}