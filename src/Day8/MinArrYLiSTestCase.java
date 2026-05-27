package Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinArrYLiSTestCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of test cses: ");
        int t = sc.nextInt();
        for(int j=0;j<t;j++);{
            System.out.println("Enter Size of Array: ");
            int ArrayLisSize=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            System.out.println("Enter Values: ");
            for(int i=0;i<ArrayLisSize;i++)
            {
                int val = sc.nextInt();
                arr.add(val);
            }
            System.out.println(Collections.min(arr));
            Collections.sort(arr);
            System.out.println("Sorted List: "+ arr);
        }
        sc.close();
    }
    
}
