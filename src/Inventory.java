// Nora Casey 17773075

import java.util.*;

public class Inventory {

	private String sku;
	private String itemName;
	private double price;
	private int quantity;
	private static List<Inventory> items = null;
	
	public Inventory(String sku, String itemName, int quantity, double price) {
		super();
		this.sku = sku;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public static List<Inventory> getInventory() {
		return items;
	}
	
	// Print inventory
	public static void printInventory() {
		for (Inventory item : items) {
			System.out.println(item.toString());
		}
	}
	
	// Remove item from inventory when it is added to cart
	public static int removeItem(int wanted, int quantity, String name) {
		// Check if there is enough stock to put into shopping cart
		if (quantity <= items.get(wanted).getQuantity()) {
			// if there is stock, remove requested from inventory
			items.get(wanted).setQuantity(items.get(wanted).getQuantity() - quantity);
			return quantity;
		} else {
			// Not enough inventory in stock, add what is in stock to cart and 
			// print error message
			int wantedQuantity = items.get(wanted).getQuantity();
			items.get(wanted).setQuantity(0);
			System.out.println("Cannot add " +quantity+ " " + items.get(wanted).getItemName() + " to" + name+"'s");
			return wantedQuantity;
		}
	}
	
	// Add item back to inventory when it is removed from a shopping cart
	public void addItem(int name, int quantity) {
		items.get(name).quantity += quantity;
	}
	
}
