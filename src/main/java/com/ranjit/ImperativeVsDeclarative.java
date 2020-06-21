package com.ranjit;

import com.ranjit.dto.Person;
import com.ranjit.enumeration.Gender;

import java.util.ArrayList;
import java.util.List;

public class ImperativeVsDeclarative {

    public void imperativeExample(List<Person> people) {
        //Imperative approach:
        System.out.println("Imperative approach:");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if(person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

    }

    public void declarativeExample(List<Person> people) {
        ///Declarative approach
        System.out.println("Declarative approach:");
        people.stream() //it allows us to go in abstract mode
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                //.collect(Collectors.toList())
                .forEach(System.out::println);

    }


}
