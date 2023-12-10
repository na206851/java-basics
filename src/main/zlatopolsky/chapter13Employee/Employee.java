package zlatopolsky.chapter13Employee;

import java.time.LocalDate;

public class Employee {
    private String name;       //имя
    private String surname;        //фамилия
    private String patronymic;         //отчество
    private int startJobYear;       //год начала работы
    private int startJobMonth;      //месяц начала работы

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getStartJobYear() {
        return startJobYear;
    }

    public int getStartJobMonth() {
        return startJobMonth;
    }

    Employee(String firstName, String lastName, int startJobYear, int startJobMonth) {
        this.name = firstName;
        this.surname = lastName;
        this.startJobYear = startJobYear;
        this.startJobMonth = startJobMonth;

    }

    Employee(String firstName, String lastName, String surname, int startJobYear, int startJobMonth) {
        this(firstName, lastName, startJobYear, startJobMonth);
        this.patronymic = surname;
    }

    public int getYearInCompany() {
        int currentMonth = LocalDate.now().getMonthValue();
        int currentYear = LocalDate.now().getYear();
        return currentYear - startJobYear + (currentMonth == startJobMonth && currentYear != startJobYear ? 1 : 0);
    }

    @Override
    public String toString() {
        if (patronymic == null) {
            return name + " " + surname + " " + getYearInCompany();
        } else {
            return name + " " + surname + " " + patronymic + " " + getYearInCompany();
        }
    }
}
