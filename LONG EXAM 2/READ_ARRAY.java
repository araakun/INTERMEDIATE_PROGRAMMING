import java.util.Arrays;
import java.util.Scanner;

public class ReviewB {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        String names[] = { "Richard", "Ashton" , "Hailey", "Yurina" , "Judith" };;
        names[0] = "Richard";
        names[1]= "Ashton";
        names[2]= "Hailey";
        names[3]= "Yurina";
        names[4]= "Judith";
        int index, x, y;
		int size = 5;
        int element = Arrays.asList(names).indexOf("");
        
        System.out.println(Arrays.toString(names));

        System.out.print("Enter the index number to delete: ");
        index = scan.nextInt();

        for (index = 0; index < size; index++) { // in order to check the index of the element

            if (index == element) { //this will check the element's index in the array
                
                //This part will remove the element and arrange the orders without changing the index
                
                for (y = element; y < (size - 1); y++) {
                    
                   names[y] = names[y + 1];
                    
                }

                size--; // these will decrement the value of the index whenever it changes
                
                index--;// to check all the elements in the array (this is especially used when both elements who are the same is next to each other
                    // so that the program will not skip nothing, and will go back to index 0 to check every element in the array
                
                // 30 30 40
                
            }

        }
        
        //condition made in order to check if the user's input can be found in the array
        if ((index != 0) && (index != 1) && (index != 2) && (index != 3) && (index != 4)) { 

            System.out.println("Error! No Element Found");

        }
        System.out.print("New list: ");
        
        for (x = 0; x < size; x++) { // Condition to print the Array 
            
            System.out.print(names[x] + " , ");
            
        }
        
        System.out.println();

    scan.close();

    while (size > 0); //Will stop the loop or the program when size is equal to 0    
    System.out.println("Array is Empty"); // Will print to inform the user that the program has ended due to the array being empty
}
}



