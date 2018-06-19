/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfsbfs;

import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author samdarshi
 */

class Node{
    Node left;
    Node right;
    int value;
    boolean visit;
    public Node(int v){
        value = v;
        left = null;
        right = null;
        visit = false;
    }
}

public class DfsBfs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);
        
        //printDfs(root);
        printBfs(root);
        // TODO code application logic here
    }

    private static void printDfs(Node root) {
        Stack<Node> st = new Stack<Node>();
        st.push(root);
        root.visit = true;
        while(!st.isEmpty()){
            if(st.peek().left!=null && st.peek().left.visit==false){
                st.peek().left.visit = true;
                st.push(st.peek().left);
                continue;
            }if(st.peek().right!=null && st.peek().right.visit==false){
                st.peek().right.visit = true;
                st.push(st.peek().right);
                continue;
            }if((st.peek().left==null && st.peek().right==null) || (st.peek().left!=null && st.peek().left.visit==true) || (st.peek().right!=null && st.peek().right.visit==true)){
                System.out.println(st.pop().value);
            }
        }
    }
    
    private static void printBfs(Node root) {
        
        Queue<Node> qu = new LinkedList<Node>();
        Stack<Node> st = new Stack<Node>();
        st.push(root);
        qu.add(root);
        while(!qu.isEmpty()){
            if(qu.peek().left!=null){
                qu.add(qu.peek().left);
            }
            if(qu.peek().right!=null){
                qu.add(qu.peek().right);
            }
            System.out.println(qu.poll().value);
        }
    }
    
}
