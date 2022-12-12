package Java_Notes.JavaNotes1207;

public class Croissant extends Food{

    public Croissant(String name, String taste, int calorieCount, boolean isCandy, String texture, String smell,
            boolean isCooked) {
        super(name, taste, calorieCount, isCandy, texture, smell, isCooked);
    }

    public Croissant() {
    }

    @Override
    public void eat() {
       System.out.println("tenderly hold the bread and take a nibble");
        
    }

    @Override
    public void cook() {
        System.out.println("make the dough, bake it for just the right amount of time at just the right temp");
        
    }

    @Override
    public void store() {
        System.out.println("what are you doing? you want to eat these thing when fresh!");
    }
    public static void main(String[] args) {
        
    }
}
