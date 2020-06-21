package com.ranjit.dto;


import com.ranjit.enumeration.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Person {
    private String name;
    private Gender gender;
    private Integer age;
}
