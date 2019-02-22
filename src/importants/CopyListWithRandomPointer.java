package importants;

import java.util.HashMap;
import java.util.Map;


// Definition for singly-linked list with a random pointer.
class RandomListNode {
     int label;
     RandomListNode next, random;
     RandomListNode(int x) { this.label = x; }
 }


public class CopyListWithRandomPointer {


        Map<RandomListNode, RandomListNode> visitedHash = new HashMap<>();

        public RandomListNode copyRandomList(RandomListNode head) {
            if (head == null) {
                return null;
            }

            if (this.visitedHash.containsKey(head)) {
                return this.visitedHash.get(head);
            }
            RandomListNode node = new RandomListNode(head.label);
            this.visitedHash.put(head, node);

            node.next = this.copyRandomList(head.next);
            node.random = this.copyRandomList(head.random);

            return node;

        }
    }

