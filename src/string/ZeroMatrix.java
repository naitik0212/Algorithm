package string;

import java.util.ArrayList;

public class ZeroMatrix {


        public static void main(String args[]) {
            int m[][] = new int[3][3];
            int temp = -1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    m[i][j] = temp++;
                }
            }
//            m[2][2] = 0;

            System.out.println("Before Zero:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(m[i][j]);
                }
                System.out.println();

            }
            System.out.println("After Zero");
            boolean a = zeroMatrix(m);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(m[i][j]);
                }
                System.out.println();

            }
        }

        private static boolean zeroMatrix(int[][] m) {
            if (m.length == 0 || m.length != m[0].length)
                return false;

            ArrayList<Integer> row = new ArrayList<>();
            ArrayList<Integer> column = new ArrayList<>();


            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    if(m[i][j]==0){
                        row.add(i);
                        column.add(j);
                    }
                }

            }

            System.out.println(row + " " + column);

            for (Integer aRow : row) {
                for (int j = 0; j < m[aRow].length; j++) {
                    m[aRow][j] = 0;
                }
            }

           for(int i = 0; i < m.length; i++ ){
               for (Integer aColumn : column) {
                   m[i][aColumn] = 0;

               }
           }

            return true;
        }
    }
