package string;

public class reverseString {
    public static void main(String args[]){
        reverse("Java");
        reverse1("Java");
        System.out.println(recursiveMethod("Java"));


        reverse("All Isa Well");

        reverse("Done And Gone");
    }

    private static void reverse(String s){
        StringBuilder sb =  new StringBuilder(s);
        System.out.println(sb.reverse().toString());
    }

    private static void reverse1(String s){
        StringBuilder sb =  new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }

    private static String recursiveMethod(String str)
    {
        if ((null == str) || (str.length() <= 1))
        {
            return str;
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
