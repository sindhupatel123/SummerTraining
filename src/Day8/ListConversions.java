package Day8;
import java.util.*;
public class ListConversions {

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        System.out.println(list);
    ArrayList<Integer> arr=new ArrayList<>(list);
    System.out.println(arr);
    TreeSet<Integer> set=new TreeSet<>(arr);
    System.out.println(set);
    
}
}


