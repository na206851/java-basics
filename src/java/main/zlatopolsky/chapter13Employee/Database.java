package zlatopolsky.chapter13Employee;

import java.util.ArrayList;
import java.util.List;

public class Database {
    List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployeesByYearsInCompany(int yearInCompany) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (yearInCompany == employee.getYearInCompany()) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> searchEmployee(String substring) {
        List<Employee> resultSearch = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getPatronymic() != null) {
                if (employee.getName().toLowerCase().contains(substring)
                        || employee.getSurname().toLowerCase().contains(substring)
                        || employee.getPatronymic().toLowerCase().contains(substring)) {
                    resultSearch.add(employee);
                }
            } else {
                if (employee.getName().toLowerCase().contains(substring)
                        || employee.getSurname().toLowerCase().contains(substring)) {
                    resultSearch.add(employee);
                }
            }
        }
        return resultSearch;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
