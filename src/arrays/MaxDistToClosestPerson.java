package arrays;

public class MaxDistToClosestPerson {
    public static int maxDistToClosest(int[] seats) {

        int i, j, res = 0, n = seats.length;

        for (i = j = 0; j < n; ++j)
            if (seats[j] == 1) {
                if (i == 0)
                    res = Math.max(res, j - i);
                else
                    res = Math.max(res, (j - i + 1) / 2);
                i = j + 1;
            }
        res = Math.max(res, n - i);
        return res;
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 1, 1, 0, 0, 0, 0, 1};
        System.out.println(maxDistToClosest(input));

    }
}

