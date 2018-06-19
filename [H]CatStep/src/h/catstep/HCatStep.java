/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h.catstep;

import java.util.Scanner;

/**
 *
 * @author samdarshi
 */
public class HCatStep {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
    // note:
    // this is just an example on how our system
    // takes input and output and automate the process
    // of marking this submission
    try {
      Scanner scan = new Scanner(System.in);
      
      // check if there is any more line
      if (scan.hasNextLine()) {
        // here's how you read the next line
        String string = scan.nextLine();
        String[] result = "this is a test".split("\\s");
        int a1 = Integer.parseInt(result[0]);
        int p1 = Integer.parseInt(result[1]);
        int a2 = Integer.parseInt(result[2]);
        int p2 = Integer.parseInt(result[3]);
        int res = 0;
        if(p1-p2-1 == 0){
            res = 0;
        }else if(p1-p2-1 < 3){
            res = 1;
        }else if((p1-p2-1)%2 == 0){
            res = 1;
        }else if((p1-p2-1)%2 == 1){
            res = 0;
        }
        
        if((res == 1 && a1>a2) && (res == 0 && a1<a2)){
            string = "1";
        }else{
            string = "0";
        }
        // here's how you output the result
        System.out.println(string);
      }
    
    } catch (Exception e) {
    }
  }
    
}
