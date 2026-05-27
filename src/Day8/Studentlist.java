package Day8;
import java.util.ArrayList;
import java.util.Scanner;

public class Studentlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t; j++);{
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++);
        {
            int Submarks = sc.nextInt();
            arr.add(Submarks);

        }int s=0;
        for(int c : arr){
            s+=c;
        }
        double avg = (double)s/5;
        System.out.println(s);
        System.out.println(avg);
    }
    sc.close();
    }
}
