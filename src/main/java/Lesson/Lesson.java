package Lesson;




import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Lesson {
//stack last in first out

    public static void main(String[] args) {


        Stack<Integer> IntegerStack = new Stack();
//pushing will add an item
        IntegerStack.push(1);
        IntegerStack.push(2);
        IntegerStack.push(3);
        IntegerStack.push(4);
        IntegerStack.push(5);

        System.out.println(IntegerStack);
//youn can remove an item from a stack using pop
        IntegerStack.pop();
//item should be removed from stack, last bitem in if first out
        System.out.println(IntegerStack);
   //you can set the size manually using set size.
         IntegerStack.setSize(4);
   //You can still push items to the stack.However, I believe this is because Stack ultimately inherits from List.
         IntegerStack.push(5);
        System.out.println(IntegerStack);
        System.out.printf("This is the value I get when I peek: %d\n",IntegerStack.peek());
    //you can use peek to access the value at the top of the stack without affecting it.
    //check stack empty using empty method.It will return boolean value
        System.out.printf("This boolean value I get when I call the empty method %b\n",IntegerStack.empty());
        System.out.println(IntegerStack.search(3));
  Stack<String> stringStack = new Stack();
  stringStack.push("Hello");
  stringStack.push("hola");
  stringStack.push("guten tag");
        System.out.println(stringStack);
        System.out.println(stringStack.search("guten tag"));
   //Queues
   //you can declare a queue with priorityqueue or linkedlist
        //priority queue is alphabetical or number sort
   Queue<String> q = new PriorityQueue<>() ;
   //add method will add all elements to the queue
    q.add("tacos");
    q.add("hot dogs");
    q.add("rice bowls");
        System.out.println(q);
        System.out.println(q.element());

        Queue<String> q1 = new LinkedList<>();
        q1.add("tacos");
        q1.add("hot dogs");
        q1.add("rice bowls");
        System.out.println(q);
        //this will give us the head of the quee
        //note that itbe the first elemnt that we defined
        System.out.println(q1.element());
        //calling remove will remove the head of thr queue
        //this follows the first in first out paradigm thats inverse to stacks
         q1.remove();
        System.out.println(q1.element());
        //poll will return the head of te queue and remove it from queue
        System.out.println(q1.poll());
        System.out.println(q1);
    }


}
