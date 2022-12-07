package Java_Notes;

import java.util.ArrayList;
import java.util.List;
//We have to import the List Interface and ArrayList class to our file with lines 1 and 2 beacause their information can
//not be found in the package (think folder with .java files) our current file is located in.


public class MoreDataStructures {
    /*Two interfaces you are going to want to become familiar with are the List and Set interfaces. These two
     * give you access to some of the more common data structures you will want to use in your Java code
     */

     /*
      * Lists are going to be your most flexible data structures: Lists are indexable, they retain order of insertion
      List also allow duplicate values. The most common kind of List you will use is an ArrayList.
      Lists make use of Generics: These are placeholders that tell Java what KIND of data is going to be used
      with the object in question.
      */

      public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(); // ArrayList has diamond bracket as well but stay empty.
        namesList.add("Billy");
        namesList.add("Sally");
        namesList.add("Teddy");
        namesList.add(0, "Adam");
        /*
         * Above we have a great example of method overloading: it is the same add method being called in all instances,
         * but the way the method works changes depending on how many arguments we provide the method
         * if we don't provide then we can determine what index position the String will be placed in, and all other string
         * in the list will be adjusted accordingly
         */
        System.out.println(namesList);
        /*
         * -When the rate of addition or removal rate is more than the read scenarios, then go for the LinkedList. 
         * On the other hand, when the frequency of the read scenarios is more than the addition or removal rate, 
         * then ArrayList takes precedence over LinkedList.
           - Since the elements of an ArrayList are stored more compact as compared to a LinkedList; therefore,
            the ArrayList is more cache-friendly as compared to the LinkedList. Thus, 
            chances for the cache miss are less in an ArrayList as compared to a LinkedList. 
            Generally, it is considered that a LinkedList is poor in cache-locality.
           -Memory overhead in the LinkedList is more as compared to the ArrayList. It is because, in a LinkedList, 
           we have two extra links (next and previous) as it is required to store the address of the previous and 
           the next nodes, and these links consume extra space. Such links are not present in an ArrayList.
         */
        
      }

}
