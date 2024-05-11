package sy.amjad.dataStrusture.linkedList;

import sy.amjad.dataStrusture.common.User;
import java.util.Comparator;

public class PlayGround {
    public static void main(String[] args) {
        var linkedList = new LinkedList<Integer>(null, null, Integer::compare);

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.prepend(-5);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        var usersLinkedList = new LinkedList<User>(null, null, Comparator.comparingInt(User::getId));

        usersLinkedList.append(new User(1, "A"));
        usersLinkedList.append(new User(2, "B"));
        usersLinkedList.prepend(new User(3, "C"));
        usersLinkedList.prepend(new User(3, "C"));
        usersLinkedList.append(new User(4, "D"));
        System.out.println(usersLinkedList);

        usersLinkedList.remove(new User(3, "C"));
        System.out.println(usersLinkedList);

        LinkedList<Integer> fromArrayLinkedList = new LinkedList<Integer>(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println(fromArrayLinkedList);

        var head = fromArrayLinkedList.deleteHead();
        System.out.println(head);
        System.out.println(fromArrayLinkedList);

        var tail = fromArrayLinkedList.deleteTail();
        System.out.println(tail);

        do {
            fromArrayLinkedList.deleteTail();
            System.out.println("List: " + fromArrayLinkedList);
            System.out.println("Tail: " + fromArrayLinkedList.getTail());
        } while (fromArrayLinkedList.getTail() != null);
    }
}
