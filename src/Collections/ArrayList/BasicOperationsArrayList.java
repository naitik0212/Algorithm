package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BasicOperationsArrayList {
    public static void main(String args[]) {
        ArrayList<String> a = new ArrayList<String>();
        //add elements to the ArrayList
        a.add("Java");
        a.add("HTML");
        a.add("CSS");
        a.add("JavaScript");
        a.add("Python");
        System.out.println(a);

        System.out.println("Element at index 1: "+ a.get(1));
        System.out.println("Does list contains JAVA? "+ a.contains("JAVA"));
        a.add(1,"Angular6");
        System.out.println("After appending tech" + a);


        System.out.println("Is ArrayList empty? "+ a.isEmpty());
        System.out.println("Index of CSS is "+ a.indexOf("CSS"));
        System.out.println("Size of the ArrayList is: "+ a.size());

        ArrayList<String> copy = (ArrayList<String>) a.clone();
        System.out.println("Cloned ArrayList: "+copy);

        List<String> list = a.subList(2, 4);
        System.out.println("Sub List: "+list);

        System.out.println("Does ArrayList contains all list elements?: "
                +a.containsAll(list));

        System.out.println("Sorted ArrayList: ");
        Collections.sort(a);
        System.out.println(a);

        Collections.reverse(a);
        System.out.println("Reversed ArrayList: ");
        System.out.println(a);


        Collections.shuffle(a);
        System.out.println("Shuffled ArrayList: ");
        System.out.println(a);

        Collections.swap(a, 2, 3);
        System.out.println("swapped ArrayList: ");
        System.out.println(a);


        copy.clear();
        System.out.println("After clear ArrayList:" + copy);
    }
}
