package Lab;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lab {
public static void main(String[] args){
 Stack<String> myStack = new Stack();
    myStack.push("apple");
    myStack.push("pear");
    myStack.push("pineapple");
    myStack.push("Lemon");
    myStack.push("grape");
    //print current top of the stack to console
    System.out.println(myStack.peek());
//create queue with 5 elements.Note where the elements are placed in
    Queue<String> myQueue = new LinkedList();

    myQueue.add("paper");
    myQueue.add("rock");
    myQueue.add("scissors");
    myQueue.add("spock");
    myQueue.add("fire");
    System.out.println(myQueue);
    myQueue.remove();
    myQueue.remove();
    System.out.println(myQueue.element());
}

}
