package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class removeList2Elements {

    private static void findUnique(List<Integer> list1, List<Integer> list2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        List<Integer> ans = new ArrayList<>();
//
//        for(int i = 0; i < list1.size();i++) {
//            hs.add(list1.get(i));
//        }
//
//// hashset of unique in list 1
//
//        System.out.print(hs);
//        for(int i = 0; i < list2.size();i++) {
//            if(list2.get(i).equals(list2.get(i+1)))  {
//                continue;
//            }
//
//            System.out.print(list2.get(i));
//            if(!hs.contains(list2.get(i))){
//                ans.add(list2.get(i));
//            }
//        }
//
//        System.out.println(ans);
        hs.addAll(list2);

        for(int i: list1){
            if(!hs.contains(i)){
                hs2.add(i);
            }
        }
        System.out.println(hs2);

    }

    public static void main(String args[]) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(3);
        a.add(5);

        b.add(1);
        b.add(2);


        findUnique(a,b);
    }
}
