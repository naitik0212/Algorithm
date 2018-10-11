package arrays;

//overwrites with the latest array copied.

public class assignArray {


        public static void main(String[] args)
        {
            int[] arrayWitThree = {1,2,3} ;

            int[] arrayWithfive = {4,5,6,7,8};
            arrayWithfive = arrayWitThree;

            System.out.println("Array with 3 elements:" );
            for(int i : arrayWitThree){
                System.out.println(i);
            }
            System.out.println("Array with 5 elements:" );
            for(int i : arrayWithfive){
                System.out.println(i);
            }

        }

    }

// Using for loop
//         Using Arrays.copyOf() method
//         Using System.arraycopy() method
//         Using clone() method