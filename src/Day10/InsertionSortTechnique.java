package Day10;

import java.util.*;

public class InsertionSortTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            int j=i-1;
            int current=arr[i];
            while(j>=0 && arr[j]>current) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current; 
            System.out.println(Arrays.toString(arr)); //to display all steps
        }
        //System.out.println(Arrays.toString(arr)); // to display final step
        sc.close();
    
    }
}