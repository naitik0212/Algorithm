package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class CollectionEnumerator {
    public static void main(String args[]){
        Vector<String> myList = new Vector<>();
        myList.add("Java");
        myList.add("HTML");
        myList.add("CSS");
        myList.add("JavaScript");
        myList.add("Python");
        Enumeration<String> en = myList.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

    }

}
