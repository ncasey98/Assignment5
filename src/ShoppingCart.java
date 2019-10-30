// Nora Casey 17773075

import java.util.*;

public class ShoppingCart {

	private String name;
	private String date;
	private List<Inventory> items;
	
	// Constructor
	public ShoppingCart(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}
	
	// Setter and getter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Inventory> getItems() {
		return items;
	}

	public void setItems(List<Inventory> items) {
		this.items = items;
	}
	
	// Search for item in shop inventory
	public int searchInventory(String name, int quantity) {
		return 0;
	}

	// Add item to shopping cart
	public void addItem(String name, int quantity) {
		int index = searchInventory(name, quantity);
		if (index == -1) {
			// The item is not in inventory, print error message
			System.out.println("Sorry, this item is not in stock");
		} else {
			int b = Inventory.removeItem(index, quantity, name);
			items.add(new Inventory("", name, b, Inventory.getInventory().get(index).getPrice()));
		}
	}
	
	// Remove item from shopping cart
	public void removeItem(String name, int quantity) {
		
	}
	
	// View the contents of shopping cart
	public void viewCart() {
		// Total of cart
		double total = 0.0;
		System.out.println("Date: " +date+ "\tName: " + name);
		
		for (Inventory item : items) {
			System.out.println(item.toString());
			total += item.getPrice() * item.getQuantity();
		}
		
		System.out.printf("\n" + "Total: €%.2f", total);
	}
	
	// Sort inventory by price, compare prices to be sorted
	public int compare(Inventory item1, Inventory item2) {
		if (item1.getPrice() > item2.getPrice()) return -1;
		if (item1.getPrice() < item2.getPrice()) return 1;
		return 0;
	}
}

