package string;


public class StringCompress {
    public static void main(String args[]){
        stringCompress("abbcccddccaaaaaa");
//        characterCount("all Isa Well");
//        characterCount("Done And Gone");
    }

    private static void stringCompress(String s) {
        StringBuilder sb =  new StringBuilder();

        s = s.toLowerCase();

        for(int i = 1; i < s.length(); i++){
            int temp = 1;

            if(s.charAt(i) != s.charAt(i -1) && i==1){
                sb.append(s.charAt(i-1));
                sb.append(temp);
            }
            sb.append(s.charAt(i));
                while (s.charAt(i) == s.charAt(i -1)) {
                    if(i!= s.length()-1) {
                        temp++;
                        i++;
                    }else{
                        temp++;
                        break;
                    }
            }
            sb.append(temp);

        }

        System.out.println(sb);
    }
}
