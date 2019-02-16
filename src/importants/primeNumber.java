package importants;

import java.util.Scanner;

public class primeNumber {
    public static void main(String args[]){
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1)
            System.out.println("Nor prime neither composite");
        int i;
        for(i = 2; i <= n/2; i++){
            if(n%i == 0){
                System.out.println("Not a prime");
                break;
            }
        }
        if(i == n/2+1){
            System.out.println("A prime number");
        }
    }
}
