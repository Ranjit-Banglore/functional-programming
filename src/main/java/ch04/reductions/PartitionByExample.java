package ch04.reductions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionByExample {
    public static void main(String[] args) {
        /**
         * partitioningBy create map with only two possible keys, true and false.
         */
        var stream = Stream.of("lion", "tiger", "bears", "elephants", "camels");
        var result = stream.collect(Collectors.partitioningBy(s -> s.length() < 5));
        System.out.println(result);
    }
}
