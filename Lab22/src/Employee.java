public class Employee {
    protected String name;
    protected String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public void setName(String newName) { this.name = newName; }
    public void setId(String newId) { this.id = id; }
}
