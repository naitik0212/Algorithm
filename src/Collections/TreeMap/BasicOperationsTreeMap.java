package Collections.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BasicOperationsTreeMap {
    public static void main(String a[]){
        TreeMap<String, String> hm = new TreeMap<>();
        //add key-value pair to TreeMap
        hm.put("first", "Java");
        hm.put("second", "JavaScript");
        hm.put("third","Python");
        System.out.println(hm);
        //getting value for the given key from TreeMap
        System.out.println("Value of second: "+hm.get("second"));
        System.out.println("Is TreeMap empty? "+hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the TreeMap: "+hm.size());

        Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println("Value of "+key+" is: "+hm.get(key));
        }
        //containsKey()
        //containsValue()
        //AllLkeys: KeySet
        //getting value for the given key from TreeMap
        Set<Map.Entry<String, String>> entires = hm.entrySet();
        for(Map.Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }
        Map<String, String> subMap1 = hm.subMap("first",false, "second",true);
        System.out.println("Sub-Map enties:");
        System.out.println(subMap1);


        //Entry<Emp,String> ent = trmap.firstEntry();
        //Entry<Emp,String> ent = trmap.lastEntry();
        //Map<String, String> rm = hm.descendingMap();

    }



}
