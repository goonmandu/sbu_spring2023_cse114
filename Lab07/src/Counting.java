import java.util.Scanner;

public class Counting {
	public static void averageOfInputs() {
		Scanner s = new Scanner(System.in);
		int input, poscount = 0, negcount = 0, count, sum = 0;
		System.out.printf("Enter your integers:\n");
		while (true) {
			input = s.nextInt();
			if (input == 0) {
				break;
			}
			if (input > 0) {
				poscount++;
			} else {
				negcount++;
			}
			sum += input;
		}
		count = poscount + negcount;
		System.out.printf("Positives: %d\n"
						+ "Negatives: %d\n"
						+ "Total: %d\n"
						+ "Sum: %d\n"
						+ "Average: %f\n", poscount, negcount, count, sum, (double)sum / count);
		s.close();
	}
	public static void main(String[] args) {
		averageOfInputs();
	}
}
