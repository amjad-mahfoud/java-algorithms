package sy.amjad.dataStrusture.dynamicArray;

import java.util.concurrent.atomic.AtomicInteger;

public class PlayGround {
    public static void main(String[] args) {
        var dynamic = new DynamicArray<Integer>();

        for (int i = 0; i < 6; i++) {
            dynamic.put(i);
        }

        AtomicInteger sum = new AtomicInteger();

        dynamic.forEach((value) -> {
            System.out.println(value);
            sum.addAndGet(value);
        });


        System.out.println("Sum: " + sum.get());

        var sum2 = 0;

        for (var value: dynamic) {
            System.out.println(value);
            sum2 += value;
        }

        System.out.println("Sum: " + sum2);
    }
}
