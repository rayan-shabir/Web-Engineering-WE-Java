import java.util.*;

public class HashMap_dictionary {
    HashMap<String, String> H;

    public HashMap_dictionary() {
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

        HashMap_dictionary obj = new HashMap_dictionary();

        obj.H.put("Rayan", "Babul Rayan");
        obj.H.put("Shahmeer", "Badshah Salamat");

        System.out.println("Enter word to find: ");
        String word = inp.nextLine();

        obj.find(word);
    }
}
