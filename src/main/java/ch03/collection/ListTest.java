package ch03.collection;

import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(new Integer[]{1,3, 5,8,19});
        System.out.println(list);
    }
}
