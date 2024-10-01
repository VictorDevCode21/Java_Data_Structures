package com.practice.pointers;

public class DoubleNode {
    private int value;
    private DoubleNode next;
    private DoubleNode prev;

    public void setNext(DoubleNode node) {
        this.next = node;
    }

    public DoubleNode getNext() {
        return this.next;
    }

    public void setPrev(DoubleNode node) {
        this.prev = node;
    }

    public DoubleNode getPrev() {
            return this.prev;
    }

    public DoubleNode(int value) {
        this.value = value;
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }

    public int getValue() {
        return this.value;
    }


    public String toString() {
            return (prev != null ? prev.getValue() : null) + "<-" + this.value + "->" + (next != null ? next.getValue() : null);
    }

}
