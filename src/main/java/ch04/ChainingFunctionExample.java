package ch04;

import java.util.function.Predicate;

public class ChainingFunctionExample {
    Predicate<String> brown = s -> s.contains("brown");
    Predicate<String> egg = s -> s.contains("egg");

    Predicate<String> brownEggs = brown.and(egg);
    Predicate<String> otherEggs = egg.and(brown.negate());

}
