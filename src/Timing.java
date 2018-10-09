import java.util.HashMap;

public class Timing {
    public static void main(String[] args) {
    String[] fruitArray = new String[] {"9/10", "Alice", "530", "540"};

    String[] fruitArray1 = new String[] {"9/10", "Alice1", "530", "540"};

    HashMap<Integer, String[]> map = new HashMap<Integer, String[]>();


    int a = Integer.parseInt(fruitArray[0]);
    int b =  Integer.parseInt(fruitArray1[0]);

    if(a == b) {

    }

    System.out.println(fruitArray[0]);

    if(fruitArray[0].equals(fruitArray1[0])) {
        System.out.println("yes");
    }else{
        System.out.println("No");
    }
    }

}
