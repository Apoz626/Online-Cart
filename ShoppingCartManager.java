import java.util.Scanner;

public class ShoppingCartManager {

	public static void printMenu() {
		System.out.println("MENU");
		System.out.println("a - Add item to cart");
		System.out.println("d - Remove item from cart");
		System.out.println("c - Change item quantity");
		System.out.println("i - Output items' descriptions");
		System.out.println("o - Output shopping cart");
		System.out.println("q - Quit\n");
		System.out.println("Choose an option:");
	}

	public static void executeMenu(char userChar, ShoppingCart cart, Scanner scnr) {
		if (userChar == 'a') {
			System.out.println("ADD ITEM TO CART\nEnter the item name:");
			scnr.nextLine();

			String itemName = scnr.nextLine();

			System.out.println("Enter the item description:");
			String itemDescription = scnr.nextLine();

			System.out.println("Enter the item price:");
			int itemPrice = scnr.nextInt();

			System.out.println("Enter the item quantity:");
			int itemQuantity = scnr.nextInt();

			cart.addItem(new ItemToPurchase(itemName, itemDescription, itemPrice, itemQuantity));
		}

		else if (userChar == 'd') {
			if (cart.getNumItemsInCart() == 0) {
				System.out.println("SHOPPING CART IS EMPTY");

			}

			else {
				System.out.println("REMOVE ITEM FROM CART");
				System.out.println("Enter name of item to remove: ");
				scnr.nextLine();

				String itemName = scnr.nextLine();

				cart.removeItem(itemName);

			}
		}

		else if (userChar == 'c') {
			if (cart.getNumItemsInCart() == 0) {
				System.out.println("SHOPPING CART IS EMPTY");
			}

			else {
				System.out.println("CHANGE ITEM QUANTITY");
				System.out.println("Enter the item name: ");
				scnr.nextLine();

				String itemName = scnr.nextLine();

				System.out.println("Enter the new quantity: ");

				int itemQuantity = scnr.nextInt();

				cart.modifyItem(itemName, itemQuantity);
			}

		}

		else if (userChar == 'i') {
			cart.printDescriptions();
		}

		else if (userChar == 'o') {
			cart.printTotal();
		}
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String userName;
		String userDate;
		char userChar = '0';

		System.out.println("Enter Customer's Name: ");
		userName = scnr.nextLine();

		System.out.println("Enter Today's Date: ");
		userDate = scnr.nextLine();

		System.out.println("\nCustomer Name: " + userName);
		System.out.println("Today's Date: " + userDate);

		ShoppingCart cart = new ShoppingCart(userName, userDate);

		while (userChar != 'q') {
			System.out.println();
			ShoppingCartManager.printMenu();
			userChar = scnr.next().charAt(0);

			if (userChar == 'a' || userChar == 'd' || userChar == 'c' || userChar == 'i' || userChar == 'o'
					|| userChar == 'q') {
				ShoppingCartManager.executeMenu(userChar, cart, scnr);
			}

			else {
				System.out.println("Invalid Option");
			}
		}

	}
}