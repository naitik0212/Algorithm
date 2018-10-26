//learning: once iterated, iterator points to last element, needs to be resetted; else use a method like removeIf
//Adding all element, traversing and removing one element
package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIterator {
    public static void main(String a[]){

        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("HTML");
        myList.add("CSS");
        myList.add("JavaScript");
        myList.add("Python");
        Iterator<String> itr = myList.iterator();
        System.out.println("My Skills are: ");
        //hasNext checks if next element present
        while(itr.hasNext()){
            //iterates over the next element
            System.out.println(itr.next());
        }

        String removeElement = "Python";

        myList.removeIf(removeElement::equals);

        System.out.println("Mention the ones in which you are proficient:");
        System.out.println(myList);
    }
}

