public class Test {
    private int num;
    private String str;
    public boolean numEquals(Test rhs) { return this.num == rhs.num; }
    public boolean strEquals(Test rhs) { return this.str.equals(rhs.str); }
    public void setNum(int newnum) { this.num = newnum; }
    public int getNum() { return this.num; }
    public void setStr(String newstr) { this.str = newstr; }
    public String getStr() { return this.str; }
    public Test() {
        this.num = 0;
        this.str = "";
    }
    public Test(int num, String str) {
        this.num = num;
        this.str = str;
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(69, "funny");
        t1.setNum(420);
        System.out.println(t2.getStr());
        System.out.println(t1.getNum());
    }
}