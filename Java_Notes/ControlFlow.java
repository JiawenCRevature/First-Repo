package Java_Notes;

public class ControlFlow {
    /*
     * When we are talking about control flow we are discussing the tools available to us to determine what
     * part of our code execute, when they should execute, and the conditions under which they will execute.
     */
    // must have main method to execute Java code.
    public static void main(String[] args) {
        int visaCard = 100; // This visa card variable represents the $100 you got for your birthday
        int burgerCost = 45; //Burger cost variable
        if(visaCard != burgerCost){ // by using the not operator we tell the if statement to trigger on a 
            // false statement instead of a true one
            System.out.println("Congrat on buying a burger!");
            
        }
        // these two are similar.
        if(!false){
            System.out.println("Congrat on buying a burger!");
        }
    }   
}
