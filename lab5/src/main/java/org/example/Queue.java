package org.example;

public class Queue {
    private int[] array;
    private int front;
    private int rear;
    private static final int MAX_SIZE = 10;

    public Queue() {
        this.array = new int[MAX_SIZE];
        this.front = 0;
        this.rear = 0;
    }

    public void enqueue(int value) {
        if (rear >= MAX_SIZE) {
            throw new IllegalStateException("Черга переповнена");
        }
        array[rear++] = value;
    }

    public int dequeue() {
        if (front == rear) {
            throw new IllegalStateException("Черга порожня");
        }
        return array[front++];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == MAX_SIZE;
    }
}

