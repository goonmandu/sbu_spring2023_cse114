public class Faculty extends Employee {
    private String officeHours;
    private int rank;
    public int salaryRange() {
        int yrs = java.time.Year.now().getValue() - dateHired.year;
        int det = rank * yrs;
        if (det < 10) {
            return 1;
        } else if (det < 20) {
            return 2;
        } else {
            return 3;
        }
    }
    public Faculty(String name, Address address, String phoneNumber, int age, String email, int salary, MyDate dateHired, String officeHours, int rank) {
        super(name, address, phoneNumber, age, email, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("Class: Faculty, Name: %s", name);
    }
}
