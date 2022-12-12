package Java_Notes.JavaNotes1207;

public class Arrray {
    /*
     * Arrays are data structures in Java that we can use to hold other data. Arrays are immutable structures
     * that are set once they are created.
     */
    public static void main(String[] args) {
        int[] numbers = {1,3,5,6,7,8,8,2};
        int[] evenNumbers = new int[4]; // Contained four 0 value inside of it that waiting for change.
        // evenNumbers[0] = 2;
        // evenNumbers[1] = 4;
        for(int i = 1; i <= evenNumbers.length; i++){
            System.out.println(evenNumbers[i - 1] = i *2);
        }

        /*arrays will work a little differently if you are not working with primitives: let's see what happens when we
         * make an array of strings instead of numbers
         */
        String[] words = {"apple", "Hello World!", "Revature", "coffee", "code"};
        for(int x = 0; x < words.length; x++){
            System.out.println(words[x]);
        }

        String[] noWordsYet = new String[3]; // contain null becasue non-primitive type(string) return null;
        for(int x=0; x< noWordsYet.length; x++){
            System.out.println(noWordsYet[x]);
        }

        String[] noWordsYet2 = new String[3];
        String characters = "avced";
        for(int x=0; x< noWordsYet2.length; x++){
            noWordsYet2[x] = characters;
            System.out.println(noWordsYet2[x]);
            characters += characters; // this replace the old string to a new one;
        }
        /*
         *  Two things are happening above:
         * 1. the value of characters is being concatenated with itself, so "avced" is being put with "avced to create a new 
         * string taht looks like so : "avcedavced".
         * 2.the variable characters is having its reference changed to the newly created string from step one
         * It is important to realize that the initially created string did not change: it was used to created another string
         * value and then it lost its previous reference (characters the variable.)
         */

    }
}
