package com.zaah;

public class Main {

    public static void main(String[] args) {
/*
        // creates the stack - line 14 in stack
        Stack stack = new Stack();

        // Pushes to stack - line 20 in stack
        stack.push(5);
        stack.push(12);
        stack.push(4);
        stack.push(3);
        stack.push(42);

        // prints the stack values - line 33 in stack
        stack.print();

        // prints last value in the stack - line 40 in stack
        System.out.println("value of peek/last entry: " + stack.peek());

        // pop (removes) last entry in the stack and prints - line 27 in stack
        System.out.println("Pops: " + stack.pop());

        // prints last value in the stack - line 40 in stack
        System.out.println("value of peek/last entry: " + stack.peek());

        // pop (removes) last entry in the stack and prints - line 27 in stack
        System.out.println("Pops: " + stack.pop());
        System.out.println("Pops: " + stack.pop());

        // prints last value in the stack - line 40 in stack
        System.out.println("value of peek/last entry: " + stack.peek());

        // checks if the stack is empty or not - line 45 in stack
        System.out.println("Is the stack empty?: " + stack.empty());

        // print the size of the stack - line 52 in stack
        System.out.println("Size of the stack: " + stack.getSize());
*/

        // Queue part
        Queue queue = new Queue();

        // offer/add's to the queue - line 20 in queue
        queue.offer(5);
        queue.offer(9);
        queue.offer(21);
        queue.offer(42);
        queue.offer(4);

        // prints the queue - line 33 in queue
        queue.print();

        // removes last value/entry in the queue - line 27 in queue
        System.out.println("removes: " + queue.remove());

        // prints last value in the queue - line 40 in queue
        System.out.println("value of peek/last entry: " + queue.peek());

        // removes last value/entry in the queue - line 27 in queue
        System.out.println("removes: " + queue.remove());
        System.out.println("removes: " + queue.remove());

        // prints last value in the queue - line 40 in queue
        System.out.println("value of peek/last entry: " + queue.peek());

        // checks if the queue is empty or not - line 45 in queue
        System.out.println("Is the stack empty?: " + queue.empty());

        // print the size of the queue - line 52 in queue
        System.out.println("Size of the queue: " + queue.getSize());

    }
}
