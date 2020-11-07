package ch04;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        var opt = average(29.12,29.12,123.44,12346.98);
        var opt1 = average();
        opt.ifPresent(System.out::println);
        //ways to return other values when Optional is empty
        System.out.println(opt1.orElse(400.0));
        //returns random number, argument is supplier
        System.out.println(opt1.orElseGet(() -> Math.random()));
    }

    /**
     * it calculates averages of given numbers.
     * return is of type Optional, in case of arguments are empty,
     * it return Optional.empty()
     * @return
     */
    private static Optional<Double> average(Double... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        var total = 0.0;
        for (Double score : scores) {
            total += score;
        }
        return Optional.of(total / scores.length);
    }
}
