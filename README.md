- Continue page 81 (+-132/723) from "Real World Scenario Singletons with Double-Checked Locking" 
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

<!-- Parking lot -->

<!-- //Parking lot -->
