package linkedList.linkedlistProblem;

class Node {
    private final int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertElement(int data) {
        Node newNode = new Node(data);

        if(head == null ){
            this.head = newNode;
            return;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public void display() {
        Node temp = this.head;
        while(temp != null) {
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }
        System.out.println("X");
    }
}

public class LinkedListIMPL {
    static LinkedList ll = new LinkedList();
}
