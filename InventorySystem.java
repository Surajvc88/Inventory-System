package Tasks;
	
import java.util.ArrayList;
import java.util.Scanner;

	class Product {
	    String name;
	    int quantity;
	    static ArrayList<Product> inventory;

	    Product(String name, int quantity) 
	    {
	        this.name	  = name;
	        this.quantity = quantity;
	    }
	
	  static void addItem() 
	  	{
		  	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter product name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter quantity: ");
	        int qty = sc.nextInt();
			inventory.add(new Product(name, qty));
	        System.out.println("Product added.");
	        sc.close();
	    }

	    static void removeItem() 
	    {
	    	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter product name to remove: ");
	        String name = sc.nextLine();
			inventory.removeIf(p -> p.name.equalsIgnoreCase(name));
	        System.out.println("Product removed if existed.");
	        sc.close();
	    }

	    static void listItems() 
	    {
	        System.out.println("Inventory List:");
	        for (Product p : inventory) 
	        {
	            System.out.println(p.name + " - " + p.quantity);
	        }
	    }

	public class InventorySystem {
	    static ArrayList<Product> inventory = new ArrayList<>();
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\n1. Add Item\n2. Remove Item\n3. List Items\n4. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1: addItem(); break;
	                case 2: removeItem(); break;
	                case 3: listItems(); break;
	                case 4: System.exit(0);
	                default: System.out.println("Invalid choice!");
	            }
	        }
	    }
	    
	}
	  
}
