package Day5;

import java.util.Scanner;

public class FibonaciSeriesRecursion {
    public static int fibo(int n) {
        //base case
        if(n==1) return 1;
        if(n==0) return 0;
        //recursive
        return fibo(n-1) + fibo(n-2);    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.println(fibo(i)+ " "); 
        }
       sc.close();
    }
}
