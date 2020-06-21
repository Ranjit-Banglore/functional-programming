package com.ranjit.functional;

import com.ranjit.dto.Customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Consumer<T> takes one argument and returns nothing.
 * BiConsumer<T,U> takes two argument and returns nothing
 */
public class ConsumerAndBiConsumer {

    public void shortGreeting(Customer customer) {
        Consumer<String> shortGreeting = name -> System.out.println("Hello " + name);
        shortGreeting.accept(customer.getName());
    }

    public void longGreeting(Customer customer) {
        BiConsumer<String, String> longGreeting =
                (name, company) -> System.out.println("Hello " + name + " from " + company);
        longGreeting.accept(customer.getName(), customer.getCountry());
    }
}
