package com.ranjit.test;

import com.ranjit.ImperativeVsDeclarative;
import com.ranjit.dto.Person;
import com.ranjit.enumeration.Gender;
import org.junit.Test;

import java.util.List;

public class ImperativeVsDeclarativeTest {

    private List<Person> people = List.of(
            new Person("Ranjit", Gender.MALE, 25),
            new Person("Katha", Gender.FEMALE, 24),
            new Person("Maria", Gender.FEMALE, 14),
            new Person("Manual", Gender.MALE, 19),
            new Person("Alice", Gender.FEMALE, 21)
    );

    @Test
    public void withImperativeTest() {
        new ImperativeVsDeclarative().imperativeExample(people);
    }

    @Test
    public void withDeclarativeTest() {
        new ImperativeVsDeclarative().declarativeExample(people);
    }

}
