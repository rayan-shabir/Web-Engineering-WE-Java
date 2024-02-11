import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class exams22 {

    public static void main(String[] args) {
        
        File file = new File("./gfg.txt");
        
        // Check if file exists
        if (file.exists()) {
            System.out.println("File exists");
            
            // Check File Absolute path
            System.out.println("File Absolute path: " + file.getAbsolutePath());
            
            
            // Check file permissions
            if (file.canRead()) {
                System.out.println("File have read permission");
            } else {
                System.out.println("File do not have read permission");
                
            }
            if (file.canWrite()) {
                System.out.println("File have write permission");
            } else {
                System.out.println("File do not have write permission");
            }
            
            // Get creation time
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            System.out.println("Creation Time: " + sdf.format(file.lastModified()));
            
            // Get last modified time
            System.out.println("Last Modified Time: " + sdf.format(file.lastModified()));
            
            // Get last Accessed time
            // Date lastAccessed = new Date(file.lastAccessed().toString());
            // System.out.println("Last Accessed Time: " + file.LastAccessed());
            
            // Checking file or directory
            if(file.isDirectory()) {
                System.out.println("It is a Directory");
            } else {
                System.out.println("It is a File");

            }

        } else {
            System.out.println("File does not exist");
        }

    }

}