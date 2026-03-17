package Threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class qn1 {
    public static void main(String[] args) throws Exception{
        
        Thread th1=new Thread(()->{
            System.out.println("therad is"+Thread.currentThread().getName());
        });
        th1.start();

        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,4 , 5, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));

        Future<String> f1=executor.submit(()->{
            System.out.println("Thread is"+Thread.currentThread().getName());
            return "return from thread";
        }); 
        
        try{

        CompletableFuture<?> f2=CompletableFuture.supplyAsync(()->{
               System.out.println(Thread.currentThread().getName());
            return "this is from f2";
        },executor).thenApply((String s)->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("inside the apply");
            return s+ "hi hi";
        });//by default it will take JoinFork pool executotr 



        System.out.println(f2.get());
    }
    catch(InterruptedException e)
    {

    }
        //System.out.println(f1.get());
       


        System.out.println("exit from main trherad");
    }
}
