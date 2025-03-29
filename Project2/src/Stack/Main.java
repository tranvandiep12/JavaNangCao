package Stack;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("10");
        linkedList.addFirst("20");
        linkedList.addFirst("30");
        linkedList.addFirst("40");
        linkedList.addFirst("50");

        System.out.println(linkedList);
        // last in first out
    }
}
