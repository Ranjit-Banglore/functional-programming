package ch03.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

// define two maps and iterate through functional programming
public class MapTest {
    public static void main(String[] args) {
       //Subject,marks
        Map<String, Integer> student1 = Map.of("Math",78,
            "Physics",98, 
            "Chemistry",76);
        
        //student1.put("Computer",65);
        
        student1.forEach((k,v)-> {
            System.out.println(String.format("Subject: %s, Marks: %d",k,v));
        });
        
        List<Integer> listOfMarks= student1.values().stream()
            .map(String::valueOf)
            .map(Integer::valueOf)
            .filter(m ->  m.intValue()<90 )
            .collect(Collectors.toList());

       Map map= student1.keySet().stream()
            .collect(Collectors.groupingBy(String::length, Collectors.toMap(String::length,String::new)));
        
        System.out.println(map);
    }
}
