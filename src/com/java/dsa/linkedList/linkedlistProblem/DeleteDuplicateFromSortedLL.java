package linkedList.linkedlistProblem;


public class DeleteDuplicateFromSortedLL {

    static void deleteDuplicate(Node head) {
        Node current = head;
        while(current != null && current.getNext() != null) {
            if(current.getData() == current.getNext().getData()) {
                current.setNext(current.getNext().getNext());
            }else{
                current = current.getNext();
            }
        }

    }
    public static void main(String[] args) {
        LinkedListIMPL.ll.insertElement(1);
        LinkedListIMPL.ll.insertElement(1);
        LinkedListIMPL.ll.insertElement(2);
        LinkedListIMPL.ll.insertElement(2);
        LinkedListIMPL.ll.insertElement(3);
        LinkedListIMPL.ll.insertElement(3);
        LinkedListIMPL.ll.insertElement(4);
        LinkedListIMPL.ll.insertElement(4);

        LinkedListIMPL.ll.display();

        deleteDuplicate(LinkedListIMPL.ll.head);

        LinkedListIMPL.ll.display();

    }
}
