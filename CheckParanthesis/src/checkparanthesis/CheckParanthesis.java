/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkparanthesis;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author samdarshi
 */
public class CheckParanthesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        Stack<Character> s = new Stack<Character>();
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='{' || exp.charAt(i)=='[' || exp.charAt(i)=='('){
                s.push(exp.charAt(i));
            }
            if(exp.charAt(i)=='}' && s.peek()=='{'){
                s.pop();
            }
            if(exp.charAt(i)==')' && s.peek()=='('){
                s.pop();
            }
            if(exp.charAt(i)==']' && s.peek()=='['){
                s.pop();
            }
        }
        if(s.empty()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
    }
    
}
