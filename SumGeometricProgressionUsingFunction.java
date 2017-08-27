package loop;

import java.util.Scanner;

public class SumGeometricProgressionUsingFunction {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            CalculatingSum(t,a,b,n);
        }
        
        in.close();
	}


	
	public static void CalculatingSum(int t, int a,int b,int n) {
			for (int j=0;j<n;j++){
				    double sum= a + b*(1*(((Math.pow(2,j+1)-1))));
                    System.out.print((int)sum +" ");
                    
                }
	}}



