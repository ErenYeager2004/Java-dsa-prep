package linkedList.linkedlistProblem;


import java.util.HashSet;

import static linkedList.linkedlistProblem.LinkedListIMPL.ll;

public class DetectCycle {
    static boolean detectCycle(Node head) {
        HashSet<Node> st = new HashSet<>();
        while(head != null) {
            if(st.contains(head))
                return true;

            st.add(head);

            head = head.getNext();
        }

        return false;
    }
    public static void main(String[] args) {
        ll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        ll.head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);

        // Create cycle: 4 → 2
        fourth.setNext(second);

        if(detectCycle(ll.head)) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
