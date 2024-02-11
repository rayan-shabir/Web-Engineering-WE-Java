import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class exams21 {
    public static void main(String[] args) {
        File file = new File("./test.txt");

        if (file.exists()) {
            // Check read/write permission
            if (file.canRead()) {
                System.out.println("File is readable");
            }
            if (file.canWrite()) {
                System.out.println("File is writable");
            }

            // Check creation time
            try {
                BasicFileAttributes attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
                FileTime creationTime = attr.creationTime();
                System.out.println("Creation Time: " + creationTime);
            } catch (Exception e) {
                System.out.println("Error getting creation time: " + e.getMessage());
            }

            // Check last modified time
            FileTime lastModifiedTime = FileTime.fromMillis(file.lastModified());
            System.out.println("Last Modified Time: " + lastModifiedTime);

        } else {
            System.out.println("File does not exist");
        }
    }
}