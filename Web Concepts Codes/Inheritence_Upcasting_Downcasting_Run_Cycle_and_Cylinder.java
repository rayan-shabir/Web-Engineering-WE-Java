/*
NOTE:
    Employee e;
    e = new Professor();
    e.show();
    -> Here show function of Professor class will be called... (We only see which class's object is contains by the refernce variable, than simply that class's function will be called.)



    Employee e;
    e = ?
    e.show();
    -> Here we cannot predict that of which class this show function will be called...
*/


public class Inheritence_Upcasting_Downcasting_Run_Cycle_and_Cylinder {
    public static void main(String args[]) {

        // Circle class
        System.out.println("\n***Circle Class***");
        Inheritence_Circle_Parent myCircle = new Inheritence_Circle_Parent(1.20);

        System.out.println("Area of Circle is: " + myCircle.getArea());     // Here .getArea() of Inheritence_Circle_Parent will be called.



        // Cylinder Class
        System.out.println("\n***Cylinder Class***");
        Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child myCilender = new Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child(1.20, 2.50);

        System.out.println("Area of Cylinder is: " + myCilender.getArea());     // Here .getArea() of  Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child will be called.



        // Upcasting / Implicit-casting / Compile-Time Casting
        System.out.println("\n***Upcasting / Implicit-casting***");
        Inheritence_Circle_Parent myCircle1 = new Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child(1.20, 2.50);

        System.out.println("Area of Cylinder is: " + myCircle1.getArea());     // Here .getArea() of  Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child will be called.




        // Downcasting / Explicit-casting / Run-Time Casting
        System.out.println("\n***Downcasting / Explicit-casting***");
        Inheritence_Circle_Parent myCircle2 = new Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child(1.20, 2.50);

        Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child myCylinder2;

        myCylinder2 = (Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child) myCircle2;

        System.out.println("Area of Cylinder is (By myCircle2): " + myCircle2.getArea());     // Here .getArea() of  Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child will be called.

        System.out.println("Area of Cylinder is (By myCylinder2): " + myCylinder2.getArea());     // Here .getArea() of  Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child will be called.



        // HOMEWORK :: Another Try
        System.out.println("\nERROR will come :: Trying Downcasting\n");
        Inheritence_Circle_Parent myCircle3 = new Inheritence_Circle_Parent(1.20);
        Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child myCylinder3;

        myCylinder3 = (Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child) myCircle3;
    }
}
