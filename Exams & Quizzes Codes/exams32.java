import java.util.*;

public class exams32 {
    HashMap<String, String> H;

    public exams32() {
        H = new HashMap<String, String>();
    }

    public void find(String word) {
        String mean = null;

        mean = H.get(word);

        if(mean != null) {
            System.out.println("Meaning of word is "+ mean);
        } else {
            System.out.println("This word not exists in dictionary");
        }
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        exams32 obj = new exams32();

        obj.H.put("Rayan", "Babul Rayan");
        obj.H.put("Shahmeer", "Badshah Salamat");

        System.out.println("Enter word to find: ");
        String word = inp.nextLine();

        obj.find(word);
    }
}
