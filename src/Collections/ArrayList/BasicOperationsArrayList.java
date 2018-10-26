package Collections.ArrayList;

import java.util.ArrayList;

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
    }
}
