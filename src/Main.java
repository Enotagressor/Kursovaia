public class Main {
    private static final EmployeeBook employeeBook = new EmployeeBook();


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


        employeeBook.addEmployee(employee1);
        employeeBook.addEmployee(employee2);
        employeeBook.addEmployee(employee3);
        employeeBook.addEmployee(employee4);
        employeeBook.addEmployee(employee5);
        employeeBook.addEmployee(employee6);
        employeeBook.addEmployee(employee7);
        employeeBook.addEmployee(employee8);
        employeeBook.addEmployee(employee9);

        employeeBook.printEmployee();
        System.out.println(employeeBook.sumSalary());
        employeeBook.printMinSalary();
        employeeBook.printMaxSalary();
        employeeBook.printAverSalary();
        employeeBook.printFullName();
        double indexPromotion = 0.1;
        employeeBook.printPromotionSalary(indexPromotion);
        int department = 5;
        System.out.println(" ++++++++++++");
        employeeBook.printMinSalaryDepartment(department);
        System.out.println(" ++++++++++++");
        employeeBook.printMaxSalaryDepartment(department);
        System.out.println(" ++++++++++++");
        employeeBook.printSumSalaryDepartment(department);
        employeeBook.printAverSalaryDepartment(department);
        double index = 0.2;
        employeeBook.promotionSalaryDepartment(department, index);
        employeeBook.printEmployeeDepartment(department);
        System.out.println();
        double povertyThreshold = 70000;
        employeeBook.printBeggar(povertyThreshold);
        System.out.println();
        employeeBook.printRich(povertyThreshold);
        employeeBook.deleteEmployee(employee8);
        System.out.println(" ++++++++++++");
        Employee employee12 = new Employee("Ibragimov", "Aron", "Iosifovich", 3, 34567.71);
        employeeBook.addEmployee(employee12);

        employeeBook.changeSalaryEmployee(employee9, 177777);
        employeeBook.changeDepartmentEmployee(employee9, 2);

        employeeBook.printEmployee();
        System.out.println(" ++++++++++++");
        employeeBook.listDepartment();
    }
}