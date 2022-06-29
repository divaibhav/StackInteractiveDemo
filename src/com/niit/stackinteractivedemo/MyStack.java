package com.niit.stackinteractivedemo;

public class MyStack {
    //head
    Node top;

    public void push(int data){
        //step1
        Node node = new Node(data);
        //step 2
        node.next = top;
        //step 3
        top = node;
    }
    public int pop(){
        //step 1
        if(top == null){
            System.out.println("Stack underflow: cannot delete from empty stack");
            return 0;
        }
        else{
            //step 2
            Node temp = top;
            //step 3
            top = top.next;
            //step 4
            int value = temp.data;
            //step 5
            temp = null;
            return value;
        }
    }
    public int peek(){
        if(top != null){
            return top.data;
        }
        return 0;
    }
}
