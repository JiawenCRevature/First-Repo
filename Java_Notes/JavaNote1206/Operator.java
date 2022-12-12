package Java_Notes.JavaNote1206;

public class Operator {
    /*In Java you have a plethora of operators that can affect the way your code operates
     * One of the main groups of operators you should familiarize yourself with are the mathmatical operators
     * 
     */
    public static void main(String[] args) {
        // = is the assignment operator: it assigns a value to a variable;
        int add = 5 + 5;
        int subtract = 5 - 5;
        int multiply = 5 * 5;
        int divide = 5 / 5 ;
        int modulus = 5 % 5; // 0 becasue no remainder.
        /*
         * there are some nice quality of life mathmatical operators that are good to know: you can take one of the math
         * operators and add the assignment operator to it in order to change the value;
         */
        int number = 5;
        number = number + 5;
        number += 5;
        number++;
        /*This increase value by 1 or -- to decrease value by 1.
         * depending on whether you put the increment/decrement operator before or after your value you will either see the 
         * change (if you put it before the value like ++x) or you won't (if you put it after like x++)
         */
        number = 5;
        System.out.println(number++);// print 5 but number is change to 6;
        number = 5;
        System.out.println(++number);//print 6 and number is change to 6;
    }
}
