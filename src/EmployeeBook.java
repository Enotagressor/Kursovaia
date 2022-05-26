import java.lang.reflect.Array;
import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] storage;
//    public static Employee newEmployee = new Employee();

    public EmployeeBook(){
        this.storage  = new Employee[10];
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = employee;
                break;
            }
        }
    }

    public void printEmployee() {
        for (Employee employee : storage) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    public double sumSalary(){
        double sum = 0;
        for (Employee employee : storage) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public void printMinSalary(){
        double min = 1000000;
        Employee empl = null;
        for (Employee employee : storage) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                empl = employee;
            }
        }
        if (empl != null) {
            System.out.println(empl);
        }
    }
    public void printMaxSalary(){
        double max = 0;
        Employee empl = null;
        for (Employee employee : storage) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                empl = employee;
            }
        }
        if (empl != null) {
            System.out.println(empl);
        }
    }
    public void printAverSalary (){
        int counter = 0;
        for (Employee employee : storage) {
            if (employee != null) {
                counter++;
            }
        }
        double aver = sumSalary()/counter;
        System.out.println(aver);
    }

    public void printFullName() {
        for (Employee employee : storage) {
            if (employee != null) {
                System.out.println(employee.getSecondName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
            }
        }
    }
    public void printPromotionSalary(double index){
        for (Employee employee : storage) {
            if (employee != null) {
                double promotion = employee.getSalary();
                employee.setSalary(promotion + promotion * index);
                System.out.println(employee);
            }
        }
    }
    public void printMinSalaryDepartment(int department) {
        double min = 1000000;
        Employee empl = null;
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() < min) {
                min = employee.getSalary();
                empl = employee;
            }
        }
        if (empl == null) {
            System.out.println("no");
        } else {
            System.out.println(empl);
        }
    }
    public void printMaxSalaryDepartment(int department){
        double max = 0;
        Employee empl = null;
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > max) {
                max = employee.getSalary();
                empl = employee;
            }
        }
        if (empl == null) {
            System.out.println("no");
        } else {
            System.out.println(empl);
        }
    }
    public void printSumSalaryDepartment(int department) {
        double sum = 0;
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        System.out.println(sum);
    }
    public void printAverSalaryDepartment(int department){
        int counter = 0;
        double sum = 0;
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
                counter++;
            }
        }
        double aver = sum /counter;
        System.out.println(aver);
    }
    public void promotionSalaryDepartment(int department, double index){
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department) {
                double promotion = employee.getSalary();
                employee.setSalary(promotion + promotion * index);
            }
        }
    }
    public void printEmployeeDepartment(int department){
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("ID" + employee.getId() + ": " + employee.getSecondName() + " " + employee.getFirstName() + " " + employee.getMiddleName()  + ", зарплата - " + employee.getSalary());
            }
        }
    }

    public void printBeggar(double povertyThreshold) {
        for (Employee employee : storage) {
            if (employee != null && employee.getSalary() < povertyThreshold) {
                System.out.println("ID" + employee.getId() + ": " + employee.getSecondName() + " " + employee.getFirstName() + " " + employee.getMiddleName()  + ", зарплата - " + employee.getSalary());
            }
        }
    }
    public void printRich(double povertyThreshold) {
        for (Employee employee : storage) {
            if (employee != null && employee.getSalary() > povertyThreshold) {
                System.out.println("ID" + employee.getId() + ": " + employee.getSecondName() + " " + employee.getFirstName() + " " + employee.getMiddleName()  + ", зарплата - " + employee.getSalary());
            }
        }
    }
    public void deleteEmployee(String secondName, String firstName, String middleName) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null && storage[i].getSecondName().equals(secondName) && storage[i].getFirstName().equals(firstName) && storage[i].getMiddleName().equals(middleName)){
                storage[i] = null;
            }
        }
    }
    public void changeSalaryEmployee(String secondName, String firstName, String middleName, double salary) {
        for (Employee employee : storage) {
            if (employee != null && employee.getSecondName().equals(secondName) && employee.getFirstName().equals(firstName) && employee.getMiddleName().equals(middleName)) {
                employee.setSalary(salary);
            }
        }
    }
    public void changeDepartmentEmployee(String secondName, String firstName, String middleName, int department) {
        for (Employee employee : storage) {
            if (employee != null && employee.getSecondName().equals(secondName) && employee.getFirstName().equals(firstName) && employee.getMiddleName().equals(middleName)) {
                employee.setDepartment(department);
            }
        }
    }
    public void listDepartment() {
        for (int i = 0; i < storage.length; i++) {
            for (Employee employee : storage) {
                if (employee != null && i == employee.getDepartment()) {
                    System.out.println("Department №" + i + " " + employee.getSecondName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
                }
            }
        }
    }
}
