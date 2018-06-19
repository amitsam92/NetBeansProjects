/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myqueuedemo;

/**
 *
 * @author samdarshi
 */
class Node{
    int value = 0;
    Node next = null;
    
    public Node(int x){
        this.value = x;
        this.next = null;
    }
}

class MyQueue{
    
    Node head = null;
    Node tail = null;
    int size = 0;
    
    public int push(int x){
        if(size == 0){
            head = new Node(x);
            tail = head;
        }else{
            tail.next = new Node(x);
            tail = tail.next;
        }
        size++;
        return tail.value;
    }
    
    public int pop() throws Exception{
        Node node;
        int ret;
        if(size == 0){
            throw new Exception("not allowed to pop from empty queue");     
        }else if(size == 1){
            node = head;
            ret = head.value;
            node = null;
            head = null;
            tail = null;
            size--;
        }else{
            node = head;
            ret = head.value;
            node = null;
            head = head.next;
            size--;
        }
        return ret;
    }
    
    public int peek(){
        return head.value;
    }
    
    public int size(){
        return size;
    }
}
public class MyQueueDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        MyQueue mq = new MyQueue();
        mq.push(10);
        mq.push(20);
        mq.push(30);
        mq.push(40);
        mq.push(50);
        mq.pop();
        while(mq.size()>0){
            System.out.println(mq.pop());
        }
    }
    
}
