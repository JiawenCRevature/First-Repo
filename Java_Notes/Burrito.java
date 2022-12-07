package Java_Notes;

public class Burrito extends Food{
    
    public Burrito(String name, String taste, int calorieCount, boolean isCandy, String texture, String smell,
            boolean isCooked) {
        super(name, taste, calorieCount, isCandy, texture, smell, isCooked);
    }

    public Burrito() {
    }
    
    public static void main(String[] args) {
        
    }

    @Override
    public void eat() {
        System.out.println("Chomp chomp!");
        
    }

    @Override
    public void cook() {
        System.out.println("I chop the veggies, fry the meat, wrap them in a tortia shell");
        this.isCooked = true;
    }

    @Override
    public void store() {
        System.out.println("I put the components of the burrito into the fridge");
        
    }

    public void addSourCream(){
        this.calorieCount+= 100;
        System.out.println("Total calories are: " + this.calorieCount);
    }
}
