import java.util.Scanner;

public class Celsius2Fahrenheit {
	public static double ctof(double celsius) {
		return (celsius * 9.0 / 5) + 32;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		var inputCelsius = s.nextDouble();
		var resultFahrenheit = ctof(inputCelsius);
		System.out.println(String.format("%f degrees Celsius is %.1f degrees Fahrenheit.", inputCelsius,
																						   resultFahrenheit));
		s.close();
	}
}
