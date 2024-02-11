/*
 
*/

public class MultiThreading_Single_Thread implements Runnable
{
    // Defining the run method, (entry point of thread)
    public void run() {
        System.out.println("Child Current Thread: " + Thread.currentThread());

        try {
            // displaying the loop with the delay of half second
            for(int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.out.println("Child Thread Interrupted " + ex.getMessage());
        }

        System.out.println("Child exiting...");
    }


    public static void main(String args[]) {
        // creating object of MultiThreading_Single_Thread which override run()
        MultiThreading_Single_Thread obj = new MultiThreading_Single_Thread();

        // creating new thread with the help of Thread class
        Thread t = new Thread(obj);

        t.setPriority(3);
        t.setName("rayan");
        // System.out.println("Current Thread: " + Thread.currentThread().getPriority());

        // starting the thread it will call the run() method of MultiThreading_Single_Thread class
        t.start();

        try {
            // displaying the loop with the delay of 1 second
            for(int i = 1; i <= 5; i++) {
                System.out.println("\nMain Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("\nMain Thread Interrupted " + ex.getMessage());
        }

        System.out.println("Main exiting...");


        // System.out.println("Current Thread: " + Thread.currentThread());
        // System.out.println("Current Thread: " + Thread.currentThread().getName());
    }
}
