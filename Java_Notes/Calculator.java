package Java_Notes;

public class Calculator implements Maths{

    public int[] convertFloat(float num, float num2){
        int[] intNum = new int[2];
        intNum[0] = Math.round(num);//Math are from java.lang.Math. java automaticly import all lang package. 
        intNum[1] = Math.round(num2);
        return intNum;
    }
    @Override
    public void add(float numOne, float numTwo) {
        // Math is a class provided by Java itself, round is one of its methods.
        int intOne = Math.round(numOne); //This will convert our float to an int by rounding it.
        int intTwo = Math.round(numTwo);
        System.out.println(intOne + intTwo);

        
    }

    @Override
    public void subtract(float numOne, float numTwo) {
          // to turn these floats into ints we could do type casting: this will truncate any decimal values
        System.out.println((int)numOne - (int)numTwo);
        
    }

    @Override
    public void multiply(float numOne, float numTwo) {
        int[] integers = this.convertFloat(numOne, numTwo);
        System.out.println(integers[0]*integers[1]); // we print the value of our rounded numbers to the console
        
    }

    @Override
    public void divide(float numOne, float numTwo) {
        int[] integers = this.convertFloat(numOne, numTwo);
        System.out.println(integers[0]/integers[1]);
        
    }
    
}
