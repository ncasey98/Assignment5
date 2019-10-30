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
	
	// Remove item from inventory when it is added to cart
	
	
	// Add item back to inventory when it is removed from a shopping cart
	public void addItem(int name, int quantity) {
		items.get(name).quantity += quantity;
	}
	
}
