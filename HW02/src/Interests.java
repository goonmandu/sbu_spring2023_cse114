/** CSE 114 (S23 Fodor) Homework 2, Part 
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class Interests {
	static class Payment {
		public double monthly;
		public double total;
		public Payment(double monthly, double total) {
			this.monthly = monthly;
			this.total = total;
		}
	}
	
	public static Payment computeInterest(double loan, int years, double interestRate) {
		double monthlyInterestRate = interestRate / 1200;
		double monthlyPayment = loan * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), years * 12)));
		double totalPayment = monthlyPayment * years * 12;
		Payment ret = new Payment(monthlyPayment, totalPayment);
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("Loan amount: $");
		double loan = s.nextDouble();
		System.out.printf("How many years: ");
		int years = s.nextInt();
		System.out.printf("Interest Rate\tMonthly Payment\tTotal Payment\n");
		for (double annualInterest = 5; annualInterest <= 8; annualInterest += 0.125) {
			Payment p = computeInterest(loan, years, annualInterest);
			System.out.printf("%.3f%%\t\t$%.2f\t\t$%.2f\n", annualInterest, p.monthly, p.total);
		}
		s.close();
	}
}
