package concurrency;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SchedulerExecutorService {
    public static void main(String[] args) {
        var scheduler = Executors.newScheduledThreadPool(4);
        Runnable runnable = () -> System.out.println("Execution started at " + (new Date()));
        try {
            scheduler.scheduleAtFixedRate(runnable, 5, 5, TimeUnit.SECONDS);
        } finally {
            // scheduler.shutdown();
        }
    }
}
