public class Employee extends Person {
    protected int salary;
    protected MyDate dateHired;
    public Employee(String name, Address address, String phoneNumber, int age, String email, int salary, MyDate dateHired) {
        super(name, address, phoneNumber, age, email);
        this.salary = salary;
        this.dateHired = dateHired;
    }
    @Override
    public String toString() {
        return String.format("Class: Employee, Name: %s", name);
    }
}
