package Collections.LinkedList;

public class KthtoLast {

    static class node
    {
        int val;
        node next;

        node(int val)
        {
            this.val = val;
        }
    }

    /* Function to print nodes in a given linked list */
    private static boolean deleteNode(node n)
    {
       if(n == null || n.next == null){
           return false;
       }
       node next = n.next;
       n.val = next.val;
       n.next = next.next;
       return  true;
    }
    private static void printList(node node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
		/* The constructed linked list is:
		10->12->11->11->12*/
        node start = new node(10);
        start.next = new node(12);
        start.next.next = new node(11);
        start.next.next.next = new node(11);
        start.next.next.next.next = new node(13);
        start.next.next.next.next.next = new node(14);

        printList(start); System.out.println();

        System.out.println("Linked list after 2nd element from end is :");

        printKthList(start,2);
        System.out.println("Removing 12: " +deleteNode(start.next)); // removing 12


//        System.out.println("\nLinked list after removing duplicates :");
        printList(start);
    }


    private static int printKthList(node start, int k) {
       if(start == null) {
           return 0;
       }
       int index = printKthList(start.next,k) + 1;
       if(index == k) {
           System.out.println(k + "th to the last node is: "+ start.val );
       }
       return index;

    }


}


