package hw2.task3;

import java.time.LocalDate;
import java.util.Scanner;

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
        if (LocalDate.now().isBefore(date)) {

        }
    }
}
