/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumton;

import java.util.Scanner;

/**
 *
 * @author samdarshi
 */
public class SumToN {

    /**
     * @param args the command line arguments
     */
    public static int ways = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), n = sc.nextInt();
        getWays(n, s);
        System.out.println(ways);
    }

    private static void getWays(int n, int s) {
        if(n==0 && s==0){
            ways++;
        }
        if(n==0){
            return;
        }
        for(int i=0;i<=s;i++){
            getWays(n-1, s-i);
        }
    }
    
    
}
