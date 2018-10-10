package string;

public class CountOccurence {

    public static void main(String args[]){
    int charCount = 0; //resetting character count
    String input = "Today is Monday";
        for(char ch: input.toCharArray()){
        if(ch == 'a'){
            charCount++;
        }
    }
        System.out.println("count of character 'a' on String: 'Today is Monday' using for each loop  " + charCount);
}

}
