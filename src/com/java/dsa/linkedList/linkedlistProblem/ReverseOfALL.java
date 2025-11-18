package linkedList.linkedlistProblem;

public class ReverseOfALL {
    static void displayReverse(Node head) {

        Node temp = head;
        if(temp == null) {
            return;
        }
        displayReverse(temp.getNext());
        System.out.print(temp.getData() + "->");
    }

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();

        ll1.insertElement(10);
        ll1.insertElement(20);
        ll1.insertElement(30);
        ll1.insertElement(40);
        ll1.insertElement(50);

        ll1.display();

        displayReverse(ll1.head);

    }
}
