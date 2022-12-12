package Java_Notes.JavaNotes1207;

public class Car {
    //For this example we can pretend we are writing an app for a car videogame.

    // All cars are going to share some properties in our code.
    public String owner; //field that attach to class.
    public int gas;
    // All classes have a special method (methods are repeatable code) that handles creating an object of the class.
    //this is called instantiation.


    public static int count; // Static keyword means the field/method is Shared across all instances(object) of class.



    /*what we are doing here is creating our own constructor that handles setting the value of the owner field when 
     * any car object is created
     */
    public Car(String owner, int gas){ //owner in here is parameter of constructor.
        this.owner = owner;
        this.gas = gas; //this is a reference to the object being created, we are setting whatever the value of owner
        //to the object's owner field.
        count++;// This keyword is not required since the field is shared across all objects of the Car class.
    }
    //You can create more than one constructor, the compiler will know how to handle them in your code depending on the
    //arguments you provide.
    public Car(){
        count++;
    }//This is a default constructor.
    public static void main(String[] args) {
        System.out.println(Car.count); //0 becasue no car has been created yet.


        Car myCar = new Car();  //anytime you see () after a word or phrase you know it is a method being called
        myCar.owner = "Joe"; //here we set the value of the owener property for the Car "myCar"
        System.out.println(myCar.owner); // here we confirm that Joe is in fact the owner.
        
        Car mattDamonCar = new Car("MattDamon", 100);

        // to call the drive method I must have a Car object to do it: I can't call the method by itself
        mattDamonCar.drive(); //make sure not to forget the () when call method.

        System.out.println(Car.count); // should be 2 because there are 2 cars.

        Car.checkCars();
    }
    /*public: access modifier, in this case, we are saying this method can be called by any object anywhere in our code
     * void: return type, in this case, we are saying this method does not return any data'
     * drive: name of the method, method names should give a decent idea of what is being accomplished by your code.
     */
    public void drive(){ //this is non static method with mean it belong to object.
        System.out.println("Vroom Vroom");
        this.gas -= 10;
        System.out.println(this.gas);
    }
// by adding the static keyword to the method we indicate the method belongs to the class proper, and so is called by the class, not individual objects
    public static void checkCars(){
        // System.out.println("there are " + Car.count + " cars created!");
        System.out.println("there are " + count + " cars created!");
    } 
}
