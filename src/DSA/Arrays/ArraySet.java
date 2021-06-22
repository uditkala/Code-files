package DSA.Arrays;
//union and intersection of array

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class ArraySet {
    public static void main (String[] args) {
        // Your code here
        int a[]={1,2,3,4,4,5,5};
        int b[]={4,4,5,5,6};
        int union[]=new int[a.length+b.length];
        int intersect[]=new int[Math.min(a.length,b.length)];
        int count[]=new int[10];//max element of a&b
        int un=0,in=0;
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
            union[un++]=a[i];
        }

        for(int i=0;i<b.length;i++){
            if(count[b[i]]>0){
                intersect[in++]=b[i];
                count[b[i]]--;
            }
            else union[un++]=b[i];
        }
        System.out.println("union");
        for(int i=0;i<union.length;i++) if(union[i]>0) System.out.print(union[i]+" ");
        System.out.println("intersection");
        for(int i=0;i<intersect.length;i++) if(intersect[i]>0) System.out.print(intersect[i]+" ");
    }
}