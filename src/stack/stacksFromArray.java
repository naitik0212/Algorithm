package stack;

public class stacksFromArray {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public stacksFromArray(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }


    //https://www.geeksforgeeks.org/efficiently-implement-k-stacks-single-array/
}
