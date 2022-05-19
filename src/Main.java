public class Main {
    private static final Employee[] storage = new Employee[10];

    private static void addEmployee(Employee employee) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = employee;
                break;
            }
        }
    }

    private static void printEmployee() {
        for (Employee employee : storage) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    private static double SumSalary(){
        double sum = 0;
        for (Employee employee : storage) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    private static void printMinSalary(){
        double min = 1000000;
        for (Employee employee : storage) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        System.out.println(min);
    }
    private static void printMaxSalary(){
        double max = 0;
        for (Employee employee : storage) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        System.out.println(max);
    }
    private static int AverSalary (){
    int counter = 0;
        for (Employee employee : storage) {
            if (employee != null) {
                counter++;
            }
        }
        return counter;
    }

    private static void printFullName() {
        for (Employee employee : storage) {
            if (employee != null) {
                System.out.println(employee.getSecondName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
            }
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Фахрудинов", "Илья", "Романович", 1, 279576.67);
        Employee employee2 = new Employee("Орлова", "Фатима", "Григорьевна", 3, 123857.15);
        Employee employee3 = new Employee("Набиулин", "Астафий", "Артурович", 2, 144679.29);
        Employee employee4 = new Employee("Тарасов", "Сергей", "Иванович", 4, 64352.05);
        Employee employee5 = new Employee("Морозов", "Сергей", "Николаевич", 4, 59724.13);
        Employee employee6 = new Employee("Сафонов", "Алексей", "Евгеньевич", 5, 56813.76);
        Employee employee7 = new Employee("Капустин", "Евгений", "Павлович", 5, 78613.05);
        Employee employee8 = new Employee("Домичковский", "Дмитрий", "Юрьевич", 5, 38702.56);
        Employee employee9 = new Employee("Ткачев", "Валерий", "Романович", 5, 46856.34);


        addEmployee(employee1);
        addEmployee(employee2);
        addEmployee(employee3);
        addEmployee(employee4);
        addEmployee(employee5);
        addEmployee(employee6);
        addEmployee(employee7);
        addEmployee(employee8);
        addEmployee(employee9);

        printEmployee();
        System.out.println(SumSalary());
        printMinSalary();
        printMaxSalary();
        System.out.println(SumSalary()/AverSalary ());
        printFullName();
    }
}