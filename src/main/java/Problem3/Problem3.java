package Problem3;

import Problem1.ArrayStack;
import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        // homework
        // !!! must use your ArrayStack or LinkedListStack in problem 1
        // print with the following format. System.out.println() will not pass test.
        LinkedListStack backStack = new LinkedListStack();
        while (list.next != null) {
            backStack.push(list.next.val);
            list = list.next;
        }
        while (backStack.size() != 0) {
            print.println(backStack.pop());
        }
    }
}
