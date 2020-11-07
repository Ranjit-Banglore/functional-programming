package ch04.reductions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExample {
    public static void main(String[] args) {
        /**
         *  T collect(T initializer,
         *          BiConsumer<T, ? super T> accumulator,
         *          BiConsumer<T, ? super T> combiner);
         *
         *  T collect(Collector<T super String, R, U>)
         */
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        Stream<String> stream3 = Stream.of("w", "o", "l", "f");
        Stream<String> stream4 = Stream.of("w", "o", "l", "f");
        StringBuffer result = stream.collect(
                StringBuffer::new,
                StringBuffer::append,
                StringBuffer::append
        );
        System.out.println(result);
        List<String> list= stream1.collect(
                ArrayList::new,
                ArrayList::add,
                ArrayList::addAll);
        System.out.println(list);

        List<String> list2= stream2.collect(Collectors.toCollection(ArrayList::new));

        System.out.println(list2);

        var treeSet= stream3.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);

        var set = stream4.collect(Collectors.toSet());
        System.out.println(set);
    }
}
