package Trees.BST;

class Node {
    int data;
    Node left;
    Node right;
}

class BST {

    public Node insert(Node node, int val) {
        if (node == null) {
            return createNewNode(val);
        }
        if (val < node.data) {
            node.left = insert(node.left, val);
        } else {
            node.right = insert(node.right, val);
        }
        return node;
    }

    private Node createNewNode(int val) {
        Node a = new Node();
        a.data = val;
        a.left = null;
        a.right = null;

        return a;
    }

    public Node delete(Node node, int key) {
        if (node == null)
            return node;
        if (key < node.data)
            node.left = delete(node.left, key);
        else if (key > node.data)
            node.right = delete(node.right, key);
        else {
            if (node.left == null || node.right == null) {
                Node temp = (node.left != null) ? node.left : node.right;
                if (temp == null)
                    return null;
                else
                    return temp;
            } else {
                Node successor = getSuccessor(node);
                node.data = successor.data;
                node.right = delete(node.right, successor.data);
            }
        }
        return node;
    }

    /*
     * getSuccessor() method return the successor node of given node
     */
    public Node getSuccessor(Node node) {
        if (node == null)
            return node;
        node = node.right;
        if (node == null)
            return null;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }


    public void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");

    }


    public Boolean isNode(Node node, int i) {
        if (node == null) {
            return false;
        }
        System.out.println(node.data + "   " + i);
            if (node.data == i) {
                System.out.println("asdas");
                return true;
            } else if (node.data > i) {
                return isNode(node.left, i);
            } else {
                return isNode(node.right, i);
            }
    }
}

public class BinarySearchTree {
    public static void main(String args[]){

        BST tree = new BST();
        Node root = null;

        root = tree.insert(root, 8);
        root = tree.insert(root, 3);
        root = tree.insert(root, 6);
        root = tree.insert(root, 10);
        root = tree.insert(root, 4);
        root = tree.insert(root, 7);
        root = tree.insert(root, 1);
        root = tree.insert(root, 14);
        root = tree.insert(root, 13);

        root = tree.delete(root, 12);
        root = tree.delete(root, 13);
        root = tree.delete(root, 8);

        System.out.print("InOrder: ");
        System.out.println();
        tree.inorder(root);
        System.out.println();

        System.out.println("Preorder: ");
        tree.preorder(root);
        System.out.println();

        System.out.println("PostOrder: ");
        tree.postOrder(root);
        System.out.println();

        Boolean flag = false;
        flag = tree.isNode(root, 3);
        System.out.println(flag);

    }

}
