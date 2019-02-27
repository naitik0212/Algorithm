package importants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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

    public static List<List<Integer>> Closest(int total, List<List<Integer>> points, int capacity ) {

            List<List<Integer>> ans = new ArrayList<>();
        if(capacity < 1 || points.size() == 0) {
            return ans;
        }

            int[] temp=new int[points.size()];

        for(int i = 0; i < total; ++i) {
            int sum= dist(points.get(i));
            temp[i] = sum;

        }

        Arrays.sort(temp);


            int distK = temp[capacity - 1];

        for (int i = 0; i < total; ++i)
            if (dist(points.get(i)) <= distK)
                ans.add(points.get(i));

        return ans;

    }

    private static int dist(List<Integer> point) {
            return point.get(0) * point.get(0) + point.get(1) * point.get(1);

    }

    public static void main(String args[]) {
        List<List<Integer>> points = new ArrayList<>();

//        List<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        points.add(a);
//
//        List<Integer> b = new ArrayList<>();
//        b.add(3);
//        b.add(4);
//        points.add(b);
//
//        List<Integer> c = new ArrayList<>();
//        c.add(1);
//        c.add(-1);
//        points.add(c);

//        System.out.println(points);
        List<List<Integer>> ans = Closest(2, points, 1);
        System.out.println(ans);
    }
}


//    https://leetcode.com/problems/k-closest-points-to-origin/discuss/220235/Java-Three-solutions-to-this-classical-K-th-problem.