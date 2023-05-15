
public class ItemToPurchase {

	private String itemName;
	private String itemDescription;
	private int itemPrice;
	private int itemQuantity;

	public ItemToPurchase() {
		itemName = "none";
		itemDescription = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}

	public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}

	public void setName(String name) {
		itemName = name;
	}

	public void setDescription(String description) {
		itemDescription = description;
	}

	public void setPrice(int price) {
		itemPrice = price;
	}

	public void setQuantity(int quantity) {
		itemQuantity = quantity;
	}

	public String getName() {
		return itemName;
	}

	public String getDescription() {
		return itemDescription;
	}

	public int getPrice() {
		return itemPrice;
	}

	public int getQuantity() {
		return itemQuantity;
	}

	public void printItemCost() {
		System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemQuantity * itemPrice));
	}

	public void printItemDescription() {
		System.out.println(itemName + ": " + itemDescription + ".");
	}
}
