package sy.amjad.dataStrusture.linkedList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sy.amjad.dataStrusture.common.Node;

import java.util.*;
import java.util.stream.Stream;

@AllArgsConstructor
@NoArgsConstructor
public class LinkedList<T> {

    @Setter @Getter
    private Node<T> head = null;
    @Setter @Getter
    private Node<T> tail = null;
    @Setter @Getter
    Comparator<T> comparator;

    public LinkedList(T[] values) {
        this.append(values);
    }

    public LinkedList<T> append(T value) {
        var newNode = new Node<T>( value, null);

        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;

            return this;
        }

        this.tail.setNext(newNode);
        this.tail = newNode;

        return this;
    }

    public LinkedList<T> append(T[] values) {
        for (var value : values) {
            this.append(value);
        }

        return this;
    }

    public LinkedList<T> prepend(T value){
        var newNode = new Node<T>( value, this.head);

        this.head = newNode;

        if (this.tail == null) {
            this.tail = newNode;
        }

        return this;
    }

    public Node<T> remove(T value){
        if (this.head == null){
            return null;
        }

        Node<T> deletedNode = null;

        while (this.head != null && this.comparator.compare(this.head.getValue(), value) == 0) {
            deletedNode = this.head;
            this.head = this.head.getNext();
        }

        var currentNode = this.head;

        if (currentNode != null) {
            // If next node must be deleted then make next node to be a next next one.
            while (currentNode.getNext() != null) {
                if (this.comparator.compare(currentNode.getNext().getValue(), value) == 0) {
                    deletedNode = currentNode.getNext();
                    currentNode.setNext(currentNode.getNext().getNext());
                } else {
                    currentNode = currentNode.getNext();
                }
            }
        }

        // Check if tail must be deleted.
        if (this.comparator.compare(this.getTail().getValue(), value) == 0) {
            this.tail = currentNode;
        }

        return deletedNode;
    }

    public List<T> toList() {
        return Stream.iterate(this.getHead(), Objects::nonNull, Node::getNext)
                .map(Node::getValue)
                .toList();
    }

    public LinkedList<T> insert(T value, int index) {
        // TODO: insert at index
        return this;
    }

    public Node<T> deleteTail(){
        var deletedNode = this.tail;

        var currentNode = this.getHead();

        if (currentNode == null || currentNode.getNext() == null) {
            this.setHead(null);
            this.setTail(null);
            return currentNode;
        }

        while(currentNode.getNext().getNext() != null){
            currentNode = currentNode.getNext();
        }

        this.setTail(currentNode);
        currentNode.setNext(null);

        return this.getTail();
    }

    public Node<T> deleteHead() {
        if (this.head == null){
            return null;
        }

        var deletedNode = this.head;

        if(this.head.getNext() != null) {
            this.head = this.head.getNext();
        } else {
            this.head = null;
            this.tail = null;
        }

        return deletedNode;
    }

    public LinkedList<T> reverse() {
        var currentNode = this.getHead();
        var currentHead = this.getHead();

        Node<T> previousNode = null;
        Node<T> nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.getNext();
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }

        this.setHead(previousNode);
        this.setTail(currentHead);

        return this;
    }

    @Override
    public String toString() {
        return String.join(" -> ", this.toList().stream().map(Object::toString).toList());
    }
}
