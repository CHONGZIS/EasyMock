package com.jhj.core.generic.pair;

public class Pair<T> {
    private T first;
    private T seconde;

    public Pair() {
    }

    public Pair(T first, T seconde) {
        this.first = first;
        this.seconde = seconde;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSeconde() {
        return seconde;
    }

    public void setSeconde(T seconde) {
        this.seconde = seconde;
    }
}
