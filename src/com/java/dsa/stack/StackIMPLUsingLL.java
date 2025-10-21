package stack;

import java.util.InputMismatchException;
import java.util.Scanner;

class Node {
    public int data;
    public Node next;
}

public class StackIMPLUsingLL {
    Node head;
    int capacity;
    int current_size;

    public StackIMPLUsingLL(int capacity) {
        this.capacity = capacity;
        this.current_size = 0;
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return current_size == capacity;
    }

    public void push() {
        if(this.isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        else {
            int data;
            System.out.print("Enter the data : ");
            data = new Scanner(System.in).nextInt();
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = head;
            head = newNode;
            current_size++;
        }
    }

    public void pop() {
        if(this.isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }else {
            Node newNode = head.next;
            head.next = null;
            head = newNode;
        }
    }

    public void display() {
        if(this.isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("X\n");
        }
    }

    public void getTop() {
        if(this.isEmpty()) {
            System.out.println("Empty Stack");
            return;
        }
        else{
            System.out.print("Top element in the stack " + this.head.data + "\n");
        }
    }

    public void menu() {
        int ch;
        System.out.println("\t*******************");
        System.out.println("\t1 Push");
        System.out.println("\t2 Pop");
        System.out.println("\t3 Display");
        System.out.println("\t4 Display the top element");
        System.out.println("\t5 Exit");
        System.out.print("Enter a choice");
        ch = new Scanner(System.in).nextInt();

        try {
            if(ch <= 5) {
                if (ch == 1) {
                    this.push();
                    this.menu();
                }
                if(ch == 2) {
                    this.pop();
                    this.menu();
                }
                if(ch == 3) {
                    this.display();
                    this.menu();
                }
                if(ch == 4) {
                    this.getTop();
                    this.menu();
                }
                if(ch == 5) {
                    System.exit(0);
                }
            }
            else{
                throw new InputMismatchException("Entered a wrong choice");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            menu();
        }
    }

    public static void main(String[] args) {
        StackIMPLUsingLL st = new StackIMPLUsingLL(6);
        st.menu();
    }
}
