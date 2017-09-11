package date;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunExample {
    public static void main(String[] args){
    Ticker tick = new Ticker("First");
    Ticker tick2 = new Ticker("Second");
    //tick.run();
    //tick2.run();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(tick);
        executorService.submit(tick2);
    }
}
