package Stack;

import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
//        int size = stack.size();
//        for(int i = 0; i < size;i++){
//            System.out.println(stack.pop());
//        }
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
