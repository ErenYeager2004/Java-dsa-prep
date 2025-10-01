package stack;

import java.util.Scanner;

public class StackIMPL extends Stack{
    public static void main(String[] args) {
        Stack newStack = new StackIMPL();
        newStack.menu();
    }

    @Override
    public void push() {
        if(isFull()){
            System.out.println("Stack Overflow, can't insert anymore data");
            return;
        }
        System.out.println("Enter your data to push in the stack");
        int data = new Scanner(System.in).nextInt();
        arr[++top] = data;
        ele++;
        System.out.println("Data pushed into the stack, current no of element present in the stack is " + ele);
    }

    @Override
    public void pop() {
            if(isEmpty()){
                System.out.println("Stack underflow, there is no data left for to delete");
                return;
            }
            top--;
            ele--;
        System.out.println("Data popped from stack, current no of element present in the stack is " + ele);
    }

    @Override
    public void display() {
        if(isEmpty()){
            System.out.println("Stack underflow, no data is present pls pushed some data first");
            return;
        }
        for(int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == arr.length - 1;
    }
}
