package linkedList.linkedlistProblem;

import static linkedList.linkedlistProblem.LinkedListIMPL.ll;

public class DeleteAlternativeElementInLL {

    static void deleteAlternativeElement(Node head) {
        Node currentNode = head;
        while (currentNode != null && currentNode.getNext() != null) {
            currentNode.setNext(currentNode.getNext().getNext());
            currentNode = currentNode.getNext();
        }
    }
    public static void main(String[] args) {

        ll.insertElement(1);
        ll.insertElement(2);
        ll.insertElement(3);
        ll.insertElement(4);
        ll.insertElement(5);
        ll.insertElement(6);

        deleteAlternativeElement(ll.head);

        ll.display();
    }
}
