package com.company.SimpleLog;

public interface SimpleLog<T> {
    public void insert(T t);
    public boolean isFull();
    public int size();
    public boolean search(T t);
    public void clear();
    public String toString();
}
