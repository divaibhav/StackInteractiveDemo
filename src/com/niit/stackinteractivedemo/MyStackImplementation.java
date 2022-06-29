package com.niit.stackinteractivedemo;

public class MyStackImplementation {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        int poppedElement = stack.pop();
        stack.push(10);

        stack.push(30);

        stack.push(40);
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.peek() = " + stack.peek());
    }
}
