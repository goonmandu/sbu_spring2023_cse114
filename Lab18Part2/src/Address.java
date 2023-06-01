public class Address {
    public int bldgNum;
    public String street;
    public String city;
    public String state;
    public int zip;
    public Address(int bldgNum, String street, String city, String state, int zip) {
        this.bldgNum = bldgNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return String.format("%d %s. %s, %s %5d", bldgNum, street, city, state, zip);
    }
}
