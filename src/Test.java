import java.util.List;

public class Test {

	public static void main(String args[]) {
		
		// Initialise new carts
		ShoppingCart cart1 = new ShoppingCart("Nora", "30/10/2019");
		ShoppingCart cart2 = new ShoppingCart("Casey", "04/05/2020");
		
		List<Inventory> items = null;
		// Add items to Inventory list
		items.add(new Inventory("1000", "Apple", 30, 2.50));
		items.add(new Inventory("1001", "Orange", 40, 2.00));
		items.add(new Inventory("2001", "Milk", 10, 2.39));
		items.add(new Inventory("2002", "Orange Juice", 20, 1.99));
		items.add(new Inventory("3001", "Blue Cheese", 10, 2.25));
		items.add(new Inventory("3002", "Cheddar", 20, 2.79));
		items.add(new Inventory("4001", "Chocolate", 40, 2.99));
		items.add(new Inventory("4002", "Candy", 30, 0.99));
		items.add(new Inventory("5001", "Beef", 10, 5.00));
		items.add(new Inventory("5002", "Chicken", 10, 4.00));
		
		// Print inventory before transactions
		Inventory.printInventory();
		
		// Fill cart1
		System.out.println("Cart 1");
		cart1.addItem("Apple", 2);
		cart1.addItem("Orange", 5);
		cart1.addItem("Milk", 2);
		cart1.addItem("Blue Cheese", 4);
		cart1.addItem("Candy", 25);
		cart1.removeItem("Candy", 5);
		
		cart1.viewCart();
		
		// Fill cart2
		System.out.println("Cart 2");
		cart2.addItem("Apple", 2);
		cart2.addItem("Orange", 5);
		cart2.addItem("Milk", 2);
		cart2.addItem("Blue Cheese", 4);
		cart2.addItem("Cheddar", 3);
		cart2.addItem("Beef", 6);
		cart2.addItem("Candy", 20);
		cart2.addItem("Chocolate", 10);
		cart2.addItem("Chicken", 2);
		cart2.removeItem("Chocolate", 5);
		cart2.removeItem("Blue Cheese", 1);
		
		cart2.viewCart();
		// Print inventory after transactions
		Inventory.printInventory();
		
	}
}
