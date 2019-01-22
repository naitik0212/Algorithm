package string;

public class StringRotation {


    public static void main(String[] args) {
        System.out.println(isRot("Hello", "lohel" ));

    }

    private static boolean isRot(String s1, String s2) {
        int length = s1.length();
        if(length == s2.length() && length > 0) {
            String s1s1 = s1 + s1;
            return issubString(s1s1, s2);
        }
        return false;
    }

    private static boolean issubString(String str1, String str2) {
        return str1.toLowerCase().contains(str2.toLowerCase());

    }
}

