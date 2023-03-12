package EasyPeasy;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        //Establish scanner
        Scanner scan = new Scanner(System.in);

        //Ask the user String input
        System.out.print("Input: ");
        String word = scan.nextLine();

        //Print output of the method isPalindromic(A). Print different result based on whether the method returns true or false
        System.out.println("Output: " + (isPalindromic(word) ? "True. It is a PALINDROME": "False. Not a PALINDROME"));

        //Close the scanner
        scan.close();
    }

    //Method to reverse the input and return whether the input is a palindrome or not.
    public static boolean isPalindromic(String word) {
        //Empty variable reverse and lowercase the input
        String reverse = "";
        word = word.toLowerCase();

        //Turn input into a char array
        char[] word_Array = word.toCharArray();

        //Loop that reverses the char array. Turn each character into String then concat each character into the variable Reverse
        for(int i = word_Array.length -1; i >= 0; i--){
            String letter = String.valueOf(word_Array[i]);
            reverse = reverse.concat(letter);
        }

        //Print out the reversed input
        System.out.println("Reversed word: " + reverse);

        //Return true or false using the .contentEquals() method
        return reverse.contentEquals(word);
    }
}
