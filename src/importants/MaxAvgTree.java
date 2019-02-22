package importants;

import java.util.ArrayList;

class ComponentNode{
    public int value;
    public ArrayList<ComponentNode> components;

    public ComponentNode(int numOfLinesChanged) {
        this.value = numOfLinesChanged;
        this.components = new ArrayList<>();
    }

    public ComponentNode() {
        this.components = components;
    }
}

public class MaxAvgTree {
    private ComponentNode result;
    private double maximumAverage = 0D;
    private ComponentNode getComponent(ComponentNode root) {

        searchBottom(root);
        System.out.println(result.value);
        return result;
    }

    private nodeValue searchBottom(ComponentNode root) {

        ArrayList<ComponentNode> children = root.components;

        nodeValue nodePair = new nodeValue(1, root.value);

        if (children == null || children.size() == 0) {
            return nodePair;
        }

        for (ComponentNode aChild : children) {
            nodeValue temp = searchBottom(aChild);

            nodePair.nodeCount += temp.nodeCount;
            nodePair.nodeSum += temp.nodeSum;
        }

        double averageCurrentNode = (nodePair.nodeSum) / (double) nodePair.nodeCount;

        if (averageCurrentNode > maximumAverage) {
            maximumAverage = averageCurrentNode;
            result = root;
        }

        return nodePair;
    }

    public static void main(String[] args) {

        ComponentNode root = new ComponentNode(200);
        ComponentNode root120 = new ComponentNode(120);
        ComponentNode root180 = new ComponentNode(180);
        ComponentNode root110 = new ComponentNode(110);
        ComponentNode root20 = new ComponentNode(20);
        ComponentNode root30 = new ComponentNode(30);
        ComponentNode root150 = new ComponentNode(150);
        ComponentNode root80 = new ComponentNode(80);

        root120.components.add(root110);
        root120.components.add(root20);
        root120.components.add(root30);

        root180.components.add(root150);
        root180.components.add(root80);

        root.components.add(root120);
        root.components.add(root180);

        MaxAvgTree maxAvgTree = new MaxAvgTree();
        maxAvgTree.getComponent(root);
    }
}

class nodeValue {

    int nodeCount;
    int nodeSum;

    nodeValue(int nodeCount, int sum) {
        this.nodeCount = nodeCount;
        this.nodeSum = sum;
    }
}


