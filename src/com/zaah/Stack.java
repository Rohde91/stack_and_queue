package com.zaah;

public class Stack{
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    /** Construct a stack with the default capacity 16 */
    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    /** Construct a stack with the specified maximum capacity */
    public Stack(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    /** Push a new integer into the top of the stack */
    public void push(int value) {
        elements[size] = value;
        size++;
    }


    /** Return and remove the top element from the stack */
    // TODO kan laves med if/else til at checke om der ligger noget overhovedet
    public int pop() {
        size--;
        return elements[size];
    }

    /** Prints values in the stack */
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }
/*
    /** Return the top element from the stack */
    public int peek() {
        return elements[size-1];
    }

    /** Test whether the stack is empty */
    public boolean empty() {
        if (elements.length == 0) {
            return true;
        }
        else return false;
    }

    /** Return the number of elements in the stack */
    public int getSize() {
        return size;
    }
}
