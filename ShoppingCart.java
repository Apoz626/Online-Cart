import java.util.ArrayList;

public class ShoppingCart {
	private String customerName = "none";
	private String currentDate = "January 1, 2016";
	private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();

	public ShoppingCart(String customerName, String currentDate) {
		this.customerName = customerName;
		this.currentDate = currentDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getDate() {
		return currentDate;
	}

	public void addItem(ItemToPurchase newItem) {
		cartItems.add(newItem);
	}

	public void removeItem(String itemName) {
		int i = 0;

		while (i != cartItems.size()) {
			if (cartItems.get(i).getName().compareTo(itemName) == 0) {
				cartItems.remove(i);
			}

			else {
				++i;
			}
		}

	}

	public void modifyItem(String itemName, int userQuantity) {
		for (int i = 0; i < cartItems.size(); ++i) {
			if (cartItems.get(i).getName().compareTo(itemName) == 0) {
				cartItems.get(i).setQuantity(userQuantity);
			}
		}
	}

	public int getNumItemsInCart() {
		return cartItems.size();
	}

	public int getCostOfCart() {
		int cartCost = 0;
		for (int i = 0; i < cartItems.size(); ++i) {
			cartCost = cartCost + cartItems.get(i).getPrice();
		}
		return cartCost;
	}

	public void printTotal() {
		int i = 0;
		int j = 0;
		int itemTotal = 0;

		if (cartItems.size() == 0) {
			System.out.println("SHOPPING CART IS EMPTY");
		}

		else {
			System.out.println("OUTPUT SHOPPING CART");
			System.out.println(customerName + "'s Shopping Cart - " + currentDate);
			System.out.println("Number of Items: " + cartItems.size() + "\n");

			for (i = 0; i < cartItems.size(); ++i) {
				cartItems.get(i).printItemCost();
			}

			for (j = 0; j < cartItems.size(); ++j) {
				itemTotal = itemTotal + (cartItems.get(j).getPrice() * cartItems.get(j).getQuantity());
			}

			System.out.println();
			System.out.println("Total: $" + itemTotal);
		}
	}

	public void printDescriptions() {
		if (cartItems.size() == 0) {
			System.out.println("SHOPPING CART IS EMPTY");
		}

		else {
			int i = 0;

			System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
			System.out.println(customerName + "'s Shopping Cart - " + currentDate + "\n");
			System.out.println("Item Descriptions");

			for (i = 0; i < cartItems.size(); ++i) {
				System.out.println(cartItems.get(i).getName() + ": " + cartItems.get(i).getDescription());
			}
		}
	}
}
