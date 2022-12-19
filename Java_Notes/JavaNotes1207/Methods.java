package Java_Notes.JavaNotes1207;

import javax.management.RuntimeErrorException;


public class Methods {
    /*
     * Methods are reusable code that is attached to a class or interface. They are useful when you need to repreatablly 
     * execute some code but don't exactly known when the code will need to be executed. Instead of having to rewrite your
     * code, you just call the method you create
     */

     /*public: is the access modifier: this method can be referenced anywhere in our code
      * void: is the return type: this method does not return any data
      doSomething: is the name of the method, so it is how we actually invoke the method
      input: is the name of the parameter associated with the method: whatever String we provide the method
      will be referenced by the variable input inside of the method
      */
      public static void main(String[] args) {
        Methods obj = new Methods();
        obj.doSomething("Oogie Boogie");

        obj.addFive(5);//this by itself doesn't do anything for us: we need to assign the return value to a variable
        //this is one way to interact with the return value from addFive method
        int returnValue = obj.addFive(6);
        System.out.println(returnValue);
        //This will accomplish the same goal as above, but I can't reuse the result of the addFive method somewhere else
        System.out.println(obj.addFive(6)); 
    obj.exceptionsHappen(6);


      }
     public void doSomething(String input){
        System.out.println("You enter " + input);
     }

     public int addFive(int num){
        return num + 5;
     }
    
     public int exceptionsHappen(int num){

        try {
            return 100/num;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            //return 0; this fix the error by return 0 if divide by 0;
            //or
            throw new RuntimeException("Can't divide by zero");
        }
     }
}
