package importants;
// number equal to sum of number of digits in it

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its armstrong number?");
        int num = sc.nextInt();
        ArmstrongNumber ob = new ArmstrongNumber();
        System.out.println(ob.armstrongNumber(num));
    }

    private int order(int num) {
        int n = 0;
        while(num!=0){
            n++;
            num = num/10;
        }
        return n;
    }

    private int power(int x, long y){
        if(y == 0)
            return 1;
        if(y%2 == 0){
            return power(x,y/2) * power(x, y/2);
        }
        return x* power(x,y/2) * power(x, y/2);
    }

    private boolean armstrongNumber(int a) {
        double sum = 0;
        int temp = a;
        int n = order(a);

        while(temp > 0) {
            int x = temp%10;
            sum = sum + power(x,n);
            temp = temp/10;
        }
        return sum == a;
    }


}
