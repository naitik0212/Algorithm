package arrays;

public class jaggedArrays {

        public static void main(String[] args)
        {
            //One Dimensional Array with length 3
            int[] OneDimensionalArray3 = {1, 2, 3};

            //One Dimensional Array with length 4
            int[] oneDimensionalArray4 = {4, 5, 6, 7};

            //One Dimensional Array with length 5
            int[] oneDimensionalArray5 = {8, 9, 10, 11, 12};

            //Jagged Two Dimensional Array
            int[][] twoDimensionalArray = {OneDimensionalArray3, oneDimensionalArray4, oneDimensionalArray5};

            //Printing elements of Two Dimensional Array
            for (int i = 0; i < twoDimensionalArray.length; i++)
            {
                for (int j = 0; j < twoDimensionalArray[i].length; j++)
                {
                    System.out.print(twoDimensionalArray[i][j]+ " ");
                }
                System.out.println();
            }
        }
}
