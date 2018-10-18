package Collections;
import java.util.IdentityHashMap;

public class IdentityHash {
    public static void main(String args[])
    {
        IdentityHashMap m = new IdentityHashMap();
        Integer I1 = new Integer(10);
        Integer I2 = new Integer(10);
        Integer I3 = new Integer(10);
        m.put(I3,"pqrs");

        m.put(I1,"abc");
        m.put(I2,"xyz");


        System.out.println(m);

    }
}
