package Collections.HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;

public class BasicHashTableOperations {


    public static void main(String a[]){
        //Create hashtable instance
        Hashtable<String,String> ht = new Hashtable<>();
        //add key-value pair to hashtable
        ht.put("first", "Java");
        ht.put("second", "JavaScript");
        ht.put("third","D3");
        System.out.println(ht);
        //getting value for the given key from hashtable
        System.out.println("Value of key 'second': "+ht.get("second"));
        System.out.println("Is Hashtable empty? "+ht.isEmpty());
        ht.remove("third");
        System.out.println(ht);
        System.out.println("Size of the Hashtable: "+ht.size());

        //all keys from keyset
        Set<String> keys = ht.keySet();
        for(String key: keys){
            System.out.println("Value of "+key+" is: "+ht.get(key));
        }

        HashMap<String, String> subMap = new HashMap<>();
        subMap.put("fourth", "HTML");
        subMap.put("fifth", "Python");
        ht.putAll(subMap);
        System.out.println("After appending map "+ht);

        System.out.print("Is 'first' key present: " + ht.containsKey("first") + " value is " + ht.get("first"));

        Set<Entry<String, String>> entires = ht.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }

        ht.clear();
        System.out.println("Content After clear:");
        System.out.println(ht);
    }

}
