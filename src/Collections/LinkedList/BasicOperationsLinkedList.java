package Collections.LinkedList;

import java.util.*;

public class BasicOperationsLinkedList {

    public static void main(String args[]) {
        LinkedList<String> l = new LinkedList<>();
        //add elements to the ArrayList
        l.add("Java");
        l.add("HTML");
        l.add("CSS");
        l.add("JavaScript");
        l.add("Python");

        System.out.println("Do you have no Skillset? "+l.isEmpty());

        System.out.println("Total skills: "+l.size());

        System.out.println("Do you know 'Java'? "+l.contains("Java"));

        System.out.println("Do you know 'C++'? "+l.contains("C++"));

        System.out.println("All Skills: " + l);

        System.out.println("Iterator Output: ");

        for (String aL : l) {
            System.out.println(aL);
        }

        LinkedList<String> copy = (LinkedList<String>) l.clone();
        System.out.println("Cloned LinkedList:"+copy);

        List<String> list = new ArrayList<>();
        list.add("D3");
        list.add("Angular");
        l.addAll(list);

        System.out.println(l);

        System.out.println("Does LinkedList contains all list elements?: "
                +l.containsAll(list));

        String[] strArr = new String[l.size()];

        l.toArray(strArr);
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
        }

        List<String> sublist = l.subList(2, 4);
        System.out.println("Sub List: " + sublist);

        Collections.sort(l);
        System.out.println("Results after Sort operation: " + l);


        Collections.reverse(l);
        System.out.println("Results after reverse operation: " + l);

        Collections.shuffle(l);
        System.out.println("Results after shuffle operation: " + l);

        Collections.swap(l, 2, 5);
        System.out.println("Results after swap operation:" + l);

        l.addFirst("React");
        l.addLast("ES6");

        System.out.println("First Element: "+l.element());
        System.out.println("First Element: "+l.getFirst());
        System.out.println("First Element: "+l.peek());
        System.out.println("First Element: "+l.peekFirst());

        System.out.println("Last Element: "+l.getLast());
        System.out.println("Last Element: "+l.peekLast());


        Iterator<String> itr = l.descendingIterator();
        System.out.println("Descending Iterator: ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        l.push("C++");
        System.out.println("Results after push operation:" + l);
        l.pop();
        System.out.println("Results after pop operation:" + l);

        System.out.println("Remov() method:"+l.remove());
        System.out.println("After remove() method call:");
        System.out.println(l);

        System.out.println("remove(index) method:"+l.remove(2));
        System.out.println("After remove(index) method call:");
        System.out.println(l);

        System.out.println("Remov(object) method:"+l.remove("C++"));
        System.out.println("After remove(object) method call:");
        System.out.println(l);

        System.out.println("removeFirst() method:"+l.removeFirst());
        System.out.println("After removeFirst() method call:");
        System.out.println(l);

        System.out.println("removeFirstOccurrence() method:"
                +l.removeFirstOccurrence("ES6"));
        System.out.println("After removeFirstOccurrence() method call:");
        System.out.println(l);

        System.out.println("removeLast() method:"+l.removeLast());
        System.out.println("After removeLast() method call:");
        System.out.println(l);

        System.out.println("removeLastOccurrence() method:"
                +l.removeLastOccurrence("C"));
        System.out.println("After removeLastOccurrence() method call:");
        System.out.println(l);

        l.clear();
        System.out.println("After clear LinkedList: " + l);



    }
}
