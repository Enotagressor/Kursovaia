public class Main {
    public static void addEmployee(Employee[] storage, Employee employee) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = employee;
                break;
            }
        }
    }

    public static void printEmployee(Employee[] storage) {
        for (Employee employee : storage) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    public static void printSumSalary(Employee[] sumSalary){
        double sum = 0;
        for (Employee employee : sumSalary) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println(sum);
    }
    public static void printMinSalary(Employee[] sumSalary){
        double min = 1000000;
        for (Employee employee : sumSalary) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        System.out.println(min);
    }
    public static void printMaxSalary(Employee[] sumSalary){
        double max = 0;
        for (Employee employee : sumSalary) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        System.out.println(max);
    }
    public static void printAverSalary (Employee[] aver){
        double sum = 0;
        double averSum = 0;
        for (int i = 0; i < aver.length; i++) {
            if (aver[i] != null){
                sum += aver[i].getSalary();
                averSum = sum / (i+1);
            }
        }
        System.out.println(averSum);
    }

    public static void printFullName(Employee[] fullName) {
        for (Employee employee : fullName) {
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


        Employee[] storage = new Employee[10];
        addEmployee(storage, employee1);
        addEmployee(storage, employee2);
        addEmployee(storage, employee3);
        addEmployee(storage, employee4);
        addEmployee(storage, employee5);
        addEmployee(storage, employee6);
        addEmployee(storage, employee7);
        addEmployee(storage, employee8);
        addEmployee(storage, employee9);

        printEmployee(storage);
        printSumSalary(storage);
        printMinSalary(storage);
        printMaxSalary(storage);
        printAverSalary(storage);
        printFullName(storage);
    }
}