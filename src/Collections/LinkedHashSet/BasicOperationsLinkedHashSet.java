package Collections.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class BasicOperationsLinkedHashSet {

    public static void main(String args[]) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //add elements to the HashSet
        lhs.add("Java");
        lhs.add("HTML");
        lhs.add("CSS");
        lhs.add("JavaScript");
        lhs.add("Python");
        System.out.println(lhs);

        System.out.println("Does list contains JAVA? " + lhs.contains("JAVA"));
        System.out.println("Is HashSet empty? " + lhs.isEmpty());
        System.out.println("Size of Linked hash Set: " + lhs.size());

        System.out.println(lhs);

        HashSet<String> subSet = new HashSet<>();
        subSet.add("Angular");
        subSet.add("D3");
        lhs.addAll(subSet);
        System.out.println("LinkedHashSet content after adding another collection:");
        System.out.println(lhs);

        String[] strArr = new String[lhs.size()];
        lhs.toArray(strArr);
        System.out.println("Copied array content:");
        for(String str:strArr){
            System.out.println(str);
        }

        lhs.remove("Python");
        System.out.println("Elements after deleting an element:");
        System.out.println(lhs);

        System.out.println("Does skill contains 'Python'? "+lhs.contains("Python"));

        lhs.retainAll(subSet);
        System.out.println(lhs);

        System.out.println("Clearing LinkedHashSet:");
        lhs.clear();
        System.out.println("Content After clear:");
        System.out.println(lhs);
    }
}

//Deletion and finding of userdefined objects same as hashset
