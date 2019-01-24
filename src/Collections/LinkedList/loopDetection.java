package Collections.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class loopDetection {

    static class node {
        int val;
        node next;

        node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
		/* The constructed linked list is:1:2:3:2*/
        node l1 = new node('A');
        l1.next = new node('B');
        l1.next.next = new node('C');
        l1.next.next.next = new node('D');
        l1.next.next.next.next = new node('E');
        l1.next.next.next.next.next = l1.next.next;

        Set<node> set = new HashSet<>();

        node a = l1;

        while(a!=null) {
            if(set.contains(a)){
                System.out.println(a.val);
                break;
            }
            set.add(a);
            a=a.next;
        }

    }
}