package Collections;
import java.util.*;

//Sort the list and traverse from front and back

public class CollectionListIterator {

    public static void main(String a[]){
        List<Integer> li = new ArrayList<>();
        li.add(23);
        li.add(98);
        li.add(29);
        li.add(71);
        li.add(5);
        Collections.sort(li);
        ListIterator<Integer> listitr = li.listIterator();
        System.out.println("Elements in Ascending Order");
        while(listitr.hasNext()){
            System.out.println(listitr.next());
        }
        System.out.println("Elements in Descending Order");
        while(listitr.hasPrevious()){
            System.out.println(listitr.previous());
        }
    }
}