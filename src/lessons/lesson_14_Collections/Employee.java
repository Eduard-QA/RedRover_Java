package lessons.lesson_14_Collections;

public class Employee {
    private final String name;
    private final String office;


    public Employee(String name, String office) {
        this.name = name;
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "" +
                "'" + name + '\'' + "";
    }
}
