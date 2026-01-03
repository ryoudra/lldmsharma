package IntroToMultithreading.hws;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

//        for(int i=1;i<=100;i++) {
//
//            Work work = new Work(i);
//
//            Thread thread = new Thread(work);
//            thread.start();
//
//        }
        //using executor service //its like a threadpool of definite number which we can give n
        //it will make available these much thread for our work
        ExecutorService executorService= Executors.newFixedThreadPool(5);

        for(int i=1;i<=100;i++){
            Work work= new Work(i);

            executorService.execute(work);
        }
    }
}
