package queue;
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class QueueImplUsingLL {
    Node head;
    Node tail;
    int size;

    public QueueImplUsingLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(this.head == null) {
            this.head = this.tail = newNode;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
        }

        this.size++;
    }

    public void dequeue() {
        if(head == null) {
            return;
        }else{
            Node oldHead = this.head;
            Node newHead = this.head.next;
            this.head = newHead;
            if(this.head == null) this.tail = null;
            oldHead.next = null;
            this.size++;
        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int getFont() {
        return this.head.data;
    }

    public void display() {
        while(!isEmpty()) {
            System.out.print(this.getFont() + " ");
            this.dequeue();
        }
    }
    public static void main(String[] args) {
        QueueImplUsingLL q = new QueueImplUsingLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.dequeue();
        q.enqueue(40);
        q.display();
    }
}
