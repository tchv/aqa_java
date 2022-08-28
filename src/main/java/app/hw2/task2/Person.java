package app.hw2.task2;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;

    public Person() {
    }

    public Person(String name, LocalDate birthDate) {
        setName(name);
        setBirthDate(birthDate);
    }

    public void setName(String name) {
        if (!name.startsWith(" ")) this.name = name;
        else {

        }
    }

    public void setBirthDate(LocalDate date) {
        if (!LocalDate.now().isBefore(date)) {
            birthDate = date;
        }
    }

    public  String getName() {
        return name;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public int getMonth() {
        return Period.between(birthDate, LocalDate.now()).getMonths();
    }

    public String toString() {
        return "\nHello, " + this.name + "! You are " + getAge() + " year(s) old from your birthday";
    }
}
