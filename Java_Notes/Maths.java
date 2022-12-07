package Java_Notes;

public interface Maths {
    /*
     * All interfaces will share some common characteristics
     * All fields in an interface are considered by default to be public static final
     * public: can be accessed anywhere
     * static: the value belongs to the interface, not the objects that implement the interface
     * final: the value can not be changed (Can't be override but can be overload.)
     */

    /*
     * methods in interfaces also have some default settings: they are considered by default to be public and abstract.
     */

     // I am setting the return type to void because we are going to print the result to the console.
     void add(float numOne, float numTwo); //notice I do not need to add public or abstract to the method
     
     void subtract(float numOne, float numTwo);

     void multiply(float numOne, float numTwo);

     void divide(float numOne, float numTwo);
}