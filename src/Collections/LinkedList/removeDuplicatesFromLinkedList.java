package Collections.LinkedList;
//
//import java.util.HashSet;
//import java.util.LinkedList;
//
//public class removeDuplicatesFromLinkedList {
//    public static void main(String args[]) {
//        LinkedList<Integer> l = new LinkedList<>();
//        //add elements to the ArrayList
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        l.add(3);
//        l.add(4);
//        l.add(3);
//
//        System.out.println("Current LinkedList");
//        for (Integer aL : l) {
//            System.out.println(aL);
//        }
//        removeDuplicates(l);
//    }
//
//    private static void removeDuplicates(LinkedList<Integer> l) {
//        HashSet<Integer> hs = new HashSet<>();
//
//        for(int i = 0; i < l.size(); i++) {
//            if(hs.contains(l.get(i))){
////                System.out.println("remove " + i);
//                l.remove(i);
//            }else{
//                hs.add(l.get(i));
//            }
//        }
//        System.out.println("New LinkedList");
//
//        for (Integer aL : l) {
//            System.out.println(aL);
//        }
//
//    }
//}

// Java program to remove duplicates
// from unsorted linkedlist ---- GeeksForGeeks Reference

import java.util.HashSet;

public class removeDuplicatesFromLinkedList
{
    static class node
    {
        int val;
        node next;

        node(int val)
        {
            this.val = val;
        }
    }

    /* Function to remove duplicates from a
    unsorted linked list */
    private static void removeDuplicate(node head)
    {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

		/* Pick elements one by one */
        node current = head;
        node prev = null;
        while (current != null)
        {
            int curval = current.val;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }

    }

    /* Function to print nodes in a given linked list */
    private static void printList(node head)
    {
        while (head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args)
    {
		/* The constructed linked list is:
		10->12->11->11->12-*/
        node start = new node(10);
        start.next = new node(12);
        start.next.next = new node(11);
        start.next.next.next = new node(11);
        start.next.next.next.next = new node(12);

        System.out.println("Linked list before removing duplicates :");
        printList(start);

        removeDuplicate(start);

        System.out.println("\nLinked list after removing duplicates :");
        printList(start);
    }
}

