package ch04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier s1= LocalDate::now;
        System.out.println(s1.get());

        Supplier<List<String>> s2= ArrayList::new;
        var list = s2.get();
        list.add("Ranjit");
        System.out.println(list);

    }

}
