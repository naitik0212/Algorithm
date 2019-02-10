package stack;

import java.util.Stack;

public class AcquireLocks {
    private static int count(String[] a) {
        if(a.length == 0) {
            return 0;
        }

        Stack<Integer> s1 = new Stack<>();

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            int temp = Integer.parseInt(a[i].substring(8));

            if (a[i].contains("ACQUIRE")) {
                if (s1.contains(temp)) {
                    return i + 1;
                } else {
                    s1.push(Integer.parseInt(a[i].substring(8)));
                }
            }

            if (a[i].contains("RELEASE")) {
                if (s1.peek()!=temp) {
                    return i + 1;
                }else{
                    s1.pop();
                }
            }
            // System.out.println(s1);
        }
        if(!s1.isEmpty()){
            return a.length + 1;
        }
        return 0;
    }


    public static void main(String args[]) {
//      String a[] = {"ACQUIRE 123", "ACQUIRE 364", "ACQUIRE 84", "RELEASE 84", "RELEASE 364",
//                "ACQUIRE 789", "RELEASE 456", "RELEASE 123"};
      String a[] = {"ACQUIRE 123", "ACQUIRE 364", "ACQUIRE 84", "RELEASE 84", "RELEASE 364",
                "ACQUIRE 456"};
//      String a[] = {"ACQUIRE 364", "ACQUIRE 84", "ACQUIRE 364", "RELEASE 364"};
//        String a[] = {"ACQUIRE 364", "ACQUIRE 84", "RELEASE 364", "RELEASE 84"};

        System.out.println(count(a));
    }
}



class countPalindromes {
    private int count = 0;

    public int countSubstrings(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            findPalindrome(s, i, i);
            findPalindrome(s, i+1 , i);
        }

        return count;
    }

    private void findPalindrome(String s, int right, int left) {
        while (right < s.length() && left >=0 && s.charAt(left) == s.charAt(right))         {
            count++;
            right++;
            left--;
        }
    }
}


// 11,5,8,5,1,5,4,3,9,2,12