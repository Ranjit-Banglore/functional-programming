package ch03.sorting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person implements Comparable<Person> {
    private String name;

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.getName());
    }
}
