package string;

public class StringParanthesisValidation {

    public static void main(String args[]){
        System.out.println(isParanthesis("((A9a)))()()())"));;
    }

    private static String isParanthesis(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
            for(int i  = 0; i < s.length(); i++) {
                if(s.charAt(i) == '('){
                    count++;
                    sb.append(s.charAt(i));
                } else if(s.charAt(i) == ')' ) {
                    if(count > 0){
                        count--;
                        sb.append(s.charAt(i));
                    }
                }else{
                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
    }
}
