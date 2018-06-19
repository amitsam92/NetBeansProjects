/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minsumpath;

/**
 *
 * @author samdarshi
 */
public class MinSumPath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int result = minPathSum (grid);
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length - 1, n = grid[0].length - 1;
        for(int t = m+n-1;t>=0;t--){
            for(int i = m;i>=0;i--){
                for(int j = n;j>=0;j--){
                    if(i+j == t){
                        grid[i][j] = Math.min((i+1<=m)? grid[i+1][j]:100000000,(j+1<=n)? grid[i][j+1]:100000000)+grid[i][j];
                    }
                }
            }
        }
        return grid[0][0];
    }

    
}
