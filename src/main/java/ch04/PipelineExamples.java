package ch04;

import java.util.List;

public class PipelineExamples {
    public static void main(String[] args) {
        /**
         * Use Case: first two names of friends alphabetically
         * that are six character long
         */
        var list = List.of("Ranjit","Shayam","Ravi","Gaurav","Abhinav","Raj","Shreyansh");
        list.stream()
                .filter(s-> s.length()==6)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }
}
