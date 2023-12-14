package zlatopolsky.chapter13Employee;

import java.util.ArrayList;

public class Database {
    ArrayList<Employee> employees = new ArrayList<>();

    public ArrayList<Employee> getEmployeesByYearsInCompany(int yearInCompany) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (yearInCompany == employee.getYearInCompany()) {
                result.add(employee);
            }
        }
        return result;
    }

    public ArrayList<Employee> searchEmployee(String substring) {
        substring.toLowerCase();
        ArrayList<Employee> resultSearch = new ArrayList<>();
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
