package ch04.reductions;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String[] args) {
        /**
         * T reduce(T initiator, BinaryOperator<T, ? super R> binaryOperator)
         * Optional<T> reduce(BinaryOperator<T, ? super R> binaryOperator)
         * T reduce (T initiator, BiFunction<T,? super R> biFunction,
         * BinaryOperator<T,R> binaryOperator)
         */
        Stream<Integer> stream1 = Stream.of(1, 4, 5, 2);
        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        Stream<String> stream3 = Stream.of("w", "o", "l", "f!");
        BinaryOperator<Integer> binaryOperator= (s,u) -> s+u;
        BinaryOperator<String> binaryOperator2= (s,u) -> s+u;
        var value= stream1.reduce(binaryOperator);
        value.ifPresent(System.out::println);
        System.out.println(stream2.reduce("", binaryOperator2));
        System.out.println(stream3.reduce(0, (i,s)-> i+s.length(),binaryOperator ));
    }
}
