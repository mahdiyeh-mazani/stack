package seri5;

import java.util.EmptyStackException;
import java.util.Stack;

public class check {
    public static void main(String[] args) {
        MyStack<Integer> myStack1 = new MyStack<>();
        myStack1.push(1);
        myStack1.push(2);
        myStack1.push(3);
        myStack1.push(4);
        System.out.println(myStack1.top());
        myStack1.reverse(myStack1, new MyStack<>());
        System.out.println(myStack1.pop());
        System.out.println(myStack1.pop());
        System.out.println(myStack1.pop());
        System.out.println(myStack1.pop());
        try {
            System.out.println(myStack1.pop());
        }
        catch (MyStackEmptyException e) {
            System.out.println(e.getMessage());
        }
        MyStack<Integer> myStack2 = new MyStack<>();
        myStack2.push(14);
        myStack2.push(62);
        System.out.println(myStack2.top());
        myStack2.reverse(myStack2, new Stack<>());
        System.out.println(myStack2.pop());
        System.out.println(myStack2.pop());
        try {
            System.out.println(myStack2.pop());
        }
        catch (MyStackEmptyException e) {
            System.out.println(e.getMessage());
        }
        Stack<Integer> Stack1 = new Stack<>();
        Stack1.push(16);
        Stack1.push(29);
        myStack1.reverse(Stack1, new MyStack<>());
        System.out.println(Stack1.pop());
        System.out.println(Stack1.pop());
        try {
            System.out.println(Stack1.pop());
        }
        catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
        Stack<Integer> Stack2 = new Stack<>();
        Stack2.push(116);
        Stack2.push(229);
        myStack2.reverse(Stack2, new Stack<>());
        System.out.println(Stack2.pop());
        System.out.println(Stack2.pop());
        try {
            System.out.println(Stack2.pop());
        }
        catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
        try {
            MyStack<String> u = new MyStack<>();
            u.push("hello");
            u.push("bye");
            System.out.println(u.pop());
            System.out.println(u.top());
        } catch (MyStackEmptyException r) {
            System.out.println(r.getMessage());
        }
    }
}
