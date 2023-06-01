import java.util.Scanner;

public class DollarChangeMaker {
	public static void dollarChangeMaker(int cents) {
		String ret = "";
		int hundreds, fifties, twenties, tens, fives, ones, quarters, dimes, nickels;
		hundreds = cents / 10000;
		cents %= 10000;
		fifties = cents / 5000;
		cents %= 5000;
		twenties = cents / 2000;
		cents %= 2000;
		tens = cents / 1000;
		cents %= 1000;
		fives = cents / 500;
		cents %= 500;
		ones = cents / 100;
		cents %= 100;
		quarters = cents / 25;
		cents %= 25;
		dimes = cents / 10;
		cents %= 10;
		nickels = cents / 5;
		cents %= 5;
		ret += String.format("$100 x %d\n", hundreds);
		ret += String.format("$ 50 x %d\n", fifties);
		ret += String.format("$ 20 x %d\n", twenties);
		ret += String.format("$ 10 x %d\n", tens);
		ret += String.format("$  5 x %d\n", fives);
		ret += String.format("$  1 x %d\n", ones);
		ret += String.format("$.25 x %d\n", quarters);
		ret += String.format("$.10 x %d\n", dimes);
		ret += String.format("$ .5 x %d\n", nickels);
		ret += String.format("$ .1 x %d\n", cents);
		System.out.println(ret);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a price: $");
		int price = (int) (s.nextDouble() * 100);
		dollarChangeMaker(price);
		s.close();
	}
}
