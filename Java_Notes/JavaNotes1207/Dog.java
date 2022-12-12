package Java_Notes.JavaNotes1207;

public class Dog extends Animal{

    public Dog() {
    }
    public Dog(int limbs, String name, String size, String eyeColor) {
        // super is a reference tothe parent class, in this case, the parent constructor with same parameter.
        super(limbs, name, size, eyeColor);
    }
    @Override //this annotation tells the compiler this method must implement and change.
    public void makeNoise(){
        System.out.println("Bark Bark");
    }
    @Override
    public void breath() {
        System.out.println("pant pant");
    }
    public static void main(String[] args) {
        /*notice that I set the type of data as Animal but I made a Dog object */
        Animal myDog = new Dog(4, "Fido", "medium", "green"); //I can set Cat object from animal becasue type is animal parent class.
        myDog.makeNoise();
        myDog.breath();
        System.out.println(myDog.name); //the name field comes from the parent Animal class
    }
}
