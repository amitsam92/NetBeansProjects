/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundarytraversal;

import java.util.Stack;

/**
 *
 * @author samdarshi
 */

class Node{
    Integer value;
    Node left;
    Node right;
    
    public Node(Integer val){
        value = val;
        left = null;
        right = null;
    }
}

public class BoundaryTraversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);
        
        //printLeftBoundary(root);
        //printRightBoundaryRev(root);
        
        getLeafNodes(root);
    }

    private static void printLeftBoundary(Node root) {
        while(root!=null){
            System.out.println(root.value);
            root = root.left;
        }
    }
    
    private static void printRightBoundaryRev(Node root) {
        Stack<Node> st = new Stack<Node>();
        while(root!=null){
            st.push(root);
            root = root.right;
        }
        while(st.size()>0){
            System.out.println(st.pop().value);
        }
    }

    private static void getLeafNodes(Node root) {
        if(root == null){
            return;
        }else if(root.left==null && root.right==null){
            System.out.println(root.value);
        }else{
            getLeafNodes(root.left);
            getLeafNodes(root.right);
        }
    }
    
}
