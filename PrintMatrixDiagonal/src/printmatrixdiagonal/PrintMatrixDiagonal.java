/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printmatrixdiagonal;

import java.util.Scanner;

/**
 *
 * @author samdarshi
 */
public class PrintMatrixDiagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a = new int[5][5];
        int t = 5;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(a[0][0]);
        printNext(0, 0, t-1, a);
    }

    private static void printNext(int i, int j, int t, int[][] a) {
        if(j==0 && i==0){
            i++;
        }else if(j==t && i==t){
            return;
        }
        else if(j==t && i%2==0){
            i++;
        }
        else if(i==t && j%2==1){
            j++;
        }
        else if(j==0 && i%2==0){
            i++;
        }
        else if(i==0 && j%2==1){
            j++;
        }
        else if((i+j)%2 == 0){
            j--;
            i++;
        }else{
            i--;
            j++;
        }
        System.out.println(a[i][j]);
        printNext(i, j, t, a);
        return;
    }
    
}
