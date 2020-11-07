package ch04;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerAndBiConsumerExample {
    public static void main(String[] args) {
        //consumer
        Consumer<String> c1= System.out::println;
        c1.accept("Ranjit");
        c1.accept("Patel");

        //BiConsumer
        var map= new HashMap<Integer,String>();
        BiConsumer<Integer,String> biConsumer= map::put;
        biConsumer.accept(1,"Ranjit");
        biConsumer.accept(2,"Patel");
        c1.accept(map.toString());
    }
}
