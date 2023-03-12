import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class question2 {
	
	static Scanner scan = new Scanner(System.in); // An object scanner to store the user's data
	static int userInput;
	static String confirmation;
	static Product product1 = new Product(1, "Shampoo", 120.50, 5);
	static Product product2 = new Product(2, "Toothpaste", 75.25, 10);
	static Product product3 = new Product(3, "Soap", 45.00, 2);
	static ArrayList<String> product_list = new ArrayList<String>(); // An array of products to hold the products
	static ArrayList<String> userCart = new ArrayList<String>(); // An ArrayList to store all the added products of the user in the system through the "cart"
	static int[] itemStocks = {5,10,2};
	static double userPayment = 0;
	static int numShampoo = 5, numToothpaste = 10, numSoap = 2;
	static int cartShampoo = 0, cartToothpaste = 0, cartSoap = 0;
	
	// Print methods to print out all the dialogues to the user while accessing different variables and data types
	// This method also used the get method to display the array and arraylist's elements
	// The system also accessed the Product class to access its constructor and getters and setters method
	public static void main(String [] args) {
		
		try { // To avoid any errors when the user inputs an invalid input, the catch method will catch the errors and displays to the user that the input is invalid
			while(true) {
			System.out.println("**********POS MENU**********");
			System.out.println("1. Show Products");
			System.out.println("2. Add to Cart by ID");
			System.out.println("3. Show Cart");
			System.out.println("4. Checkout");
			System.out.println("5. Exit");
			System.out.print("> ");
			userInput = scan.nextInt();
					if(userInput == 1) {
						Product.printList(); // Calls printList method to print the list of products
					}
					else if(userInput == 2) {
						System.out.print("Please Enter Product ID: ");
						userInput = scan.nextInt();
							if(userInput == 1) {
									System.out.print("Please Enter Quantity: ");
									userInput = scan.nextInt();
									if(userInput <= 0) {
										System.out.println("Try Again!");
									}
									else if(userInput <= itemStocks[0]) {
										if(numShampoo == 0) {
											System.out.println("Not Enough Stock\n");
										}
										else {
											userCart.add("1"); // Adding a string value to the arraylist of user cart
											userCart.add("Shampoo");
											userCart.add("120.50");
											numShampoo -= userInput; // Adding the user's input regarding to their respective quantity that they have entered
											cartShampoo += userInput;
											System.out.println("Price per item: " + product1.price);
											System.out.println("Total: "+product1.price * userInput);
											userPayment += userInput * product1.price; // Stores the total amount to be paid by multiplying the quantity (user's input) and the product price
											System.out.println("Added to Cart\n");
										}
									}
									else {
										System.out.println("Not Enough Stock\n");
									}
							}
							else if(userInput == 2) {
								if(userInput <= itemStocks[0]) {
									System.out.print("Please Enter Quantity: ");
									userInput = scan.nextInt();
									if(userInput <= 0) {
										System.out.println("Try Again!");
									}
									else if(userInput <= itemStocks[1]) {
										if(numToothpaste == 0) {
											System.out.println("Not Enough Stock\n");
										}
										else {
											userCart.add("2");
											userCart.add("Toothpaste");
											userCart.add("75.25");
											numToothpaste -= userInput;
											cartToothpaste += userInput;
											System.out.println("Price per item: " + product2.price);
											System.out.println("Total: "+product2.price * userInput);
											userPayment += product2.price * userInput;
											System.out.println("Added to Cart\n");
										}
									}
									else {
										System.out.println("Not Enough Stock\n");
									}
								}
							}
							else if(userInput == 3) {
										System.out.print("Please Enter Quantity: ");
										userInput = scan.nextInt();
										if(userInput <= 0) {
											System.out.println("Try Again!");
										}
										else if(userInput <= itemStocks[2]) {
											if(numSoap == 0) {
												System.out.println("Not Enough Stock\n");
											}
											else {
												userCart.add("3");
												userCart.add("Soap");
												userCart.add("45.00");
												System.out.println("Price per item: " + product3.price);
												System.out.println("Total: "+product3.price * userInput);
												userPayment += product3.price * userInput;
												numSoap -= userInput;
												cartSoap += userInput;
												System.out.println("Added to Cart\n");
											}
										}
										else {
											System.out.println("Not Enough Stock\n");
										}
									}
					}
					else if(userInput == 3) {
						System.out.println("**********CURRENT CART**********");
						if(userCart.isEmpty()) {
							System.out.println("You don't have any items!\n");
						}
						else {
							Product.printCart(); // Accessing the printCart method
						}
					}
					else if(userInput == 4) {
						System.out.println("**********CHECKOUT**********");
						Product.printCheckout(); // Calling the printCheckout Method
					}
					else if(userInput == 5) {
						System.out.println("Thank you for Shopping!");
						break;
					}
			}
		}
		catch(Exception e) {
		System.out.println("Invalid Input! Please Try Again!");
		}
	}
}
