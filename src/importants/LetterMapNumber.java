package importants;

import java.util.HashMap;
import java.util.Scanner;

public class LetterMapNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.next();
        char arr[] = word.toLowerCase().toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        char currChar = 'a';

        for(int i = 0; i < 26; i++){
            map.put(currChar++,i);
        }

        StringBuilder sb = new StringBuilder();
        for(char c: arr ){
            sb.append(map.get(c));
        }

        System.out.println(sb.toString());

    }
}
