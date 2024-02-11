class Interface_Child implements Interface_Parent {
    public void show() {
        System.out.println("\nThis is method of Parent Interface");
    }

    public void displayX() {
        System.out.println("Value of X:" + x);
    }

    public static void main(String args[]) {
        Interface_Child obj = new Interface_Child();

        obj.show();
        obj.displayX();

        Interface_Parent obj2 = new Interface_Child();

        obj2.show();
        obj2.displayX();
    }
}
