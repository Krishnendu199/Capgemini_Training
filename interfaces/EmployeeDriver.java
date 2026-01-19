package interfaces;


public class EmployeeDriver {

	public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee(1, "Rahul", 30000, "IT", 2);
        employees[1] = new Employee(2, "Amit", 50000, "HR", 5);
        employees[2] = new Employee(3, "Sneha", 70000, "IT", 6);
        employees[3] = new Employee(4, "Neha", 45000, "Finance", 4);
        employees[4] = new Employee(5, "Arjun", 60000, "HR", 7);

        EmployeeService service = new EmployeeServiceImp();

        System.out.println("High Salary Employees (>= 50000):");
        Employee[] highSal = service.getHighSalaryEmployee(employees, 50000);
        for (int i = 0; i < highSal.length; i++) {
            if (highSal[i] != null) {
                System.out.println(
                    highSal[i].id + " " +
                    highSal[i].name + " " +
                    highSal[i].sal
                );
            }
        }


        System.out.println("\nAverage Salary of All Employees:");
        System.out.println(service.calculateAverageSalary(employees));

        System.out.println("\nTop Paid Employee:");
        Employee top = service.getTopPaidEmployee(employees);
        System.out.println(
            top.id + " " +
            top.name + " " +
            top.sal
        );

        System.out.println("\nExperienced Employees (>= 5 years):");
        Employee[] exp = service.getExperiencedEmployees(employees, 5);
        for (int i = 0; i < exp.length; i++) {
            System.out.println(
                exp[i].id + " " +
                exp[i].name + " " +
                exp[i].experience
            );
        }

        System.out.println("\nTop Paid Employee in IT Department:");
        Employee itTop = service.getTopPaidEmployeeByDepartment(employees, "IT");
        System.out.println(
            itTop.id + " " +
            itTop.name + " " +
            itTop.sal
        );

        System.out.println("\nAverage Salary in HR Department:");
        System.out.println(
            service.getAverageSalaryByDepartment(employees, "HR")
        );
    }
}