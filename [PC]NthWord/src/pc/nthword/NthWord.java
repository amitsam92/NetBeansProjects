/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.nthword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author samdarshi
 */
public class NthWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), n, l;
        while((t--)>0){
            String s = sc.next();
            n = sc.nextInt();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            //ArrayList<char> a = new ArrayList<char>(Arrays.asList(chars));
            //ArrayList<char> arrayList = new ArrayList<char>(Arrays.asList(char));
            List<Character> a = new ArrayList<Character>();
            for (char c : chars) {
                a.add(c);
            }
            String x = "";
            for(int i=0;i<chars.length;i++){
                l = a.size();
                for(int j=0;j<l;j++){
                    if((n - fact(l-1))>0){
                        n = n - fact(l-1);
                    }else{
                        x += a.get(j);
                        a.remove(j);
                        break;
                    }
                }
            }
            
            System.out.println(x);
            
        }
    }

    private static int fact(int n) {
        int result;
       if(n==0 || n==1)
         return 1;

       result = fact(n-1) * n;
       return result;
    }
    
}
