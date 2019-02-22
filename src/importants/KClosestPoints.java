package importants;

import java.util.Arrays;
import java.util.HashMap;

public class KClosestPoints {

        public int[][] kClosest(int[][] points, int K) {
            // List<List<Integer>> ans = new ArrayList<>();
            HashMap<Integer,Integer> dist = new HashMap<>();
            int[][] array=new int[K][2];

            int[] temp=new int[points.length];

            for(int i = 0; i< points.length; i++) {
                int sum=points[i][0]*points[i][0]+points[i][1]*points[i][1];
                dist.put(sum, i);
                temp[i] = sum;
            }
            // System.out.println(dist);
            Arrays.sort(temp);
            for(int i=0; i < K; i++){
                int ind = dist.get(temp[i]);
                array[i][0]=points[ind][0];
                array[i][1]=points[ind][1];
            }
            return array;
        }


    public int[][] kClosest1(int[][] points, int K) {
        int len =  points.length, l = 0, r = len - 1;
        while (l <= r) {
            int mid = helper(points, l, r);
            if (mid == K) break;
            if (mid < K) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return Arrays.copyOfRange(points, 0, K);
    }

    private int helper(int[][] A, int l, int r) {
        int[] pivot = A[l];
        while (l < r) {
            while (l < r && compare(A[r], pivot) >= 0) r--;
            A[l] = A[r];
            while (l < r && compare(A[l], pivot) <= 0) l++;
            A[r] = A[l];
        }
        A[l] = pivot;
        return l;
    }

    private int compare(int[] p1, int[] p2) {
        return p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1];
    }
}



//    https://leetcode.com/problems/k-closest-points-to-origin/discuss/220235/Java-Three-solutions-to-this-classical-K-th-problem.