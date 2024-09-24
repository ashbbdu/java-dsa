package CollectionFramework.Map;

import java.util.HashMap;
import java.util.TreeMap;

public class MapTutorial {
//    key value
//    does not store in sorted order
    public static void main(String[] args) {
        HashMap <Integer , String> hm =new HashMap<Integer , String>();
        hm.put(1 , "Ashish");
        hm.put(2 , "Maddy");

        System.out.println(hm);
        System.out.println(hm.get(1));
        hm.remove(2);
        System.out.println(hm);

//        stores in sorted order
        TreeMap<Integer , String> tm =new TreeMap<Integer , String>();
        hm.put(1 , "Ashish");
        hm.put(2 , "Maddy");

        System.out.println(tm);
        System.out.println(tm.get(1));
        tm.remove(2);
        System.out.println(tm);



    }
}
