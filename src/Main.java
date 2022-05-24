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
    private static double sumSalary(){
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
    private static void printAverSalary (){
    int counter = 0;
        for (Employee employee : storage) {
            if (employee != null) {
                counter++;
            }
        }
        double aver = sumSalary()/counter;
        System.out.println(aver);
    }

    private static void printFullName() {
        for (Employee employee : storage) {
            if (employee != null) {
                System.out.println(employee.getSecondName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
            }
        }
    }
    private static void printPromotionSalary(double index){
        for (Employee employee : storage) {
            if (employee != null) {
                double promotion = employee.getSalary();
                employee.setSalary(promotion + promotion * index);
                System.out.println(employee);
            }
        }
    }
    private static void printMinSalaryDepartment(int department) {
        double min = 1000000;
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        for (Employee employee : storage) {
            if (employee != null && min == employee.getSalary()) {
                System.out.println(employee);
                break;
            }
        }
    }
    private static void printMaxSalaryDepartment(int department){
        double max = 0;
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        for (Employee employee : storage) {
            if (employee != null && max == employee.getSalary()) {
                System.out.println(employee);
                break;
            }
        }
    }
    private static void printSumSalaryDepartment(int department) {
        double sum = 0;
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        System.out.println(sum);
    }
    private static void printAverSalaryDepartment(int department){
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
    private static void promotionSalaryDepartment(int department, double index){
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department) {
                double promotion = employee.getSalary();
                employee.setSalary(promotion + promotion * index);
            }
        }
    }
    private static void printEmployeeDepartment(int department){
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("ID" + employee.getId() + ": " + employee.getSecondName() + " " + employee.getFirstName() + " " + employee.getMiddleName()  + ", зарплата - " + employee.getSalary());
            }
        }
    }

    private static void printBeggar(double povertyThreshold) {
        for (Employee employee : storage) {
            if (employee != null && employee.getSalary() < povertyThreshold) {
                System.out.println("ID" + employee.getId() + ": " + employee.getSecondName() + " " + employee.getFirstName() + " " + employee.getMiddleName()  + ", зарплата - " + employee.getSalary());
            }
        }
    }
    private static void printRich(double povertyThreshold) {
        for (Employee employee : storage) {
            if (employee != null && employee.getSalary() > povertyThreshold) {
                System.out.println("ID" + employee.getId() + ": " + employee.getSecondName() + " " + employee.getFirstName() + " " + employee.getMiddleName()  + ", зарплата - " + employee.getSalary());
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
        System.out.println(sumSalary());
        printMinSalary();
        printMaxSalary();
        printAverSalary();
        printFullName();
        double indexPromotion = 0.1;
        printPromotionSalary(indexPromotion);
        int department = 5;
        System.out.println(" ++++++++++++");
        printMinSalaryDepartment(department);
        System.out.println(" ++++++++++++");
        printMaxSalaryDepartment(department);
        System.out.println(" ++++++++++++");
        printSumSalaryDepartment(department);
        printAverSalaryDepartment(department);
        double index = 0.2;
        promotionSalaryDepartment(department, index);
        printEmployeeDepartment(department);
        System.out.println();
        double povertyThreshold = 70000;
        printBeggar(povertyThreshold);
        System.out.println();
        printRich(povertyThreshold);

    }
}