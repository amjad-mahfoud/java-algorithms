package sy.amjad.dataStrusture.stack;

public class PlayGround {
    public static void main(String[] args) {
        var integerStack = new Stack<Integer>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(5);
        integerStack.push(5);
        System.out.println(integerStack);

        integerStack.pop();
        integerStack.pop();
        System.out.println(integerStack);

        var value = integerStack.peek();
        System.out.println("Peeked value: " + value);
        System.out.println(integerStack);
    }
}
