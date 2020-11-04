package ch03.sorting;

import java.util.Arrays;
import java.util.Collections;

public class ComparableTest {
    public static void main(String[] args) {
        var list = Arrays.asList(new Person[]{new Person("Ranjit"),
                new Person("Sonu"),
                new Person("Abhijit")});
        Collections.sort(list);
        System.out.println(list);
    }
}
