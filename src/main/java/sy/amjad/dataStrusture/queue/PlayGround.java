package sy.amjad.dataStrusture.queue;

import sy.amjad.dataStrusture.stack.Stack;

public class PlayGround {
    public static void main(String[] args) {
        var integerQueue = new Queue<>();

        integerQueue.enqueue(1);
        integerQueue.enqueue(2);
        integerQueue.enqueue(3);
        System.out.println(integerQueue);

        integerQueue.enqueue(4);
        integerQueue.enqueue(5);

        System.out.println(integerQueue);

        integerQueue.dequeue();
        System.out.println(integerQueue);

        var value = integerQueue.peek();
        System.out.println("Peeked value: " + value);
        System.out.println(integerQueue);
    }
}
