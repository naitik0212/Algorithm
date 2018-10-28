package arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class allocateServer {
    HashMap<Integer, String> map = new HashMap<>();

    public static void main(String args[]){
        allocateServer a = new allocateServer();
        System.out.println(a.allocate("hel"));
        System.out.println(a.allocate("hello"));
        System.out.println(a.allocate("hello"));



    }

    public String allocate(String hosttype){
       String ServerName = findServerName(hosttype);

        if(!this.map.containsValue(ServerName)) {
            this.map.put(1,ServerName);
            return ServerName + "1";

        }

       int serverNumber = findServerElement(hosttype);
        System.out.println(serverNumber);

       ArrayList<Integer> server = new ArrayList<>();
       server.add(serverNumber);
       this.map.put(serverNumber,ServerName);



        int[] arr = server.stream().mapToInt(i -> i).toArray();
        int ans = (findSmallestElementNotInArray.smallestPostiveElementNotInArray(arr));

        this.map.put(ans,ServerName);


        System.out.println(this.map);
        return ServerName + ans;
    }

    public void deallocate(String hostName){


    }

    private  int findServerElement(String hosttype) {
        String a = hosttype.substring(hosttype.length());
        System.out.println(a);
        if(Character.isLetter(hosttype.charAt(hosttype.length()-1))){
            return 1;
        }
        return Integer.parseInt(a);
    }

    private  String findServerName(String hosttype) {
        return hosttype.substring(0, hosttype.length());
    }


}

//logic incomplete
