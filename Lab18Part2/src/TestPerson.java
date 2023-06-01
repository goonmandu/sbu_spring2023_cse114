public class TestPerson {
    public static void main(String[] args) {
        Address a1 = new Address(116, "Conchise Rd", "Morenci", "AZ", 85540);
        Address a2 = new Address(8906, "Houston Rd", "Fort Smith", "AR", 72903);
        Address a3 = new Address(135, "Albany Dr", "Hampton", "VA", 23666);
        Address a4 = new Address(7945, "Village Dr", "Cincinnati", "OH", 45242);
        Address a5 = new Address(500, "Circle Rd", "Stony Brook", "NY", 11790);

        MyDate d1 = new MyDate(2017, 2, 23);
        MyDate d2 = new MyDate(2001, 10, 14);
        MyDate d3 = new MyDate(2020, 12, 10);

        Person per1 = new Person(
            "Greg Young",
            a1,
            "374299015",
            32,
            "gregyoung@gmail.com");

        Student me = new Student(
            "Mingi Hwang",
            a5,
            "6314328354",
            21,
            "hwang.mingi7@gmail.com",
            Student.ClassStatus.SOPHOMORE);

        Employee emp1 = new Employee(
            "Hattie Richardson",
            a2,
            "3966099318",
            57,
            "hrichardson@outlook.com",
            64000,
            d1);

        Faculty fac1 = new Faculty(
            "Jami Patel",
            a3,
            "3214787299",
            40,
            "jami.patel@gmail.com",
            83100,
            d2,
            "Mon/Fri 3:30 - 5:30 PM",
            5);

        Staff staff1 = new Staff(
            "Cornell Robles",
            a4,
            "8869866578",
            39,
            "feralrabbit@gmail.com",
            42690,
            d3,
            "Public Relations Manager"
        );

        System.out.println(per1);
        System.out.println(me);
        System.out.println(emp1);
        System.out.println(fac1);
        System.out.println(staff1);
        System.out.println(me.getAddress());
    }
}
