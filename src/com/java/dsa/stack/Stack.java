package stack;

import java.util.Scanner;

public abstract class Stack<T> {
    int top = -1;
    int ele = 0;
    T[] arr ;

    abstract void push();

    abstract void pop();

    abstract void display();

    abstract boolean isEmpty();

    abstract boolean isFull();

     void menu() {
         boolean flag;
         do {
             System.out.println("*******************************************");
             System.out.println("1. Push");
             System.out.println("2. Pop");
             System.out.println("3. Display");
             System.out.println("4. Exit");
             System.out.println("Enter your choice");
             int choice = new Scanner(System.in).nextInt();
             flag = true;
             switch (choice) {
                 case 1 -> push();
                 case 2 -> pop();
                 case 3 -> display();
                 case 4 -> System.exit(0);
                 default -> flag = false;
             }
         } while (flag);
     }
}
