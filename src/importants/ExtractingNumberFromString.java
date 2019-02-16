package importants;

import java.util.Scanner;


// Given a String, remove number from the string

public class ExtractingNumberFromString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();

        String ans = s.replaceAll("[0-9]","");
        System.out.println(ans);
    }
}
