package linkedList.linkedlistProblem;

import static linkedList.linkedlistProblem.LinkedListIMPL.ll;

public class DeleteOddElements {

    public static void deleteOdd(Node head) {
        while(head != null && head.getData() % 2 != 0) {
            head = head.getNext();
        }

        if(head == null) {
            return;
        }

        Node current = head;
        Node prev = null;

        while(current != null) {
            if(current.getData() % 2 != 0) {
                prev.setNext(current.getNext());
            }else{
                prev = current;
            }
            current = current.getNext();
        }
    }
    public static void main(String[] args) {
        ll.insertElement(1);
        ll.insertElement(2);
        ll.insertElement(3);
        ll.insertElement(4);
        ll.insertElement(5);
        ll.insertElement(6);

        deleteOdd(ll.head);

        ll.display();
    }

}
