import java.util.Scanner;

public class Emergency {
	public static String emergency(String call) {
		/** Hello, my name is NAME. I need to report EVENT. Please come to WHERE.
		 */
		String[] statements = call.split("\\.");
		String callerName, event, location;
		callerName = statements[0].substring(18, statements[0].length());
		event = statements[1].substring(18, statements[1].length());
		location = statements[2].substring(16, statements[2].length());
		return String.format("%s at %s reported by %s", event, location, callerName);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Who are you, what is your emergency, and where is your emergency:\n");
		String rawReport = s.nextLine();
		String parsed = emergency(rawReport);
		System.out.println(parsed);
		s.close();
	}
}
