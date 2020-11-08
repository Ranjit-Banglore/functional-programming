package ch04;

import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {
    public static void main(String[] args) {
        var ohMy = Stream.of("lion", "tigers", "bears");
        var result = ohMy.collect(Collectors.joining(","));
        System.out.println(result);
        //Collecting into maps:
        var ohMy1 = Stream.of("lion", "tiger", "bears");
        var map = ohMy1.collect(Collectors.toMap(s -> s, String::length));
        System.out.println(map);
        //groupingBy -1
        var stream = Stream.of("lion", "tiger", "bears");
        var groupingByResult = stream.collect(Collectors.groupingBy(String::length));
        System.out.println(groupingByResult);
        //groupingBy -2
        var stream2 = Stream.of("lion", "tiger", "bears");
        var groupingByResult2 = stream2.collect(Collectors
                .groupingBy(String::length, Collectors.toSet()));
        System.out.println(groupingByResult2);
        //groupingBy -3
        var stream3 = Stream.of("lion", "tiger", "bears");
        var groupingByResult3 = stream3.collect(Collectors
                .groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(groupingByResult3);

        //groupingBy -4
        var stream4 = Stream.of("lion", "tiger", "bears");
        var groupingByResult4 = stream4.collect(Collectors
                .groupingBy(String::length, Collectors.counting()));
        System.out.println(groupingByResult4);
    }
}
