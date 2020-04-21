package lab2;

public class Employee {
    private String name;
    private int number;

    public Employee(String name, int number) {
        //System.out.println("Constructing an Employee");
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
}
