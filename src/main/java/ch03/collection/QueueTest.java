package ch03.collection;

import java.util.LinkedList;
import java.util.Queue;

//Add items to queue and verify order of getting values out of queue
public class QueueTest {
    public static void main(String[] args) {

        int i=0;
        Queue<String> messages= new LinkedList<>();
        messages.offer("This is message-"+i++);
        messages.offer("This is message-"+i++);
        messages.offer("This is message-"+i++);
        messages.offer("This is message-"+i++);

        i=0;
        System.out.println("Before polling: "+messages);
        System.out.println(messages.poll());
        System.out.println("After polling message-"+ i++ + " "+messages);
        System.out.println(messages.poll());
        System.out.println("After polling message-"+ i++ + " "+messages);
        System.out.println(messages.poll());
        System.out.println("After polling message-"+ i++ + " "+messages);
        System.out.println(messages.poll());
        System.out.println("After polling message-"+ i++ + " "+messages);
        
    }
}
