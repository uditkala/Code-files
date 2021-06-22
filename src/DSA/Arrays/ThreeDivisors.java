package DSA.Arrays;
//check numbers with 3 divisors less than N

import java.io.*;
import java.util.*;
class ThreeDivisors {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            long c=0;
            for(long i=4;i<n;i++){
                int f=0;
                alpha:
                for(long j=2;j<i;j++){
                    if(i%j==0){
                        f++;
                    }
                    if(f>1){
                        break alpha;
                    }
                }
                if(f==1){
                    //System.out.println(i);
                    c++;
                }
            }
            System.out.println(c);
            t--;
        }
    }
}
