public class Staff extends Employee {
    private final String title;
    public Staff(String name, Address address, String phoneNumber, int age, String email, int salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, age, email, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Class: Staff, Name: %s", name);
    }
}
