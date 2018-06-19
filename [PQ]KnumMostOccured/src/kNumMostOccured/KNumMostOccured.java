/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kNumMostOccured;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author samdarshi
 * 
 */

class Pair{
    Integer key, value;
    
    public Pair(Integer k, Integer v){
        key = k;
        value = v;
    }
}

class HighComparator implements Comparator<Pair>{

    @Override
    public int compare(Pair o1, Pair o2) {
        if(o1.value<o2.value){                         
            return 1;
        }else if(o1.value == o2.value && o1.key<o2.key){
            return 1;
        }else{
            return -1;
        }
    }
    
}

public class KNumMostOccured {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[1000];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        HighComparator hc = new HighComparator();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(n, hc);
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }
        System.out.println(pq.remove().key);
        System.out.println(pq.remove().key);
    }
    
}
