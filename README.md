- Continue page 208 (+-260/723) from "Using Optional with Primitive Streams"

    - Going through db singleton example from (8m12s) https://www.youtube.com/watch?v=NZaXM67fxbs
- Simple tutorial on enums: https://www.mkyong.com/java/java-enum-example/ 
    
- the 'method signature' is the method name and the parameter list     

- An annotation is extra information about the program, and it is a type of metadata. It can be used by the compiler or even at runtime.

- @Override is allowed only when referencing a method. Just as there is no such thing as overriding a field, the annotation cannot be used on a field either.

- Inner classes are not allowed to contain static methods or static variables. Only nested static classes are permitted to contain statics. Refer to question 8 from chapter 1 review questions for an example.

- A reminder about interfaces: An interface is an abstract data type, similar to a class that defines a list of public abstract methods that any class implementing the interface must provide. An interface may also include constant public static final variables, default methods, and static methods. 

- The compiler automatically adds 'public' to all interface methods and 'abstract' to all (non-static and non-default) methods, if the developer does not provide them. By contrast, the class implementing the interface must provide the proper modifiers. Refer to the Lion class on page 49.

- You can construct interfaces that have neither methods nor class members, traditionally referred to as marker interfaces. java.io.Serializable (from chapter 8, "IO") contains no methods, is an example of a marker interface.

- Interfaces may not be marked final or instantiated directly. There are additional rules for default methods, such as Java failing to compile if a class or interface inherits two default methods with the same signature and doesn't provide its own implementation.

- Object vs Reference
    1) The type of the object determines which properties exist within the object in memory.
    2) The type of the reference to the object determines which methods and variables are 
       accessible to the Java program.
       
- Some basic rules to keep in mind when casting variables:
    1) Casting an object from a subclass to a superclass doesn't require an explicit cast
    2) Casting an object from a superclass to a subclass requires an explicit cast
    3) The compiler will not allow casts to unrelated types
    4) Even when the code compiles without issue, an exception may be thrown at runtime if
       the object being cast is not actually an instance of that class.
       
- Singletons
    - Used in situations where we need access to a single set of data throughout an application. For example,
    application configuration data and reusable data caches are commonly implemented using singletons.
    Singletons may also be used to coordinate access to shared resources, such as coordinating write access
    to a file.
    
    - For the purposes of the exam, singletons are always unique. When you get to writing applications that
    run across multiple computers, the static singleton solution starts to require special consideration, as
    each computer would have its own JVM.
    
    In those situations, you might still use the singleton pattern, although it might be implemented with a 
    database or queue server rather than as a static object. However the discussion of which to employ is 
    beyond the scope of the exam.
    
- Creating Immutable Objects 
    - Applying an Immutable Strategy:
    Although there are a variety of techniques for writing an immutable class, you should be familiar with 
    a common strategy for making a class immutable for the exam:
    1) Use a constructor to set all properties of the object
    2) Mark all of the instance variables 'private' and 'final'
    3) Don't define any setter methods
    4) Don't allow referenced mutable objects to be modified or accessed directly
    5) Prevent methods from being overridden
    
- A design principle is an established idea or best practice that facilitates the software design process:
    e.g. Encapsulating Data, Creating JavaBeans, Applying the  Is-a Relationship, Applying the Has-a Relationship
    and Composing Objects.
    
- A design pattern is an established general solution to a commonly occuring software development problem. 
  e.g. The Singleton Pattern, Creating Immutable Objects, Using the Builder Pattern and creating Objects with
  the Factory Pattern.
  
- Autoboxing converts primitive to wrapper class

- Unboxing converts a wrapper class back to a primitive

- Primitive/Wrapper
    boolean/Boolean
    byte/Byte
    short/Short
    int/Integer *
    long/Long
    float/Float
    double/Double
    char/Character *
    
- Naming Conventions for Generics
    A type parameter can be named anything you want. The convention is to use single uppercase letters to make
    it obvious that they aren't real class names. The following are common letters to use:
    * E for an element
    * K for a map key
    * V for a map value
    * N for a number
    * T for a generic data type
    * S,U,V, and so forth for multiple generic types
    
- Important to double check what the book says, for example, the compiler warning on page 113, I'm unable to recreate...
    mint@mint-Lenovo-YOGA-910-13IKB ~/IdeaProjects/untitled/src $ javac io/gen/ShippableRobotCrate.java
    mint@mint-Lenovo-YOGA-910-13IKB ~/IdeaProjects/untitled/src $ java io/gen/ShippableRobotCrate
    fine

- Although not needed for the exam, keep in mind what you can't do with generics (listed on page 113, "Real World Scenario")

- Collections written without generics are also known as "raw collections".

- $ javac *.java to compile all .java files within the location you're pointing to
- javac -Xlint:unchecked *.java 
    Passing this flag will elaborate on the warning
    
- LinkedList implements both 'List' and 'Queue'. The List interface has a method to remove by index. Since the method exists, Java does not autobox to call the other method. Queue has only the remove object method.
Refer to question 19 from chapter 3 for an example.

<!-- Parking lot -->
- Revisit "Handling Mutable Objects in the Constructors of Immutable Objects" from the top of page 85, I don't get why 
  this gives the ability to change the List...
  
- Although not required for the exam, find more examples of the builder pattern, the AnimalBuilder example does not show 
  why adding more fields to the constructor (or however they choose to expand the class) is handled in a more 
  maintainable manner.
  
- Find some tutorials on generics, because writing the sample from page 114 doesn't tie up, if the class has a generic type and you don't specify the formal type parameter like "public static <T> Crate<T> ship(T t)", it does not compile.
Perhaps because the method is static...
public class Crate<T> {

    public static Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }
}
or like this: the class doesn't define a generic type, so it complains?
package io.mypackage;

public class Crate{

    public <T> Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }
}

- The following from page 120 does not compile, not following why...
    2: static class Sparrow extends Bird { }
    3: static class Bird { }
    4:
    5: public static void main(String[] args) {
    6: List<? extends Bird> birds = new ArrayList<Bird>();
    7: birds.add(new Sparrow()); // DOES NOT COMPILE
    8: birds.add(new Bird()); // DOES NOT COMPILE
    9: }
    
- Go through bounded generics again after completing the book

- Ensure you go through table 3.7 and 3.8 (page 140 and 141) and be able to recall the differences before writing

- According to Unicode character mapping and as far as the exam is concerned: numbers sort before letters and uppercase letters
  sort before lowercase letters.

- Go through java brains lambdas, especially the :: example

- Remember to view the exam criteria that may have changed on https://www.selikoff.net/java-ocp-8-programmer-ii-study-guide/

- Go through chapter 3 again after finishing the book, it's too much to take in.

- Chapter 3, question 7 "The output is indeterminate"?

- Chapter 3, question 15, why does it return -1 and why is it undefined?

- Keep in mind from page 178: Real world scenario, the default methods on Predicate.
<!-- //Parking lot -->
