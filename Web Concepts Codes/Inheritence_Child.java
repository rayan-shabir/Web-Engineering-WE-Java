public class Inheritence_Child extends Inheritence_Parent {
    int a;

    Inheritence_Child(int p, int q, float r) {
        a = p;
        // a = q;
        super.a = q;
        b = r;
    }

    Inheritence_Child(int p, float q) {
        a = p;
        super.b = q;
        b = q;
    }

    void Show() {
        super.Show();
        // System.out.println("b in super class:  " + b);
        System.out.println("a in super class:  " + super.a);
        System.out.println("b in super class:  " + super.b);
        System.out.println("a in sub class:    " + a);
    }

    public static void main(String[] args) {
        // Inheritence_Child subobj = new Inheritence_Child(1, 5);
        Inheritence_Child subobj = new Inheritence_Child(1, 12, (float)6.7);
        subobj.Show();

    }

}