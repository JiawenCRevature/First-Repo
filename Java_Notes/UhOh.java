package Java_Notes;

public class UhOh {
    /*
     * Anytime something goes wrong in your code Java will "throw" an exception. This is the default behavior
     * for handling things going wrong in your code. If you as a developer want to "handle" these exceptions you
     * have to make use of try/catch blocks
     */

     public static void main(String[] args) {
        //System.out.println(10/0);//ArithmeticExceptoinException: divide(/) by zero
        try {
            //code to execute that might fail
            System.out.println(10/0);
        } catch (ArithmeticException e) { //this exception is thrown if we try to divide by zero.
            // TODO: handle exception
            System.out.println("You can't divide by zero silly: try again"); //print out own message.
             //or e.getMessage();(could print out the exception message)
        }

        //You can handle multiple exception types individually
        try {
            //some code
        } catch (IOException e) {
            // TODO: handle exception
            //code to execute should we get an IOException
            System.out.println("File could not be find");
        }catch(ArithmeticException e){
            //code to exectue should we get an ArithmeticException
            System.out.println("Can't do the maths");
        }
        //You can also handle them the same way using a pip | to seperate the exception type
        try {
            //code here
        } catch (IOException e | ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Something went wrong");
        }

        //If you REALLY want to be generic you can just catch the base exception 
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
            //Catch all base exception.
        }
     }
}
