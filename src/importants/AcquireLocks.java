package importants;

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


// 11,5,8,5,1,5,4,3,9,2,12