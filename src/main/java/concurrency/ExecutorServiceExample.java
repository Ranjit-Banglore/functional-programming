package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();


        Runnable task1 = () -> System.out.println(" This is task one.");
        Runnable task2 = () -> System.out.println(" This is task two.");
        Runnable task3 = () -> System.out.println(" This is task three.");
        try {
            service.submit(task1);
            service.submit(task2);
            service.submit(task3);

        } finally {
            if(service!=null){
                System.out.println(" shutting down executor");
                 //not able to submit task anymore. however already submitted task will excute anyway.
                service.shutdown();
                System.out.println("service is closed now");
            }
        }

    }
}
