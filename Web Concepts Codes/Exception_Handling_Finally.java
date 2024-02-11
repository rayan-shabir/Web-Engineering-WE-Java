/*
finally block :: finally block will always executes whether exception occurs or not, It helps to avoid repetation of code.
-> Whther try block executes or catch block executes, in any case finally block will always executes...
-> We use finally block to free up resources which are allocated by us. (connection closing)
-> finally block will always executes even if we have return statement in our code. (if we return from somewhere even then also finally block can execute.)
-> But there is one way to stop execution of finally block.

Q:: How can we skip / stop / avoid finally block??
ANS:: If we Terminates our Program before coming to finally block, only then finally block can avoid.

Q:: How we can terminate our code in JAVA?
Ans:: 

file f = null
try {
    // code

    // f = new file("test.doc")  :: file open -> connection establishded successfully; (it means there will be a connection in memory which is established b/w code & file.)

    // data reading -> EXCEPTION occurs
    // close    -> this line will not executes
}   
catch (Exception ex)
{
    // close -> Wrong Approach here
    // error handling here 
} 
// As, connection is open till, with external resource i.e file. And it is not closed in above try block. So it is necessary to close it here. Thus, we use finally block to close it.

finally {
    // resource free
    f.close();
}

- - - - - - - 
- - - - - - -


***IMPT***
Q: What if we got exception at the time of creation / establishing a connection ? Then when finally will execute, it will try to close a connection which is not /never opened. So there what happened? We also got another NullPointerException there? 

file f = null
try {
    // code

    // f = new file("test.doc") :: file not open -> EXCEPTION occur here, (connection not opened)

    // data reading     -> this line will not executes
} catch (Exception ex) 
{
    // error handling code
} 
finally {
    // resource free
    // So we can do
    // either 
    try {
        f.close();      // NullPointerException
    } catch (Exception ex) {

    }

    // OR 
    // BEST WAY
    if (f != null)
        f.close();      // NullPointerException
}

-> Note:: In finally block, further exceptions can occur.

*/

public class Exception_Handling_Finally {
    public static void main(String arg[]) {
        int num = 5, den = 0;
        try {
            try {
                int res = num / den;

                System.out.println("Result:: " + res);
            } catch (IndexOutOfBoundsException ex) 
            {
                System.out.println("Inner Catch block");
            } finally 
            {
                System.out.println("Inner finally block");          // # 01
            }
        } catch (Exception ex) 
        {
            System.out.println("Outer Catch block");                // #02
        }  finally 
        {
            System.out.println("Outer finally block");               // #03
        }
    }
}
