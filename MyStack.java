package seri5;

import java.util.Stack;

public class MyStack<T> {
    //bad az anjam chalesh aval be generic tabdil krdam
     private int size = 0;

    private Node<T> top = null;

    public void push(T value) {
        Node<T> a = new Node<>(value);
        if (this.top == null) this.top = a;
        else {
            a.last = top;

            top = a;
        }
        size++;

    }

    public Node<T> pop() throws MyStackEmptyException {
        if (top == null) throw new MyStackEmptyException();
        Node<T> w = this.top;
        this.top = top.last;
        size--;
        return w;

    }

    public Node<T> top() throws MyStackEmptyException {
        if (top == null) throw new MyStackEmptyException();
        return top;
    }

    public void reverse(MyStack<T> s1, MyStack<T> s2) {

        int size = s1.size;
        for (int i = 0; i < size; i++) {
            T top = s1.pop().value;
            for (int j = 0; j < size - i - 1; j++) {
                s2.push(s1.pop().value);
            }
            s1.push(top);
            for (int j = 0; j < size - i - 1; j++) {
                s1.push(s2.pop().value);
            }
        }


    }

    public void reverse(MyStack<T> s1, Stack<T> s2) {

        int size = s1.size;
        for (int i = 0; i < size; i++) {
            T top = s1.pop().value;
            for (int j = 0; j < size - i - 1; j++) {
                s2.push(s1.pop().value);
            }
            s1.push(top);
            for (int j = 0; j < size - i - 1; j++) {
                s1.push(s2.pop());
            }
        }


    }

    public void reverse(Stack<T> s1, MyStack<T> s2) {


        int length = s1.size();

        for (int i = 0; i < length; i++) {
            T top = s1.pop();
            for (int j = 0; j < length - i - 1; j++) {
                s2.push(s1.pop());
            }
            s1.push(top);
            for (int j = 0; j < length - i - 1; j++) {
                s1.push(s2.pop().value);
            }

        }

    }

    public void reverse(Stack<T> s1, Stack<T> s2) {

        int length = s1.size();

        for (int i = 0; i < length; i++) {
            T top = s1.pop();
            for (int j = 0; j < length - i - 1; j++) {
                s2.push(s1.pop());
            }
            s1.push(top);
            for (int j = 0; j < length - i - 1; j++) {
                s1.push(s2.pop());
            }
        }


    }
}
