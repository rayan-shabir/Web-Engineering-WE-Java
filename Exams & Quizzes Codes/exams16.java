class MyException  extends RuntimeException {
    public void print() {

    }
    
    public String toString() {
        return "exception : rayan";
    }
}

public class exams16 {
    public static void main(String args[]) {
        try {
            int i = 0, count = 0;
    
            do {
                count *= i;
                i++;
                if(count == 1) continue;
                count++;
            } while(i < 3);
            System.out.println(count);

            throw new MyException();

        } catch(MyException ex) {
            System.out.println(ex);
        }
    }
}
