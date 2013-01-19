package com.gmail.dailyefforts.java.generic;

public class Box<T> {

    private T something;

    public void put(T something) {
        this.something = something;
    }

    public T get() {
        return something;
    }
}