package DSAList;

public class MyLinkedList {
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;
        for(int i = 0; i < size; i++){
            stringBuilder.append(temp.value).append("\t");
            temp = temp.next;
        }

        return stringBuilder.toString();
    }
}
