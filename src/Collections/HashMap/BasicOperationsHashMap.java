package Collections.HashMap;

import java.util.HashMap;
import java.util.Set;

public class BasicOperationsHashMap {
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from hashmap
        System.out.println("Value of second: "+hm.get("second"));
        System.out.println("Is HashMap empty? "+hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the HashMap: "+hm.size());

        //fetch all keys

        Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println(key);
        }


        hm.clear();
        System.out.println("Content After clear:");
        System.out.println(hm);


    }
}
