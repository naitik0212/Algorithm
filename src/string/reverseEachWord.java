package string;

public class reverseEachWord {

    public static String reverseWords(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder output = new StringBuilder();

        char[] a = s.toCharArray();
        for(int i = 0; i<a.length;i++){
            if(a[i] != ' '){
                sb1.append(a[i]);
            }else{
                output.append(sb1.reverse().toString());
                sb1.setLength(0);
                output.append(" ");
            }
        }
        output.append(sb1.reverse().toString());
        return output.toString();
    }
    public static void main(String args[]){
        System.out.println(reverseWords("Java"));
        System.out.println(reverseWords("All Isa Well"));
        System.out.println(reverseWords("Done And Gone"));
    }
}