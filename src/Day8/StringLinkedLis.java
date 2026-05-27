package Day8;
import java.util.LinkedList;
import java.util.Scanner;

public class StringLinkedLis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String k = sc.nextLine();
        LinkedList<String> ll=new LinkedList<>();
        for(int i=0;i<n;i++);
        {
            String val = sc.next();
            ll.add(val);

        }
         System.out.println(ll.contains(k));
         int c=0;
         for(String d : ll)
            {
            if(d.equals(k))
        {
                c++;
            }
         }
          System.out.println(c);
          sc.close();
    }
    
}
