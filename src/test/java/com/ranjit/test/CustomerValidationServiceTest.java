package com.ranjit.test;

import com.ranjit.combinator.CustomerValidationService;
import com.ranjit.dto.Customer;
import org.junit.Test;

public class CustomerValidationServiceTest {
    Customer customer = new Customer(
            "Ranjit",
            "DE",
            "+4921984984",
            "ranjitkumarkiit@gmail.com"
    );

    @Test
    public void customerValidationTest(){
        System.out.println(new CustomerValidationService().validateCustomer(customer));
    }

}
