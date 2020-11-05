package ch03.sorting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Animal implements Comparable<Animal> {
    private int id;
    private String name;
    private Integer weight;

    @Override
    public int compareTo(Animal o) {
        return id - o.id;
    }
}
