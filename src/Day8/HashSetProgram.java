package Day8;

import java.util.*;


public class HashSetProgram {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(66);
        set.add(4);
        System.out.println(set);
        LinkedList<Integer> s=new LinkedList<>(set);
        System.out.println(s);
    }

    
}
