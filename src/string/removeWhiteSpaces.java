package string;

public class removeWhiteSpaces {
    public static void main(String args[]){
        removeSpaces("Java   a");

        removeSpaces1("All Isa Well");

        removeSpaces("Done And Gone");
    }

    private static void removeSpaces(String s) {
        System.out.println(s.replaceAll("\\s",""));
    }

    private static void removeSpaces1(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!= ' ') {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
