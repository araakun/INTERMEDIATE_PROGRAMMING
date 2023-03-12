package ABC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ABC_Exercises {
    static Scanner scanner_w = new Scanner(System.in);
    static Scanner scanner_n = new Scanner(System.in);

    public static void main(String[] args) {
        A();
    }

    static void A(){
        System.out.print("Who are you?: ");
        String name = scanner_w.nextLine(); // stores the name of the user

        if (name.length() == 0) {
            System.out.println("Please input a name!");
            A(); return; // flags user whenever an empty name is inputted
        }

        System.out.println("Merry Christmas! "+name);

        int l = 0; // will monitor what line the program is on
        while (l < 9){
            // We used the built-in function String.repeat(n) to repeat a String n number of times
            if (l == 7 || l == 8)
                // Will print the stem of the tree
                System.out.println(" ".repeat((6) + ((17+name.length())/2 - 7)) + "*".repeat((3)));
            else {
                // Will print the leaves of the tree.
                // We will add (total length of introduction)/2 - 7 to the beginning of the tree to center it
                System.out.print(" ".repeat((7 - l) + ((17 + name.length()) / 2 - 7)));
                System.out.println("*".repeat((l * 2 + 1)));
            }
            l++;
        }
    }
    static void B(){
        // Initialize the array list
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Richard", "Ashton", "Hailey", "Yurina", "Judith"));

        while (!names.isEmpty()){ // Will continue while names is not empty
            System.out.println("Updated Elements: "+names);
            System.out.print("Delete whom? [index]: ");
            try {
                int index = scanner_n.nextInt(); // stores the index to be removed
                System.out.println(names.remove(index) + " Deleted."); // deletes the element
            }
            catch (InputMismatchException e){ // sees whether the user inputted a data type other than int
                System.out.println(">>Please input an integer for the index!<<");
                scanner_n.nextLine(); // cuts the scanner to prevent over-flow looping
            }
            catch (IndexOutOfBoundsException e){ // sees whether the user inputted an index more than the length of the array list
                System.out.println(">>Please input a valid index!<<");
            }
        }
        System.out.println("Other.Array is empty!");
    }

    static void C(){
        System.out.print("Enter a word: ");
        String text = scanner_w.nextLine();

        for (int i=0; i < text.length()/2; i++) {
            if(text.toLowerCase().charAt(i)!= text.toLowerCase().charAt(text.length() - i - 1)){
                System.out.println("False. "+ text + " Is Not A Palindrome");
                return;
            }
        }

        System.out.println("True. " + text + " Is A Palindrome");
    }

}
