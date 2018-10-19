package string;


public class RabinKarp {
//    private static int prime_no = 101;
//
//    public static void main(String args[]) {
//        String text = "KShah";
//        String find = "Shah";
//        char str[] = text.toCharArray();
//        char str1[] = find.toCharArray();
//
//
//        int m = find.length();
//        int n = text.length();
//
//        Long hashtext = createHash(text, m-1);
//        Long findtext = createHash(find, m-1);
//
//
//
////        System.out.println(hashtext);
////        System.out.println(findtext);
//        for(int i = 1; i <= n - m + 1; i++) {
//
//
//            if(hashtext.equals(findtext) && checkEqual(str, i - 1, i + m - 2, str1, 0, m - 1))  {
//                System.out.println(i - 1);
//            }
//            if(i < n - m + 1) {
//                hashtext = recalculateHash(str, i - 1, i + m - 1, hashtext, m);
//            }
//
//        }
//    }
//
//    private static Long recalculateHash(char str[], int oldIndex, int newIndex, Long oldHash, int patternLen) {
//        long newHash = oldHash - str[oldIndex];
//        newHash = newHash/prime_no;
//        newHash += str[newIndex]*Math.pow(prime_no, patternLen - 1);
//        return newHash;
//
//    }
//
//    private static boolean checkEqual(char[] str1,int start1,int end1,char[] str2,int start2,int end2) {
//        if(end1 - start1 != end2 - start2) {
//            return false;
//        }
//        while(start1 <= end1 && start2 <= end2){
//            if(str1[start1] != str2[start2]){
//                return false;
//            }
//            start1++;
//            start2++;
//        }
//        return true;
//    }
//
//    private static Long createHash(String text, int m) {
//        long value = 0;
//        char a[] = text.toCharArray();
//
//        for(int i = 0; i < m; i++) {
//            value = (long) (value + a[i]*Math.pow(prime_no, i));
//        }
//        return value;
//    }

    private static int prime = 101;

     private static int patternSearch(char[] text, char[] pattern){
        int m = pattern.length;
        int n = text.length;
        long patternHash = createHash(pattern, m - 1);
        long textHash = createHash(text, m - 1);
        for (int i = 1; i <= n - m + 1; i++) {
            if(patternHash == textHash && checkEqual(text, i - 1, i + m - 2, pattern, 0, m - 1)) {
                return i - 1;
            }
            if(i < n - m + 1) {
                textHash = recalculateHash(text, i - 1, i + m - 1, textHash, m);
            }
        }
        return -1;
    }

    private static long recalculateHash(char[] str,int oldIndex, int newIndex,long oldHash, int patternLen) {
        long newHash = oldHash - str[oldIndex];
        newHash = newHash/prime;
        newHash += str[newIndex]*Math.pow(prime, patternLen - 1);
        return newHash;
    }

    private static long createHash(char[] str, int end){
        long hash = 0;
        for (int i = 0 ; i <= end; i++) {
            hash += str[i]*Math.pow(prime,i);
        }
        return hash;
    }

    private static boolean checkEqual(char str1[],int start1,int end1, char str2[],int start2,int end2){
        if(end1 - start1 != end2 - start2) {
            return false;
        }
        while(start1 <= end1 && start2 <= end2){
            if(str1[start1] != str2[start2]){
                return false;
            }
            start1++;
            start2++;
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(patternSearch("NaitikShah".toCharArray(), "Shah".toCharArray()));
    }

}
//referred from tusharroy
