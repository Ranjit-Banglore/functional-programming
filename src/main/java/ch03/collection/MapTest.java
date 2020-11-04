package ch03.collection;

import java.util.Map;
import java.util.function.BiConsumer;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> address1 = Map.of("name", "Ranjit",
                "city", "Berlin",
                "country", "Germany");
        Map<String, String> address2 = Map.ofEntries(
                Map.entry("name", "Ranjit"),
                Map.entry("city", "Berlin"),
                Map.entry("country", "Germany")
        );
        BiConsumer<String, String> biConsumer = (k, v) -> {
            System.out.println(String.format("Key: %s, value: %s", k, v));
        };
        address1.forEach(biConsumer);
        address2.entrySet().forEach(System.out::println);
        address1.values().forEach(System.out::println);
    }
}
