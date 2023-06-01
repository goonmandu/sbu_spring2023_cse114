public class HourlyEmployee extends Employee {
    private double hours;
    private double hourlyPay;

    public HourlyEmployee(String name, String id, double hours, double hourlyPay) {
        super(name, id);
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    public double earnings() { return hours * hourlyPay; }

    @Override
    public String toString() {
        return String.format("Name: %s, ID: %s, Earnings: $%.2f", name, id, earnings());
    }
}
