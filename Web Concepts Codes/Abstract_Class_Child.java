public class Abstract_Class_Child extends Abstract_Class_Parent{
    public void display() {
        System.out.println("This method is 'Display' & declared in Abstract Class");
    }

    public void displaySomething() {
        System.out.println("This method is 'DisplaySomething' & declared in Abstract Class");
    }

    public static void main(String args[]) {
        // Child class object is created who provide complete implementation of Parent Abstract Class.
        Abstract_Class_Child obj1 = new Abstract_Class_Child();
        obj1.display();
        obj1.show();

        // Abstract class reference is containing child class object. (This child class has provided complete implementation of parent Abstract class)
        Abstract_Class_Parent obj2 = new Abstract_Class_Child();
        System.out.println();
        obj2.display();
        obj2.show();
    }
}
