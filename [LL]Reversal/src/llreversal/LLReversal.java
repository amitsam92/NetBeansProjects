/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llreversal;

import java.util.Scanner;

/**
 *
 * @author samdarshi
 */

class Node {
    int value;
    Node next;
    
    public Node(int v){
        value = v;
    }
}
public class LLReversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, t, first;
        Node root, curr;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        first = sc.nextInt();
        curr = root = new Node(first);
        for(int i=1;i<t;i++){
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }
        Node prev = null, next = null;
        curr = root;
        while(true){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            if(curr.next == null){
                curr.next = prev;
                break;
            }
        }
        root = curr;
        
        while(curr != null){
            System.out.println(curr.value);
            curr = curr.next;
        }
    }
    
}
