import java.util.*;

class wayfair {
    private static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            while(i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = {-2, 1,2,5};
        int b[] = {3,3,3,3};

        System.out.println(solution(a,b));
    }
}