package ch04.reductions;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Reductions are terminal operator. Stream can't be used
 * after terminal operator.
 * <p>
 * Optional<String> min(Comparator)
 */
public class MinMaxExample {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Ranjit", "Kumar", "Patel");
        Optional<String> min = s.min(Comparator.comparingInt(String::length));
        //Any other operation on closed stream will throw error.
        //Optional<String> max = s.max((e1, e2) -> e1.length() - e2.length());
        min.ifPresent(System.out::println);
        //max.ifPresent(System.out::println);
    }
}
