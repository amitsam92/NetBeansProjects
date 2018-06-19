/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystackdemo;

/**
 *
 * @author samdarshi
 */
class MyStack{
    int[] a = new int[100000];
    int top = -1;
    
    public int push(int x){
        a[++top]=x;
        return top;
    }
    
    public int pop(){
        int ret = a[top];
        a[top--]=0;
        return ret;
    }
    
    public int peek(){
        return a[top];
    }
    
    public int size(){
        return top+1;
    }
}
public class MyStackDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyStack ms = new MyStack();
        ms.push(10);
        ms.push(20);
        ms.push(30);
        ms.push(40);
        ms.push(50);
        ms.pop();
        while(ms.size()>0){
            System.out.println(ms.pop());
        }
    }
    
}
