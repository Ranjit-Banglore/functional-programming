package com.ranjit.test;

import com.ranjit.dto.Person;
import com.ranjit.enumeration.Gender;
import com.ranjit.stream.StreamExample;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StreamExampleTest {
    private List<Person> people = List.of(
            new Person("Ranjit", Gender.MALE, 25),
            new Person("Katha", Gender.FEMALE, 24),
            new Person("Maria", Gender.FEMALE, 14),
            new Person("Manual", Gender.MALE, 19),
            new Person("Alice", Gender.FEMALE, 21)
    );

    @Test
    public void checkFemales() {
        List<Person> females = new StreamExample().females(people);
        females.forEach(female -> System.out.println(female));
        Assert.assertEquals(females.size(), 3);
    }

    @Test
    public void setOfNameTest() {
        Set<String> names = new StreamExample().setOfNames(people);
        names.forEach(name -> System.out.println(name));
        Assert.assertEquals(names.size(), 5);
    }

    @Test
    public void sortedPeopleListTest() {
        List<Person> sortedList = new StreamExample().sortByAgeAndThenName(people);
        sortedList.forEach(person -> System.out.println(person));
    }


    @Test
    public void sortedPeopleReverseTest() {
        List<Person> sortedList = new StreamExample().reverse(people);
        sortedList.forEach(person -> System.out.println(person));
    }

    @Test
    public void maxAgePersonTest() {
        Person person = new StreamExample().maxAgePerson(people);
        System.out.println(person);
    }

    @Test
    public void minAgePersonTest() {
        Person person = new StreamExample().minAgePerson(people);
        System.out.println(person);
    }

    @Test
    public void groupByGenderTest() {
        Map<Gender, List<Person>> groupedMap = new StreamExample().groupByGender(people);
        groupedMap.forEach((k, v) -> System.out.println(k + "-->" + v));
    }

}
