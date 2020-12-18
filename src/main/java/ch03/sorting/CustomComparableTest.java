package ch03.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CustomComparableTest {
    public static void main(String[] args) {
        var animals = Arrays.asList(new Animal(10, "Dog", 20),
                new Animal(5, "Cat", 8),
                new Animal(13, "Elephant", 1000),
                new Animal(2, "Camel", 500),
                new Animal(10, "PussyCat", 12));
        Collections.sort(animals);
        System.out.println(String.format("using default compareTo with id : \n %s", animals));
        var comparator1 = new Comparator<Animal>() {
            public int compare(Animal a1, Animal a2) {
                return a1.getWeight() - a2.getWeight();
            }
        };
        Collections.sort(animals, comparator1);
        System.out.println(String.format("using compare method : \n %s", animals));
        /**
         * Best way to use chaining
         */
        var comparator2 = Comparator.comparingInt(Animal::getId)
                .thenComparing(Animal::getName)
                .thenComparingInt(Animal::getWeight);
        Collections.sort(animals, comparator2);
        System.out.println(String.format("using Comparator.comparing method in chaining: \n %s", animals));
    }
}
