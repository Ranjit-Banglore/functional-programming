package ch03.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CustomComparatorTest2 {
    public static void main(String[] args) {
        var statuses = Arrays.asList(
                new Status[]{
                        Status.PAYOUTS_PENDING,
                        Status.PAYOUTS_APPROVED,
                        Status.PENDING,
                        Status.PRE_ASSESMENT_PENDING,
                        Status.TRANSACTION_APPROVED,
                        Status.TRANSACTION_PENDING
                }
        );
        
        var comparator = Comparator.comparing(Status::name).thenComparingInt(Status::getOrder);
        Collections.sort(statuses, comparator);
        System.out.println(statuses);
    }
}
