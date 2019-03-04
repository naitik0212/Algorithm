package importants;

public class removeChoc {
    static int arr[] = {1, 3};

    public static void main(String args[]) {
        System.out.println(removeCho(4));

    }

    private static int removeCho(int N) {
        {
            int count[] = new int[N + 1];
            count[0] = 1;
            for (int i = 1; i <= N; i++)
                for (int j = 0; j < arr.length; j++)

                    if (i >= arr[j])
                        count[i] += count[i - arr[j]];

            return count[N];

        }
    }


}

class Gfg
{
    static int arr[] = {1, 3};

    // method to count the total number
    // of ways to sum up to 'N'
    static int countWays(int N)
    {
        int count[] = new int[N + 1];
        count[0] = 1;
        for (int i = 1; i <= N; i++)
            for (int j = 0; j < arr.length; j++)

                if (i >= arr[j])
                    count[i] += count[i - arr[j]];

        return count[N];

    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 7;
        System.out.println("Total number of ways = "
                + countWays(N));
    }
}

