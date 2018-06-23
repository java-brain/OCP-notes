- Continue page 55 (+-107/723) from heading "Implementing Functional Interfaces with Lambdas"

- Simple tutorial on enums: https://www.mkyong.com/java/java-enum-example/ 
    
- the 'method signature' is the method name and the parameter list     

- An annotation is extra information about the program, and it is a type of metadata. It can be used by the compiler or even at runtime.

- @Override is allowed only when referencing a method. Just as there is no such thing as overriding a field, the annotation cannot be used on a field either.

- Inner classes are not allowed to contain static methods or static variables. Only nested static classes are permitted to contain statics. Refer to question 8 from chapter 1 review questions for an example.

- A reminder about interfaces: An interface is an abstract data type, similar to a class that defines a list of public abstract methods that any class implementing the interface must provide. An interface may also include constant public static final variables, default methods, and static methods. 

- The compiler automatically adds 'public' to all interface methods and 'abstract' to all (non-static and non-default) methods, if the developer does not provide them. By contrast, the class implementing the interface must provide the proper modifiers. Refer to the Lion class on page 49.

- You can construct interfaces that have neither methods nor class members, traditionally referred to as marker interfaces. java.io.Serializable (from chapter 8, "IO") contains no methods, is an example of a marker interface.

- Interfaces may not be marked final or instantiated directly. There are additional rules for default methods, such as Java failing to compile if a class or interface inherits two default methods with the same signature and doesn't provide its own implementation.

<!-- Parking lot -->

<!-- //Parking lot -->
