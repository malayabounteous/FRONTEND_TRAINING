package Threading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class qn2 {
    public static void main(String[] args) {
        
        ScheduledExecutorService service=Executors.newScheduledThreadPool(4);

        //service.schedule(()->{System.out.println("hello ji");}, 6, TimeUnit.SECONDS);
        
       Future<?>f= service.scheduleAtFixedRate(()->{System.out.println("hi");},2 , 2, TimeUnit.SECONDS);
        
        try{
            Thread.sleep(10000);
            f.cancel(true);  
        }
        catch(Exception e)
        {

        }



    }
}
