package Day8;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListEmp {
    public static void main(String[] args) {
        ArrayList<String> emd  = new ArrayList<>();
        emd.add("raj");
        emd.add("ram");
        emd.add("raj");
        LinkedHashSet<String>lhs=new LinkedHashSet<>(emd);
        System.out.println(lhs);

        
    }
    
}
