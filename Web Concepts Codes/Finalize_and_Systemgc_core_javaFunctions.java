/* 

finalize() method in Java is a method of the Object class that is used to perform cleanup activity before destroying any object. It is called by Garbage collector before destroying the objects from memory. finalize() method is called by default for every object before its deletion.

It is not a destructor. It only perfrom some activity at the deletion time of the object.
*/


/*

System.gc() method runs the garbage collector. Calling this suggests that the Java Virtual Machine expend effort toward recycling unused objects in order to make the memory they currently occupy available for quick reuse.
 
gc() is a static method of System class.

Main purpose of System.gc() is to invoke the Garbage Collector manually.

Keep 2 things in mind.
-> Java strongly reccomend us to not invoke/call this function explicitly.
-> Java did not give us gurantee that on calling this function, the garbage collector is invoked or not.

Because the decision to invoke garbage collector is done by JVM itself.
*/