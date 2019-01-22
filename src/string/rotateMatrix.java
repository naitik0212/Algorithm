package string;

public class rotateMatrix {
    public static void main(String args[]){
        int m[][] = new int[3][3];
        int temp = 0;
        for(int i = 0; i < 3; i ++) {
            for (int j =0 ; j < 3; j++){
                m[i][j] = temp++;
            }
        }

        System.out.println("Before rotation:");
        for(int i = 0; i < 3; i ++) {
            for (int j =0 ; j < 3; j++){
                System.out.print(m[i][j]);
            }
            System.out.println();

        }
        System.out.println("After Rotation");
        boolean a = rotatematrix(m);
        for(int i = 0; i < 3; i ++) {
            for (int j =0 ; j < 3; j++){
                System.out.print(m[i][j]);
            }
            System.out.println();

        }
    }

    private static boolean rotatematrix(int[][] m) {
         if(m.length == 0 || m.length!= m[0].length)
             return false;

         int n = m.length;

         for(int layer = 0; layer < n/2; layer++) {
             int first = layer;
             int last = n - layer -1;
             for(int i = first; i< last; i++) {
                 int offset = i - first;
                 int top = m[first][i];

                 m[first][i] = m[last-offset][first];

                 m[last - offset][first] = m[last][last- offset];

                 m[last][last - offset] = m[i][last];

                 m[i][last] = top;
             }
         }


         return true;
    }
}
