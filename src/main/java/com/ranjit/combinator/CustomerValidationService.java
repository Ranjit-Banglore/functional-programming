package com.ranjit.combinator;

import com.ranjit.combinator.CustomerValidator.ValidationResult;
import com.ranjit.dto.Customer;

public class CustomerValidationService {

    public ValidationResult validateCustomer(Customer customer){
        return CustomerValidator.isNameValid()
                .and(CustomerValidator.isCountryValid())
                .and(CustomerValidator.isPhoneValid())
                .and(CustomerValidator.isEmailValid())
                .apply(customer);
    }

}
