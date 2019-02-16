package importants;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String args[]){
        BinaryToDecimal b = new BinaryToDecimal();
        System.out.println("Enter a binary number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Decimal of "+ n + " is: "+ String.valueOf(b.findDecimal(n)));

    }

    private int findDecimal(int i) {
        int decimal = 0;
        int p = 0;
        while(i!=0){
            decimal+=((i%10)*Math.pow(2,p));
            i=i/10;
            p++;

        }
        return decimal;
    }
}

