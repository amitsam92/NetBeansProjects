/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leftview;

import javafx.scene.layout.AnchorPane;

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

public class LeftView {

    /**
     * @param args the command line arguments
     */
    static int level = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Node root = new Node(12);
        root.left = new Node(10);
        root.right = new Node(30);
        root.right.left = new Node(25);
        root.right.right = new Node(40);
        
        printLeftView(root);
    }

    private static void printLeftView(Node root) {
        getLeftView(root, 1);
    }

    private static void getLeftView(Node root, int nextLevel) {
        if(root == null) return;
        if(level < nextLevel){
            System.out.println(root.value);
            level = nextLevel;
        }
        getLeftView(root.left, nextLevel+1);
        getLeftView(root.right, nextLevel+1);
    }

    
}
