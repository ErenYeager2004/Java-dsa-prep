package linkedList.linkedlistProblem;

public class DeleteKthNodeFromEndOfLL {
    static void removeKthNodeFromEnd(Node head, int k) {
        Node ptr1 = head;
        Node ptr2 = head;

        int count = k;
        while(count > 0) {
            ptr2 = ptr2.getNext();
            count--;
        }

        if(ptr2 == null) {
            Node temp = head;
            head = head.getNext();
            return;
        }

        while(ptr2.getNext() != null) {
            ptr1 = ptr1.getNext();
            ptr2 = ptr2.getNext();
        }

        Node temp = ptr1.getNext();
        ptr1.setNext(ptr1.getNext().getNext());
    }

    public static void main(String[] args) {
        LinkedListIMPL.ll.insertElement(1);
        LinkedListIMPL.ll.insertElement(2);
        LinkedListIMPL.ll.insertElement(3);
        LinkedListIMPL.ll.insertElement(4);
        LinkedListIMPL.ll.insertElement(5);
        LinkedListIMPL.ll.insertElement(6);

        LinkedListIMPL.ll.display();

        removeKthNodeFromEnd(LinkedListIMPL.ll.head, 3);

        LinkedListIMPL.ll.display();
    }
}
