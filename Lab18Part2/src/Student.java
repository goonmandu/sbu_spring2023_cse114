public class Student extends Person {
    public enum ClassStatus {
        FRESHMAN {
            @Override
            public String toString() { return "Freshman"; }
        },
        SOPHOMORE {
            @Override
            public String toString() { return "Sophomore"; }
        },
        JUNIOR {
            @Override
            public String toString() { return "Junior"; }
        },
        SENIOR {
            @Override
            public String toString() { return "Senior"; }
        }
    }

    private ClassStatus standing;
    public String getClassStatus() {
        return standing.toString();
    }
    public Student(String name, Address address, String phoneNumber, int age, String email, ClassStatus standing) {
        super(name, address, phoneNumber, age, email);
        this.standing = standing;
    }

    @Override
    public String toString() {
        return String.format("Class: Student, Name: %s", name);
    }
}
