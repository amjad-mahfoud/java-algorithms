package sy.amjad.dataStrusture.stack;

import sy.amjad.dataStrusture.linkedList.LinkedList;

import java.util.List;

public class Stack<T> {
    private final LinkedList<T> stack;

    public Stack() {
        this.stack = new LinkedList<T>();
    }

    public boolean isEmpty(){
        return this.stack.getHead() == null;
    }

    public void push(T value) {
        this.stack.prepend(value);
    }

    public T peek() {
        if( this.isEmpty() ){
            return null;
        }

        return this.stack.getHead().getValue();
    }

    public T pop(){
        var head = this.stack.deleteHead();
        return head.getValue() != null ? head.getValue() : null;
    }

    @Override
    public String toString() {
        return this.stack.toString();
    }

    public List<T> toArray() {
        return this.stack.toList();
    }
}
