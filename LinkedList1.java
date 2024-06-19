import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer>l1 = new LinkedList<>();
        LinkedList<Integer>l2 = new LinkedList<>();
        l2.add(25);
        l2.add(26);
        l2.add(27); 
        l1.add(1);
        l1.add(2);
        l1.add(4);
        l1.add(3);
        l1.add(5);
        l1.add(0,7);
        l1.addAll(0,l2);
        l1.set(5, 369); //sets the element / replaces the element
       l1.addLast(9685);
       l1.addFirst(9658);
        // l1.clear();  // clears the LinkedList
    //    System.out.println(l1.contains(7));
    //    System.out.println(l1.indexOf(7));    
    //    System.out.println(l1.indexOf(96));     //not present so will give -1
    //    System.out.println(l1.lastIndexOf(6));     //will give last index of the integer  present 
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
}
}
 