package ch03.sorting;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Person implements Comparable<Person> {
    private String name;

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.getName());
    }
}
