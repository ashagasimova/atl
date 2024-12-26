package StreamLEesson;

import java.util.List;

public class Person {
    private String name;

    private List<Phone> numbers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Phone> numbers) {
        this.numbers = numbers;
    }

    public Person(String name, List<Phone> numbers) {
        this.name = name;
        this.numbers = numbers;


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                '}';
    }
}
