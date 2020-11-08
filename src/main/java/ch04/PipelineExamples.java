package ch04;

import java.util.List;
import java.util.stream.IntStream;

public class PipelineExamples {
    public static void main(String[] args) {
        /**
         * Use Case: first two names of friends alphabetically
         * that are six character long
         */
        var list = List.of("Ranjit", "Shayam", "Ravi", "Gaurav", "Abhinav", "Raj", "Shreyansh");
        list.stream()
                .filter(s -> s.length() == 6)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
        //Finding average using rangeClosed()
        System.out.println(IntStream.rangeClosed(1, 100)
                .average()
                .orElse(Double.NaN));
    }
}
