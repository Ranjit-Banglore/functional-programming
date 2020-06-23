package com.ranjit.test;

import com.ranjit.dto.Customer;
import com.ranjit.functional.ConsumerAndBiConsumer;
import org.junit.Test;

public class ConsumerAndBiConsumerTest {

    @Test
    public void consumerTest() {
        new ConsumerAndBiConsumer().shortGreeting(new Customer("Ranjit", "India"));
    }

    @Test
    public void biConsumerTest() {
        new ConsumerAndBiConsumer().longGreeting(new Customer("Ranjit", "India"));
    }
}
