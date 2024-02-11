/*
NOTE:: In below code, we use bogous approach (to wait main thread until all child complete their execution), by setting main thread sleep for 10 seconds. So that till then all the child threads can complete their execution.
But here we can also notice that all child threads complete earlier and then after some seconds main thread terminates. Here it means that some seconds are wasting (bcz main is still in sleep state and till it's comeback the execution cannot complete), some CPU cycles are wasting in this case. 

So, To save these wasting cycles of CPU, we can use SIGNALING. (Whenever all the child threads complete their execution, the main thread come immidiately without wasting any time and complete it's execution. Main thread does not wait for it's sleep time to finish so that then it can come and complete it's execution)

SIGNALING / MESSAGING :: The child threads send message / signals to main thread. This message contain that the parent thread wait / stay in RAM until all child thread complete their execution. And when the child threads complete their execution then again the child thread send SIGNALS to the main thread and tell it that they had completed their execution, now main thread can execute and complete it's execution.
(Simply, the child threads send signal at the time of their execution (flag : 0) and also send signals at the time of their termination (flag : 1) to main thread.)
Thus, by SIGNALING we can save our wasting cycle of CPU.
NOTE:: We can never estimate the optimal time for the completion of all child threads, thus we use signaling.
*/

class NewThread implements Runnable{
    String t_name;      // holds the Thread name
    Thread t;           // holds Thread information

    // parametrized constructor
    NewThread(String t_name) {
        this.t_name = t_name;           // initializing thread name
        t = new Thread(this, t_name);   // creating Thread by calling the constructor of Thread class with Thread name
        // If we want to save name of thread we can also call t.setName() function, and with that we can use single paramterize constructor.

        // When we print Thread object it display us '3' Informations ::[ Thread_name, Priority, Parent ]
        System.out.println("New Thread: " + t);     // Displaying Thread Information 

        t.start();      // Putting our created Thread in Ready Queue
    }

    // Defining the run method, (entry point for the thread)
    public void run() {
        try {
            // displaying the loop number with delay of half second
            for (int i = 0; i < 5; i++) {
                System.out.println(t_name + " : " + i);
                Thread.sleep(500);      // 0.5 seconds
            }
        } catch (InterruptedException ex) {
            System.out.println("Child Thread Interrupted: " + ex.getMessage());
        }

        System.out.println("Thread " + t_name + " Exiting...");
    }
}


public class MultiThreading_Multiple_Thread {
    public static void main(String args[]) {
        // Creating object(s) of NewThread Class. (Whenever we create object of NewThread class, it basically creates a new Thread, and put it in ready queue. As, we see in NewThread Constructor. Thus, it means creating an object is basically creating a thread..)
        // (Main is Parent of these Threads.)
        NewThread t1 = new NewThread("ONE");
        NewThread t2 = new NewThread("TWO");
        NewThread t3 = new NewThread("THREE");

        try {
            Thread.sleep(10000);        // 10 seconds
        } catch (InterruptedException ex) {
            System.out.println("Main Thread Interrupted: " + ex.getMessage());
        }

        System.out.println("Main Exiting...");
    }
}
