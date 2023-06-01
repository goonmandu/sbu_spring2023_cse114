public class MyDate {
    public int year;
    public int month;
    public int date;
    public MyDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%4d-%2d-%2d", year, month, date);
    }
}
