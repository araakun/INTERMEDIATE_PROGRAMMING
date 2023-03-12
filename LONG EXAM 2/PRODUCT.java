
public class Product extends question2 {

	
	// Attributes of the product class
	public String productName;
	public double price;
	public int itemStock;
	public int productID;
	
	Product (int productID, String productName, double price, int itemStock){
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.itemStock = itemStock;
	} // Constructor for the product to be accessed by the main method
	
	
	// getters method to return the specified value when called
	public double getPayment() {
		return price * itemStock;
	}

	public int getID() {
		return productID;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getItemStock() {
		return itemStock;
	}
	
    public static void printList() {
    	
    	product_list.add("Shampoo");
    	product_list.add("Toothpaste");
    	product_list.add("Soap");
    	
		System.out.println("\nList of products:\n");
		System.out.println("Product ID: "+ product1.getID());
		System.out.println("Product Name: "+ product_list.get(0));
		System.out.println("Product Price: "+ product1.getPrice());
		System.out.println("Stock: "+ product1.getItemStock());
		System.out.println("");
		System.out.println("Product ID: "+ product2.getID());
		System.out.println("Product Name: "+ product_list.get(1));
		System.out.println("Product Price: "+ product2.getPrice());
		System.out.println("Stock: "+ product2.getItemStock());
		System.out.println("");
		System.out.println("Product ID: "+ product3.getID());
		System.out.println("Product Name: "+ product_list.get(2));
		System.out.println("Product Price: "+ product3.getPrice());
		System.out.println("Stock: "+ product3.getItemStock());
		System.out.println();
    }
    
    public static void printCart() {
		if(userCart.contains("Shampoo")) {
			System.out.println("Product ID: " + product1.getID());
			System.out.println("Product Name: " + product_list.get(0));
			System.out.println("Product Price: " + product1.getPrice() * cartShampoo);
			System.out.println("Quantity: " + cartShampoo);
			System.out.println();
		}
		if(userCart.contains("Toothpaste")){
			System.out.println("Product ID: " + product2.getID());
			System.out.println("Product Name: " + product_list.get(1));
			System.out.println("Product Price: " + product2.getPrice() * cartToothpaste);
			System.out.println("Quantity: " + cartToothpaste);
			System.out.println();
		}
		if(userCart.contains("Soap")) {
			System.out.println("Product ID: " + product3.getID());
			System.out.println("Product Name: " + product_list.get(2));
			System.out.println("Product Price: " + product3.getPrice() * cartSoap);
			System.out.println("Quantity: " + cartSoap);
			System.out.println();
		}
    }
    
    public static void printCheckout() {
		if(userCart.contains("Shampoo")) {
			System.out.println("Product Name: " + product_list.get(0));
			System.out.println("Product Price: " + product1.getPrice());
			System.out.println("Quantity: " + numShampoo);
			System.out.println();
		}
		if(userCart.contains("Toothpaste")){
			System.out.println("Product Name: " + product_list.get(1));
			System.out.println("Product Price: " + product2.getPrice());
			System.out.println("Quantity: " + cartToothpaste);
			System.out.println();
		}
		if(userCart.contains("Soap")) {
			System.out.println("Product Name: " + product_list.get(2));
			System.out.println("Product Price: " + product3.getPrice());
			System.out.println("Quantity: " + cartSoap);
			System.out.println();
		}
		System.out.println("--");
		System.out.println("Your total is: " + userPayment);
		System.out.println();
    }
}
