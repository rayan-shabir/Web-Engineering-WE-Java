class Student {
    // By default, the access specifier for all data members & member variable is 'Default'
    String name;
    int rollNo;

    // Parameterize Constrcutor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void Print() {
        System.out.println("Name: " + this.name);
        System.out.println("RollNo: " + this.rollNo);
    }
}

public class Array_of_objects {
    public static void main(String args[]) {
        Student s1 = new Student("Rayan", 535);
        Student s2 = new Student("Ali", 515);
        Student s3 = new Student("Shahmeer", 527);

        Student array[] = new Student[3];   // Here reference array is created which will point to Student objects.

        array[0] = s1;          // Object / reference 's1' is storing in index '0' of array.
        array[1] = s2;          // Object / reference 's2' is storing in index '1' of array.
        array[2] = s3;          // Object / reference 's3' is storing in index '2' of array.

        for(int i = 0; i < array.length; i++) {
            System.out.println("\nPrinting Info of I = " + i);
            array[i].Print();
        }
    }
}
