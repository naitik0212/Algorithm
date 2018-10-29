package Collections.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class BasicOperationsTreeSet {
    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        //add elements to the HashSet
        ts.add("Java");
        ts.add("HTML");
        ts.add("CSS");
        ts.add("JavaScript");
        ts.add("Python");
        System.out.println(ts);

        System.out.println("Does list contains JAVA? " + ts.contains("JAVA"));
        System.out.println("Is TreeSet empty? " + ts.isEmpty());
        System.out.println("Size of the set: " + ts.size());
        ts.remove("Python");

        System.out.println("First in sorted set: "+ts.first());
        System.out.println("Last in sorted set: "+ts.last());
    }
}
    class MyComp implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
