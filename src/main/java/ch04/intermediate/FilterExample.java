package ch04.intermediate;

import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        Stream.of("Ram","Shayam","Ranjit")
                .filter(s-> s.startsWith("R"))
                .forEach(System.out::println);
    }
}
