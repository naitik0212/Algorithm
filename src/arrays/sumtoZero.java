package arrays;

public class sumtoZero {

    public static void main(String args[]) {
        int n = 3;
        int a[] = new int[n];
        int sum =0;

        for(int i =0 ;i < n; i ++){
            if(n % 2 == 0) {

            }
           if(i % 2 == 0) {
                a[i] = i;
            }else {
                a[i] = -i - 1;
            }

            sum = sum + a[i];

        }
        System.out.println(sum);

        for(int i : a){
            System.out.print((i) + " ") ;
        }

    }
}
