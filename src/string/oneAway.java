package string;

public class oneAway {
private static boolean isAway(String s, String t) {
    s = s.toLowerCase();
    t = t.toLowerCase();
    if(s.length()>t.length()){
        String temp = s;
        s = t;
        t =temp;
    }
    boolean isAway = false;


    if (s.length() == t.length()) {
        for (int i = 0, j = 0; i < s.length(); i++, j++) {
            System.out.println(s.charAt(i)+ " " + t.charAt(j));

            if (s.charAt(i) != t.charAt(j)) {
                if (isAway) {
                    return false;
                }
                isAway = true;
            }
        }
        return true;
    }  if (s.length() > t.length()) {
        for (int i = 0, j = 0; i < t.length(); i++, j++) {
//            System.out.println(s.charAt(i)+ " " + t.charAt(j));
            if (s.charAt(i) != t.charAt(j)) {
                i++;
                if (isAway) {
                    return false;
                }
                isAway = true;
            }
        }
        return s.length() - t.length() == 1;

    }
    return true;
}

    public static void main(String[] args) {
//        System.out.println(isAway("pale", "ple" ));
        System.out.println(isAway("paless", "pale" ));

    }

}
