package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double amount) {
        this.salary = amount;
    }

    public void increaseSalary(double percentage) {
        this.salary -= percentage + this.salary;
    }
}