/*
 * Scooby and all of his friends have gathered for a party. There are N friends present. Scooby is really happy to see all of his friends in one place and is excited to greet them.

All N friends are seated in a circle, and are numbered from 0 to N-1. Scooby is initially sitting beside the Ath friend. After greeting one friend, he goes clockwise to the Bth next friend, sits next to him and greets him. He repeats this till he returns to the Ath friend.

In his excitement, it is possible that Scooby misses out on greeting some friends. Your job is to find the number of friends (including A) that Scooby will have greeted before reaching back to A.

Input:

The first line contains T, the number of test cases.

Each of the next T lines contain three space-separated integers, the values of A, B and N for that test case.

Output:

For each test case, output the number of friends that Scooby will have greeted before reaching back to A.

Constraints:

1 ≤ T ≤ 100000

1 ≤ N ≤ 1015

0 ≤ B ≤ 1015
 */
package cp.excitedscooby;

import java.util.Scanner;

/**
 *
 * @author samdarshi
 */
public class CPExcitedScooby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n, a, b;
        while((t--)>0){
            a = sc.nextLong();
            b = sc.nextLong();
            n = sc.nextLong();
            
            System.out.println(n/gcd(n,b));
        }
    }

    private static long gcd(long n, long b) {
        if (b==0){
            return n;
        }else{
            return gcd(b, n%b);
        }
    }
    
}
