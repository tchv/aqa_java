package app.hw4.task2;

import java.util.List;

public class Root {
    private String name;
    private List<People> people;

    public String getName() {
        return name;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "File name: " + name + "\nPeople info: \n" + people;
    }
}
