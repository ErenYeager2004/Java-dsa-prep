package linkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SinglyLinkedListIMPL {

    Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode; // return new head
    }

    void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("X\n");
    }

    Node insertAtTail(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    Node insertAtAnyPosition(Node head, int data, int position) {
        if (position == 0) {
            return insertAtHead(head, data);
        }

        Node temp = head;
        int currentPosition = 0;
        while (temp != null && currentPosition != position - 1) {
            temp = temp.next;
            currentPosition++;
        }

        if (temp == null) {
            System.out.println("Position out of range!");
            return head;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    Node updateAtAnyPosition(Node head, int data, int position) {
        Node temp = head;
        int currentPosition = 0;
        while (temp != null && currentPosition != position) {
            temp = temp.next;
            currentPosition++;
        }

        if (temp == null) {
            System.out.println("Position out of range!");
            return head;
        }

        temp.val = data;
        return head;
    }

    Node deleteAtHead(Node head) {
        if (head == null) return null;
        return head.next;
    }

    Node deleteAtEnd(Node head) {
        if (head == null || head.next == null) return null;

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        secondLast.next = null;
        return head;
    }

    Node deleteAtAnyPosition(Node head, int position) {
        if (position == 0) return deleteAtHead(head);

        Node prev = head;
        int currentPosition = 0;
        while (prev != null && currentPosition != position - 1) {
            prev = prev.next;
            currentPosition++;
        }

        if (prev == null || prev.next == null) {
            System.out.println("Position out of range!");
            return head;
        }

        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedListIMPL ll = new SinglyLinkedListIMPL();
        Node head = null;

        head = ll.insertAtHead(head, 2);
        head = ll.insertAtHead(head, 3);
        head = ll.insertAtTail(head, 5);
        head = ll.insertAtAnyPosition(head, 4, 1);

        ll.display(head); // Output: 3->4->2->5->X

        head = ll.updateAtAnyPosition(head, 9, 2);
        ll.display(head); // Output: 3->4->9->5->X

        head = ll.deleteAtHead(head);
        head = ll.deleteAtEnd(head);
        head = ll.deleteAtAnyPosition(head, 1);
        ll.display(head); // Output: 4->X
    }
}
