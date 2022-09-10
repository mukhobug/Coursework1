public class EmployeeBook {
    private Employee[] employeeBook;

    public EmployeeBook(int size) {
        employeeBook = new Employee[size];
    }

    public void addEmployee(Employee name) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] == null) {
                employeeBook[i] = name;
                return;
            }
        }
    }

    public Employee[] getEmployeeBook() {
        return employeeBook;
    }

    public void setEmployeeBook(Employee[] employeeBook) {
        this.employeeBook = employeeBook;
    }

    public void allEmployee() {
        for (Employee employee : employeeBook) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public double sumSalary() {
        double sum = 0;
        for (Employee employee : employeeBook) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public Employee minSalary() {
        double min = Double.MAX_VALUE;
        Employee minEmployee = null;
        for (Employee employee : employeeBook) {
            if (employee != null && min > employee.getSalary()) {
                min = employee.getSalary();
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    public Employee maxSalary() {
        double max = 0;
        Employee maxEmployee = null;
        for (Employee employee : employeeBook) {
            if (employee != null && max < employee.getSalary()) {
                max = employee.getSalary();
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    public double midSalary() {
        int j = 0;
        double midSalary;
        for (Employee employee : employeeBook) {
            if (employee != null) {
                j++;
            }
        }
        midSalary = sumSalary() / j;
        return midSalary;
    }

    public void upSalary(double percent) {
        for (Employee employee : employeeBook) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() * (percent / 100 + 1.0));
            }
        }
    }

    public void allEmployeeNames() {
        System.out.println("\n\nEmployee`s full names:");
        for (Employee employee : employeeBook) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
        System.out.println();
    }

    public void allEmployee(int dep) {
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getDepartment() == dep) {
                System.out.println(employee.toString().replaceAll(" Department: .", ""));
            }
        }
        System.out.println();
    }

    public Employee minSalary(int dep) {
        double min = Double.MAX_VALUE;
        Employee minEmployee = null;
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getDepartment() == dep && min > employee.getSalary()) {
                min = employee.getSalary();
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    public Employee maxSalary(int dep) {
        double max = 0;
        Employee maxEmployee = null;
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getDepartment() == dep && max < employee.getSalary()) {
                max = employee.getSalary();
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    public double sumSalary(int dep) {
        double sum = 0;
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getDepartment() == dep) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double midSalary(int dep) {
        int j = 0;
        double midSalary;
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getDepartment() == dep) {
                j++;
            }
        }
        midSalary = sumSalary(dep) / j;
        return midSalary;
    }

    public void upSalary(int dep, double percent) {
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getDepartment() == dep) {
                employee.setSalary(employee.getSalary() * (percent / 100 + 1.0));
            }
        }
    }

    public void findUp(int number) {
        for (Employee employee : employeeBook) {
            if (employee != null && number >= employee.getSalary()) {
                System.out.println(employee.getId() + " " + employee.getFullName() + " " + String.format("%.2f", employee.getSalary()));
            }
        }
        System.out.println();
    }

    public void findDown(int number) {
        for (Employee employee : employeeBook) {
            if (employee != null && number < employee.getSalary()) {
                System.out.println(employee.getId() + " " + employee.getFullName() + " " + String.format("%.2f", employee.getSalary()));
            }
        }
        System.out.println();
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getId() == id) {
                employeeBook[i] = null;
            }
        }
    }

    public void editEmployee(int id, double salary) {
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getId() == id) {
                employee.setSalary(salary);
            }
        }
    }

    public void editEmployee(int id, int dep) {
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getId() == id) {
                employee.setDepartment(dep);
            }
        }
    }

    public void allDepartments() {
        for (int dep = 1; dep <= 5; dep++) {
            System.out.printf("Department %d\n", dep);
            for (Employee employee : employeeBook) {
                if (employee != null && employee.getDepartment() == dep) {
                    System.out.println(employee.getFullName());
                }
            }
            System.out.println();
        }
    }
}
