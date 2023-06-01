import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ReformatCode {
    private File file;
    private ArrayList<String> contents = new ArrayList<>();
    public void reformat() {
        for (int lineNo = 0; lineNo < contents.size() - 1; ++lineNo) {
            String curr = contents.get(lineNo);
            String next = contents.get(lineNo + 1);
            if (next.equals("{")) {
                curr += "{";
                contents.set(lineNo, curr);
            }
        }
        contents.removeAll(Collections.singleton("{"));
    }

    public void writeToFile(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        for (String s : contents) {
            pw.print(String.format("%s\n", s));
        }
        pw.close();
    }

    public ReformatCode(String fileName) throws FileNotFoundException {
        file = new File(fileName);
        Scanner s = new Scanner(file);
        while (s.hasNext()) {
            contents.add(s.nextLine());
        }
    }

    public void printWithNewlines() {
        for (String s : contents) {
            System.out.println(s);
        }
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        for (String s : contents) {
            ret.append(s);
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        try {
            String fileName = args[0];
            String relPath = String.format("./Lab19Part2/src/%s", fileName);
            var rc = new ReformatCode(relPath);
            rc.reformat();
            // rc.printWithNewlines();
            rc.writeToFile(relPath);
            // rc.writeToFile("./Lab19Part2/src/Output.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("File name was not specified as a command line argument.");
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.err.println("File name was not found in the current directory.");
            System.exit(2);
        }
    }
}
