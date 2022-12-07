package Java_Notes;

public class Cat extends Animal{

    public Cat() {
    }
    public Cat(int limbs, String name, String size, String eyeColor){
        super(limbs, name, size, eyeColor);
    }
    
    @Override
    public void breath() {
        System.out.println("pur");
    }
    @Override
    public void makeNoise() {
        System.out.println("meow");
    }
    public static void main(String[] args) {
        Cat myCat = new Cat(4, "Shadow", "small", "orange");
        
    }
}
