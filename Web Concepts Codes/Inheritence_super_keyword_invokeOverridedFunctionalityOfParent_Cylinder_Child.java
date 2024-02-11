import java.util.*;

public class Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child extends Inheritence_Circle_Parent{
    protected double length;

    Inheritence_super_keyword_invokeOverridedFunctionalityOfParent_Cylinder_Child(double radius, double length) {
        super(radius);      // If we don't write this, we got a compile time error, because otherwise it will try to c all default constructor of parent class, but is this case that is not available and neither provided by Java (As we write one parametrize constructor by ourselfs).

        this.length = length;
    }

    // Method overriden here
    public double getArea() {
        return 2*super.getArea() + 2*Math.PI*radius*length;
    }
}

