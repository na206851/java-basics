package java.zlatopolsky.chapter13Employee;

class DatabaseTest {
    public static void main(String[] args) {
        Database database = new Database();
        database.addEmployee(new Employee("bob", "lastName", "surname", 2020, 4));
        database.addEmployee(new Employee("nikita", "secondLasbotName", "seson", 2014, 9));
        database.addEmployee(new Employee("nikita", "bobob", 2021, 9));
        // System.out.println(database.getEmployeesByYearsInCompany(2));

        System.out.println(database.searchEmployee("ni"));
    }

}