package com.zaah;

public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    /** Construct a queue with the default capacity 16 */
    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    /** Construct a queue with the specified maximum capacity */
    public Queue(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    /** Insert a new integer into the queue */
    public void offer(int value) {
        elements[size] = value;
        size++;
    }


    /** Return and remove the element from the queue */
    public int remove() {
        size--;
        return elements[size];
    }

    /** Prints values in the stack */
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    /** Return the element from the queue, which has been in the queue longest time */
    public int peek() {
        return elements[size-1];
    }

    /** Test whether the queue is empty */
    public boolean empty() {
        if (elements.length == 0) {
            return true;
        }
        else return false;
    }

    /** Return the number of elements in the queue */
    public int getSize() {
        return size;
    }
}
