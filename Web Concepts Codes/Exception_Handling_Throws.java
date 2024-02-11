/*
throws:: -> throws can throw exception from where it is occur to some other place, and it will handle at that some other location.
-> if we are not interested to handle exception where it is occurred , we will throw that exception using 'throws' keyword to it's caller function to handle it there.


function     main()      =>       m1()       =>       m2()  throws ...      =>    m3()  throws ArithmeticException, IOException, (so on)
call seq:        

                                  try{
code:          m1()                 m2()               m3()                         // code where EXCEPTION occur
                                  }                     
                                              
                                                        
                               

* Exception occurs in m3() body, but m3() is not interested to handle exception in it's body bcz developer wants to separate Exception code from main logic code., So it throws that that exceptions which he don't want to handle to it's (m3()'s') Callee function. Now Callee of m3() i.e m2() is responsible to handle all that exceptions which are trown by m3() towards it. All that exceptions which m3() throws will handle in it's callee (m2()) function.

* But if the Callee (m2()) is also not interested in handling that exceptions which are thrown by m3(), then m2() can also use throws keyword and throw all the exceptions towards it's Callee i.e (m1()).
* In above scenerio, m1() is handling it using try-catch block.

-------------------------------------------------------------------------------------------------------------------------------
functions:

JVM   =>   main()       =>         m1()  throws ...    =>     m2()  throws ...    =>    m3()  throws ArithmeticException, IOException, ...
        

code:                                 
          m1()                    m2()                       m3()                    // code where EXCEPTION occur

* But if m1() is also not interested in handling exceptions, then it will also throw these exception to its Callee i.e Main() function. Then all those exceptions will be handle in main() using try-catch. (Means exception occurs in m3(), but handle in main()).
Note::
* But if main() function is also not interested in handling that exceptions, then main can also write 'throws' infront of it's signature, then all those exception goes towards main();s  Callee i.e JVM. Now all these exceptions will be handle by JVM. JVM will display default handler messages.
-> In this case JVM can also handle Checked exceptions. JVM will also provide default messages for these (Checked or Unchecked) exceptions. (JVM will not force (not give error) us to provide handler for checked exceptions in this case.). But this is only possible (JVM will only provide default handler message for Checked exceptions) when we write Checked exception name with the throws keyword.

like: throws ClassNotFoundException, AWTException, IOException
-> But if don't write Checked exception name with throws keyword, and Checked Exception occurs, (It means we are no dealing the Checked exception in our code), then Java will definitely give us ERROR at compile time, and force us to write it's handler by ourselfs.
                                                      
* We can simply also throws all the exceptions at one time by generic way (Not need to write names of all the exceptions individually):
like :: throws Exception
*/          

class NewException extends Exception {
    int val;

    NewException(int v) {
        val = v;
    }

    public String toString() {
        return "NewException " + val;
    }
}

public class Exception_Handling_Throws {
    public static void main(String args[]) {
        try {
            doWork(4);
            doWork(3);
            doWork(2);
            doWork(1);
            doWork(0);
        } catch (NewException ex) {
            System.out.println("Exception: " + ex);
        }
    }

    public static void doWork(int val) throws NewException, ArithmeticException
    {
        if(val == 0) throw new NewException(val);
        else System.out.println("No Problem...");
    }

}
