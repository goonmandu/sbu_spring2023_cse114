public class Person {
    protected String name;
    protected Address address;
    protected String phoneNumber;
    protected int age;
    protected String email;
    public int getAge() {
        return age;
    }
    protected Person(String name, Address address, String phoneNumber, int age, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }
    @Override
    public String toString() {
        return String.format("Class: Person, Name: %s", name);
    }
    public String getAddress() {
        return address.toString();
    }
}
