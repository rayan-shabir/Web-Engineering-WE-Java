import java.util.*;

public class Inheritence_Circle_Parent {
    // declaring the instance variable
    protected double radius;

    Inheritence_Circle_Parent(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;       // 'Math' is s class which has static function 'PI'.
    }
}

