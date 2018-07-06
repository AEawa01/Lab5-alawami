package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Stack;


public class LinkedStack<E> implements IStack<E> {
    /** The topmost node of this stack. The stack gets pushed down from here. */
    private Node<E> top;

    @Override
    public E push(final E obj) {
        Node<E> nn = new Node<E>(obj, top);
        top = nn;
        return obj;
    }

    @Override
    public E peek() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return top.data;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        E peakVal = top.data;
        top = top.next;
        return peakVal;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public List<E> asList() {
        List<E> list = new ArrayList<>();
        Node<E> start = top;
        while(start!=null){
            list.add(start.data);
            start = start.next;
        }
        return list;
    }
}
