/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergeklist;

import java.util.Comparator;
import java.util.PriorityQueue;
import javafx.scene.layout.Priority;

/**
 *
 * @author samdarshi
 */
public class MergeKList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comparator<Integer> comp = new NodeComparator();
        PriorityQueue<Integer> pq = new PriorityQueue<>(comp);
        pq.add(2);
        pq.add(5);
        pq.add(3);
        pq.add(1);
        pq.add(6);
        pq.add(3);
        pq.add(1);
        pq.add(7);
        while(pq.peek() != null){
            System.out.println(pq.poll());
        }
    }
    
}

class NodeComparator implements Comparator<Integer>
{
    @Override
    public int compare(Integer a, Integer b){
        return a-b;
    }
}
