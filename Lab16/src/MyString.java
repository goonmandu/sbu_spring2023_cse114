import java.util.Arrays;

public class MyString {
    private char[] cString;
    public MyString(char[] chars) {
        this.cString = new char[chars.length];
        System.arraycopy(chars, 0, this.cString, 0, chars.length);
    }
    public char charAt(int index) {
        return this.cString[index];
    }
    public int length() {
        return cString.length;
    }
    public char[] getCString() {
        return this.cString;
    }
    public void print() {
        for (char m : cString) {
            System.out.print(m);
        }
    }
    public void print(MyString end) {
        this.print();
        end.print();
    }
    public void println() {
        this.print(new MyString(new char[]{'\n'}));
    }
    public MyString substring(int begin, int end) {
        char[] raw = new char[end - begin];
        System.arraycopy(this.cString, begin, raw, 0, end - begin);
        return new MyString(raw);
    }
    public MyString toLowerCase() {
        for (int i = 0; i < cString.length; ++i) {
            if (65 <= cString[i] && cString[i] <= 90) {
                cString[i] += 32;
            }
        }
        return this;
    }
    public boolean equals(MyString rhs) {
        if (this.cString.length != rhs.cString.length) {
            return false;
        }
        for (int i = 0; i < rhs.cString.length; ++i) {
            if (this.cString[i] != rhs.cString[i]) {
                return false;
            }
        }
        return true;
    }
    public MyString[] split(MyString delim) {
        if (this.equals(delim)) {
            return new MyString[]{};
        }
        int delimLength = delim.length();
        MyString[] retRaw = new MyString[this.length()];
        Arrays.fill(retRaw, new MyString(new char[]{}));
        int from = 0;
        int count = 0;
        for (int i = 0; i < this.cString.length - delimLength + 1; ++i) {
            char[] checkAgainstRaw = new char[delimLength];
            System.arraycopy(this.cString, i, checkAgainstRaw, 0, delimLength);
            MyString checkAgainst = new MyString(checkAgainstRaw);
            if (checkAgainst.equals(delim)) {
                retRaw[count++] = this.substring(from, i);
                from = i + delimLength;
            }
        }
        retRaw[count] = this.substring(from, this.length());
        MyString[] ret = new MyString[(from >= this.length() || from == delimLength) ? count : count + 1];
        int retIndex = 0;
        for (MyString splitStr : retRaw) {
            if (splitStr.length() != 0) {
                ret[retIndex++] = splitStr;
            }
        }
        return ret;
    }
    public static MyString valueOf(int i) {
        if (i == 0) {
            return new MyString(new char[]{'0'});
        }
        boolean neg = false;
        if (i < 0) {
            i *= -1;
            neg = true;
        }
        char[] raw = new char[neg ? (int) Math.log10(i) + 2 : (int) Math.log10(i) + 1];
        int pos = raw.length - 1;
        while (i != 0) {
            int digit = i % 10;
            i /= 10;
            raw[pos--] = (char) (digit + 48);
        }
        if (neg) {
            raw[pos] = '-';
        }
        return new MyString(raw);
    }
    public static void printlnMyStringArray(MyString[] mystrarr) {
        MyString nothing = new MyString(new char[]{'{', '}'});              // {}
        MyString begin = new MyString(new char[]{'{', '"'});                // {"
        MyString between = new MyString(new char[]{'\"', ',', ' ', '\"'});  // ", "
        MyString end = new MyString(new char[]{'\"', '}', '\n'});           // "}(newline)
        if (mystrarr.length == 0) {
            nothing.println();
            return;
        }
        begin.print();
        for (int i = 0; i < mystrarr.length; ++i) {
            if (i != mystrarr.length - 1) {
                mystrarr[i].print(between);
            } else {
                mystrarr[i].print(end);
            }
        }
    }
    public static void main(String[] args) {
        char[] helloWorldRaw = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd','!'};
        char[] cse114Raw = {'C', 'S', 'E', '1', '1', '4'};
        MyString helloWorld = new MyString(helloWorldRaw);
        MyString helloWorldClone = new MyString(helloWorldRaw);
        MyString cse114 = new MyString(cse114Raw);

        System.out.println("Printing");
        helloWorld.println();
        helloWorldClone.println();
        cse114.println();

        System.out.println("\nLength");
        System.out.printf("%d, %d\n", helloWorld.length(), cse114.length());

        System.out.println("\ncharAt");
        // MyString:  H  e  l  l  o     w  o  r  l  d  !
        // Indices:   0  1  2  3  4  5  6  7  8  9 10 11
        System.out.println(helloWorld.charAt(4));
        System.out.println(helloWorld.charAt(11));

        System.out.println("\nEquals");
        System.out.println(helloWorld.equals(helloWorldClone));
        System.out.println(helloWorld.equals(cse114));

        System.out.println("\nSubstring");
        helloWorld.substring(2, 8).println();
        cse114.substring(0, 6).println();  // intentional substring of itself

        System.out.println("\ntoLowerCase");
        helloWorld.toLowerCase().println();
        cse114.toLowerCase().println();

        System.out.println("\nSplit");
        MyString delimiter_ll = new MyString(new char[]{'l', 'l'});
        MyString delimiter_He = new MyString(new char[]{'H', 'e'});
        MyString delimiter_d_exclMark = new MyString(new char[]{'d', '!'});
        MyString delimiter_e = new MyString(new char[]{'e'});
        MyString delimiter_cse114 = new MyString(new char[]{'c', 's', 'e', '1', '1', '4'});
        printlnMyStringArray(helloWorldClone.split(delimiter_ll));
        printlnMyStringArray(helloWorldClone.split(delimiter_He));
        printlnMyStringArray(helloWorldClone.split(delimiter_d_exclMark));
        printlnMyStringArray((cse114.split(delimiter_e)));
        printlnMyStringArray((cse114.split(delimiter_cse114)));

        System.out.println("\nvalueOf");
        int funny = 69420;
        int zero = 0;
        int negativeFunny = -69420;
        MyString.valueOf(funny).println();
        MyString.valueOf(zero).println();
        MyString.valueOf(negativeFunny).println();
    }
}