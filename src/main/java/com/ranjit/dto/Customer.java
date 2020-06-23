package com.ranjit.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Customer {
    private String name;
    private String country;
    private String phone;
    private String email;

    public Customer(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
