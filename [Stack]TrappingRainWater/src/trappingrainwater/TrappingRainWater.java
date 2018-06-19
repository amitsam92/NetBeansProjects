/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trappingrainwater;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author samdarshi
 */
public class TrappingRainWater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = new int[1000];
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), n, ans;
        while((t--)>0){
            n = sc.nextInt();
            Stack<Integer> st = new Stack<Integer>();
            nums[0] = sc.nextInt();
            st.push(nums[0]);
            ans = 0;
            for(int i=1;i<n;i++){
                nums[i] = sc.nextInt();
                if(nums[i]<=nums[i-1]){
                    st.push(nums[i]);
                }else{
                    int j=1, pop=0;
                    for(j=1;st.size()>0 && st.peek()<=nums[i];j++){
                        pop = st.pop();
                    }
                    ans += (j-1)*(pop);
                    st.push(nums[i]);
                }
            }
            System.out.println(ans);
            
        }
    }
    
}
