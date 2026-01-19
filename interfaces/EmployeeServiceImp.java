package interfaces;

public class EmployeeServiceImp implements EmployeeService {

	public Employee[] getHighSalaryEmployee(Employee[] employee, double minSalary) {
		Employee[] highSalEmp = new Employee[employee.length];
		for (int i = 0; i < employee.length; i++) {
			if (employee[i].sal >= minSalary) {
				highSalEmp[i] = employee[i];
			}
		}
		return highSalEmp;
	}

	public double calculateAverageSalary(Employee[] employees) {
		int total = 0;
		for (int i = 0; i < employees.length; i++) {
			total += employees[i].sal;
		}
		double average = total / employees.length;
		return average;
	}

	public Employee getTopPaidEmployee(Employee[] employees) {
		Employee max = employees[0];

		for (int i = 1; i < employees.length; i++) {
			if (employees[i].sal > max.sal) {
				max = employees[i];
			}
		}

		return max;
	}

	public Employee[] getExperiencedEmployees(Employee[] employees, int minYears) {

		int count = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].experience >= minYears) {
				count++;
			}
		}

		Employee[] result = new Employee[count];
		int index = 0;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].experience >= minYears) {
				result[index] = employees[i];
				index++;
			}
		}
		return result;
	}

	public Employee getTopPaidEmployeeByDepartment(Employee[] employees, String department) {

		Employee top = employees[0];

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].department == department) {
				if (employees[i].sal > top.sal) {
					top = employees[i];
				}
			}
		}
		return top;
		
	}
	
	public double getAverageSalaryByDepartment(Employee[] employees, String department) {

        double sum = 0;
        int count = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].department == department) {
                sum += employees[i].sal;
                count++;
            }
        }
        if (count == 0)
            return 0;

        return sum / count;
    }
}
