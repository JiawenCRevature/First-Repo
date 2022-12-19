package Test;

import java.util.*;

public class TestOne{
    public static int addTwoNumbers(int x, int y) {
        //WRITE YOUR CODE HERE
          if((x <= 1000 && x >= 0)&& (y <= 1000 && y >= 0)){
            int result = x + y;
            return result;
          } else {
            System.out.println("The numbers you enter are not between 0 to 1000");
            return 0;
          }
                    
    
        
        
    }

    
    //DO NOT TOUCH THE CODE BELOW
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // sc.close();
        // System.out.println(addTwoNumbers(x,y));
        int balance = 0;
        String result = balance % 2 ==0 ?  "even" :  "odd";
        System.out.println(result);
    }
}