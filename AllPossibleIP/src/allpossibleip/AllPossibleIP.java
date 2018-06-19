/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allpossibleip;

import java.util.Scanner;

/**
 *
 * @author samdarshi
 */
public class AllPossibleIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        printIP("","","","",num.trim());
    }

    private static void printIP(String a, String b, String c, String d, String num) {
        if(num.length()==0){
            if(a.length()==0 || b.length()==0 || c.length()==0 || d.length()==0){
                return;
            }else{
                System.out.println(a+"."+b+"."+c+"."+d);
                return;
            }
        }else{
            if(a.equals("")){
                if(num.charAt(0)=='0'){
                    printIP("0", b, c, d, num.substring(1));
                }else{
                    if(num.length()>=1 && Integer.valueOf(num.substring(0, 1))<256)printIP(num.substring(0, 1), b, c, d, num.substring(1));
                    if(num.length()>=2 && Integer.valueOf(num.substring(0, 2))<256)printIP(num.substring(0, 2), b, c, d, num.substring(2));
                    if(num.length()>=3 && Integer.valueOf(num.substring(0, 3))<256)printIP(num.substring(0, 3), b, c, d, num.substring(3));
                }
            } else if(b.equals("")){
                if(num.charAt(0)=='0'){
                    printIP(a, "0", c, d, num.substring(1));
                }else{
                    if(num.length()>=1 && Integer.valueOf(num.substring(0, 1))<256)printIP(a, num.substring(0, 1), c, d, num.substring(1));
                    if(num.length()>=2 && Integer.valueOf(num.substring(0, 2))<256)printIP(a, num.substring(0, 2), c, d, num.substring(2));
                    if(num.length()>=3 && Integer.valueOf(num.substring(0, 3))<256)printIP(a, num.substring(0, 3), c, d, num.substring(3));
                }
            } else if(c.equals("")){
                if(num.charAt(0)=='0'){
                    printIP(a, b, "0", d, num.substring(1));
                }else{
                    if(num.length()>=1 && Integer.valueOf(num.substring(0, 1))<256)printIP(a, b, num.substring(0, 1), d, num.substring(1));
                    if(num.length()>=2 && Integer.valueOf(num.substring(0, 2))<256)printIP(a, b, num.substring(0, 2), d, num.substring(2));
                    if(num.length()>=3 && Integer.valueOf(num.substring(0, 3))<256)printIP(a, b, num.substring(0, 3), d, num.substring(3));
                }
            } else if(d.equals("")){
                if(num.charAt(0)=='0'){
                    printIP(a, b, c, "0", num.substring(1));
                }else{
                    if(num.length()>=1 && Integer.valueOf(num.substring(0, 1))<256)printIP(a, b, c, num.substring(0, 1), num.substring(1));
                    if(num.length()>=2 && Integer.valueOf(num.substring(0, 2))<256)printIP(a, b, c, num.substring(0, 2), num.substring(2));
                    if(num.length()>=3 && Integer.valueOf(num.substring(0, 3))<256)printIP(a, b, c, num.substring(0, 3), num.substring(3));
                }
            }
            return;
        }
    }
    
}
