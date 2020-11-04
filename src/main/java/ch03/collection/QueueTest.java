package ch03.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //add element
        System.out.println(queue.offer(5));
        // return next element orelse null
        System.out.println(queue.peek());
        System.out.println(queue);
        // remove and return next elemenet or else null
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
