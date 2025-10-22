package linkedList.linkedlistProblem;

public class CheckForEqualLL {
    static boolean isEqual(Node head1, Node head2) {
        Node ptr1 = head1;
        Node ptr2 = head2;

        while(ptr1 != null && ptr2 != null) {
            if(ptr1.getData() != ptr2.getData()) {
                return false;
            }

            ptr1 = ptr1.getNext();
            ptr2 = ptr2.getNext();
        }

        return (ptr1 == null && ptr2 == null);
    }
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();

        ll1.insertElement(1);
        ll1.insertElement(2);
        ll1.insertElement(3);
        ll1.insertElement(4);

        ll2.insertElement(1);
        ll2.insertElement(2);
        ll2.insertElement(3);
        ll2.insertElement(4);

        if(isEqual(ll1.head, ll2.head)) {
            System.out.println("Both are equal linked list");
        }else {
            System.out.println("Both are not equal linked list");
        }
    }
}
