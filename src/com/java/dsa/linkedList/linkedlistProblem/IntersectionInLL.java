package linkedList.linkedlistProblem;

public class IntersectionInLL {
    static int getLength(Node head){
        Node temp = head;
        int length = 0;

        while(temp != null) {
            length++;
            temp = temp.getNext();
        }

        return length;
    }

    static Node moveHeadByK(Node head, int k) {
        Node ptr = head;
        while(k-- > 0 && ptr != null) {
            ptr = ptr.getNext();
        }
        return ptr;
    }

    static Node getIntersection(Node head1, Node head2) {
        int l1 = getLength(head1);
        int l2 = getLength(head2);

        Node ptr1, ptr2;

        if(l1 > l2) { //l1 is longer
            int k = l1 - l2;
            ptr1 = moveHeadByK(head1, k);
            ptr2 = head2;
        }else { //l2 is longer
            int k = l2 - l1;
            ptr1 = head1;
            ptr2 = moveHeadByK(head2, k);
        }

        while(ptr1 != null) {
            if(ptr1  == ptr2) {
                return ptr1;
            }

            ptr1 = ptr1.getNext();
            ptr2 = ptr2.getNext();
        }

        return null;
    }

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();

        ll1.insertElement(1);
        ll1.insertElement(2);
        ll1.insertElement(3);
        ll1.insertElement(4);
        ll1.insertElement(5);

        ll2.insertElement(6);
        ll2.insertElement(7);

        ll2.head.getNext().setNext(ll1.head.getNext().getNext());

        Node intersection = getIntersection(ll1.head, ll2.head);

        if(intersection != null) {
            System.out.println("Intersection al node with value " + intersection.getData());
        }else {
            System.out.println("No intersection found");
        }
    }
}
