package ch04.intermediate;

import java.util.stream.Stream;

public class DistinctExample {
    public static void main(String[] args) {
        Stream.of("duck", "Shayam", "Pappu", "Kiran", "duck", "Ranjit", "Kumar")
                .distinct()
                .skip(1)
                .limit(10)
                .filter(s -> s.startsWith("R"))
                .map(String::length)
                .forEach(System.out::println);
    }
}
