public class HayStorage {
    private int quantity = 0;

    //all constructors in a singleton class are marked private,
    //which ensures that no other class is capable of instantiating
    //another version of the class
    //By marking the constructors private, we have implicitly marked
    //the class final. The first line of any constructor is a call
    //to a parent constructor with the super() command. If all of the
    //constructors are declared private in the singleton class, then
    //it is impossible to create a subclass with a valid constructor;
    //therefore, the singleton class is effectively final.
    private HayStorage() {}

    //singletons in Java are created as private static variables
    //within the class, often with the name instance
    private static final HayStorage instance = new HayStorage();

    //singletons are accessed via a single public static method,
    //often named getInstance(), which returns the reference to the
    //singleton object.
    public static HayStorage getInstance() {
        return instance;
    }

    //the modifier "synchronized" is added to addHay(), removeHay()
    //and getHayQuantity(). This will be discussed further in chapter
    //7 "Concurrency". For now, however, you just need to know that
    //they prevent two processes from running the same method at
    //the exact same time
    public synchronized void addHay(int amount) {
        quantity += amount;
    }
    public synchronized boolean removeHay (int amount) {
        if(quantity < amount) return false;
        quantity -= amount;
        return true;
    }
    public synchronized int getHayQuantity() {
        return quantity;
    }
}
