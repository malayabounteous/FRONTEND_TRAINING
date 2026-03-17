package Assignment3;

import java.util.*;

public class MultiThread {
    static List<Example> list = new ArrayList<>();
    static Map<String, List<Example>> map = new TreeMap<>();
    static boolean available = false;

    public static void main(String[] args) {

        Producer p = new Producer();
        Consumer c = new Consumer();
        try {
            p.start();
            c.start();

            // p.join();
            // c.join();
        } catch (Exception e) {

        }

        System.out.println("my generate d examples are-");
        
        System.out.println("My generated Tree Set is=");
        for(Map.Entry<String,List<Example>> e :map.entrySet())
        {
            System.out.print("id -"+e.getKey()+" ->");
            for(Example s:e.getValue())
            {
            System.out.print(s);
            }
            System.out.println();
        }
        System.out.println("Main thread comploeted");

    }
}

class Producer extends Thread {

    private Random r = new Random();

    public void run() {

         
        for(int i=0;i<10;++i){
             while (MultiThread.available) {
            try {
                wait();
            } catch (Exception e) {
            }
            ;
        }
        synchronized (this) {
            Example e = new Example();
            e.uid = UUID.randomUUID().toString();
            e.id = r.ints().toString();
            MultiThread.list.add(e);
            System.out.println("one Example produced");
            MultiThread.available = true;
            notify();
        }
    }

    }
}

class Consumer extends Thread {

    public void run() {


        for (int i = 0; i < 10; ++i) {
             while (!MultiThread.available) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
            synchronized (this) {

                Example e = MultiThread.list.get(0);
                MultiThread.list.remove(0);
                System.out.println("one Exmaple consume");
                if (MultiThread.map.get(e.id) == null) {
                    MultiThread.map.put(e.id, new ArrayList<>());
                    MultiThread.map.get(e.id).add(e);
                } else {
                    MultiThread.map.get(e.id).add(e);
                }
                MultiThread.available = false;
                notify();
            }
        }
    }
}

class Example {
    String uid;
    String id;

    public String toString(){
          
        return " "+ uid+" "+id;
    }
}
