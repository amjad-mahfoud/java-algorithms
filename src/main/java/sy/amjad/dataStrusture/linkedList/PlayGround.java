package sy.amjad.dataStrusture.linkedList;

import sy.amjad.dataStrusture.common.User;
import java.util.Comparator;

public class PlayGround {
    public static void main(String[] args) {
        var linkedList = new LinkedList<Integer>(null, null, Integer::compare);

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        System.out.println(linkedList);
        System.out.println("Current head: " + linkedList.getHead());
        System.out.println("Current tail: " + linkedList.getTail());

        linkedList.insert(11,0);
        System.out.println(linkedList);
        System.out.println("Current head: " + linkedList.getHead());
        System.out.println("Current tail: " + linkedList.getTail());

        linkedList.insert(12,4);
        System.out.println(linkedList);
        System.out.println("Current head: " + linkedList.getHead());
        System.out.println("Current tail: " + linkedList.getTail());

        linkedList.append(4);
        linkedList.append(5);
        System.out.println(linkedList);

        System.out.println("Current head: " + linkedList.getHead());
        System.out.println("Current tail: " + linkedList.getTail());

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.remove(-5);
        System.out.println(linkedList);


        var usersLinkedList = new LinkedList<User>(null, null, Comparator.comparingInt(User::getId));

        usersLinkedList.append(new User(1, "A"));
        usersLinkedList.append(new User(2, "B"));
        usersLinkedList.append(new User(3, "C"));
        usersLinkedList.append(new User(4, "D"));
        System.out.println(usersLinkedList);
        System.out.println("Current head: " + usersLinkedList.getHead());
        System.out.println("Current tail: " + usersLinkedList.getTail());

        System.out.println(usersLinkedList.reverse());
        System.out.println("Current head: " + usersLinkedList.getHead());
        System.out.println("Current tail: " + usersLinkedList.getTail());

        usersLinkedList.remove(new User(3, "C"));
        System.out.println(usersLinkedList);

        LinkedList<Integer> fromArrayLinkedList = new LinkedList<Integer>(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println("LinkedList: " + fromArrayLinkedList);

        System.out.println("Head: " + fromArrayLinkedList.getHead());
        System.out.println("Tail: " + fromArrayLinkedList.getTail());

        var head = fromArrayLinkedList.deleteHead();
        System.out.println("Deleted head: " + head);

        var tail = fromArrayLinkedList.deleteTail();
        System.out.println("Deleted tail: " + tail);

        System.out.println("LinkedList: " + fromArrayLinkedList);

        System.out.println("Head: " + fromArrayLinkedList.getHead());
        System.out.println("Tail: " + fromArrayLinkedList.getTail());
        System.out.println("After deleting tail: " + fromArrayLinkedList);

        do {
            fromArrayLinkedList.deleteTail();
            System.out.println("List: " + fromArrayLinkedList);
            System.out.println("Tail: " + fromArrayLinkedList.getTail());
        } while (fromArrayLinkedList.getTail() != null);
    }
}
