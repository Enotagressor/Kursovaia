import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String secondName;
    private final String middleName;
    private int department;
    private double salary;
    private static int counter = 1;
    private final int id;

    public Employee(String secondName, String firstName, String middleName, int department, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(secondName, employee.secondName) && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public String toString() {
        return "ID" + id + ": " + secondName + " " + firstName + " " + middleName + ", отдел №" + department + ", зарплата - " + salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
