package Java_Notes.JavaNotes1207;

public class LunchRoom {
    public static void main(String[] args) {
        //Both options below are perfectly valid ways of creating Burrito and Croissant objects
        //we can reference their parent class, Food, as the type, and then make the specific type of food object!
        
        Burrito myBurrito = new Burrito();//call Burrito constructor to be burrito object. Same as Croissant.
        //Be aware: if you set the type to the parent but define child specific method or field you will NOT have 
        // access to it if the type is of the parent (myBurrito loses access to the addSourCream method if its type is Food)
        Food myCroissant = new Croissant();

        myBurrito.eat();
        myCroissant.eat();
        System.out.println();//just for space

        myBurrito.cook();
        myCroissant.cook();
        System.out.println();

        myBurrito.store();
        myCroissant.store();
        System.out.println();

        myBurrito.addSourCream();
    }
}
