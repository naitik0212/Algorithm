package importants;

import java.util.ArrayList;
//
//class ComponentNode{
//    public int nodeSum;
//    public ArrayList<ComponentNode> components;
//
//    public ComponentNode(int numOfLinesChanged) {
//        this.nodeSum = numOfLinesChanged;
//        this.components = new ArrayList<>();
//    }
//
//    public ComponentNode() {
//        this.components = components;
//    }
//}

public class TreeWithMaxAvg {
    private void findMaxAvg(ComponentNode root) {


    }

    public static void main(String args[]) {
        ComponentNode temp = new ComponentNode(200);
        ComponentNode temp1 = new ComponentNode(160);
        ComponentNode temp2 = new ComponentNode(180);


        ArrayList<ComponentNode> a = new ArrayList<>();
        a.add(temp1);
        a.add(temp2);

        temp.components = a;

        System.out.println(temp.value);

//        while (){
//            System.out.println(temp.components);
//        }
//        System.out.println(temp.components);



    }
}


//
//// Java program to find largest
//// subtree sum in a given binary tree.
//class GFG
//{
//
//    // Structure of a tree node.
//    static class Node
//    {
//        int key;
//        Node left, right;
//    }
//
//    static class INT
//    {
//        int v;
//        INT(int a)
//        {
//            v = a;
//        }
//    }
//
//    // Function to create new tree node.
//    static Node newNode(int key)
//    {
//        Node temp = new Node();
//        temp.key = key;
//        temp.left = temp.right = null;
//        return temp;
//    }
//
//    // Helper function to find largest
//// subtree sum recursively.
//    static int findLargestSubtreeSumUtil(Node root,
//                                         INT result)
//    {
//        // If current node is null then
//        // return 0 to parent node.
//        if (root == null)
//            return 0;
//
//        // Subtree sum rooted
//        // at current node.
////
////        for(int i = 0; i < root.size(); i++) {
////            int currSum = root.key +
////                    findLargestSubtreeSumUtil(root.get(i), result);
////        }
//
//
//        int currSum = root.key +
//                findLargestSubtreeSumUtil(root.left, result) +
//                findLargestSubtreeSumUtil(root.right, result);
//
//        // Update answer if current subtree
//        // sum is greater than answer so far.
//        result.v = Math.max(result.v, currSum);
//
//        // Return current subtree
//        // sum to its parent node.
//        return currSum;
//    }
//
//    // Function to find
//// largest subtree sum.
//    static int findLargestSubtreeSum(Node root)
//    {
//        // If tree does not exist,
//        // then answer is 0.
//        if (root == null)
//            return 0;
//
//        // Variable to store
//        // maximum subtree sum.
//        INT result = new INT(-9999999);
//
//        // Call to recursive function
//        // to find maximum subtree sum.
//        findLargestSubtreeSumUtil(root, result);
//
//        return result.v;
//    }
//
//    // Driver Code
//    public static void main(String args[])
//    {
//	/*
//			1
//			/ \
//			/	 \
//		-2	 3
//		/ \	 / \
//		/ \ / \
//		4	 5 -6	 2
//	*/
//
//        Node root = newNode(1);
//        root.left = newNode(-2);
//        root.right = newNode(3);
//        root.left.left = newNode(4);
//        root.left.right = newNode(5);
//        root.right.left = newNode(-6);
//        root.right.right = newNode(2);
//
//        System.out.println(findLargestSubtreeSum(root));
//    }
//}
//
//// This code is contributed by Arnab Kundu
