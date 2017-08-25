import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lensum=A.length() + B.length();
        System.out.println(lensum);
        int compare=A.compareTo(B);
        if (compare>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String C=String.valueOf(A.charAt(0)).toUpperCase() + A.substring(1) +" "+
            String.valueOf(B.charAt(0)).toUpperCase() + B.substring(1);
        System.out.println(C);
        sc.close();
        
    }
}