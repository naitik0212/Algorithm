package Collections.Vectors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorOperations {
    public static void main(String a[]) {

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Original Vector" + vector);

        Vector<Integer> copy = (Vector<Integer>) vector.clone();
        System.out.println("Cloned vector:"+copy);

        System.out.println("Equal?:" + copy.equals(vector));

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        vector.addAll(list);
        System.out.println("After appending list: "+vector);

        System.out.println("Does vector contains all list elements?: "+vector.containsAll(list));
        list.add(6);
        System.out.println("Does vector contains all list elements?: "+vector.containsAll(list));


        Vector<String> stringVector = new Vector<>();
        Enumeration<Integer> en = vector.elements();
        while(en.hasMoreElements()){
            stringVector.add(en.nextElement().toString());
        }

        String[] copyArr = new String[vector.size()];
        stringVector.copyInto(copyArr);
        System.out.println("Copied Array content:");
        for(String str:copyArr){
            System.out.println(str);
        }

        List<String> newlist = stringVector.subList(2, 4);
        System.out.println("Sub List: "+newlist);

        vector.clear();
        System.out.println("After clear vector:"+vector);


    }
}
