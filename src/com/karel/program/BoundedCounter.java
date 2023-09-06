package com.karel.program;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public BoundedCounter(int upperLimit, int initialValue) {
        this.upperLimit = upperLimit;
        if (initialValue >= 0 && initialValue <= upperLimit) {
            this.value = initialValue;
        } else {
            this.value = 0;
        }
    }

    public void next() {
        if (value < upperLimit) {
            value++;
        } else {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return Integer.toString(value);
    }
}
