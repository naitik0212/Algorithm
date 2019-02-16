package importants;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int r;
        while(temp>0){
            r = temp%10;
            sum = sum*10 + r;
            temp = temp/10;
        }
        if(sum == n){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
