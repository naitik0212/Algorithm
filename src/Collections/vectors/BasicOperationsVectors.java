package Collections.vectors;

import java.util.Vector;

public class BasicOperationsVectors {

    public static void main(String a[]){
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);
        //adding element at specified index
        vector.add(2,2);
        System.out.println(vector);
        //getting elements by index
        System.out.println("Element at index 3 is: "+vector.get(3));
        //getting first element
        System.out.println("first element: "+vector.firstElement());
        //getting last element
        System.out.println("last element: "+vector.lastElement());
        //how to check vector is empty or not
        System.out.println("Is vector empty? "+vector.isEmpty());
    }
}