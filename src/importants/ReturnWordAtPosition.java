package importants;

import java.util.Scanner;

public class ReturnWordAtPosition {

    private String findWord(String s, int position) {
        String[] arr = s.split(" ");
        return arr[arr.length - position];
    }



    public static void main(String args[]) {
        System.out.println("Enter the Sentence");
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();

        System.out.println("Enter the Word position");
        int position = sc.nextInt();


        ReturnWordAtPosition r = new ReturnWordAtPosition();


        String ans = r.findWord(s,position);
        System.out.println(ans);
        String penultimate_word = r.findPenultimateWord(s);
        System.out.println(penultimate_word);
    }

    private String findPenultimateWord(String s) {
        int lastSpace = s.lastIndexOf(" ");

        int penultimateSpace = s.lastIndexOf(" ", lastSpace-1);
        System.out.println(penultimateSpace);

        return s.substring(penultimateSpace+1,lastSpace);
    }

}
