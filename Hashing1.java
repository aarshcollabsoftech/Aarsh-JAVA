import java.util.HashSet;

public class Hashing1 {
    public static void main(String[] args) {
        // converts key value pairs to indices
        HashSet<Integer> myhashSet = new HashSet<>(6,0.75f);
       myhashSet.add(3);  
       myhashSet.add(4);  
       myhashSet.add(7);  
       myhashSet.add(7);  
       System.out.println(myhashSet);
    }
}
 