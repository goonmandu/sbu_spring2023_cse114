import java.util.Scanner;

public class Discount {
	public static void discountCalculator(int items, double unitPrice) {
		double discount;
		double unitPriceAfterDiscount;
		double unitPriceDiscountDelta;
		double finalPrice;
		if (0 <= items && items < 10) {
			discount = 0;
		} else if (10 <= items && items < 20) {
			discount = 0.2;
		} else if (20 <= items && items < 50) {
			discount = 0.3;
		} else if (50 <= items && items < 100) {
			discount = 0.4;
		} else if (100 <= items) {
			discount = 0.5;
		} else {
			System.out.println("You cannot purchase a negative quantity!");
			discount = 0;
			return;
		}
		unitPriceAfterDiscount = unitPrice * (1 - discount);
		unitPriceDiscountDelta = unitPrice - unitPriceAfterDiscount;
		finalPrice = unitPriceAfterDiscount * items;
		System.out.println(String.format("Discount: %d%%", (int) (discount * 100)));
		System.out.println(String.format("Discounted Price: $%.2f", unitPriceAfterDiscount));
		System.out.println(String.format("Discounted Amount Per Unit: $%.2f", unitPriceDiscountDelta));
		System.out.println(String.format("Total Price: $%.2f * %d = $%.2f", unitPriceAfterDiscount,
																		    items,
																		    finalPrice));
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Fixed Price: $");
		var unitPrice = s.nextDouble();
		System.out.print("Quantity: ");
		var items = s.nextInt();
		
		discountCalculator(items, unitPrice);
		s.close();
	}
}
