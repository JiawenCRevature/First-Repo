package Java_Notes.JavaNotes1207;

public class TheBaseClass {
    
    public String name;
    public int age;
    public boolean isAwake;

    public TheBaseClass(String name, int age, boolean isAwake) {
        this.name = name;
        this.age = age;
        this.isAwake = isAwake;
    }
    /*
     * In Java, All classes inherit from the base Object class. This is how we get access to things like constructor
     * or helpful methods like the toString() method.
     */

    // this toString() method is inherited from the base Java Object class, there are some others that are inherited as well
    @Override
    public String toString() {
        //whatever value we return here will print to the console anytime we call the print method on these object
        return "TheBaseClass [name=" + name + ", age=" + age + ", isAwake=" + isAwake + "]";
    }
    public static void main(String[] args) {
        TheBaseClass obj = new TheBaseClass("Timmy", 47, false);
        System.out.println(obj);
    }
     
}
