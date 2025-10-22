package linkedList.linkedlistProblem;

public class MergeTwoSortedLL {
    static Node mergeList(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node ptr1 = head1;
        Node ptr2 = head2;
        Node ptr3 = dummy;

        while(ptr1 != null && ptr2 != null) {
            if(ptr1.getData() < ptr2.getData()) {
                ptr3.setNext(ptr1);
                ptr1 = ptr1.getNext();
            }else {
                ptr3.setNext(ptr2);
                ptr2 = ptr2.getNext();
            }

            ptr3 = ptr3.getNext();
        }

        if(ptr1 != null) {
            ptr3.setNext(ptr1);
        }else {
            ptr3.setNext(ptr2);
        }

        return dummy.getNext();
    }

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll1.insertElement(1);
        ll1.insertElement(4);
        ll1.insertElement(5);
        ll1.display();

        ll2.insertElement(2);
        ll2.insertElement(3);
        ll2.display();

        LinkedList ll3 = new LinkedList();

        ll3.head = mergeList(ll1.head, ll2.head);

        ll3.display();
    }
}
