package Java_Notes;

public class TheBaseClass {
    
    /*
     * In Java, All classes inherit from the base Object class. This is how we get access to things like constructor
     * or helpful methods like the toString() method.
     */

    // this toString() method is inherited from the base Java Object class, there are some others that are inherited as well
    @Override
    public String toString() {
        //whatever value we return here will print to the console anytime we call the print method on these object
        return "TheBaseClass []";
    }
    public static void main(String[] args) {
        TheBaseClass obj = new TheBaseClass();
        System.out.println(obj);
    }
     
}
