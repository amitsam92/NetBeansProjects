/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupDivBy3;

import java.util.Scanner;

/**
 *
 * @author samdarshi
 */
public class GroupDivBy3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = new int[1000], rem = {0, 0, 0};
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
            rem[nums[i]%3]++;
        }
        System.out.println(getGroups(rem));
    }

    private static int getGroups(int[] rem) {
        int val = rem[0]*(rem[0]-1)/2; // grp2 with distinct remainder
        val += rem[1]*rem[2]; // grp2 with same remainder 0
        
        val += rem[0]*(rem[0]-1)*(rem[0]-2)/6; // grp3 with same remainder 0
        val += rem[1]*(rem[1]-1)*(rem[1]-2)/6; // grp3 with same remainder 1
        val += rem[2]*(rem[2]-1)*(rem[2]-2)/6; // grp3 with same remainder 2
        
        val += rem[0]*(rem[1])*(rem[2]); // grp3 with distinct
        
        return val;
    }
    
}
