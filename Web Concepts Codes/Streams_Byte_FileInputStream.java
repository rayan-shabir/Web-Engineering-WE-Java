/* 

Steps for Reading / Writing with file.
===================================================
i) Include package ::
java.io.*;

ii) Open File    ;   Open connection (For opening connection, we have to decide, whther we use Byte stream or character stream).

FileInputStream f = new FileInputStream("C:/test/filename.txt");

iii) Read / Write                 

f.read();                   -> It will read 1 byte.

for whole file ::       
while(f.read() != EOF) {

} 
OR
while( (char) f.read() > -1)      -> Remeber:: In case of end of file, OS returns us '-1', which means there is not data available in 
{                                               hard drive for this file. (Means this file chunks end at -1).
                                    As, here we are reading data in form of bytes, So we have to cast / convert them in appropriate format. (So we are converting it here in form of characters.) 
}

iv) Close

f.close();

REMEMBER:: Here we are first trying to open connection with the file, but if connection is not opened successfully (bcz file does not exists), we got IOException which is in category of CHECKED Exceptions (JAVA forced us to write handle for it).
-> Thus, when we are communicating with the external resource i.e file here, So in case of Streams (in these scenerios) when we are reading or writing of data, If we do not handle IOexception here our code will not compile. Thus, it is part of syntax to write try-catch block, provide handle for IOException.

NOTE:: Thus, whenever we are using 'Streams', we must have to write try-catch block, we must have to handle IOException, otherwise our code will not compile.

Q: What is file?
ANS:: File is abstraction of hard drive, data of file is save / present on some part of hard drive or chunk of memory. So when we are reading or writing data from file, it basically means we are reading or writing data from hard drive. And this data ends is represented by -1.

-> if we read file in form of characters, By making object of Char stream like::
FileReader f = new fileReader('filename.txt');

* Then we also need to cast it with (char), bcz here data is also get in form of bytes, but the main diff with byte stream is that in char stream the data is stored in 2 bytes (in byte stream data is stored in 1 byte).


***NOTE :: REMEMBER :: IMPORTANT ::***
-> In below code;

FileInputStream f = new FileInputStream("Streams_FileInputStream.java");    // Reading the same file which is opened here for execution
=> Here No ERROR comes, bcz when we compile our file / code, it will create a new file i.e Byte code file (whoose extension is .class) and then code will execute / run by that byte code and it will use this file for reading purpose.
: Byte code file will run
: this file is used for reading


FileInputStream f = new FileInputStream("Streams_FileInputStream.class");    // Reading the byte code (file) of this file which is opened here for execution.
=> Here also, No ERROR comes, bcz the code which we want to execute / run, Java will already load it (this code) in memory at start, So, when it execute this code then this file which is in hard drive is not using for execution purpose, it will execute by the file (code) which is loaded in memory not this one, and for reading purpose it will read the byte code file from hard drive.
-> edit
-> compile
-> load
-> verify
-> execute


*/

import java.io.*;

// Byte Stream : FileInputStream  ->  low level stream

public class Streams_Byte_FileInputStream {
    public static void main(String args[]) {
        // Try-catch block is must here bcz IOException is Checked Exception.
        FileInputStream f = null;

        try {
            f = new FileInputStream("Streams_FileInputStream.java");    // Reading the same file which is opened here
            // f = new FileInputStream("Streams_FileInputStream.class");    // Reading the byte code (file) of this file which is opened here for execution.
            int ch = 0;

            while ((ch = f.read()) > -1) {
                System.out.print((char) ch);
                // System.out.println(ch);     // It will print ASCII value of each word of our file.
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 
    }
}
