package queue;

import java.util.Scanner;

public class queueIMPL extends Queue{
    @Override
    void push() {
        if(isFull()){
            System.out.println("Queue is full can't insert anymore data");
            return;
        }
        System.out.println("Enter data to push into the Queue");
        int data = new Scanner(System.in).nextInt();
        arr[rear++] = data;
        ele++;
        System.out.println("Data pushed into the queue, current element present in the queue is " + ele);
    }

    @Override
    void pop() {
        if(isEmpty()){
            System.out.println("Queue is empty can't delete any more data");
            return;
        }
        font++;
        ele--;
        System.out.println("Data deleted successfully, current element present in the queue is " + ele);
    }

    @Override
    void display() {
        if(isEmpty()){
            System.out.println("Queue is empty , insert some data first");
            return;
        }
        for(int i = font; i < rear; i++){
            System.out.println(arr[i]);
        }
    }

    @Override
    boolean isEmpty() {
        return rear == font ;
    }

    @Override
    boolean isFull() {
        return rear == arr.length - 1;
    }

    public static void main(String[] args) {
        Queue newQueue = new queueIMPL();
        newQueue.menu();
    }
}
