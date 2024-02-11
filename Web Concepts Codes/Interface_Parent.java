/*
Interface
===============
* For Interface we use the keyword 'interface'.

* In interface all methods are by-default 'Abstract'. All the methods do not have any body/implementation.

* By default all the methods in interface are public & Abstract. So, we don't need to mention them.

* If any class is implementing / inherits from interface, then we write implements instead of extends with that child class.

* The inherited Child class is fully responsible to provide the implementation of all the methods / function of interface. 

NOTE:: 'Whenever a class is implementing an interface, Basically they are sining a contract Now the inherited Child class is fully responsible to provide the implementation of all the methods / function of interface.'


* All the data members in interface are by-deefault: public static & final.
public: can be accessed from anywhere.
static: can be accessed without creating the object of class or interface.
final: means they are constant, there value cannot be changed.


* We cannot craete object of interface, whether we can create refercnce variable of interface, same like of abstract class.


Main difference between Abstract class and Interaface.

* Multiple Inheritence exists in Java only by using the concept of interface.
* In Java, multiple inheritence only exists in the scenrio of interface.



Multiple Inheritence existence in JAVA::
--------------------------------------------

i) -> '1' interface inherits from multiple interfaces.
interface I1 extends I2, I3, I4 {

}

In this case if any class implements I1, then that class has also responsibility to implements I2, I3 & I4 as well
class Text implements I1 {
    // I2
    // I3
    //I4
}


ii) ->  A class is directly implementing / inheriting different interfaces.
class Text implements I1, I2, I3, I4 {

}


iii) -> At a single time, one class can inherits / extends from other class and also implements other interface.
class Text extends sampleDemo implements I1 {

}
* Here also multiple inheritence is doninig by interface (I1)




DIAMOND PROBLEM: (Scenerio)
-------------------
interface I1 {
    void show();
}

interface I2 {
    void show();
}

interface I3 {
    void show();
}

interface I4 {
    void show();
}


class Text implements I1, I2, I3, I4 {
    // This class can only have 1 function of the name show(), bcz all the interfaces have same definition of the show method.
    void show() {

    }
}

--> IN Main
I1 ref1;
ref1 = new Text();
ref1.show();

I2 ref2;
ref2 = new Text();
ref2.show();

I3 ref3;
ref3 = new Text();
ref3.show();

I4 ref4;
ref4 = new Text();
ref4.show(); 


In the above scenerio:: 
{Community against JAVA asks to tell that void show() in class Text belongs to which interface? 'So there is DIAMOND Problem in Java.'}

{But the Community in favour of JAVA claims that bcz the signature / name of method show() is same in all the interfaces. So it does'nt matter of which interface it belongs to, Only 1 implementation of it will be given in class for all the interfaces. And that implementation will fulfil all of the interfaces. 'So there is no DIAMOND Problem in Java.'}


-> C sharp gives solution of this DIAMOND Problem in their language as:
to implement void show() in Child class differently as:

class Text implements I1, I2, I3, I4 {
    void I1::show() {
    }

    void I2::show() {
    }

    void I3::show() {
    }

    void I4::show() {
    }
}

* But JAVA still claims that there is no DIAMOND Problem in JAVA.


REMEMBER:: 
# An interface can never inherits from a class. (An interface can only inherits from other interfaces.)
# A class can inherits from a interface and also from another class.
*/


interface Interface_Parent{
    int x = 3; 

    void show();

    void displayX();
}
