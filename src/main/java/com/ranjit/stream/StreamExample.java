package com.ranjit.stream;

import com.ranjit.dto.Person;
import com.ranjit.enumeration.Gender;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

    /**
     * Filter Only females
     * @param people
     * @return
     */
    public List<Person> females(List<Person> people) {
        return people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
    }


    /**
     * Check if anyone is less that 18 years of age
     * @param people
     * @return
     */
    public boolean isAnyoneLessThan18(List<Person> people) {
        return people.stream()
                .anyMatch(person -> person.getAge() < 18);
    }

    //none

    /**
     * Check if no body is more than 30 Years of age
     * @param people
     * @return
     */
    public boolean noBodyMoreThan30(List<Person> people) {
        return people.stream()
                .noneMatch(person -> person.getAge() > 30);
    }

    /**
     * Sort the list with age and name
     * @param people
     * @return
     */
    public List<Person> sortByAgeAndThenName(List<Person> people) {
        return people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
                .collect(Collectors.toList());
    }

    /**
     * reverse the list with age, name
     * @param people
     * @return
     */
    public List<Person> reverse(List<Person> people) {
        return people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed())
                .collect(Collectors.toList());
    }

    /**
     * Set of unique names.
     * @param people
     * @return
     */
    public Set<String> setOfNames(List<Person> people) {
        return people.stream()
                .map(person -> person.getName())
                .collect(Collectors.toSet());
    }

    /**
     * Oldest person
     * @param people
     * @return
     */
    public Person maxAgePerson(List<Person> people) {
        return people.stream()
                .max(Comparator.comparing(Person::getAge))
                .get();
    }

    /**
     * youngest person.
     * @param people
     * @return
     */
    public Person minAgePerson(List<Person> people) {
        return people.stream()
                .min(Comparator.comparing(Person::getAge))
                .get();
    }

    /**
     * group by Gender
     * @param people
     * @return
     */
    public Map<Gender, List<Person>> groupByGender(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
    }

}
