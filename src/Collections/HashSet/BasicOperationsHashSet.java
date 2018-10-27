package Collections.HashSet;

import java.util.HashSet;

public class BasicOperationsHashSet {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<>();
        //add elements to the HashSet
        hs.add("Java");
        hs.add("HTML");
        hs.add("CSS");
        hs.add("JavaScript");
        hs.add("Python");
        System.out.println(hs);

        System.out.println("Does list contains JAVA? "+ hs.contains("JAVA"));
        System.out.println("Is HashSet empty? "+hs.isEmpty());
        hs.remove("Python");

        System.out.println("Size of the HashSet: "+hs.size());
        System.out.println("Does HashSet contains Java? "+hs.contains("Java"));

        HashSet<String> subSet = new HashSet<>();
        subSet.add("Angular6");
        subSet.add("D3");
        hs.addAll(subSet);
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hs);

        String[] strArr = new String[hs.size()];
        hs.toArray(strArr);
        System.out.println("Copied array content:");
        for(String str:strArr){
            System.out.println(str);
        }

        hs.retainAll(subSet);
        System.out.println("HashSet content:");
        System.out.println(hs);

        hs.clear();
        System.out.println("Content After clear:");
        System.out.println(hs);

    }
}
