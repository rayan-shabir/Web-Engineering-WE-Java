import java.util.*;

/*
ABSTRACT CLASSES
======================
* They are like Pure virtual function.

* Atleast one or more function are abstract  --> must be Abstract class
-> And the Child class must provide the implementation of this abstract function of parent class.

* Abstract class can also have concrete function or data member.

* We cannot create an Object of Abstract class, rather we can create the refernce of Abstract class.

* For Abstract class & function we write the keyword of Abstract with them.

ABSTRACT FUNCTION:  functions without any body, (functions which do not have any body)

CONCRETE FUNCTION:  functions with body, (functions which must have a body)

REMEMBER (IMPT):: We cannot create object of abstract parent class by ourselves, But whenever we create child class object (who implements / inherits a parent abstract class)  in the backend first parent class object is created, bcz we all know in OOP first parent constructor is called then child whenever we create child object.
*/ 


public abstract class Abstract_Class_Parent {

    public abstract void display();

    public abstract void displaySomething();

    public void show() {
        System.out.println("This method is diclared in Abstract Class"); 
    }
}
