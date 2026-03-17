package Threading;

import java.lang.invoke.VolatileCallSite;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class qn3 {
    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.size());
        Queue<Integer> q1 = new ArrayBlockingQueue<>(3);
        q1.add(10);
        q1.add(20);
        q1.add(30);
        System.out.println(q1);
         System.out.println();
        Map<Integer, String> mpp = new Hashtable<>();
        mpp.put(1, "malaya");
        mpp.put(2, "chandan");
        // mpp.put(3,null); null not aloowed in HashTable
        System.out.println(mpp);
    

        Set<String> set = new TreeSet<>();

    }
}
