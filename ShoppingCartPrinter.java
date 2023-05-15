import java.util.Scanner;

public class ShoppingCartPrinter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String itemName;
		int itemPrice = 0;
		int itemQuantity = 0;
		int item1Total = 0;
		int item2Total = 0;

		ItemToPurchase item1 = new ItemToPurchase();
		ItemToPurchase item2 = new ItemToPurchase();

		System.out.println("Item 1\nEnter the item name: ");
		itemName = scnr.nextLine();

		item1.setName(itemName);

		System.out.println("Enter the item price: ");
		itemPrice = scnr.nextInt();

		item1.setPrice(itemPrice);

		System.out.println("Enter the item quantity: ");
		itemQuantity = scnr.nextInt();

		item1.setQuantity(itemQuantity);

		System.out.println();
		scnr.nextLine();

		System.out.println("Item 2\nEnter the item name: ");
		itemName = scnr.nextLine();

		item2.setName(itemName);

		System.out.println("Enter the item price: ");
		itemPrice = scnr.nextInt();

		item2.setPrice(itemPrice);

		System.out.println("Enter the item quantity: ");
		itemQuantity = scnr.nextInt();

		item2.setQuantity(itemQuantity);

		System.out.println("TOTAL COST");

		item1Total = item1.getPrice() * item1.getQuantity();
		item2Total = item2.getPrice() * item2.getQuantity();

		item1.printItemCost();
		item2.printItemCost();

		System.out.println("\nTotal: $" + (item1Total + item2Total));
		
		scnr.close();
	}

}
