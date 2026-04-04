package MISC;

import java.util.*;

public class QN6 {
    public static void main(String[] args) {
        
        HashMap<List<Integer>,String> map=new HashMap<>();

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        map.put(list1, "Hello");
        System.out.println(map.get(list1));
        list1.add(2);
        System.out.println(map.get(list1));//return null because modifying key   break key 
        list1.add(3);
        map.put(list1, "Hello2");
        System.out.println(map.get(list1));
    }
}
