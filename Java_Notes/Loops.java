package Java_Notes;
import java.util.ArrayList;

public class Loops {
    //Loops are another way of controlling the flow of your application. These are particularly useful when you
    //need an operation to happen multiple times. The easiest way to make this happen is with a for loop
    public static void main(String[] args) {
      // A for loop has three basic parts: a controlling value, a condition under which the loop continues, and a change
      //to the controlling value
      /*you can either use your ide to stop the code or press ctr + c with the terminal selected to kill the process */
      for(int x = 0; x <= 10; x++){
        System.out.println(x);
      }
      int[] number = {1,3,5,9,15,35,46,86};

      for(int i = 0; i < number.length; i++){//i++ happen at the end of the for loop cycle no matter what (++i is the same)
        System.out.println(number[i]);
      }

      //++i change value immediately
      int y =5;
      System.out.println(++y);
      System.out.println(y++);
      System.out.println(y); 
      //while loop
      while(y < 10){
        System.out.println(y);
        y++;
      }
      /*For loops are particularly useful when you know how many times you need to do something, or you are working through a 
      data collection. A while loop is going to be more useful when you can't be sure how many times an operation needs to happen,
      or your exit condition for the loop does not lend itself well to basic mathmatics */
      
      do {
        System.out.println(y);
        y++;
      }while (y > 10);

      //import java.util.ArrayList; is important to use arraylist.
      ArrayList<String> cars = new ArrayList<>();
      cars.add("car");

    }

}
