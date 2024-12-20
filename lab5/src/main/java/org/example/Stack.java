package org.example;

public class Stack {
    private int[] array;
    private int size;
    private static final int MAX_SIZE = 10;

    public Stack() {
        this.array = new int[MAX_SIZE];
        this.size = 0;
    }

    public void push(int value) {
        if (size >= MAX_SIZE) {
            throw new IllegalStateException("Стек переповнений");
        }
        array[size++] = value;
    }

    public int pop() {
        if (size == 0) {
            throw new IllegalStateException("Стек порожній");
        }
        return array[--size];
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Стек порожній");
        }
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }
}
