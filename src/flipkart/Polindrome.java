package flipkart;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Polindrome {
    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('a');
        linkedList.add('m');
        linkedList.add('m');
        linkedList.add('a');
        Iterator<Character> iterator = linkedList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        boolean isPolindrome = isPolindrome(linkedList);
        System.out.println(isPolindrome);
    }

    public static boolean isPolindrome(LinkedList<Character> linkedList) {
        Iterator iterator = linkedList.iterator();
        Stack<Character> stack = new Stack<>();
        while (iterator.hasNext()) {
            stack.push((Character) iterator.next());
        }

        Iterator iterator1 = linkedList.iterator();
        while (iterator1.hasNext()) {
            if(stack.peek() != (Character) iterator1.next()) {
                return false;
            } else {
                stack.pop();
            }
        }
        return true;
    }
}
