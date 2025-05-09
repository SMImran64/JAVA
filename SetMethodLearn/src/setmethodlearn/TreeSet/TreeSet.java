
package setmethodlearn.TreeSet;

import java.util.Set;
import java.util.TreeSet;


public class TreeSet {
    
    public static void main(String[] args) {
         Set<String> s = new TreeSet<>();
        
         //String value
         
        s.add("Parvez");
        s.add("Rakib");
        s.add("Reja");
        s.add("Atik");
        s.add("Parvez");
        
        System.out.println(s);
        
        TreeSet<String> tSet = new TreeSet<>(s);
        
        System.out.println(tSet.first());
        System.out.println(tSet.last());
        System.out.println(tSet.floor("Atik"));
        System.out.println(tSet.ceiling("Rakib"));
        
        
        
    }
    
}
