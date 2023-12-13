package java.zlatopolsky.chapter13Employee;

class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee("Nikita", "Shavrov", 2003, 10);
        Employee employee2 = new Employee("боб", "губка", "квадратныеШтаны", 2015, 11);
        System.out.println(employee.getYearInCompany());
        System.out.println(employee2.getYearInCompany());
        System.out.println(employee2.getPatronymic());
    }
}