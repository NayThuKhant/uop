/*

Class vs Object

Objects are closely related to classes. classes are used to create objects. A class is a kind of factory—or
blueprint—for constructing objects. The non-static parts of the class specify, or describe, what variables and
methods the objects will contain. This is part of the explanation of how objects differ from classes: Objects are created
and destroyed as the program runs, and there can be many objects with the same structure, if they are created using the
same class.
*/

class DiscussionUnit4 {

    public static void main(String[] args) {
        // Creating an instance OR object from a class
        Class object = new Class();

        // After creating instance/object from Class class, we can use all the member properties or methods from the class statically.
        // Accessing class's property
        System.out.println(object.property);

        // Invoking class's method / subroutine
        object.method();
    }
}

class Class{
    public String property = "This is class's property";

    public void method() {
        System.out.println("Class method OR subroutine is working");
    }
}


/*
From the above example, Class is a base class which we use to creat object from it and access member properties and methods.
Reference
David J.Eck. (2022, May). Javanotes 9, Section 2.1—The Basic
Java Application. Introduction to Programming Using Java. https://math.hws.edu/javanotes/c2/s1.html
* */
