package Java_Notes;

public class NoBilly extends RuntimeException {//extend Exception to make a checked exception.
    /*
     * There are two ways to create your own exceptions, and this is accomplished by either extending the 
     * Exception or RuntimeException class.If your custom exception extends Exception it will be a "checked exception",
     * meaning that any code that chould throw the exception MUST be handled.
     * If the exception extends RuntimeException then it is a "unchecked exception" and you do NOT need to handle
     * the code that might produce the exception.
     */

     public NoBilly(String message){
        super(message);
     }
     //this is all you need to do to create a custom exception!
}
