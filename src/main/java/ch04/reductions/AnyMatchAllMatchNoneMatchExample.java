package ch04.reductions;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class AnyMatchAllMatchNoneMatchExample {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Ranjit", "43iucs", "Patel");
        Stream<String> stream2 = Stream.of("Ranjit", "43iucs", "Patel");
        Stream<String> stream3 = Stream.of("Ranjit", "43iucs", "Patel");
        Predicate<String> predicate = (s) -> Character.isLetter(s.charAt(0));
        System.out.println(stream1.anyMatch(predicate));
        System.out.println(stream2.allMatch(predicate));
        System.out.println(stream3.noneMatch(predicate));
    }
}
