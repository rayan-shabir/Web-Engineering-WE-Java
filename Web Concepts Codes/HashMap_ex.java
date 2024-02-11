import java.util.*;

class Person {
    String name;
    int id;

    Person(String n, int p) {
        this.name = n;
        id = p;
    }

    public void show() {
        System.out.println("Name: " + name + "ID: " + id);
    }
}

class Teacher {
    String name;
    double age;

    Teacher(String n, double p) {
        this.name = n;
        age = p;
    }

    public void show() {
        System.out.println("Name: " + name + "ID: " + age);
    }
}

public class HashMap_ex {
    public static void main(String args[]) {
        Teacher t1 = new Teacher("Rayan Shabir", 20.335);
        Teacher t2 = new Teacher("Shabir", 49.19);
        Person p1 = new Person("Ali Hassan", 555);
        Person p2 = new Person("Shammer", 111);

        HashMap<Integer, Object> h = new HashMap<Integer, Object>();

        h.put(1, t1);
        h.put(2, t2);
        h.put(3, p1);
        h.put(4, p2);


        // Teacher ob1 = (Teacher) h.get(1);
        // Teacher ob2 = (Teacher) h.get(2);
        // Person ob3 = (Person) h.get(3);
        // Person ob4 = (Person) h.get(4);
        
        // ob1.show();
        // ob2.show();
        // ob3.show();
        // ob4.show();
        
        System.out.println("For loop" );

        for(Integer key: h.keySet()) {
            Object ob = h.get(key);

            if(ob instanceof Person) {
                Person temp = (Person) ob;
                temp.show();
            } else {
                Teacher temp = (Teacher) ob;
                temp.show();
            }

            System.out.println("KEY:: " + key);

        }
        
    }
}
