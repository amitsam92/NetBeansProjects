/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 microsoft-interview-questions
 Find the number of ways you can have breakfast in 'n' days, given Bread-butter can be eaten every day, Pizza can be eaten every alternate day and Burger can be eaten every two days.
 */
package dp.breakfast;

import java.util.Scanner;

/**
 *
 * @author samdarshi
 */
public class DPBreakfast {

    /**
     * @param args the command line arguments
     * 1 -> bread
     * 2 -> pizza
     * 3 -> burger
     */
    public static int way = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getWay(n, 0, 0);
        System.out.println(way);
    }

    private static void getWay(int n, int y1, int y2) {
        if(n==0){
            way++;
            return;
        }
        getWay(n-1, 1, y1);
        if(y1 != 2){
            getWay(n-1, 2, y1);
        }
        if(y1 != 3 && y2 != 3){
            getWay(n-1, 3, y1);
        }
    }
    
}
