package sy.amjad.dataStrusture.queue;

import sy.amjad.dataStrusture.linkedList.LinkedList;

import java.util.List;

public class Queue<T> {
    private final LinkedList<T> queue;

    public Queue() {
        this.queue = new LinkedList<T>();
    }

    public boolean isEmpty(){
        return this.queue.getHead() == null;
    }

    public void enqueue(T value) {
        this.queue.append(value);
    }

    public T dequeue() {
        var removedHead = this.queue.deleteHead();
        return removedHead != null ? removedHead.getValue() : null;
    }

    public T peek() {
        if( this.isEmpty() ){
            return null;
        }

        return this.stack.getHead().getValue();
    }

    @Override
    public String toString() {
        return this.stack.toString();
    }

    public List<T> toArray() {
        return this.stack.toList();
    }

}
