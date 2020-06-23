package com.ranjit.combinator;

import com.ranjit.dto.Customer;

import java.util.function.Function;

import static com.ranjit.combinator.CustomerValidator.*;
import static com.ranjit.combinator.CustomerValidator.ValidationResult.*;


public interface CustomerValidator extends Function<Customer, ValidationResult> {

    static CustomerValidator isNameValid() {
        return customer -> customer.getName().length() > 50 ? NAME_IS_INVALID
                : SUCCESS;
    }

    static CustomerValidator isCountryValid() {
        return customer -> customer.getCountry().length() > 3 ? COUNTRY_IS_INVALID
                : SUCCESS;
    }

    static CustomerValidator isPhoneValid() {
        return customer -> customer.getPhone().startsWith("+49") ? SUCCESS
                : PHONE_IS_INVALID;
    }

    static CustomerValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? SUCCESS
                : EMAIL_IS_INVALID;
    }

    default CustomerValidator and (CustomerValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }

     enum ValidationResult {
        SUCCESS,
        NAME_IS_INVALID,
        COUNTRY_IS_INVALID,
        PHONE_IS_INVALID,
        EMAIL_IS_INVALID;
    }
}
