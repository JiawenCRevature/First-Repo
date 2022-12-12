package Java_Notes.JavaNote1206;

public class ControlFlowTwo {
    /*
     * often you will find yourself needing to execute one of many potential pieces of code depending on the 
     * data your code is working with. Going back to the idea of getting a visa for your birthday, if you don't
     * have enough many on the card to make a purchase you might find it helpful to get back the actual value on the card.
     */
    public static void main(String[] args) {
    int visa = 100;
    int cost = 500;

        if(visa >= cost){
            System.out.println("congrat on your purchase");
        } else {
            System.out.println("You do not have enough money to make this purchase");
        }
    
    String username = "username";
    String password = "password";
    if(username.equals("username") && password.equals("password")){//!password.equals("password") means unequal to 
    //username.equals("username") == boolean true so you can add ! in front to make it false.
        System.out.println("logged in successfully");
    } else {
        System.out.println("Incorrect username or password!");
    }

    System.out.println(username != "username");
    }
    
}
