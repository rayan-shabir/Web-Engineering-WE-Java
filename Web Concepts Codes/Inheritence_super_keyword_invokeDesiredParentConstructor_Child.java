/*
Super Keyword:
-> To invoke the desired constructor of parent class.
-> To invoke overrided functionality of parent class.
*/ 

class Inheritence_super_keyword_invokeDesiredParentConstructor_Child extends Inheritence_SuperClass {
    int d;

    Inheritence_super_keyword_invokeDesiredParentConstructor_Child() {
        d = 0;
    }

    Inheritence_super_keyword_invokeDesiredParentConstructor_Child(int p, int q, int r, int l) {
        super(p, q, r);             // must be first line in child constructor

        d = l; 
    }

    void show() {
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("d : " + d);
    }


    public static void main(String args[]) {
        Inheritence_super_keyword_invokeDesiredParentConstructor_Child c = new Inheritence_super_keyword_invokeDesiredParentConstructor_Child(4, 8, 3, 7);

        c.show();
    }
}
