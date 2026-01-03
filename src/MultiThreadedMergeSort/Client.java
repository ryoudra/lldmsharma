package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> list = List.of(33,5,4,6,9,5,3,33,2,4,5,6,7,7,55,678,8,54,2,1,8);
        Sorter sorter = new Sorter(list);

        ExecutorService executorService= Executors.newCachedThreadPool();
        //callable returns something ie FUTURE
       Future<List<Integer>> sortedArrayFuture= executorService.submit(sorter);

       System.out.println(sortedArrayFuture.get());
    }
}
