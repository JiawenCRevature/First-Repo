package Java_Notes;

public class StringAPI {
    /*
     * String are the simplest object we can use to represent words/phrases within our code. They are useful when we need to 
     * do things like pass messages to our users, create error messages for developers, 
     */

     /*String are immutable objects: at best, you can reasign a variable with your "updated string, but you
     do not change the initial string that was created" */
     public static void main(String[] args) {
        String myName = "Joe";
        System.out.println(myName);
        //Will ask!
        myName += " Suminski"; //a new string object is being created here, and myName has its reference changed to the brand new string
        /*
         * So this begs the questions, if you want to change your word/phrase, the easiest tool to use would be StringBuilder class.
         */
        String[] splitMyName = myName.split(" ");
        System.out.println(splitMyName); // Gives memory position.
        for(int x = 0; x < splitMyName.length; x++){
            System.out.println(splitMyName[x]);
        }

        //code challenge will ask to add this string as number.
        String numbers = "10 7 15 25 5";


         StringBuilder myWord = new StringBuilder(myName);
         System.out.println(myWord);

         myWord.reverse();
         System.out.println(myWord);

         myWord.append(" the bold!"); //Add the bold! to myWord.
        
         //String builder does not have a built in split method, but it is easy to convert your Stringbuilder back into a string
         myWord.toString().split(" ");//this is an easy way to split your stringbuilder

         /*
          * Use a regular string if you know you will not need to perfrom many(if any) operations on your word/phrase.
          
          */
        
     }
}
