/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knearelemants;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author samdarshi
 */

class Point{
    int x;
    int y;
    double d;

    public double getD() {
        return d;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.d = java.lang.Math.sqrt(x*x+y*y);
    }
}

public class KNearElemants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Point> kpoints = new ArrayList<Point>();
        List<Point> restpoints = new ArrayList<Point>();
        for(int t=0;t<k;t++){
            kpoints.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        for(int t=k;t<n;t++){
            restpoints.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        Comparator<Point> comparator = new PointComparator();
        PriorityQueue<Point> pq;
        pq = new PriorityQueue<Point>(comparator);
        pq.addAll(kpoints);
        for(Point point : restpoints){
            if(pq.peek().getD()>point.getD()){
                pq.poll();
                pq.add(point);
            }
        }
        for(Point point : pq){
            System.out.println(point.getX()+" "+point.getY());
        }
    }
    
}

class PointComparator implements Comparator<Point>{

    @Override
    public int compare(Point o1, Point o2) {
        if(o1.getD()<o2.getD()){
            return 1;
        }else if(o1.getD()<o2.getD()){
            return -1;
        }else{
            return 0;
        }
    }
    
}
