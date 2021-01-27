package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> sumOfIntegerUpto1000 = () -> {
            int result = 0;
            for (int i = 0; i < 1000; i++) {
                result = result + i;
            }
            return result;
        };

        try {
            var future = executor.submit(sumOfIntegerUpto1000);
            System.out.println(future.get());
        } finally {
            if (executor != null) {
                executor.shutdown();
                System.out.println("Executor has been shut down");
            }
        }

    }
}
