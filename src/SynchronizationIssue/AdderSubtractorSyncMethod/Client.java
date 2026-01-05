package SynchronizationIssue.AdderSubtractorSyncMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value value = new Value();
//        Lock lock = new ReentrantLock();
        // same object of the lock should be passed to both the codes

        Adder adder= new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Future<Void> adderFuture= executorService.submit(adder);
        Future<Void> subtractorFuture= executorService.submit(subtractor);

//        adderFuture.get();
//        subtractorFuture.get();
        //idk if its true or what but without waiting for the result(.get() ) still correct answer is coming i guess because of locks

        System.out.println(value.getX());
    }
}
