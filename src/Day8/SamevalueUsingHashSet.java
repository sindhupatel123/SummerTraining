package Day8;
import java.util.HashSet;
public class SamevalueUsingHashSet {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(66);
        set.add(4);
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(4);
        set1.add(5);
        set1.add(66);
        set1.add(4);
        set.addAll(set1);
        System.out.println(set);
    
    }
    
}
