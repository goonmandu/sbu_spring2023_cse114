import java.awt.color.ICC_ColorSpace;

public class RandomString {
    public static int randint(int lbIncl, int ubExcl) {
        return (int) (Math.random() * (ubExcl - lbIncl)) + lbIncl;
    }
    public static String randomString(int len, char ulCase) {
        String ret = "";
        for (int i = 0; i < len; ++i) {
            ret += (char) randint(65, 91);
        }
        if (ulCase == 'u') {
            return ret;
        } else if (ulCase == 'l') {
            return ret.toLowerCase();
        } else {
            return "";
        }
    }
    public static void main(String[] args) {
        System.out.printf("%s\n", randomString(10, 'l'));
        System.out.printf("%s\n", randomString(5, 'u'));
    }
}
