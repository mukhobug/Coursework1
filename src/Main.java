public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Isaac1", "judavich1", "Asimov1", 1, 12345);
        Employee employee2 = new Employee("Isaac2", "judavich2", "Asimov2", 2, 23456);
        Employee employee3 = new Employee("Isaac3", "judavich3", "Asimov3", 3, 34567);
        Employee employee4 = new Employee("Isaac4", "judavich4", "Asimov4", 4, 45678);
        Employee employee5 = new Employee("Isaac5", "judavich5", "Asimov5", 5, 56789);
        Employee employee6 = new Employee("Isaac1", "judavich1", "Asimov1", 1, 12345);
        Employee employee7 = new Employee("Isaac2", "judavich2", "Asimov2", 2, 23456);
        Employee employee8 = new Employee("Isaac3", "judavich3", "Asimov3", 3, 34567);
        Employee employee9 = new Employee("Isaac4", "judavich4", "Asimov4", 4, 45678);
        Employee employee10 = new Employee("Isaac5", "judavich5", "Asimov5", 5, 56789);

        EmployeeBook arr = new EmployeeBook(10);
        arr.addEmployee(employee1);
        arr.addEmployee(employee2);
        arr.addEmployee(employee3);
        arr.addEmployee(employee4);
        arr.addEmployee(employee5);
        arr.addEmployee(employee6);
        arr.addEmployee(employee7);
        arr.addEmployee(employee8);
        arr.addEmployee(employee9);
        arr.addEmployee(employee10);

        arr.allEmployee();
        System.out.println();

        arr.allEmployee(4);

        System.out.printf("\nMonthly salary budget: %.2f", arr.sumSalary());
        System.out.printf("\nMonthly minimum salary: %s", arr.minSalary());
        System.out.printf("\nMonthly maximum salary: %s", arr.maxSalary());
        System.out.printf("\nMonthly middle salary: %.2f", arr.midSalary());
        System.out.printf("\nMonthly department %d minimum salary: %s", 2, arr.minSalary(2).toString().replaceAll(" Department: .", ""));
        System.out.printf("\nMonthly department %d maximum salary: %s", 2, arr.maxSalary(2).toString().replaceAll(" Department: .", ""));
        System.out.printf("\nMonthly department %d middle salary: %.2f", 2, arr.midSalary(2));

        arr.allEmployeeNames();
        arr.upSalary(20);
        arr.upSalary(2, 25);

        arr.findUp(30000);
        arr.findDown(30000);

        arr.allDepartments();
    }
}