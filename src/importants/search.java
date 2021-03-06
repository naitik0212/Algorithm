package importants;

public class search {
    private static int sorted_search(int[] elements, int target) {
        if(elements == null || elements.length <= 0) {
            return -1;
        }

        int left = 0, right = elements.length - 1;

        while (left < right) {
            int middle = (left + right + 1)/2;

//            if(elements[middle] == target)
//                return middle;

            if(elements[middle] > target) {
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }
        if(elements[right] == target) {
            return right;
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = {1,2,6,8,15,20};

        System.out.println(sorted_search(a,6));
        checker(a, 1);

        System.out.println(sorted_search(a,6));
        checker(a, 6);

        System.out.println(sorted_search(a,8));
        checker(a, 8);

        System.out.println(sorted_search(a,20));
        checker(a, 20);

        System.out.println(sorted_search(a,22));
        checker(a, 22);

    }

    private static void checker(int[] elements, int target) {
        int left = 0, right = elements.length - 1;
        int middle = (left + right + 1)/2;

        if((elements[middle] != target) || target > elements[right]){
            System.out.println("CORRECT");
        }else{
            System.out.println(elements.length);
            for(int i: elements) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println(target);
        }
    }
}
